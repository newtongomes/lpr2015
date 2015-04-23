package br.estacio.lpr.exemplos.objetos;

public class OlaMundo {

	public static void main(String[] args) 
	{
		Pessoa p = new Pessoa();
		
		p.nome = "Mundo";
		
		p.cumprimentar();

	}

}


class Pessoa
{
	// Atributos (Estado)
	
	String nome;
	
	
	// M�todos (Comportamento)
	
	void cumprimentar()
	{
		System.out.println("Ol�, "+nome+"!");
	}

}


