package br.estacio.lpr.exercicios.grupo2;
import java.util.Scanner;

public class Diagonal 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
	// Programa que calcula a diagonal de acordo com o tamanho dos lados.
	
	Scanner input = new Scanner(System.in);
		
	int lado1, lado2;
	double diagonal;
	
	System.out.println("Informe o tamanho dos lados:");
	System.out.println("Lado 1:");
	lado1 = input.nextInt();
	System.out.println("Lado 2:");
	lado2 = input.nextInt();
	diagonal = Math.sqrt((lado1*lado1)+(lado2*lado2));
	
	System.out.printf("O comprimento da diagonal sera: %.2f m",diagonal);
	
	}
}
