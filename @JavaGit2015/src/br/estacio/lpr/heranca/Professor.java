package br.estacio.lpr.heranca;

public abstract class Professor 
{
	protected int matricula;
	protected String nome;
	
	public Professor(int matricula, String nome) 
	{
		this.matricula = matricula;
		this.nome = nome;
	}

	public Professor() 
	{
		this.matricula = 0;
		this.nome = "";
	}
	
	public Professor(String nome)
	{
		this();
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public abstract float getSalario();

}
