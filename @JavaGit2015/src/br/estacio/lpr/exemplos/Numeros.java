package br.estacio.lpr.exemplos;
import java.util.Scanner;

/*
 * Ler uma lista de 10 números inteiros,
 * e mostrar no final o maior número e a 
 * média dos números lidos.
 * 
*/
public class Numeros 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num, maior, soma;
		
		maior = 0;
		soma = 0;
		System.out.println("Digite 10 números inteiros:");
		for(int i=0; i<10; i++)
		{
			num = input.nextInt();
			soma += num;
			if (num > maior)
				num = maior;
		}
		
		System.out.println("Maior número: " + maior);
		System.out.printf("Média = %.2f\n", (soma/10f));
		
		input.close();
		
	}

}
