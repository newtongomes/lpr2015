package br.estacio.lpr.exercicios.robot;

public class RobotX
{
	// Atributos (dados) caracter�sticas ("vari�veis")
	
	String nome;
	String cor;
	int tamanho;
	
	// M�todos (opera��es) - comportamento ("fun��es")
	
	void andar()
	{
		System.out.println("Andando...");
	}
	
	void andar(int metros)
	{
		System.out.println("Andando "+metros+" metros.");
	}
	
	void andar(int origem,int destino)
	{
		System.out.println("Andando at� "+destino);
	}

	// * SOBRECARGA DE M�TODOS

	void quemEhVoce()
	{
		System.out.println("nome = "+nome);
		System.out.println("cor = "+cor);
		System.out.println("tamanho = "+tamanho);
	}
	
	void qualSeuNome()
	{
		System.out.println("nome = "+nome);
	}
	
	void pintar(String cor)
	{
		this.cor = cor;
		// Auto-Refer�ncia ao objeto atual (this.)
		// Estado do objeto: valores das caracter�sticas atuais de um objeto
	}
	
	void criar(String nome, String cor, int tamanho)
	{
		this.nome = nome;
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	
	
}







