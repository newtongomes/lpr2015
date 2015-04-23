package br.estacio.lpr.biblioteca;

public class zzzLivro 
{
	private int codigo;
	private String titulo;
	private String autor;
	private String ISBN;
	private int numPaginas;
	private float valorCompra;
	
	public zzzLivro() 
	{ }

	public zzzLivro(int codigo, String ISBN, String titulo, String autor, 
			int numPaginas, float valorCompra) 
	{
		setAutor(autor);
		setCodigo(codigo);
		setISBN(ISBN);
		setNumPaginas(numPaginas);
		setTitulo(titulo);
		setValorCompra(valorCompra);
	}

	public int getCodigo() 
	{ return codigo; }

	public String getTitulo() 
	{ return titulo; }

	public String getAutor() 
	{ return autor; }

	public String getISBN() 
	{ return ISBN; }

	public int getNumPaginas() 
	{ return numPaginas; }

	public float getValorCompra() 
	{ return valorCompra; }

	public void setCodigo(int codigo) 
	{ this.codigo = codigo; }

	public void setTitulo(String titulo) 
	{ this.titulo = titulo; }

	public void setAutor(String autor) 
	{ this.autor = autor; }

	public void setISBN(String ISBN) 
	{ this.ISBN = ISBN; }

	public void setNumPaginas(int numPaginas) 
	{ 
		if (numPaginas < 0)
			this.numPaginas = 0;
		else
			this.numPaginas = numPaginas; 
	}

	public void setValorCompra(float valorCompra) 
	{ 
		if (valorCompra < 0)
			this.valorCompra = 0;
		else
			this.valorCompra = valorCompra; }
	
}
