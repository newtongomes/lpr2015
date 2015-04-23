package br.estacio.lpr.objetos;

/*
 * Elaborar um programa para calcular a media de um aluno 
 * com duas notas, em seguida mostrar o nome do aluno com 
 * a sua média e o resultado de aprovação considerando a média >= 6.
 */
public class Aluno 
{
	// dados, propriedades (ATRIBUTOS)
	String nome;
	float nota1;
	float nota2;
	
	// operações, funções, funcionalidades (MÉTODOS)
	float calcularMedia()
	{
		float media;
		media = (nota1+nota2)/2;
		return media;
		
	}
	
	void mostrarResultado()
	{
		float m;
		m = calcularMedia();
		if (m > 6)
			System.out.println(nome + " está APROVADO!");
		else
			System.out.println(nome + " está REPROVADO!");
	}
}
