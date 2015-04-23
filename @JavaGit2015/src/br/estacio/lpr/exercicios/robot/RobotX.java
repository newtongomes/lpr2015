package br.estacio.lpr.exercicios.robot;

public class RobotX
{
	// Atributos (dados) características ("variáveis")
	
	String nome;
	String cor;
	int tamanho;
	
	// Métodos (operações) - comportamento ("funções")
	
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
		System.out.println("Andando até "+destino);
	}

	// * SOBRECARGA DE MÉTODOS

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
		// Auto-Referência ao objeto atual (this.)
		// Estado do objeto: valores das características atuais de um objeto
	}
	
	void criar(String nome, String cor, int tamanho)
	{
		this.nome = nome;
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	
	
}







