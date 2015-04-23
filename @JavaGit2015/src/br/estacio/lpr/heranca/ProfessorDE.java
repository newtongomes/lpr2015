package br.estacio.lpr.heranca;

public class ProfessorDE extends Professor
{
	private float salario;
	
	public ProfessorDE(float salario) 
	{
		this.salario = salario;
	}

	public ProfessorDE() 
	{
		this.salario = 0;
	}
	
	public ProfessorDE(String nome)
	{
		this();
		this.nome = nome;
	}

	public float getSalario()
	{
		return this.salario;
	}
	
	public void setSalario(float salario) 
	{
		this.salario = salario;
	}
	
	public float calcularSalarioLiquido()
	{
		return (salario - salario*0.125f);
	}
	

}
