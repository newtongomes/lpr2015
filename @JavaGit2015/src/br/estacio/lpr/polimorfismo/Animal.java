package br.estacio.lpr.polimorfismo;

public abstract class Animal 
{
	private String nome;
	private int idade;

	public Animal()
	{
	
	}
	
	public Animal(String nome, int idade) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
	
	public Animal(String nome)
	{
		this.nome = nome;
	}
	

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public abstract void emitirSom();

}
