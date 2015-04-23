package br.estacio.lpr.polimorfismo;

public class Preguica extends Animal 
{
	public Preguica()
	{
		super();
	}

	public Preguica(String nome, int idade) 
	{
		super(nome, idade);
	}

	public void emitirSom() 
	{
		System.out.println("humm!");
	}
	
	public void subirArvore()
	{
		System.out.println("subindo lentamente");
	}

}
