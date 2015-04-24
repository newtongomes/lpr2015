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
    public static void imprime(String a){
        System.out.println(a);
    }
    
    static float media(float[] a){
        int i;
        float soma = 0, media;
        for(i = 0; i < 3; i++){
            soma += a[i];
        }
        
        media = soma / 3;
        
        return media;
    }
    
    static void resultado(float a){
        if(a >= 6){
            imprime("Aprovado!");
        } else {
            imprime("Reprovado!");
        }
    }
}
