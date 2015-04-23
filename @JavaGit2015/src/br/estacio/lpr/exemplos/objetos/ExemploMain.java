package br.estacio.lpr.exemplos.objetos;

public class ExemploMain 
{

	public static void main(String[] args) 
	{
		System.out.println("inicio");
		
		Exemplo1 teste;
		
		teste = new Exemplo1();
		
		
		teste.setCodigo(10);
		teste.setNome("José");
	
		//teste.mostrarObjeto();
		
		System.out.println("Codigo = "+teste.getCodigo());
		System.out.println("Nome = "+teste.getNome());
		
		System.out.println(teste.toString());
		
		
		
		
	
		System.out.println("fim");
		
	}

}
