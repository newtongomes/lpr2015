package exemplos;
import java.io.*;
import java.util.Scanner;

class C08EX06 {
  public static void main(String args[]) {

    int A[] = new int[10], I, J, PESQ;
    boolean ACHA;
    String RESP;
    Scanner s = new Scanner(System.in); 
 
    // Entrada de dados

    System.out.println();
    for (I = 0; I <= 9; I++) {
      System.out.print("Entre o " + (I + 1) + "o. elemento: ");
      A[I] = s.nextInt(); 
    }

    // Pesquisa de dados

    do {

      System.out.println();
      System.out.print("Entre o valor a ser pesquisado: ");
      PESQ = s.nextInt(); 

      I = 0;
      ACHA = false;
      while (I <= 9 & ACHA == false)
        if (PESQ == A[I])
          ACHA = true;
        else
          I++;

      if (ACHA == true)
        System.out.print(PESQ + " localizado na posicao " + (I + 1));
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
