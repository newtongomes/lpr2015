package br.estacio.lpr.exemplos;

public class ExemploString 
{

	public static void main(String[] args) 
	{
		int x;
		 x = 10;
		 
		 String teste;
		 
		 teste = "Thiago";

		 teste = new String();
		 
		 teste = new String("Programador Java Thiago");
		 
		 System.out.println("variavel String: " + teste);
		 
		 System.out.println("tamanho: "+ teste.length());
		 System.out.println(teste.toUpperCase());
		 System.out.println(teste.toLowerCase());
		 System.out.println(teste.substring(2,5));
		 System.out.println(teste.charAt(7));
		 System.out.println(teste.indexOf("ava"));
		 
		 teste = "Edson";
		 
		 String teste1 = "Edson";
		 
		 if (teste == teste1)
		 {
			 System.out.println("nome Edson");
		 }
		 else
			 System.out.println("nome diferente");
			 
		 
		

		
		
	}

}
