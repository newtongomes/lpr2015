package br.estacio.lpr.exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExemploException01 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String meses[] = { "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio",
				"Junho", "Julho", "Agosto", "Setembro", "Outubro", 
				"Novembro", "Dezembro" };
		
		int mes = 1;
		while (mes != 0)
		{
			try 
			{
			System.out.print("Numero do Mes: ");
				mes = sc.nextInt();

			if (mes < 0)
			{
				//throw new IllegalArgumentException();
			}
			
			if (mes == 0)
				continue;
			else
					System.out.println("Nome do M�s > "+meses[mes-1]);
			}
			catch(IndexOutOfBoundsException e)
			{
					System.out.println("N�mero do m�s inv�lido!");
					e.getMessage();
					//e.printStackTrace();
			}
			catch(InputMismatchException e)
			{
				System.out.println("valor inteiro inv�lido.");
				sc.nextLine();
				continue;
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("valor de mes deve ser maior que zero.");
				sc.nextLine();
				continue;
			}
			
			catch(Exception e)
			{
				System.out.println("exce��o desconhecida.");
			}
			
			finally
			{
				System.out.println("teste de tratamento de excecoes.");
			}
			
		}

	}

}
