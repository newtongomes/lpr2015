package br.estacio.lpr.polimorfismo;

public class Zoologico {

	static Animal[] jaulas = new Animal[10];
	static int i = 0;

	public void enjaularAnimal(Animal animal) {
		System.out.println("Enjaulando animal....");
		jaulas[i++] = animal;
		animal.emitirSom();
		if(animal instanceof Cachorro){
			
			((Cachorro) animal).correr();
			System.out.println("\n\n\n\n\n");
		}else if(animal instanceof Cavalo){
			((Cavalo) animal).correr();
			System.out.println("\n\n\n\n\n");
		}
	}

}
