package br.estacio.lpr.heranca;

public class Fornecedor extends Pessoa 
{
	private float valorCredito;
	private float valorDivida;
	
	
	public Fornecedor()
	{
		
	}
	
	
	public Fornecedor(String nome, String endereco, String telefone,
			float valorCredito, float valorDivida) {
		
		this();
		
		//super(nome, endereco, telefone);
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	
	
	public float getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}
	public float getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public float obterSaldo()
	{
		return this.valorCredito - this.valorDivida;
	}
	
	
	

}
