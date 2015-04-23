package br.estacio.lpr.exemplos.objetos;

public class Exemplo 
{
	// Atributos
	private int codigo;
	private String nome;
	
	
	// Construtores
	
	public Exemplo()
	{
		codigo = 0;
		nome = "";
	}
	
	public Exemplo(int codigo, String nome)
	{
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Exemplo(String nome)
	{
		this.codigo = 0;
		this.nome = nome;
		
	}
	
	// Métodos
	
	public void mostrarObjeto()
	{
		System.out.println("Codigo = "+codigo);
		System.out.println("Nome = "+nome);
		
	}
	
	public void mostrarObjeto(int x)
	{
		System.out.println("Codigo = "+codigo);
		System.out.println("Nome = "+nome);
		
	}

	public void mostrarObjeto(int codigo,int teste)
	{
		System.out.println("Codigo = "+codigo);
		System.out.println("Nome = "+nome);
		
	}



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
	
	public String toString()
	{
		return "nome="+nome+" codigo:("+codigo+")";
	}
	

}
