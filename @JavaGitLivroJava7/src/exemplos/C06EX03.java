package exemplos;
import java.io.*;
import java.util.Scanner;

class C06EX03 {

  public static void main(String args[]) { 

    byte X;
    Scanner s = new Scanner(System.in); 

    System.out.println();
    System.out.println("-------------------------");
    System.out.println("    Programa Fatorial    ");
    System.out.println("-------------------------");
    System.out.println();
    System.out.print("Entre um valor inteiro (de 0 ate 25): ");
    X = s.nextByte();  
    System.out.println();
    fatorial(X);
    System.out.println();
  }

  public static void fatorial(byte N) {
    long FAT = 1;
    if (N == 0)
      FAT = 0;
    else
      for (int I = 1; I <= N; I++)
        FAT *= I;
    System.out.println("Fatorial de " + N + " = " + FAT);
  }

}
