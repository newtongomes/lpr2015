package br.estacio.lp.problema2;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>, Comparator<Aluno>{
    private int matricula;
    private String nome;
    private String curso;
    private double media;

    public Aluno() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public int compareTo(Aluno o) {
        if(this.media > o.getMedia()){
            return -1;
        }else if(this.media < o.getMedia()){
            return 1;
        } else{
            return 0;
        }
    }

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}