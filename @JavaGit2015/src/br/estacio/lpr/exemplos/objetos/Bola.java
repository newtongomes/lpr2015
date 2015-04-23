package br.estacio.lpr.exemplos.objetos;

public class Bola 
{
	// atributos
	
	String cor;
	int tamnho;
	boolean estado;  // true=cheia   false=vazia
	
	// métodos
	
	void pintar(String novaCor)
	{
		cor = novaCor;
	}
	
	void encher()
	{
		estado = true;
	}
	
	void esvaziar()
	{
		estado = false;
	}
	
	

}
