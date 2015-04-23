package br.estacio.lpr.exemplos;
import java.util.Scanner;

/*
Ler o nome e três de uma aluno, calcular a média das notas 
e o resultado: Aprovado ou Reprovado (média de aprovação 6,0).
*/

public class MediaAluno 
{
	public static void main(String[] args) 
	{
		System.out.println("* Aluno *");
		Scanner teclado = new Scanner(System.in);
		String nome;
		float nota1, nota2, nota3, media;
		
		System.out.print("Digite o nome do aluno: ");
		nome = teclado.nextLine();
		System.out.print("Digite a primeira nota: ");
		nota1 = teclado.nextFloat();
		System.out.print("Digite a segunda nota: ");
		nota2 = teclado.nextFloat();
		System.out.print("Digite a terceira nota: ");
		nota3 = teclado.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.printf("Média do aluno %s = %.1f\n",nome,media);
		
		if (media >= 6)
			System.out.println("Aluno Aprovado! :))");
		else
			System.out.println("Aluno Reprovado :(");

		teclado.close();
		
	}

}
