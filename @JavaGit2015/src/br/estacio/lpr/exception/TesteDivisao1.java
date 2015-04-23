package br.estacio.lpr.exception;

/*
*** TRATAMENTO DE EXCEÇÕES - Aula 02/06/2014

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
			System.out.println("Denominador não pode ser zero!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Entada de dados inválida!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Indice invalido!");
		}
		catch(Exception e)
		{
			System.out.println("Exceção geral.");
		}
		

			
	}

}
