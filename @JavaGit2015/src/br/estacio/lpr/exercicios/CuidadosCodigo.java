package br.estacio.lpr.exercicios;

import java.util.Scanner;
import java.util.Random;

/*
-Classes básicas:
 System,
 Math,
 String,
 Scanner,
 "Wrappers" (8),
 JOptionPane,
 Random, Calendar, DecimalFormat
*/
public class CuidadosCodigo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		int soma=0;
		float media;
		float perc;
		
		int positivo, cont;
		
		for (int i=0; i<5; i++)
		{
			System.out.print("Digite nome: ");
			nome = sc.nextLine();
			System.out.print("Digite idade: ");
			idade = sc.nextInt();  sc.nextLine();
			soma += idade;
			
		}
		media = soma/5f;
		positivo = 5;
		cont = 15;
		
		perc = (float)positivo/cont * 100;
		
		System.out.println("perc="+perc);
		
		Random r = new Random();
		
		int num = r.nextInt(60) + 1;
		
		//vetor[i] = r.nextInt();
		
		Math.abs(r.nextInt());
		
		/*
		1-gerar 6 dezenas da Mega-Sena e mostrá-las em 
		ordem crescente ("sem duplicatas").

		2-gerar 200 números inteiros positivos entre 100 e 10000,
		pedir um intervalo de pesquisa, e mostrar a frequencia 
		de valores encontados no intervalo fechado dado.
		
		"nome = "+y;
		
		*/
		
		
		


	}

}
