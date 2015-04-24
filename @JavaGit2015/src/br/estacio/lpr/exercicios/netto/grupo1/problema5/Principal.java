package br.estacio.lp.problema5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {        
        int alunos, votos[], op;
        String candidato[];
        candidato = new String[5];
        votos = new int[5];
        
        Scanner ler = new Scanner(System.in);  
        imprime("Programa para ler 5 candidatos, receber os votos de cada candidato e retornar o ganhador.");
        
        imprime("Informe a quantidade de alunos na sala:");
        alunos = ler.nextInt();

        for(int i = 0; i < 5; i++){
            imprime("Informe o nome do " + (i+1) + "º candidato:");
            candidato[i] = ler.nextLine();
            votos[i] = 0;
        }
        lista(candidato, votos);
    }
    static void imprime(String texto){
        System.out.println(texto);
    }
    
    static void lista(String[] candidato, int votos[]){
        int id;
        for(int i = 0; i < 5; i++){
            imprime(candidato[i] + String.valueOf(votos[i]));
        }
    }
}