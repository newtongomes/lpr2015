package br.estacio.lpr.faculdade;

public interface IEmpregadoComSalario 
{
	
	public final float DESCONTO = 12.5f;
	
	public float getSalario();

	public float calcularSalarioLiquido();
	
	public void mostrarSalario();

}
