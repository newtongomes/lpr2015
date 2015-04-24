package br.estacio.lp.questao1;

public class Funcionario {
    private int matricula;
    private String nome;
    private double salarioB;
    private double salarioL;
    
    public Funcionario(){
    }

    public Funcionario(int matricula, String nome, double salarioB) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioB = salarioB;
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
    
    public double getSalario() {
        return salarioB;
    }
    
    public void setSalario(double s) {
        this.salarioB = s;
    }
    
    public double getSalarioL(double s){
        if(s > 1500){
            salarioL = s - (s * 0.6);
        } else{
            salarioL = s - (s * 0.95);
        }
        return salarioL;
    }
}
