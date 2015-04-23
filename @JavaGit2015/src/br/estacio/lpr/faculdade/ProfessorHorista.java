package br.estacio.lpr.faculdade;

public class ProfessorHorista extends Professor
{
	// Atributos
	
	private float valorHora;
	private float numeroHoras;
	
	// Construtores
	
	public ProfessorHorista()
	{
		
	}

	
	public ProfessorHorista(int matricula, String nome, float valorHora,
			float numeroHoras) 
	{
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}


	
	//Métodos
	
	public float getValorHora() {
		return valorHora;
	}


	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}


	public float getNumeroHoras() {
		return numeroHoras;
	}


	public void setNumeroHoras(float numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public float getSalario()
	{
		return numeroHoras*valorHora;
	}

	public float calcularSalarioLiquido()
	{
		return getSalario() - getSalario()*0.12f;
	}


	public void mostrarSalario() 
	{

		
	}
	
	
	

}
