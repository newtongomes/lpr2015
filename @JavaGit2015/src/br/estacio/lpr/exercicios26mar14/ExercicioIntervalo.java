package br.estacio.lpr.exercicios26mar14;

import java.util.Random;
import javax.swing.JOptionPane;

public class ExercicioIntervalo 
{
	public static void main(String[] args) 
	{
		final int QUANTIDADE_NUMEROS = 200;
		final int VALOR_INICIAL = 1000;
		final int VALOR_FINAL = 10000;
		Random r = new Random();
		int numeros[] = new int[QUANTIDADE_NUMEROS];
		int inicio, fim, frequencia;

		// gerando os numeros de 1000 a 10000
		for (int i=0; i < QUANTIDADE_NUMEROS; i++) 
			numeros[i] = r.nextInt(VALOR_FINAL-VALOR_INICIAL+1) + VALOR_INICIAL;
		
		inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o inicio do intervalo: "));
		fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o final do intervalo: "));

		// contando numeros do intervalo
		frequencia = 0;
		for (int x : numeros)
			if (x >= inicio && x <= fim)
				frequencia++;

		for (int x : numeros)
			System.out.printf("%d ", x);

		
		// mostrando resultado
		JOptionPane.showMessageDialog(null,
				String.format("Frequencia de Numeros no Intervalo de %d a %d :\n" +
				"%03d números", inicio, fim , frequencia));

	}

}
