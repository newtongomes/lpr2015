package br.estacio.lpr.exercicios.grupo3;
import java.util.Scanner;

public class MaiorMenor 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		int valor = 0; // somente valores positivos;
		int maior = 0,menor = -1;
		int total = 0;
		int quant = 0;
		Scanner input = new Scanner(System.in);
		
		while(valor != -1)
		{
			System.out.println("Digite um valor positivo, ou digite -1 para sair.");
			valor = input.nextInt();
			if(valor != -1)
			{
				total += valor;
				quant++;
				if(menor == -1 || menor > valor)
					menor = valor;
				if(valor > maior)
					maior = valor;
			}
		}
		if(quant != 0)
		System.out.printf("Maior valor: %d\nMenor valor: %d\nMedia: %.2f",maior,menor,(float)(total/quant));
		else
			System.out.println("Nenhum valor foi inserido!");
	}
}
