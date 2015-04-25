/* Ler o nome e o sobrenome de uma pessoa, em seguida mostrar as formações:
 *	a) Nome Sobrenome.
 *	b) N.S.
 *	c) Nome, S.
 *	d) S., Nome.
 *	e) NOME Sobrenome.
 */

package br.estacio.poo.alunos.joao;

import java.util.Scanner;

public class Nomes {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome, sobreNome;
		
		
		System.out.printf("Digite o seu nome: ");
		nome = s.nextLine();
		
		System.out.printf("Digite o seu sobrenome: ");
		sobreNome = s.nextLine();
		
		System.out.println(nome.toUpperCase().charAt(0) + nome.substring(1).toLowerCase() + " " 
		+ sobreNome.toUpperCase().charAt(0) + sobreNome.substring(1).toLowerCase() + ".");
		
		System.out.println(nome.toUpperCase().charAt(0) + "." + sobreNome.toUpperCase().charAt(0) + ".");
		
		System.out.println(nome.toUpperCase().charAt(0) + nome.substring(1).toLowerCase() + ", " 
		+ sobreNome.toUpperCase().charAt(0) + ".");
		
		System.out.println(sobreNome.toUpperCase().charAt(0) +"., " + 
		nome.toUpperCase().charAt(0) + nome.substring(1).toLowerCase() + ".");
		
		System.out.println(nome.toUpperCase() + " " 
		+ sobreNome.toUpperCase().charAt(0) + sobreNome.substring(1).toLowerCase() + ".");
		
		
		s.close();
		
	} // Fim do método main
} // Fim da classe Nomes
