package br.estacio.lpr.faculdade;

public class ProfessorDE extends Professor
{
	// Atributos
	
	private float salario;
	
	// Construtores
	
	public ProfessorDE()
	{
		
	}

	public ProfessorDE(int matricula, String nome, float salario) 
	{
		super(matricula,nome);
		//setMatricula(matricula);
		//setNome(nome);
		this.salario = salario;
	}

	
	//Métodos
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float calcularSalarioLiquido()
	{
		return salario - salario*0.12f;
	}

	public void mostrarSalario() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
