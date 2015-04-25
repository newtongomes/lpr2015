package br.estacio.lpr.aluno.netto;

import java.util.Scanner;

public class PrincipalG1Q4 {
    public static void main(String[] args) {        
        float notas[][], media[];
        notas = new float[30][2];
        media = new float[30];
        
        Scanner ler = new Scanner(System.in);
        
        imprime("Programa para ler duas notas de 30 alunos, retornar maior e menor média e média geral.");
        
        imprime("Informe a primeira e segunda nota de cada aluno, respectivamente:");
        for(int i = 0; i < 30; i++){
            for(int j = 0; j < 2; j++){
                imprime("Aluno " + (i + 1) + " nota " + (j + 1));
                notas[i][j] = ler.nextFloat();
            }
        }
        
        media = media(notas);
        
        for(int i = 0; i < 30; i++){
            imprime("Média aluno " + (i + 1));
            imprime(String.valueOf(media[i]));
        }
        
        organiza(media);
    }
    static void imprime(String texto){
        System.out.println(texto);
    }
    
    static float[] media(float[][] notas){
        float media[];
        media = new float[30];
        
        for(int i = 0; i < 30; i++){
            media[i] = (notas[i][0] + notas[i][1]) / 2;
        }
        
        return media;
    }

    static void organiza(float[] media){
        int i, j;
        float aux;
        
        for(i = 0; i < 30; i++){
            for(j = i + 1; j < 30; j++){
                if(media[j] > media[i]){
                    aux = media[j];
                    media[j] = media[i];
                    media[i] = aux;
                }
            }
        }
        
        imprime("Maior média: " + media[0] + " Menor: " + media[29]);
    }
}
