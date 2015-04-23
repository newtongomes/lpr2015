package br.estacio.lpr.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class ExemploException01Aula 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		
		String meses[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio",
				"Junho", "Julho", "Agosto", "Setembro", "Outubro", 
				"Novembro", "Dezembro" };
		
		lerArquivo();
		
		
		int mes = 1;
		while (mes != 0)
		{	
			try
			{
				System.out.print("Numero do Mes (0 p/ fim): ");
				mes = sc.nextInt();
				
				if (mes < 0)
				{
				   throw new IllegalArgumentException("Valores negativos não são permitidos");
				}
				
   			    System.out.println("Nome do Mês > "+meses[mes-1]);
			}
			
			catch (IndexOutOfBoundsException exception1)
			{
				System.out.println("voce ja viu mes igual ao valor digitado seu \"inteligente\"");
			}
			
			catch (InputMismatchException e)
			{
				System.out.println("entrada de dados inválida - digite um número inteiro");
				sc.nextLine();
			}
			
			catch (IllegalArgumentException e)
			{
				System.out.println("gerada exceção manualmente.");
				
				System.out.println("Mensagem do Erro: "+e.getMessage());
				
				sc.nextLine();
			}
			
			catch (Exception e)
			{
				System.out.println("Exceção genérica gerada.");
				sc.nextLine();
			}
			
			finally
			{
				System.out.println("Sempre executa. Tende novamente...");
			}
			
		}
		
		

	}
	
	
	public static void lerArquivo() throws FileNotFoundException
	{

		BufferedReader buffer = new BufferedReader(
				new FileReader("teste.txt"));
		
	}
	

}



