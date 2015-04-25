package br.estacio.lpr.aluno.netto;

public class Mes {
    private int index;
    private String nome;
    private int dias;
    private double precipitacao;

    public Mes(int index, String nome, int dias, double precipitacao) {
        this.index = index;
        this.nome = nome;
        this.dias = dias;
        this.precipitacao = precipitacao;
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
    
    public double getPrecipitacao() {
        return precipitacao;
    }

    public void setPrecipitacao(double precipitacao) {
        this.precipitacao = precipitacao;
    }
}
