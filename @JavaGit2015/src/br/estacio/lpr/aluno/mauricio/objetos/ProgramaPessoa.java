package br.estacio.lpr.aluno.mauricio.objetos;

import java.util.Scanner;

public class ProgramaPessoa {
	public static void main(String[] args) {
		final int NUM_PESSOAS = 2;
		Scanner teclado = new Scanner(System.in);
			
		Pessoa[] vetorPessoas = new Pessoa[NUM_PESSOAS];

		// Obtemos os dados das pessoas
		for (int i=0; i < NUM_PESSOAS; i++) {
			System.out.printf("Forneça o nome da pessoa %d: ", i + 1);
			String nome = teclado.nextLine();
			System.out.printf("Forneça o sexo da pessoa %d (H/M): ", i + 1);
			char sexo = teclado.nextLine().toUpperCase().charAt(0);
			System.out.printf("Forneça a idade da pessoa %d: ", i + 1);
			int idade = teclado.nextInt();
			System.out.printf("Forneça a altura da pessoa %d (m): ", i + 1);
			float altura = teclado.nextFloat();
			System.out.printf("Forneça a peso da pessoa %d (kg): ", i + 1);
			float peso = teclado.nextFloat();
			teclado.nextLine(); // Fixa o bug de Scanner
			vetorPessoas[i] = new Pessoa(nome, sexo, idade, altura, peso);
		}
		
		// Procuramos a pessoa com maior IMC
		int indice = 0;
		for (int i=1; i < NUM_PESSOAS; i++)
			if (vetorPessoas[i].calcularImc() > vetorPessoas[indice].calcularImc())
				indice = i;
		
		// Mostramos os dados da pessoa com maior IMC
		System.out.printf("A pessoa com maior IMC é " + vetorPessoas[indice].nome + 
							" de sexo %c, idade %d, altura %.2f e peso %.2f. E seu IMC é %.2f.%n", 
							vetorPessoas[indice].sexo, vetorPessoas[indice].idade,
							vetorPessoas[indice].altura, vetorPessoas[indice].peso,
							vetorPessoas[indice].calcularImc());

		// Fechamos o teclado para que eclipse não proteste (Warning)
        teclado.close();
	}
}
