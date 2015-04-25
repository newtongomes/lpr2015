package br.estacio.lpr.aluno.douglas.exercicios.grupo3;
import java.util.Scanner;

public class Pesos 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int valor = 0;
		int quant60k = 0;
		int total60k = 0;
		int maior = 0;
		int menor = 1000; // atribuindo um valor extremamente alto para o peso de uma pessoa.
		
		while(valor != -1)
		{
			System.out.println("Digite o peso ou -1 para encerrar.");
			valor = input.nextInt();
			if(valor > 60)
			{
				quant60k += 1;
				total60k += valor;
			}
			if(valor > maior)
				maior = valor;
			if(valor < menor && valor != -1)
				menor = valor;
		}
		if(quant60k == 0)
			System.out.println("Nao existem pessoas com mais de 60 quilos.");
		else
		System.out.printf("Media das pessoas com mais de 60 quilos = %.2f\n",(float)(total60k/quant60k));
		System.out.printf("Maior peso = %d\nMenor peso = %d",maior,menor);
	}
}
