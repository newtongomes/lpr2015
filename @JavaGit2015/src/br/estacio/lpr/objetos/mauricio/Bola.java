package br.estacio.lpr.objetos.mauricio;

public class Bola {
	// Definição de um tipo enumerado para os estados da Bola
	enum estadoBola {
		VAZIA, CHEIA
	}

	// Atributos
	float tamanho;
	String material;
	String cor;
	estadoBola estado;
	
	// Métodos
	void encher () {
		this.estado = estadoBola.CHEIA;
	}

	void esvaziar () {
		this.estado = estadoBola.VAZIA;
	}

	void pintar (String novoCor) {
		this.cor = novoCor;
	}

	void definirTamanho (float novoTamanho) {
		this.tamanho = novoTamanho;
	}

	void definirMaterial (String novoMaterial) {
		this.material = novoMaterial;
	}
	
	// Construtores
	Bola() {
		this.tamanho = 0.0f;
		this.material = "Borracha";
		this.cor = "Amarela";
		this.estado = estadoBola.VAZIA;
	}

	Bola(float tamanho, String material, String cor, estadoBola estado) {
		this.tamanho = tamanho;
		this.material = material;
		this.cor = cor;
		this.estado = estado;
	}
}
