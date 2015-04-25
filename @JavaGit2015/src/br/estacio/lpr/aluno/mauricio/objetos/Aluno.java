package br.estacio.lpr.aluno.mauricio.objetos;

public class Aluno {
	// Dados, propriedades (Atributos)
	String nome;
	float nota1;
	float nota2;
	
	// Operações, funcionalidades (MÉTODOS)
	float calcularMedia() {
		return (this.nota1 + this.nota2) / 2;
	}
	
	boolean foiAprovado() {
		return (calcularMedia() >= 6.0f);
	}
	
	// Construtores
	Aluno () {
		this.nome = "";
		this.nota1 = 0.0f;
		this.nota2 = 0.0f;
	}

	Aluno (String nome, float n1, float n2) {
		this.nome = nome;
		this.nota1 = n1;
		this.nota2 = n2;
	}
}
