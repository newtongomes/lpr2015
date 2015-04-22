package br.estacio.douglas.exercicios.grupo1;
import java.util.Scanner; // classe que irá tratar a entrada de dados pelo teclado.

public class MediaAluno 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		// Programa que armazena três notas de alunos e calcula sua média.
		
		double av1,av2,av3, media;
		String nome;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno(a):");
		nome = input.nextLine();
		System.out.println("Informe as notas de av1,av2 e av3:");
		System.out.println("av1:");
		av1 = input.nextDouble();
		System.out.println("av2:");
		av2 = input.nextDouble();
		System.out.println("av3:");
		av3 = input.nextDouble();
		
		if(av1 > av2 && av1 > av3)
		{
			if(av2 > av3)
				media = (av1+av2)/2;
			else
				media = (av1+av3)/2;
		}
		else
		{
			if(av2 > av3)
			{
				if(av1 > av3)
					media = (av2+av1)/2;
				else
					media = (av2+av3)/2;
			}
			else
			{
				if(av1 > av2)
					media = (av3+av1)/2;
				else
					media = (av3+av2)/2;
			}
		}
		
		System.out.printf("A media do aluno(a) - %s foi %.2f.",nome,media);
	}

}
