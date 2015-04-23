package br.estacio.lpr.faculdade;

public abstract class Professor implements IEmpregadoComSalario
{
	// Atributos
	
	private int matricula;
	private String nome;
	
	// Construtores
	
	public Professor()
	{
		
	}

	public Professor(int matricula, String nome) 
	{
		this.matricula = matricula;
		this.nome = nome;
	}

	
	//Métodos
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract float getSalario();
	

}
