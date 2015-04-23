package exemplos;
import java.io.*;
import java.util.Scanner;

class C04EX05 {
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
      System.out.print("Resultado ultrapassa o valor dez.");
    else
      System.out.print("Resultado nao ultrapassa o valor dez.");
    System.out.println();

  }
}
