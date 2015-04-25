package br.estacio.lpr.aluno.netto;

public class Professor {
    private String nome;
    private int tempProf;
    
    public Professor(){
    
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public int getTempo(){
        return tempProf;
    }
    
    public void setTempo(int t){
        this.tempProf = t;
    }
}
