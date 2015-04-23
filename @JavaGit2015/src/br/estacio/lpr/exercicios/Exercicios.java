package br.estacio.lpr.exercicios;

/*
-Programas Java
1-gerar num vetor 6 dezenas da Mega-Sena, 
mostrar os número em ordem crescente ("sem duplicatas").
2-gerar 200 numeros entre 1000 e 10000 e contar a frequencia de um intervalo

utilizar as classes: JOptionPane, Math, String
apresentar o API-Docs (java.oracle.com)

 */
public class Exercicios 
{

	public static void main(String[] args) 
	{
		String nome;
		
		nome = "Antonio";
		

		nome.length();
		System.out.println(nome+"\ntamanho = "+nome.length());
		 nome.charAt(2);
		 nome.substring(3,5);
		 nome.indexOf("nt");
		 nome.toLowerCase();
		 nome.toUpperCase();
		 nome.equals("Luiz");
		 nome.compareTo("ANTONIO");
		 nome.compareToIgnoreCase("Alberto");
		 nome.replace("nt","xx");
		 
		 int teste;
		 teste = soma(4,7);
	

	}
	
	static int soma(int x, int y)
	{
		int s;
		s = x+y;
		return s;
	}
	
	

}
