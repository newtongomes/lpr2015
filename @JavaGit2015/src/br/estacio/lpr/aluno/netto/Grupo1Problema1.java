package br.estacio.lpr.aluno.netto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int a, b;
        
        Scanner ler = new Scanner(System.in);
        
        imprime("Programa que recebe dois números inteiros e mostra a soma, produto e comparação.");
        
        imprime("Informe o primeiro número: ");
        a = ler.nextInt();
        
        imprime("Informe o segundo número: ");
        b = ler.nextInt();
        
        soma(a, b);
        produto(a, b);
        compara(a, b);
    }
    
    public static void imprime(String a){
        System.out.println(a);
    }
    
    public static void soma(int a, int b){
        int soma;
        soma = a + b;
        imprime("Soma: " + Integer.toString(soma));
    }

    public static void produto(int a, int b){
        int produto = a * b;
        imprime("Produto: " + Integer.toString(produto));
    }
    
    public static void compara(int a, int b){
        if(a > b){
            imprime("O primeiro número, " + a + ", é maior.");
        } else if(b > a){
            imprime("O segundo número, " + b + ", é maior.");
        } else {
            imprime( a + " e " + b + " são iguais.");
        }
    }
}