package br.estacio.lpr.objetos.mauricio;

public class ProgramaBola {
	public static void main(String[] args) {
		Bola a = new Bola();
		Bola b = new Bola(5.3f, "Metal", "Dourada", Bola.estadoBola.CHEIA);

		a.encher();
	    a.esvaziar();
	    a.pintar("Azul");
		a.definirTamanho(3.5f);
	    b.definirMaterial("Abacaxi");
	    
	    b.encher();
	    b.esvaziar();
	    b.pintar("Vermelho");
		b.definirTamanho(50.0f);
	    b.definirMaterial("Ferro");
	}
}
