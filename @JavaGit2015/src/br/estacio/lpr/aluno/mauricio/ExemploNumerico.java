package br.estacio.lpr.aluno.mauricio;

/*****************************************************************************
 * Exercicio Exemplo Numerico (c) Mauricio Mu�oz Lucero, 2015                              *
 * Elabore um programa para receber pela Entrada de Dados do Computador dois *
 * n�meros, em seguida calcular e mostrar a soma e o produto dos dois n�meros*
 * e mostre o maior n�mero digitado ou a informa��o se forem iguais.         *
 *****************************************************************************/

import java.util.Scanner; 	// Entrada de teclado

public class ExemploNumerico {
    // Defini��o das constantes
    final String version = "$VER:Exemplo Numerico v1.0";

    public ExemploNumerico () {
        
        // Declara��o das vari�veis
        float numero01, numero02, resultado;
    
        Scanner teclado = new Scanner(System.in);
        
        // Carrega valores
        System.out.print("Forne�a o primeiro numero: ");
        numero01 = teclado.nextFloat();
        
        System.out.print("Forne�a o segundo numero: ");
        numero02 = teclado.nextFloat();

        System.out.println();
        
        // Faz c�lculos
        resultado = numero01 + numero02;
        System.out.printf("A soma � %f.%n", resultado);
        
        resultado = numero01 * numero02;
        System.out.printf("A multiplica��o � %f.%n", resultado);
        
        // Compara numeros
        if  (numero01 > numero02) 
            System.out.printf("O primeiro � maior %f.%n", numero01);
        else
            if (numero01 < numero02) 
                System.out.printf("O segundo � maior %f.%n", numero02);
            else
                System.out.println("Ambos n�meros s�o iguais.");

        // Fechamos o teclado para que eclipse n�o proteste (Warning)
        teclado.close();
    }

    public static void main (String[] args) {
    	// Instanciamos um objeto an�nimo
        new ExemploNumerico();
    }
}
