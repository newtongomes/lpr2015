package br.estacio.lpr.objetos;

import java.util.Scanner;

public class ProgramaBola {

	public static void main(String[] args) 
	{
		
		Bola b1, b2;
		b1 = new Bola();
		b2 = new Bola();

		b1.material = "Couro";
		b1.tamanho = 30;
		b1.pintar("Preto");
		b1.encher();
		
		b1.tamanho = -345;
		
		System.out.println("tamanho: "+ b1.obterTamanho());
;

		b2.criarBola("Amarelo","Plastico", 15);
		b2.encher();
		b2.pintar("Amarelo");
		b2.esvaziar();

		/*
		b2.brincar();
		b2.chutar();
		b1.agarrar();
		b1.furar();
		b1.remendar();
		...
		*/

	}

}
