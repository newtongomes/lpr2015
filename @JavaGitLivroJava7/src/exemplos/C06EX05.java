package exemplos;
import java.io.*;
import java.util.Scanner;

class C06EX05 {

  public static void main(String args[]) { 

    byte X;
    long R;
    Scanner s = new Scanner(System.in); 

    System.out.println();
    System.out.println("-------------------------");
    System.out.println("    Programa Fatorial    ");
    System.out.println("-------------------------");
    System.out.println();
    System.out.print("Entre um valor inteiro (de 0 ate 25): ");
    X = s.nextByte();  
    System.out.println();
    R = C06EX04.fatorial(X);
    System.out.println();
    System.out.println("Fatorial de " + X + " = " + R);

  }

}
