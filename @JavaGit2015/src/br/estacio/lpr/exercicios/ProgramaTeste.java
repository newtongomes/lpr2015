package br.estacio.lpr.exercicios;

/*
Este programa irá iniciar os programadores em java
Autor: Newton
Data: 12/03/2014
Bem-vindo ao java....
*/
/**
Comentário de documentação do Java (javadoc)
@author Newton


*/
public class ProgramaTeste 
{
	public static void main(String a[])
	{
		// Programa para testes da linguagem Java
		
		System.out.print("Linguagem \n\"Java.\"\n");
		System.out.println("Linguagem Java.");
		System.out.printf("Linguagem Java.");
	
		// Declaração de variáveis
		
		String nome;
		float peso, altura, imc, pesoIdeal;
		
		byte v1;
		short v2;
		int v3;
		long v4;
		float v5;
		double v6;
		char v7;
		boolean v8;
		
		   nome = "xxxxx";
		   peso = 90;
		   altura = 1.78F;
			   
		   imc = peso / (float)Math.pow(altura,2);
		   pesoIdeal = 22 * (float)Math.pow(altura,2);
		   
		   System.out.println("IMC calculado = " + imc);
		   System.out.println("Peso Ideal = " + pesoIdeal);

		   
		   
		   
		   
	}

}
