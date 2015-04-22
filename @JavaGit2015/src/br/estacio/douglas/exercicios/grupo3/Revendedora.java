package br.estacio.douglas.exercicios.grupo3;
import java.util.Scanner;

public class Revendedora 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String nome;
		int quantCarros;
		final float salario = 722.00f;
		final float comissao = 150.00f;
		float vendas;
		float salarioTotal;
		
		System.out.println("Informe o nome do vendedor:");
		nome = input.nextLine();
		System.out.printf("informe a quantidade de carros vendidos por %s",nome);
		quantCarros = input.nextInt();
		System.out.printf("Informe o total das vendas de %s:",nome);
		vendas = input.nextFloat();
		salarioTotal = (salario*2)+(quantCarros*comissao)+(vendas*0.05f);
		
		System.out.printf("O salario total do vendedor %s e igual a - R$ %,.2f",nome,salarioTotal);
		
	}
}
