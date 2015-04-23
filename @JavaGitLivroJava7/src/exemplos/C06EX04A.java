package exemplos;
import java.io.*;
import java.util.Scanner;

class C06EX04A {

  public static void main(String args[]) { 

    long X, R;
    Scanner s = new Scanner(System.in); 

    System.out.println();
    System.out.println("-------------------------");
    System.out.println("    Programa Fatorial    ");
    System.out.println("-------------------------");
    System.out.println();
    System.out.print("Entre um valor inteiro (de 0 ate 25): ");
    X = s.nextByte();  
    System.out.println();
    R = fatorial(X);
    System.out.println();
    System.out.println("Fatorial de " + X + " = " + R);
  }

  public static long fatorial(long  N) {
    if (N <= 0)
      return(1);
    else
      return(fatorial(N - 1) * N);
  }

}
