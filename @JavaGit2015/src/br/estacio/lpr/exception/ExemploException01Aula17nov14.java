package br.estacio.lpr.exception;

/*
*** TRATAMENTO DE EXCEÇÕES - Aula 17/11/2014

-Contextualização dos Erros de Programação
-Tipos de Erros tratados pelo Java (Exceções)
-Exemplos de Exceções que podem ser tratadas com Java
-Tipos de Exceções do Java
-Situações de Exceções utilizadas nos programas Java:
 .tratamento/manipulação de exceções
 .lançamento/geração de uma exceção
 .propagação de exceções

Classe: TesteExcecao.java

/*
 * Escreva um programa para solicitar como entrada de dados 
 * dois números inteiros (numerador e denominador) e em
 * seguida calcular o resultado da divisão e mostrar na tela.
 * Variáveis: numerador, denominador e resultado 
 * Tratar como Exceção a Entrada de Dados e a Divisão por Zero

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
		
		String meses[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio",
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
				System.out.println("Nome do Mês > "+meses[mes-1]);
				
				throw new NullPointerException();
				
			}
			catch(ArrayIndexOutOfBoundsException excecao)
			{
				System.out.println("Numero do mês inválido!");
				System.out.println("Mensagem: "+excecao.getMessage());
			}
			catch(Exception e)
			{
				System.out.println("Valor Inválido!");
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



