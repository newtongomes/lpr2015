package br.estacio.douglas.exercicios.grupo1;
import java.util.Scanner;

public class OrdemDecrescente 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		// Programa que mostra três números em ordem decrescente no console.
		
		Scanner input = new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("Digite os numeros:");
		System.out.println("numero 1:");
		num1 = input.nextInt();
		System.out.println("numero 2:");
		num2 = input.nextInt();
		System.out.println("numero 3:");
		num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3)
		{
			if(num2 > num3)
				System.out.printf("Ordem decrescente dos numeros inseridos: %d %d %d",num1,num2,num3);
			else
				System.out.printf("Ordem decrescente dos numeros inseridos: %d %d %d",num1,num3,num2);
		}
		else
		{
			if(num2 > num3)
			{
				if(num1 > num3)
					System.out.printf("Ordem decrescente dos numeros inseridos: %d %d %d",num2,num1,num3);
				else
					System.out.printf("Ordem decrescente dos numeros inseridos: %d %d %d",num2,num3,num1);
			}
			else
			{
				if(num1 > num2)
					System.out.printf("Ordem decrescente dos numeros inseridos: %d %d %d",num3,num1,num2);
				else
					System.out.printf("Ordem decrescente dos numeros inseridos: %d %d %d",num3,num2,num1);
			}
		}
	}
}
