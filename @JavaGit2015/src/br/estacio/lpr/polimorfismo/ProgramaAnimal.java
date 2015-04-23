package br.estacio.lpr.polimorfismo;

public class ProgramaAnimal 
{
	public static void main(String[] args)
	{
		System.out.println("* Implementação 1 *");
		
		Animal a1,a2,a3;
		
		a1 = new Cachorro("Lessie",50);
		
		a2 = new Cavalo("WhiteHorse",15);
		
		a3 = new Preguica("Lerda",3);
		
		System.out.println("Animal: "+a1.getNome());
		a1.emitirSom();
		
		System.out.println("Animal: "+a2.getNome());
		a2.emitirSom();
		
		System.out.println("Animal: "+a3.getNome());
		a3.emitirSom();
		

		System.out.println("* Implementação 2 *");

		Animal meuAnimal;
		
		meuAnimal = new Cachorro("Lessie",50);
		System.out.println("Animal: "+meuAnimal.getNome());
		meuAnimal.emitirSom();
		
		meuAnimal = new Cavalo("WhiteHorse",15);
		System.out.println("Animal: "+meuAnimal.getNome());
		meuAnimal.emitirSom();
		
		meuAnimal = new Preguica("Lerda",3);
		System.out.println("Animal: "+meuAnimal.getNome());
		meuAnimal.emitirSom();
		

	
	}

}
