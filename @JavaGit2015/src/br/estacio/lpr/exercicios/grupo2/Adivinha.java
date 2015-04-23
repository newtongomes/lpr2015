package br.estacio.lpr.exercicios.grupo2;
import java.util.Scanner;

public class Adivinha 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		// Programa que adivinha um numero pensado por uma pessoa
		
		Scanner input = new Scanner(System.in);
		int numero = 0;
		int resultado = 0;
		
		System.out.println("Pense em um numero!");
		input.nextLine();
		System.out.println("Agora multiplique por 2!");
		input.nextLine();
		System.out.println("Some mais 6 ao resultado!");
		input.nextLine();
		System.out.println("Divida por 2!");
		input.nextLine();
		System.out.println("Quanto deu?!");
		resultado = input.nextInt();
		numero = resultado-3;
		System.out.printf("O numero que você pensou foi %d!",numero);
	}

}
