package br.estacio.lpr.aluno.mauricio;

/*****************************************************************************
 * Exercicio Exemplo Numerico (c) Mauricio Muñoz Lucero, 2015                              *
 * Elabore um programa para receber pela Entrada de Dados do Computador dois *
 * números, em seguida calcular e mostrar a soma e o produto dos dois números*
 * e mostre o maior número digitado ou a informação se forem iguais.         *
 *****************************************************************************/

import java.util.Scanner; 	// Entrada de teclado

public class ExemploNumerico {
    // Definição das constantes
    final String version = "$VER:Exemplo Numerico v1.0";

    public ExemploNumerico () {
        
        // Declaração das variáveis
        float numero01, numero02, resultado;
    
        Scanner teclado = new Scanner(System.in);
        
        // Carrega valores
        System.out.print("Forneça o primeiro numero: ");
        numero01 = teclado.nextFloat();
        
        System.out.print("Forneça o segundo numero: ");
        numero02 = teclado.nextFloat();

        System.out.println();
        
        // Faz cálculos
        resultado = numero01 + numero02;
        System.out.printf("A soma é %f.%n", resultado);
        
        resultado = numero01 * numero02;
        System.out.printf("A multiplicação é %f.%n", resultado);
        
        // Compara numeros
        if  (numero01 > numero02) 
            System.out.printf("O primeiro é maior %f.%n", numero01);
        else
            if (numero01 < numero02) 
                System.out.printf("O segundo é maior %f.%n", numero02);
            else
                System.out.println("Ambos números são iguais.");

        // Fechamos o teclado para que eclipse não proteste (Warning)
        teclado.close();
    }

    public static void main (String[] args) {
    	// Instanciamos um objeto anônimo
        new ExemploNumerico();
    }
}
