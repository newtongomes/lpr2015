package exemplos;
import java.io.*;
import java.util.Scanner;

class C04EX04 {
  public static void main(String args[]) {

    int A, B, R;
    Scanner s = new Scanner(System.in); 

    System.out.println();
   
    System.out.print("Entre o valor <A>: ");
    A = s.nextInt();  
   
    System.out.print("Entre o valor <B>: ");
    B = s.nextInt();  

    R = A + B;
    System.out.println();
    if (R > 10)
      System.out.print("Resultado = " + R);
    System.out.println();

  }
}
