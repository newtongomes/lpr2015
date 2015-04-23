package br.estacio.lpr.exemplos.objetos;

public class ContaBancaria 
{
	// Atributos
	
	private int numero;
	private String nomeCliente;
	private double saldo;	
	
	// Construtores
	
	public ContaBancaria(int numero, String nomeCliente)
	{
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		this.saldo = 0;
	}

	public ContaBancaria()
	{
		this.numero = 0;
		this.nomeCliente = "";
		this.saldo = 0;
	}
	
	//Métodos

	public void abrirConta(int num, String nome)
	{
		this.numero = num;
		this.nomeCliente = nome;
		this.saldo = 0;
	}
	
	public void creditar(double valor)
	{
		this.saldo += valor;
	}
	
	public void debitar(double valor)
	{
		if (this.saldo >= valor)
		{
			this.saldo -= valor;
		}
		else
		{
			System.out.println("Saldo Insuficiente!");
		}
	}

	public double getSaldo()
	{
		return this.saldo;
	}
	
	public String getNomeCliente()
	{
		return this.nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente)
	{
		this.nomeCliente = nomeCliente;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
		
	public void setNumero(int numero)
	{
		this.numero = numero;
	}

}
