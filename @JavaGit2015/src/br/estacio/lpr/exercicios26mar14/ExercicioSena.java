package br.estacio.lpr.exercicios26mar14;

import java.util.Random;

public class ExercicioSena 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int dezena[] = new int[6];
		int aux = 0;
		boolean teste; 

		// gerando as dezenas com repetição
		//for (int i=0; i < dezena.length; i++) 
		//	dezena[i] = r.nextInt(60) + 1;
		
		// gerando as dezenas sem repetição
		for (int i=0; i < dezena.length; i++) 
		{
			teste = true;
			while (teste)
			{
				dezena[i] = r.nextInt(60) + 1;
				teste = false;
				for (int j=0; j<i; j++)
					if (dezena[i] == dezena[j])
						teste = true;
			}
		}
		
		// ordenando dezenas do vetor
		for(int i=0; i<dezena.length-1; i++)
			for(int j=i+1; j<dezena.length; j++)
				if (dezena[i] > dezena[j])
				{
					aux = dezena[i];
					dezena[i] = dezena[j];
					dezena[j] = aux;
				}

		// mostrando as dezenas geradas
		System.out.println("Dezenas da Mega-Sena: ");
		for (int x : dezena)
			System.out.printf("%02d ", x);
	}

}
