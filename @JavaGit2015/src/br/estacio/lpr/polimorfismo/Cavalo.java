package br.estacio.lpr.polimorfismo;

public class Cavalo extends Animal 
{
	public Cavalo()
	{
		super();
	}

	public Cavalo(String nome, int idade) 
	{
		super(nome, idade);
	}

	public void emitirSom() 
	{
		System.out.println("hi!hi!hi!hi!");
	}
	
	public void correr()
	{
		System.out.println("correndo...pocotó!pocotó!");
	}

}
