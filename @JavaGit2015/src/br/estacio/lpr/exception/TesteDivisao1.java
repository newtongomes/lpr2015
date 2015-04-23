package br.estacio.lpr.exception;

/*
*** TRATAMENTO DE EXCE��ES - Aula 02/06/2014

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

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteDivisao1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int numerador=0, denominador=0;
		float resultado;

		String nomes[] = { "Lidia", "Adriano", "Igor"};
		
		try 
		{
			System.out.print("Digite o numerador: ");
			numerador = input.nextInt();
			System.out.print("Digite o denominador: ");
			denominador = input.nextInt();
		
			resultado = numerador / denominador;
			System.out.println("Resultado da Divisao = " + resultado);
			
			System.out.println("Nome = " + nomes[numerador]);
			
			throw new IllegalArgumentException();

			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominador n�o pode ser zero!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Entada de dados inv�lida!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Indice invalido!");
		}
		catch(Exception e)
		{
			System.out.println("Exce��o geral.");
		}
		

			
	}

}
