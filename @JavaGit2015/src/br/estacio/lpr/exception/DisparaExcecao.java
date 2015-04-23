package br.estacio.lpr.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DisparaExcecao 
{

	public static void main(String[] args) 
	{	
		int x;
		//x = 4/0; // java.lang.ArithmeticException: / by zero
		x = 4;
		System.out.println("x = "+x);
		//System.out.println("args = "+args[1]);
		// java.lang.ArrayIndexOutOfBoundsException: 1

		try
		{
			throw new IllegalArgumentException();
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exceção Tratada!");
		}
		
		//throw new IOException();
		
		//throw new UnknownError("texto");
		
		//throw new FileNotFoundException();

	}

}
