package br.estacio.lp;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nome;
        float notas[], media;
        int i;
        
        notas = new float[3];
        
        Scanner ler = new Scanner(System.in);
        
        imprime("Programa para ler o nome e 3 notas do aluno, retornar a média e situação.");
        
        imprime("Imforme seu nome:");
        nome = ler.nextLine();
        
        imprime("Informe a primeira, segunda e terceira nota respectivamente:");        
        for(i = 0; i < 3; i++){
            notas[i] = ler.nextFloat();
        }
        
        media = media(notas);
        imprime(nome + ", sua média foi: " + media);
        
        resultado(media);
    }
    public static void imprime(String texto){
        System.out.println(texto);
    }
    
    static float media(float[] notas){
        int i;
        float soma = 0, media;
        notas = organiza(notas);
        
        for(i = 0; i < 2; i++){
            soma += notas[i];
        }
        
        media = soma / 2;
        
        return media;
    }
    
    static void resultado(float media){
        if(media >= 6){
            imprime("Aprovado!");
        } else {
            imprime("Reprovado!");
        }
    }

    static float[] organiza(float[] notas){
        int i, j;
        float aux;
        
        for(i = 0; i < 3; i++){
            for(j = i + 1; j < 3; j++){
                if(notas[j] > notas[i]){
                    aux = notas[j];
                    notas[j] = notas[i];
                    notas[i] = aux;
                }
            }
        }
        
        return notas;
    }
}
