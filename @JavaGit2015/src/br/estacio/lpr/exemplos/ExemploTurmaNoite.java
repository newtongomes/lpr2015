package br.estacio.lpr.exemplos;

import java.util.Scanner;

/*
classe de exemplo em sala de aula
Autor: Newton
Data: 11/03/2015
*/



// classe básica de estudo


/**
 * Classe Principal para Exemplo
 * @author Newton
 * @version 1.0
 */
public /* publica */ class ExemploTurmaNoite  // nome da classe 
{
	
	public static void main(String x[])  // método principal
	{
		byte varByte;
		short varShort;
		int varInt;
		long varLong;
		
		float varFloat;
		double varDouble;
		
		char varChar;
		boolean varBoolean;
		
	
		varFloat = 37.5F;
		
		varDouble = 37.5;
		
		
		
		
		// conversão : Casting
		
		
		varDouble = varFloat;
		
		varFloat = (float) varDouble;
		
		
		varInt = 1000;
		
		varByte = (byte) varInt;
		
		
		varInt = (int) Math.sqrt(25);
		
		
		
		String nome1, nome2;
		float valor1, valor2;
		
		
		Scanner teste = new Scanner(System.in);
		
		System.out.print("nome1:");
		nome1 = teste.nextLine();
		System.out.print("valor1:");
		valor1 = teste.nextFloat(); teste.nextLine();
		System.out.print("nome2:");
		nome2 = teste.nextLine();
		System.out.print("valor2:");
		valor2 = teste.nextFloat();
		
		
		
		
		
		
	}
	
	

}
