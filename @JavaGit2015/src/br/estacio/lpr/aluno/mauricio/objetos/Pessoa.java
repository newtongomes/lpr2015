package br.estacio.lpr.aluno.mauricio.objetos;

public class Pessoa {
	// Atributos
	String nome;
	char sexo;
	int idade;
	float altura;
	float peso;

	// Métodos
	float calcularImc() {
		return this.peso / (this.altura * this.altura);
	}
	
	// Construtores
	Pessoa() {
		this.nome = "";
		this.sexo = ' ';
		this.idade = 0;
		this.altura = 0.0f;
		this.peso = 0.0f;
	}

	Pessoa(String nome, char sexo, int idade, float altura, float peso) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
}
