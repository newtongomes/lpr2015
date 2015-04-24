package br.estacio.lp;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {        
        int alunos, votos[], op, saida = 0;
        String candidato[];
        candidato = new String[5];
        votos = new int[5];
        
        Scanner ler = new Scanner(System.in);  
        imprime("Programa para ler 5 candidatos, receber os votos de cada candidato e retornar o ganhador.");

        for(int i = 0; i < 5; i++){
            imprime("Informe o nome do " + (i+1) + "º candidato:");
            candidato[i] = ler.nextLine();
            votos[i] = 0;
        }
//        lista(candidato, votos);
        mostraOp(candidato);
        op = ler.nextInt();
        
        while(saida == 1){
            switch(op){
                case 1:
                    votos[0] += 1;
                    break;
                case 2:
                    votos[1] += 1;
                    break;
                case 3:
                    votos[2] += 1;
                    break;
                case 4:
                    votos[3] += 1;
                    break;
                case 5:
                    votos[4] += 1;
                    break;
                default:
                    imprime("Opção invãlida!");
            }
            imprime("Votar novamente? 1 - Sim 0 - Não");
            saida = ler.nextInt();
        }
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
    
    static void mostraOp(String[] candidato){
        int id;
        for(int i = 0; i < 5; i++){
            imprime("Eleição para candidatos a lider de turma.");
            imprime((i + 1) + "° Candidato: " + candidato[i]);
        }
    }
}