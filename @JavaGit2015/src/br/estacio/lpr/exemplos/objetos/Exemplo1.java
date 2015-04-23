package br.estacio.lpr.exemplos.objetos;

public class Exemplo1 
{
	// Atributos

	private int codigo;
	private String nome;
	private int idade;

	// Construtores
	
	public Exemplo1()
	{
		this.codigo = 0;
		this.nome = "";
	}
	
	
	public Exemplo1(int codigo, String nome)
	{
		this.codigo = codigo;
		this.nome = "Adriano";
	}
	
	public Exemplo1(String nome)
	{
		this.codigo = 0;
		this.nome = nome;
	}
	
	
	// Métodos
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void mostrarObjeto()
	{
		System.out.println("Codigo="+codigo);
		System.out.println("Nome="+nome);
	}

	public void mostrarObjeto(int x)
	{
		System.out.println("Codigo="+codigo);
		System.out.println("Nome="+nome);
	}
	
	
	public String toString()
	{
		return "Nome: "+nome+" Cod.: "+codigo;
	}
	

}
