package br.estacio.lpr.aluno.douglas.exercicios.grupo3;
import java.util.Scanner;

public class Valores 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		float valPosit = 0;
		float valNegat = 0;
		int quant = 0;
		float total = 0;
		int valor = -1;
		
		while(valor != 0)
		{
			System.out.println("Digite um valor, ou digite 0(zero) para sair.");
			valor = input.nextInt();
			if(valor != 0)
			{
				quant++;
				total += valor;
			
			if(valor < 0)
				valNegat += 1;
			else
				valPosit += 1;
			}
		}
		if(quant == 0)
			System.out.println("Nenhum valor inserido!");
		else
		{
			System.out.printf("Media dos valores inseridos = %.2f.\n" +
					"Quantidade de valores positivos %.0f. Percentual %.1f%%.\n" +
					"Quantidade de Valores Negativos %.0f. Percentual %.1f%%."
					,(float)(total/quant),valPosit,(float)(valPosit/quant)*100,valNegat,(float)(valNegat/quant)*100);
		}
	}
}
