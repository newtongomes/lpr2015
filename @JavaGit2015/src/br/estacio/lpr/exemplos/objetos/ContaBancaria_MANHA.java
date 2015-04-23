package br.estacio.lpr.exemplos.objetos;

public class ContaBancaria_MANHA 
{
	// atributos
	private int numero;
	private String nomeCliente;
	private double saldo;
	
	//métodos
	
	public void abrirConta(int num, String cliente)
	{
		numero = num;
		nomeCliente = cliente;
		saldo = 0;
	}
	
	public void creditar(double valor)
	{
		saldo += valor;
	}
	
	public void debitar(double valor)
	{
		if (saldo >= valor)
		{
			saldo -= valor;
		}
		else
		{
			System.out.println("Saldo Insuficiente!");
		}
	}
	
	public double obterSaldo()
	{
		return saldo;
	}
	
	public void setNome(String novoNome)
	{
		nomeCliente = novoNome;
	}
	
	public String getNomeCliente()
	{
		return nomeCliente;
	}
	

}
