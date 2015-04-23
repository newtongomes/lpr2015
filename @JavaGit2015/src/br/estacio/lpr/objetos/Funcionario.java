package br.estacio.lpr.objetos;

public class Funcionario 
{
	String nome;
	float salario;
	
	float salarioLiquido()
	{
		if (salario <= 500)
			return salario-60;
		else
			return salario-90;
	}

}
