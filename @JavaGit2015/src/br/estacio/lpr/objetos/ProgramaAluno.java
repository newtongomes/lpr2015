package br.estacio.lpr.objetos;

import java.util.Scanner;

public class ProgramaAluno {

	public static void main(String[] args) 
	{
		
		Aluno a1;
		
		a1 = new Aluno();
		
	    Scanner sc = new Scanner(System.in); 
		
	    System.out.print("nome do aluno: ");
		a1.nome = sc.next();
	    System.out.print("primeira nota: ");
		a1.nota1 = sc.nextFloat();
	    System.out.print("segunda nota: ");
		a1.nota2 = sc.nextFloat();
		
		System.out.println("Media do Aluno = " + a1.calcularMedia());
		
		a1.mostrarResultado();

		sc.close();
	}

}


/*
		a1.nome = "Antonio";
		a1.nota1 = 7;
		a1.nota2 = 6.3f;
		
		a1 = new Aluno();
		
		System.out.println("Media = " + a1.calcularMedia());
		
		a1.mostrarResultado();
 */
