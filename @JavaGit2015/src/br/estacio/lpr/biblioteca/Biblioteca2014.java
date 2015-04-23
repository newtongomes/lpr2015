package br.estacio.lpr.biblioteca;

import java.util.ArrayList;

public class Biblioteca2014 
{
	private String nome;
	private String local;
	private ArrayList<Livro2014> livros;
	
	public Biblioteca2014() 
	{ 
		livros = new ArrayList<Livro2014>();
	}

	public Biblioteca2014(String nome) 
	{
		this();
		setNome(nome);
	}

	public Biblioteca2014(String nome, String local) 
	{
		this(nome);
		setLocal(local);
	}

	public String getNome() 
	{ 
		return nome; 
	}

	public String getLocal() 
	{
		return local;
	}

	public int getQuantidade() 
	{
		return livros.size();
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public void setLocal(String local) 
	{
		this.local = local;
	}

	public void incluirLivro(Livro2014 livro) throws NullPointerException
	{
		if (livro == null)
		{
			throw new NullPointerException("Erro de Objeto Livro null");
		}
        else
        {
        	livros.add(livro);
        }
	}
	
	public Livro2014 obterLivro(int cod)
	{
		for(Livro2014 livro : livros)
		{
			if (livro != null)
			{
				if (livro.getCodigo() == cod)
				{
					return livro;
				}
			}
		}
		return null;
	}
	
	public ArrayList<Livro2014> obterLivro(String tit)
	{
		ArrayList<Livro2014> lista = new ArrayList<Livro2014>();
		
		for(Livro2014 livro : livros)
		{
			if (livro != null)
			{
				if (livro.getTitulo().indexOf(tit) >= 0)
				{
					lista.add(livro);
				}
			}
		}
		return lista;
	}
	
	public Livro2014 getLivro(int posicao) throws IndexOutOfBoundsException
	{
		if (posicao < this.getQuantidade()) 
			return livros.get(posicao);
		else
			throw new IndexOutOfBoundsException("�ndice de Livro Inv�lido!");
	}
	
}
