package br.estacio.lpr.heranca;

public class ProfessorHorista extends Professor
{
	private float valorHora;
	private float numeroHoras;
	
	public ProfessorHorista(float valorHora, float numeroHoras) 
	{
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}

	public ProfessorHorista() 
	{
		this.valorHora = 0;
		this.numeroHoras = 0;
	}
	
	public ProfessorHorista(String nome)
	{
		this();
	}

	public float getSalario() 
	{
		return valorHora * numeroHoras;
	}

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
	
	public float calcularSalarioLiquido()
	{
		return (getSalario() - getSalario()*0.125f);
	}
	
}
