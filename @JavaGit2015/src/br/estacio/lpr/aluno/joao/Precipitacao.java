/* Precisamos armazenar a quantidade de chuva para um determinado mês do ano, respeitando
 * a quantidade de dias dos meses. Ao final mostrar a precipitação média de chuva no mês
 * e o dia que ocorreu a maior chuva. 
 */

package br.estacio.poo.alunos.joao;

import java.util.Scanner;

public class Precipitacao {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		int numeroMes, qtdDias;
		double mediaChuva = 0;
		
		System.out.printf("Digite o número do mês: ");
		numeroMes = s.nextInt ();
		
		if (numeroMes <= 7) {
			if (numeroMes == 2)
				qtdDias = 28;
			else {
				if (numeroMes % 2 == 0)
					qtdDias = 30;
				else
					qtdDias = 31;
			}
		} else {
			if (numeroMes % 2 == 0)
				qtdDias = 31;
			else
				qtdDias = 30;
		}
		
		int[] precipitacoes = new int[qtdDias];
		
		for (int i = 0; i < qtdDias; i++) {
			System.out.printf("Digite a precipitação do dia %d: ", i + 1);
			precipitacoes[i] = s.nextInt ();
			
			mediaChuva += (double)precipitacoes[i]/qtdDias;
		}
		
		System.out.printf("Precipitação média do mês: %.2f\n", mediaChuva);
		
		System.out.printf ("A maior chuva o correu no dia: %d\n", maiorChuva (precipitacoes, qtdDias) + 1);
		
		s.close ();
		
	} // Fim do m�todo main
	
	static int maiorChuva (int[] p, int qtdDias) {
		int maior = 0;
		for (int i = 1; i < qtdDias; i++) {
			if (p[i] > p[maior])
				maior = i;
		}
		return maior;
	
	} // Fim do método maiorChuva
	
} // Fim da classe Precipitação
