package br.estacio.lpr.exercicios.robot;
import java.util.*;
// Implementação de Vinicius SOOI-15-10-2008
public class ProgramaRobot2
{
	public static void main (String a[])
	{
		int i;
		String command = "X";
		ClassRobot2[] robots = new ClassRobot2[5];
		Scanner input = new Scanner(System.in);
		robots[0] = new ClassRobot2();
		robots[1] = new ClassRobot2();
		robots[2] = new ClassRobot2();
		robots[3] = new ClassRobot2();
		robots[4] = new ClassRobot2();
		try
		{
			while ( (command.toUpperCase()).charAt(0)!='Q' )
			{
				System.out.print("Command> ");
				command = input.next();
				
				i=0;
				if (command.length() >= 3)
					i = command.charAt(2) - 48 - 1;
				String opc = command.toUpperCase().substring(0, 2);
				int opcaoInt = Integer.parseInt(opc);
				switch(opcaoInt)
				{
				case 13 :
				{ 
					System.out.println("Ajuda: ");
					System.out.println("Para usar o Menu\ndigite o numero do comando\n"+
							"seguido do - e o\nnumero do robo!\nEx: 1-1");
					System.out.println(":::::::::: MENU ::::::::::");
					System.out.println("1:  Criar Robo");
					System.out.println("2:  Estado do Robo");
					System.out.println("3:  Carregar Robo");
					System.out.println("4:  Carga total");
					System.out.println("5:  Acelerar");
					System.out.println("6:  Frear");
					System.out.println("7:  Aumentar Velocidade");
					System.out.println("8:  Reduzir Velocidade");
					System.out.println("9:  Parar Robo");
					System.out.println("10: Explorar");
					System.out.println("11: Retornar");
					System.out.println("12: Desligar");
					System.out.println("13:  Ajuda");
					System.out.println("Q:  Sair");
					break;
				}	
				case 1 : 
				{	
					robots[i] = new ClassRobot2();
					System.out.print("Nome> ");
					robots[i].setName(input.next());
					System.out.print("Temperatura> ");
					robots[i].setTemperature(input.nextFloat());
					System.out.print("Velocidade Maxima> ");
					robots[i].setMaxVelocity(input.nextFloat());
					break;
				}
				case 2 :
				{	
					robots[i].show();
					break;
				}	
				case 3 :
				{	
					robots[i].charge();
					break;
				}	
				case 4 :
				{
					robots[i].fullCharge();
					break;
				}	
				case 5 :
				{
					robots[i].speedUp();
					break;
				}	
				case 6 :
				{
					robots[i].breaking();
					break;
				}
				case 7 :
				{
					System.out.print("Aumentar na Velocidade> ");
					robots[i].speedUp(input.nextInt());
					break;
				}	
				case 8 :
				{
					System.out.print("Diminuir na Velocidade> ");
					robots[i].speedDown(input.nextInt());
					break;
				}	
				case 9 :
				{
					robots[i].stop();
					break;
				}	
				case 10 :
				{
					System.out.println("opcao 10");
					robots[i].explorer();
					break;
				}	
				case 11 :
				{
					robots[i].returning();
					break;
				}	
				case 12 :
				{
					robots[i].standBy();
					break;
				}	
				
				default:
				{
					System.out.println("Op��o inv�lida, tente novamente");
				}
			}
				
			}
		
		} 
		catch(Exception e)
		{
			System.out.println("Comando inv�lido, tente novamente");
		}
			
		}
		
}