package br.estacio.lpr.aluno.mauricio.objetos;

import java.util.Scanner;

public class ProgramaFuncionario {
	public static void main(String[] args) {
		final int NUM_FUNCIONARIOS = 3;
		Scanner teclado = new Scanner(System.in);
			
		Funcionario[] vetorFuncionarios = new Funcionario[NUM_FUNCIONARIOS]; 
		
		// Obtemos os funcionarios
		for (int i=0; i < NUM_FUNCIONARIOS; i++) {
			System.out.printf("Forneça o nome do funcionario %d: ", i + 1);
			String nome = teclado.nextLine();
			System.out.printf("Forneça o salario do funcionario %d: ", i + 1);
			float salario = teclado.nextFloat();
			teclado.nextLine(); // Fixa o bug de Scanner
			vetorFuncionarios[i] = new Funcionario(nome, salario);
		}
		
		// Mostramos os salarios liquidos dos empleados e calculamos o total da empresa
		float salarioLiquidoTotal = 0.0f;
		for (int i=0; i < NUM_FUNCIONARIOS; i++) {
			System.out.printf("O funcionario " + vetorFuncionarios [i].nome + 
								" tem um salario liquido de %.2f R$.%n", 
								vetorFuncionarios[i].calcularSalarioLiquido());
			salarioLiquidoTotal += vetorFuncionarios[i].calcularSalarioLiquido();
		}
		System.out.printf("O salário líquido total da empresa é %.2f R$.%n",
							salarioLiquidoTotal);
		
        // Fechamos o teclado para que eclipse não proteste (Warning)
        teclado.close();
	}
}
