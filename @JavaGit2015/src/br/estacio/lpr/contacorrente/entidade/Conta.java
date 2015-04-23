package br.estacio.lpr.contacorrente.entidade;

public class Conta 
{
	// atributos - ESTADO
	private int numeroConta;
	private String nomeCliente;
	private double saldo;
	private String[] historico;
	private int contador = 0;
	
	// métodos - COMPORTAMENTO
	public void movimentar(double valor, char tipo)
	{
		if (tipo == 'C' || tipo == 'c')
		{
			creditar(valor);
		}
		else
			if (tipo == 'D' || tipo == 'd')
			{
				debitar(valor);
			}	
	}
	
	public void creditar(double valor)
	{
		if (valor > 0)
		{
			saldo += valor;
			if (contador < 1000)
				historico[contador++] = "Creditou R$ "+valor; 
		}
	}
	
	public void debitar(double valor)
	{
		if (saldo >= valor && valor > 0)
		{
			saldo -= valor;
			if (contador < 1000)
				historico[contador++] = "Debitou R$ "+valor; 
		}
	}
	
	public double consultarSaldo()
	{
		return saldo; 
	}
	
	public void criarConta(int conta, String cliente)
	{
		numeroConta = conta;
		nomeCliente = cliente;
		saldo = 0;
		historico = new String[1000];
	}
	
	public void alterarNome(String nome)
	{
		nomeCliente = nome;
	}
	
	public void mostrarHistorico()
	{
		for(int i=0; i < contador; i++)
			System.out.println(historico[i]);
	}

}
