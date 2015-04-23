package br.estacio.lpr.objetos;

public class Bola 
{
	// Atributos
	String material;
	int tamanho;
	String cor;
	boolean cheia;  // true=cheia  false=vazia

	// Métodos

	public void pintar(String cor)
	{
		this.cor = cor;
	}

	public void encher()
	{
		cheia = true;
	}

	void esvaziar()
	{
		cheia = false;
	}

	void criarBola(String c, String mat, int tam)
	{
		cor = c;
		material = mat;
		tamanho = tam;
		cheia = false;
	}
	
	void alterarTamanho(int tam)
	{
		tamanho = tam;
	}

	void alterarMaterial(String material)
	{
		this.material = material;
	}

    float obterTamanho()
    {
    	return this.tamanho;
    }
	

}
