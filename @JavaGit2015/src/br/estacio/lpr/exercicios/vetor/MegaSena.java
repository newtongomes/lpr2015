package br.estacio.lpr.exercicios.vetor;
import java.util.Random;

public class MegaSena {

	public static void main(String[] args) 
	{
		
		Random r = new Random();
		int vetor[] = new int[6];
		int aux = 0;
		
		for(int i = 0;i<vetor.length;i++)
		{
			aux = r.nextInt(60)+1;
			for(int x:vetor)
			{
				if(aux == x)
					aux = r.nextInt(60)+1;
			}
			vetor[i] = aux;
		}
		
		System.out.println("Valores:");
		for(int x = 0; x <vetor.length;x++)
		{
			System.out.printf("%d ", vetor[x]);
		}
	}
}
