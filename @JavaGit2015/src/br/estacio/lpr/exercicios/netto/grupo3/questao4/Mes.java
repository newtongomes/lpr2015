package br.estacio.lp.questao4;

public class Mes {
    private int index;
    private String nome;
    private int dias;

    public Mes(int index, String nome, int dias) {
        this.index = index;
        this.nome = nome;
        this.dias = dias;
    }

    public Mes() {
    }    

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }    
}
