package br.estacio.lpr.exception;

/*
*** TRATAMENTO DE EXCE��ES - Aula 17/11/2014

-Contextualiza��o dos Erros de Programa��o
-Tipos de Erros tratados pelo Java (Exce��es)
-Exemplos de Exce��es que podem ser tratadas com Java
-Tipos de Exce��es do Java
-Situa��es de Exce��es utilizadas nos programas Java:
 .tratamento/manipula��o de exce��es
 .lan�amento/gera��o de uma exce��o
 .propaga��o de exce��es

Classe: TesteExcecao.java

/*
 * Escreva um programa para solicitar como entrada de dados 
 * dois n�meros inteiros (numerador e denominador) e em
 * seguida calcular o resultado da divis�o e mostrar na tela.
 * Vari�veis: numerador, denominador e resultado 
 * Tratar como Exce��o a Entrada de Dados e a Divis�o por Zero

* - ArithmeticException
* - InputMismatchException
*
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploException01Aula17nov14 
{

	public static void main(String[] args) throws FileNotFoundException
	{

		Scanner sc=new Scanner(System.in);
		
		String meses[] = { "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio",
				"Junho", "Julho", "Agosto", "Setembro", "Outubro", 
				"Novembro", "Dezembro" };

		lerArquivo();

		int mes = 1;
		while (mes != 0)
		{	
			System.out.print("Numero do Mes (0 p/ fim): ");

			
			try
			{
				mes = sc.nextInt();
				System.out.println("Nome do M�s > "+meses[mes-1]);
				
				throw new NullPointerException();
				
			}
			catch(ArrayIndexOutOfBoundsException excecao)
			{
				System.out.println("Numero do m�s inv�lido!");
				System.out.println("Mensagem: "+excecao.getMessage());
			}
			catch(Exception e)
			{
				System.out.println("Valor Inv�lido!");
				sc.nextLine();
				continue;
			}
			finally
			{
				
			}
		
				
				
		}
	}
	
	
	public static void lerArquivo() throws FileNotFoundException
	{
			BufferedReader buffer = new BufferedReader(
					new FileReader("teste.txt"));
	}

	
}



