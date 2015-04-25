package br.estacio.lpr.aluno.douglas.exercicios.grupo3;
import java.util.Scanner;

public class MediaPesos 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		int pesoAte10 = 0,cont10 = 0;
		int peso11A20 = 0,cont11A20 = 0;
		int peso21A30 = 0,cont21A30 = 0;
		int pesoAcima30 = 0,contAcima30 = 0;
		int idade,peso;
		
		for (int i = 0; i<15;i++)
		{
			System.out.println("Digite a idade:");
			idade = input.nextInt();
			System.out.println("Digite o peso:");
			peso = input.nextInt();
			if(idade <= 10)
			{
				cont10 += 1;
				pesoAte10 += peso;
			}
			else if(idade > 10 && idade <= 20)
				{
					cont11A20 += 1;
					peso11A20 += peso;
				}
			else if( idade >20 && idade <= 30)
			{
				cont21A30 += 1;
				peso21A30 += peso;
			}
			else
			{
				contAcima30 += 1;
				pesoAcima30 += peso;
			}
		}
		System.out.println("Valores:");
		if(cont10 != 0)
			{
			System.out.printf("Total de pessoas com idade de ate 10 anos: %d.\tMedia do peso: %.2f",
					cont10,(float)(pesoAte10/cont10));
			}
			else
				System.out.println("Nenhuma pessoa com idade ate 10 anos!");
		if(cont11A20 != 0)
			{
			System.out.printf("Total de pessoas com idade de 11 ate 20 anos: %d.\tMedia do peso: %.2f",
					cont11A20,(float)(peso11A20/cont11A20));
			}
			else
				System.out.println("Nenhuma pessoa com idade de 11 ate 20 anos!");
		if(cont21A30 != 0)
			{
			System.out.printf("Total de pessoas com idade de 21 ate 30 anos: %d.\tMedia do peso: %.2f",
					cont21A30,(float)(peso21A30/cont21A30));
			}
			else
				System.out.println("Nenhuma pessoa com idade de 21 ate 30 anos!");
		if(contAcima30 != 0)
			{
			System.out.printf("Total de pessoas com idade acima de 30 anos: %d.\tMedia do peso: %.2f",
					contAcima30,(float)(pesoAcima30/contAcima30));
			}
			else
				System.out.println("Nenhuma pessoa com idade acima 30 anos!");
	}
}