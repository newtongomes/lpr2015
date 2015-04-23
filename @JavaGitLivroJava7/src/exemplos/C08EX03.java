package exemplos;
import java.io.*;
import java.util.Scanner;

class C08EX03 {
  public static void main(String args[]) {

    int A[] = new int[5];
    int I, SOMA = 0;
    Scanner s = new Scanner(System.in); 
 
    // Entrada de dados

    System.out.println();
    for (I = 0; I <= 4; I++) {
      System.out.print("Entre o " + (I + 1) + "o. elemento: ");
      A[I] = s.nextInt(); 
    }
 
    // Processamento par ou impar

    for (I = 0; I <= 4; I++)
    if (A[I] % 2 != 0)
      SOMA += A[I];

    // Apresentacao dos arranjos

    System.out.println();
    System.out.println("Soma = " + SOMA);
 
  }
}
