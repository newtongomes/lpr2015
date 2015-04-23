package br.estacio.lpr.polimorfismo;

public class TestaZoologico {
	public static void main(String[] args) {
		Zoologico zoo = new Zoologico();
		//Animal a = new Cachorro();
		//a.setNome("Dog");
		//a.setIdade(2);
		//a.setSom("au-au-au");
		//zoo.enjaularAnimal(a);
		//Animal b = new Cavalo();
		//b.setIdade(20);
		//b.setNome("Alado");
		//b.setSom("ihohihohnihohio");
		//zoo.enjaularAnimal(b);
		//Animal c = new Preguica();
		//c.setIdade(20);
		//c.setNome("preguiçosa");
		//c.setSom("ZZZZZZZZZZzzzzzzzzzz");
		//zoo.enjaularAnimal(c);
		for (int i = 0; i < Zoologico.i; i++) {
			System.out.println(Zoologico.jaulas[i].getNome());
			System.out.println(Zoologico.jaulas[i].getIdade());
			//System.out.println(Zoologico.jaulas[i].getSom());
		}
	}
}
