package br.estacio.lpr.polimorfismo;

public class Veterinario {
	public void examinar(Animal a) {
		System.out.println("Examinando animal... ");
		a.emitirSom();
		System.out.println("\n\n\n\n");
	}
}
