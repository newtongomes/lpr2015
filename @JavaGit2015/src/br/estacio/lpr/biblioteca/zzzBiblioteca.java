package br.estacio.lpr.biblioteca;

public class zzzBiblioteca 
{
	private String nome;
	private String local;
	private int capacidade;
	private zzzLivro[] livros;
	private int quantidade;
	
	public zzzBiblioteca() 
	{ }

	public zzzBiblioteca(String nome, String local, int capacidade) 
	{
		setLocal(local);
		setNome(nome);
		livros = new zzzLivro[capacidade];
		this.capacidade = capacidade;
		quantidade = 0;	
	}

	public zzzBiblioteca(String nome) 
	{
		setNome(nome);
	}

	public String getNome() 
	{ return nome; }

	public String getLocal() 
	{ return local; }

	public int getCapacidade() 
	{ return capacidade; }

	public int getQuantidade() 
	{ return quantidade; }

	public void setNome(String nome) 
	{ this.nome = nome; }

	public void setLocal(String local) 
	{ this.local = local; }

	public void criaLivros(int capacidade) throws Exception
	{ 
            if (capacidade > 100)
                throw new IllegalArgumentException("Erro de capacidade!");
            else 
            {
		this.capacidade = capacidade;
		livros = new zzzLivro[capacidade]; 
                this.quantidade = 0;
            }
	}
	
	public void incluirLivro(zzzLivro livro)
	{ 
		/*for(int i=0;i<getCapacidade();i++)
			if (livros[i]==null)
			{
				livros[i] = livro;
				break;
			}
		*/
            
            try {
                if (livro == null)
                    throw new NullPointerException("Erro de Objeto Livro null");
                else

                    if (quantidade < capacidade)
                    {
			quantidade++;
			livros[quantidade-1] = livro;
                    }
                else
                     throw new IndexOutOfBoundsException("Cadasto cheio");
            }
            catch(NullPointerException e)
            {
                
            }
            catch(IndexOutOfBoundsException e)
            {
                
            }
            catch(Exception e)
            {
                
            }
                    
                    
	}
	
	public zzzLivro obterLivro(int cod)
	{
		for(int i=0;i<quantidade;i++)
		{
			if (livros[i] != null)
			{
				if (livros[i].getCodigo() == cod)
				{
					return livros[i];
				}
			}
		}
                
                for(zzzLivro liv : livros)
                {
			if (liv != null)
			{
				if (liv.getCodigo() == cod)
				{
					return liv;
				}
			}
                }
                
                
		return null;
	}
	
	public zzzLivro obterLivro(String tit)
	{ 
		for(int i=0;i<quantidade;i++)
		{
			if (livros[i] != null)
			{
				if (livros[i].getTitulo().indexOf(tit) >= 0)
				{
					return livros[i];
				}
			}
		}
		return null;
	}
	
	public zzzLivro getLivro(int posicao)
	{
		if (posicao < quantidade)
			return livros[posicao];
		else
			return null;
	}
	
}
