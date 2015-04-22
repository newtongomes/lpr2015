package br.estacio.lpr.objetos.mauricio;

public class Produto {
	// Atributos
    float[] vendasMensuais;
    float precioCusto;
    float precioVenda;

	// Métodos
    float gananciaVenda () {
        return this.precioVenda - this.precioCusto;
    }
    
    float lucroAnual() {
        float lucroTemporal = 0.0f;

        for (int i = 0; i < 12; i++)
            lucroTemporal += this.vendasMensuais[i] * gananciaVenda();

        return lucroTemporal;
    }
    
    Produto () {
    	vendasMensuais = new float[12];
    	precioCusto = 0.0f;
    	precioVenda = 0.0f;
    }
}
