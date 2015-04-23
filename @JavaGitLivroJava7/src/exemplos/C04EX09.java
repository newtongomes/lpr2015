package exemplos;
import java.io.*;
import java.util.Scanner;

class C04EX09 {
  public static void main(String args[]) {

    int A, B, C, X;
    Scanner s = new Scanner(System.in); 

    System.out.println();
   
    System.out.print("Entre o valor <A>: ");
    A = s.nextInt();  
      
    System.out.print("Entre o valor <B>: ");
    B = s.nextInt();  
   
    System.out.print("Entre o valor <C>: ");
    C = s.nextInt();  
   
    if (!(C > 5))
      X = (A + B) * C;
    else
      X = (A - B) * C;
    System.out.println("O resultado de X equivale a: " + X);

    System.out.println();

  }
}
