package br.estacio.lpr.exception;

import java.util.Scanner;

public class ExemploException02 
{

	public static void main(String[] args) 
	{
		Scanner sc = null;   //new Scanner(System.in);
		
		float x;
		
		System.out.print("n�mero: ");
		x = sc.nextFloat();
		System.out.print("raiz quadrada: "+Math.sqrt(x));
		
	}
	
}
