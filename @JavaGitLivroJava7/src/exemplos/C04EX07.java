package exemplos;
import java.io.*;
import java.util.Scanner;

class C04EX07 {
  public static void main(String args[]) {

    int CODIGO;
    Scanner s = new Scanner(System.in); 

    System.out.println();
   
    System.out.print("Entre o codigo de acesso: ");
    CODIGO = s.nextInt();  
   
    if (CODIGO == 1 || CODIGO == 2 || CODIGO == 3)
      {
        if (CODIGO == 1)
          System.out.println("um");
        if (CODIGO == 2)
          System.out.println("dois");
        if (CODIGO == 3)
          System.out.println("tres");
      }
    else
      System.out.println("codigo invalido");

    System.out.println();

  }
}
