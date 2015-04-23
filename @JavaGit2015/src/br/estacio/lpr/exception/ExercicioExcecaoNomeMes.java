package br.estacio.lpr.exception;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
 * Escreva um programa que armazene em um vetor os nomes dos meses
 * do ano, sem seguida peça ao usuário que digite um valor inteiro.
 * Após isso, mostrar o nome do mês correspondente ao número digitado.
 * 
 * O programa deve finalizar quando for digitado o valor zero.
 * 
 * Deve tratar através de exceções a digitação inválida e o índice 
 * do mês inválido. 
 * 
 * - InputMismatchException
 * - ArrayIndexOutOfBoundsException
 *
*/



public class ExercicioExcecaoNomeMes 
{
	public static void main(String[] a)
	{
		
		String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril",
				"Maio", "Junho", "Julho", "Agosto","Setembro",
				"Outubro", "Novembro", "Dezembro" };

		Scanner input = new Scanner(System.in);
		int mes = 1;
		
		while (mes != 0)
		{
			try
			{
				System.out.print("Numero do mês (0 para finalizar): ");
				mes = input.nextInt();
				if (mes != 0)
				{
					System.out.println("Nome do mês = " + meses[mes-1]);
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Valor digitado inválido! Tente novamente.");
				input.nextLine();
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Número do mês inválido! Tente novamente.");
			}
		}
		System.out.println("# fim do programa #");
	
	}

}
