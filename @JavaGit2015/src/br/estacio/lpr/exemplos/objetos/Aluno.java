package br.estacio.lpr.exemplos.objetos;

public class Aluno 
{
	//atributos
	
	String nome;
	float nota1;
	float nota2;
	
	//m�todos
	
	float calcularMedia()  // par�metros ???
	{
		float media;
		media = (nota1+nota2)/2;
		return media;

		//return (nota1+nota2)/2;

	}
	
	void verificarAprovacao()  //(CERTO/ERRADO?)
	{
		if (calcularMedia() >= 6)
		   System.out.println("APROVADO"); // return "APROVADO";
		else
		   System.out.println("REPROVADO"); // return "REPROVADO";

		//return (calcularMedia() >= 6) ? "APROVADO" : "REPROVADO");
		//return (calcularMedia() >= 6);

	}

}
