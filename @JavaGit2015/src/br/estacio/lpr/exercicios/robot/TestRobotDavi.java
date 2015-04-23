package br.estacio.lpr.exercicios.robot;

import java.util.Scanner;


public class TestRobotDavi 
{

	
	public static void main(String[] args) 
	{
		
		RobotDavi flatron = new RobotDavi("flatron", 30);
		
		Scanner sc = new Scanner(System.in);
		boolean sair = false;
		int op;
		
		while(sair == false)		
		{
			flatron.show();								
			System.out.println("\n");
			
			System.out.println("1 - Acelerar");
			System.out.println("2 - Frear");
			System.out.println("3 - Parar");
			System.out.println("4 - Explorar");
			System.out.println("5 - Retornar");
			System.out.println("6 - Carregar 10%");
			System.out.println("7 - Carregar 100%\n");
			
			System.out.print("Opção: ");
			op = Integer.parseInt(sc.nextLine());
			
			
			switch (op) 
			{		
			case 1:
				flatron.speedUp(10);
				break;
				
			case 2:
				flatron.speedBreak();
				break;
				
			case 3:
				flatron.stop();
				break; 
			
			case 4:
				flatron.explorer();
				break;
			
			case 5:
				flatron.returning();
				break;
				
			case 6:
				flatron.charge();
				break;
			case 7:
				flatron.fullCharge();
				break;
				
			case 9:
				sair = true;
				break;
			}
			
		}
		
	}	
}
