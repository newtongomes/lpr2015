package br.estacio.lpr.objetos;

public class Pessoa 
{
	String nome;
	char sexo;
	int idade;
	float altura;
	float peso;
	
	float calcularIMC()
	{
		return (float) (peso/Math.pow(altura,2));
	}
	
}
