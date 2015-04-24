/*	Deseja-se calcular o salário líquido de um grupo de 10 funcionários de uma empresa,
 *	e ainda o total a ser pago a estes funcionários. Cada funcionário deve entrar com sua
 *	matrícula, nome e o salário bruto. O salário líquido será calculado com um desconto de 6% 
 *	se o salário do funcionário for até R$ 1.500,00 e 9,5% para os salários maiores que esse valor.
 *	Ao final mostrar a lista de todos os funcionários com seus dados e o salário líquido de cada um.
 *	E ainda o total geral a ser pago aos funcionários.
 */

package br.estacio.lpr.exercicios.nivel3;

import java.util.Scanner;

public class Funcionarios {
	
	public static void main (String[] args) {
		final int numeroFuncionarios = 10;
		Scanner s = new Scanner (System.in);
		double totalPagar = 0;
		
		int[] matriculas = new int[numeroFuncionarios];
		String[] nomes = new String[numeroFuncionarios];
		double[] salariosBrutos = new double[numeroFuncionarios];
		double[] salariosLiquidos = new double[numeroFuncionarios];
		
		for (int i = 0; i < numeroFuncionarios; i++) {
			System.out.printf("Funcionário %d:\n", i + 1);
			
			System.out.printf ("\tDigite a matricula: ");
			matriculas[i] = s.nextInt ();
			
			s.nextLine ();
			
			System.out.printf ("\tDigite o nome: ");
			nomes[i] = s.nextLine ();
			
			System.out.printf("\tDigite o salário bruto: ");
			salariosBrutos[i] = s.nextDouble();
			
			salariosLiquidos[i] = calculaSalario (salariosBrutos[i]);
			totalPagar += salariosLiquidos[i];
		}
		
		System.out.printf ("\n\n");
		
		for (int i = 0; i < numeroFuncionarios; i++) {
			System.out.printf("\nFuncionário %d:\n", i + 1);
			
			System.out.printf ("\tMatrícula: %d\n", matriculas[i]);
			System.out.printf ("\tNome: %s\n", nomes[i]);
			System.out.printf ("\tSalário Bruto: %.2f\n", salariosBrutos[i]);
			System.out.printf ("\tSalário Líquido: %.2f\n", salariosLiquidos[i]);
		}
		System.out.printf ("\n\nTotal a pagar: %.2f\n", totalPagar);
		s.close ();
		
	} // Fim do método main
	
	static double calculaSalario (double salario) {
		double novoSalario = salario;
		if (salario > 1500.0)
			novoSalario *= 0.905;
		else
			novoSalario *= 0.94;
		
		return novoSalario;
	
	} // Fim do método calculaSalario
	
}
