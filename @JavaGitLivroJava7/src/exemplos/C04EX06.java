package exemplos;
import java.io.*;
import java.util.Scanner;

class C04EX06 {
  public static void main(String args[]) {

    int NUMERO;
    Scanner s = new Scanner(System.in); 

    System.out.println();
   
    System.out.print("Entre um valor: ");
    NUMERO = s.nextInt();  
   
    if (NUMERO >= 20 && NUMERO <= 90)
      System.out.print("O valor esta entre 20 e 90");
    else
      System.out.print("O valor nao esta entre 20 e 90");
    System.out.println();

  }
}
