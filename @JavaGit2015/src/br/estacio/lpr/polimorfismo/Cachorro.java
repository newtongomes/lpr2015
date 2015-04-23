package br.estacio.lpr.polimorfismo;

public class Cachorro extends Animal 
{
	public Cachorro()
	{
		super();
	}
	
	public Cachorro(String nome, int idade) 
	{
		super(nome, idade);
	}

	public void emitirSom() 
	{
		System.out.println("au!au!au!");
	}
	
	public void correr()
	{
		System.out.println("correndo...");
	}
	
}
