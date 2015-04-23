package br.estacio.lpr.exception;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
 * Escreva um programa que armazene em um vetor os nomes dos meses
 * do ano, sem seguida pe�a ao usu�rio que digite um valor inteiro.
 * Ap�s isso, mostrar o nome do m�s correspondente ao n�mero digitado.
 * 
 * O programa deve finalizar quando for digitado o valor zero.
 * 
 * Deve tratar atrav�s de exce��es a digita��o inv�lida e o �ndice 
 * do m�s inv�lido. 
 * 
 * - InputMismatchException
 * - ArrayIndexOutOfBoundsException
 *
*/



public class ExercicioExcecaoNomeMes 
{
	public static void main(String[] a)
	{
		
		String meses[] = {"Janeiro", "Fevereiro", "Mar�o", "Abril",
				"Maio", "Junho", "Julho", "Agosto","Setembro",
				"Outubro", "Novembro", "Dezembro" };

		Scanner input = new Scanner(System.in);
		int mes = 1;
		
		while (mes != 0)
		{
			try
			{
				System.out.print("Numero do m�s (0 para finalizar): ");
				mes = input.nextInt();
				if (mes != 0)
				{
					System.out.println("Nome do m�s = " + meses[mes-1]);
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Valor digitado inv�lido! Tente novamente.");
				input.nextLine();
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("N�mero do m�s inv�lido! Tente novamente.");
			}
		}
		System.out.println("# fim do programa #");
	
	}

}
