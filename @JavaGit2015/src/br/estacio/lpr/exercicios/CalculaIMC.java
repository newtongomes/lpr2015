package br.estacio.lpr.exercicios;

import java.util.Scanner;

public class CalculaIMC 
{

	public static void main(String[] args) 
	{
	   String nome;
	   float peso, altura, imc, pesoIdeal;
	   Scanner scanner = new Scanner(System.in);
		   
	   System.out.print("Digite seu nome: ");
	   nome = scanner.nextLine();;
	   System.out.print("Digite o peso: ");
	   peso = scanner.nextFloat();;
	   System.out.print("Digite a altura: ");
	   altura = scanner.nextFloat();
		   
	   imc = peso / (float)Math.pow(altura,2);
	   pesoIdeal = 22 * (float)Math.pow(altura,2);
	   
	   System.out.println("IMC calculado = " + imc);
	   System.out.println("Peso Ideal = " + pesoIdeal);

	}

}
