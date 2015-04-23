package exemplos;
/**
  Programa exemplo para cálculo de tabuada de um valor numérico qualquer
  fornecido a partir do teclado para operação em modo console.
*/

/*
  Programa .......: Tabuada (C04EX24.java)
  Autor(es) ......: Augusto Manzano & Roberto Affonso
  Data ...........: 10/06/2010
  Versão .........: 1.2
  Revisão.........: 25/07/2010
*/

import java.io.*;
import java.util.Scanner;

class C04EX24 {
  public static void main(String args[]) {

    int N, I, R;
    Scanner s = new Scanner(System.in); 

    System.out.println();
    System.out.println("Programa: TABUADA");
    System.out.println();
    System.out.print("Entre um valor inteiro para o calculo: ");
    N = s.nextInt();  

    System.out.println();
  
    /**
      O trecho de código seguinte é responsável pela apresentação
      Da tabuada de um valor numérico qualquer.
    */

    for (I = 1; I <= 10; I++) {
      // Cálculo da tabuada propriamente dito
      R = N * I; 
      // Apresentação da tabuada no formato: N X I = R
      System.out.printf("%3d X %2d = %3d\n", N, I, R);
    }

  }
}

