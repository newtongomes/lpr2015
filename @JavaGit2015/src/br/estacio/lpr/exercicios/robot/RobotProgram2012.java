package br.estacio.lpr.exercicios.robot;
import java.util.*;

public class RobotProgram2012
{
	public static void main(String a[])
	{
		Robot[] robots = new Robot[5];
		Scanner scan = new Scanner(System.in);
		String command;
		
		System.out.println("Program: Java Robots");
		System.out.println("By Newton Gomes\n");
		
		while (true)
		{
			//System.out.println(robots[0]);
			System.out.print("comm> ");
			command = scan.nextLine();
			
			// Sair do programa
			if ("quit".equalsIgnoreCase(command) ||
					"q".equalsIgnoreCase(command))
				break;

			// Lista de comandos (help-ajuda)
			if ("help".equalsIgnoreCase(command) || 
					"?".equalsIgnoreCase(command))
			{
				System.out.println("\n* Help Commands *");
				System.out.println("help | ? ... : Ajuda - lista de comandos disponíveis");
				System.out.println("create ..... : Criar um novo Robot");
				System.out.println("show | s ... : Listar todos os Robots criados");
				System.out.println("show(n) .... : Mostrar o Robot \"n\" criado");
				System.out.println("up(n) ...... : Aumentar a velocidade do Robot \"n\"");
				System.out.println("down(n) .... : Reduzir a velocidade do Robot \"n\"");
				System.out.println("break(n) ... : Frear a velocidade do Robot \"n\"");
				System.out.println("explorer(n)  : Ativar funcao explorar no Robot \"n\"");
				System.out.println("stop(n) .... : Parar o Robot \"n\"");
				System.out.println("standby(n) . : Desligar o Robot \"n\"");
				System.out.println("return(n) .. : Retornar o Robot \"n\" para o Inicio");
				System.out.println("charge(n) .. : Carregando o Robot \"n\"");
				System.out.println("full(n) .... : Carga total para o Robot \"n\"");
				System.out.println("quit | q ... : Finalizar o programa Java Robots.\n");
			}

			// Criar um Robot
			if ("create".equalsIgnoreCase(command) ||
					"c".equalsIgnoreCase(command))
			{
				int i;
				for (i=0; i < robots.length; i++)
					if (robots[i] == null)
					{
						robots[i] = new Robot();
						System.out.print("Nome do Robot: ");
						robots[i].setName(scan.nextLine());
						System.out.print("Veloc. Maxima: ");
						robots[i].setMaxVelocity(Float.parseFloat(scan.nextLine()));
						break;
					}
				if (i == robots.length)
					System.out.println("Capacidade de Robots esgotada!!!");
			}
			
			// Listar Robots
			if ("show".equalsIgnoreCase(command) ||
					"s".equalsIgnoreCase(command))
			{
				for (int i=0; i < robots.length; i++)
				{
					System.out.println("*Robot ("+(i+1)+")");
					if (robots[i] == null)
						System.out.println("null");
					else
						robots[i].show();
				}
			}
			
			// Mostrar Robot n
			if (command.length() > 5 &&
					"show(".equalsIgnoreCase(command.substring(0,5)))
			{
				int i = Integer.parseInt(command.substring(5,6));
				if (i < 1 || i > robots.length)
					System.out.println("Index Error");
				else
				{
					System.out.println("*Robot ("+i+")");
					if (robots[i-1] == null)
						System.out.println("null");
					else
						robots[i-1].show();
				}
			}
				
			// Aumenta a velocidade do Robot n
			if (command.length() > 3 &&
					"up(".equalsIgnoreCase(command.substring(0,3)))
			{
				int i = Integer.parseInt(command.substring(3,4));
				if (i < 1 || i > robots.length)
					System.out.println("Index Error");
				else
					if (robots[i-1] == null)
						System.out.println("Error null");
					else
						robots[i-1].speedUp();
			}

			// Reduz a velocidade do Robot n
			if (command.length() > 5 &&
					"down(".equalsIgnoreCase(command.substring(0,5)))
			{
				int i = Integer.parseInt(command.substring(5,6));
				if (i < 1 || i > robots.length)
					System.out.println("Index Error");
				else
					if (robots[i-1] == null)
						System.out.println("Error null");
					else
						robots[i-1].speedDown(1);
			}
				
			// Freia a velocidade do Robot n
			if (command.length() > 6 &&
					"break(".equalsIgnoreCase(command.substring(0,6)))
			{
				int i = Integer.parseInt(command.substring(6,7));
				if (i < 1 || i > robots.length)
					System.out.println("Index Error");
				else
					if (robots[i-1] == null)
						System.out.println("Error null");
					else
						robots[i-1].breaking();
			}
				
			
			
			
		}		
		System.out.println("#Bye!#");
	}
	
}
