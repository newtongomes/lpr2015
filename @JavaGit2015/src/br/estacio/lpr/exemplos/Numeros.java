package br.estacio.lpr.exemplos;
import java.util.Scanner;

/*
 * Ler uma lista de 10 n�meros inteiros,
 * e mostrar no final o maior n�mero e a 
 * m�dia dos n�meros lidos.
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
		System.out.println("Digite 10 n�meros inteiros:");
		for(int i=0; i<10; i++)
		{
			num = input.nextInt();
			soma += num;
			if (num > maior)
				num = maior;
		}
		
		System.out.println("Maior n�mero: " + maior);
		System.out.printf("M�dia = %.2f\n", (soma/10f));
		
		input.close();
		
	}

}
