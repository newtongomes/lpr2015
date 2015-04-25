package br.estacio.lpr.aluno.mauricio.objetos;

public class Funcionario {
	// Atributos
	String nome;
	float salario;

	// Métodos
	float calcularSalarioLiquido() {
		return (this.salario <= 500.0f)? this.salario - 60.0f: this.salario - 90.0f;
	}

	// Construtores
	Funcionario() {
		this.nome = "";
		this.salario = 0.0f;
	}

	Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
}
