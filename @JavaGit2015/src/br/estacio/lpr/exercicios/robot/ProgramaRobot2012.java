// Implementação de Vinicius SOOI-15-10-2008
// Ajustes e Correção - Newton - 24-04-2012
package br.estacio.lpr.exercicios.robot;

import java.util.*;
public class ProgramaRobot2012
{
	public static void main (String a[])
	{
		int i;
		String command = "X";
		String opcao;
		int opcaoInt=0;
		ClassRobot2[] robots = new ClassRobot2[5];
		Scanner input = new Scanner(System.in);
		robots[0] = new ClassRobot2();
		robots[1] = new ClassRobot2();
		robots[2] = new ClassRobot2();
		robots[3] = new ClassRobot2();
		robots[4] = new ClassRobot2();
		while ( (command.toUpperCase()).charAt(0)!='Q' && opcaoInt != 14 )
		{
			try
			{
				System.out.print("Digite Comando> ");
				command = input.nextLine();
				
				i=-1;
				opcao = "X";
				if (command.length() == 1)
				{
					opcao = command.toUpperCase().substring(0, 1);
					switch(opcao.charAt(0))
					{
						case 'Q' : opcao = "14"; break;
						case 'H' : opcao = "13"; break;
					}
				}
				if (command.length() == 2)
				{
					opcao = command.toUpperCase().substring(0, 2);
				}
				if (command.length() == 3)
				{
					opcao = command.toUpperCase().substring(0, 1);
					i = command.charAt(2) - 48 - 1;
				}
				if (command.length() == 4)
				{
					opcao = command.toUpperCase().substring(0, 2);
					i = command.charAt(2) - 48 - 1;
				}
				opcaoInt = Integer.parseInt(opcao);
				
				switch(opcaoInt)
				{
				case 1 : 
				{	
					robots[i] = new ClassRobot2();
					System.out.print("Nome> ");
					robots[i].setName(input.nextLine());
					System.out.print("Velocidade Maxima> ");
					robots[i].setMaxVelocity(input.nextFloat());
					input.nextLine();
					break;
				}
				case 2 :
				{	System.out.println("[ Nome, Velocidade Maxima, Velocidade Atual, Temperatura, Status, Carga(%) ]");
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
				case 13 :
				{ 
					System.out.println("Ajuda: ");
					System.out.println("Para usar o Menu\ndigite o numero do comando\n"+
							"seguido do - e o\nnumero do robo!\nEx: 1-1");
					System.out.println(":::::::::: MENU ::::::::::");
					System.out.println("1-n:  Criar Robo");
					System.out.println("2-n:  Estado do Robo");
					System.out.println("3-n:  Carregar Robo");
					System.out.println("4-n:  Carga total");
					System.out.println("5-n:  Acelerar");
					System.out.println("6-n:  Frear");
					System.out.println("7-n:  Aumentar Velocidade");
					System.out.println("8-n:  Reduzir Velocidade");
					System.out.println("9-n:  Parar Robo");
					System.out.println("10-n: Explorar");
					System.out.println("11-n: Retornar");
					System.out.println("12-n: Desligar");
					System.out.println("13 (H): Ajuda");
					System.out.println("14 (Q): Sair");
					break;
				}
				case 14 : break;
				
				default:
				{
					System.out.println("Opção Inválida. Tente Novamente...");
				}
			}
				
			}
		
		catch(Exception e)
		{
			System.out.println("Comando Inválido. Tente Novamente...");
		}
		} 
			
		}
		
}