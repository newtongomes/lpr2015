package br.estacio.lpr.objetos;

/*
 * Elaborar um programa para calcular a media de um aluno 
 * com duas notas, em seguida mostrar o nome do aluno com 
 * a sua m�dia e o resultado de aprova��o considerando a m�dia >= 6.
 */
public class Aluno 
{
	// dados, propriedades (ATRIBUTOS)
	String nome;
	float nota1;
	float nota2;
	
	// opera��es, fun��es, funcionalidades (M�TODOS)
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
			System.out.println(nome + " est� APROVADO!");
		else
			System.out.println(nome + " est� REPROVADO!");
	}
}
