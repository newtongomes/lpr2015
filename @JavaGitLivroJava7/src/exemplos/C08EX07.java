package exemplos;
import java.io.*;
import java.util.Scanner;

class C08EX07 {
  public static void main(String args[]) {

    String A[] = new String[10], X, PESQ, RESP; 
    int I, J, MEIO, COMECO, FINAL;
    boolean ACHA;
    Scanner s = new Scanner(System.in); 

    // Entrada de dados

    System.out.println();
    for (I = 0; I <= 9; I++) {
      System.out.print("Entre o " + (I + 1) + "o. nome: ");
      A[I] = s.nextLine(); 
    }
 
    // Processamento ordenacao

    for (I = 0; I <= 8; I++)
      for (J = I + 1; J <= 9; J++)
        if (A[I].compareTo(A[J]) > 0) {
          X = A[I];
          A[I] = A[J];
          A[J] = X;
        }

    // Apresentacao nomes ordenados

    System.out.println();
    for (I = 0; I <= 9; I++)
      System.out.println((I + 1) + "o. nome = " + A[I]);

    // Apresentacao por pesquisa binario

    do {

      System.out.println();
      System.out.print("Entre o valor a ser pesquisado: ");
      PESQ = s.nextLine(); 

      COMECO = 0;
      FINAL = 9;
      MEIO = 0;
      ACHA = false;
      while (COMECO <= FINAL & ACHA == false) {
        MEIO = (COMECO + FINAL) / 2;
        if (PESQ.compareTo(A[MEIO]) == 0)
          ACHA = true;
        else
          if (PESQ.compareTo(A[MEIO]) < 0)
            FINAL = MEIO - 1;
          else
            COMECO = MEIO + 1;
      }

      if (ACHA == true)
        System.out.print(PESQ + " esta na posicao " + (MEIO + 1));
      else
        System.out.print(PESQ + " nao foi localizado");

      System.out.println();
      System.out.println();
      System.out.print("Continua? [S]im / [N]ao + <Enter>. ");
      try {
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
        RESP = br.readLine(); } 
      catch (Exception e) {
        RESP = "";
      }
      RESP = RESP.toUpperCase(); }

    while (RESP.compareTo("S") == 0);
 
  }
}
