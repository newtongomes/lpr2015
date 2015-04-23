package exemplos;
import java.io.*;
import java.util.Scanner;

class C04EX11 {
  public static void main(String args[]) {

    int MES;
    Scanner s = new Scanner(System.in); 

    System.out.println();
    System.out.print("Entre um valor referente a um MES: ");
    MES = s.nextInt();  
    System.out.println();

    if (MES ==  1)
      System.out.println("Janeiro");
    else if (MES ==  2)
      System.out.println("Fevereiro");
    else if (MES ==  3)
      System.out.println("Marco");
    else if (MES ==  4)
      System.out.println("Abril");
    else if (MES ==  5)
      System.out.println("Maio");
    else if (MES ==  6)
      System.out.println("Junho");
    else if (MES ==  7)
      System.out.println("Julho");
    else if (MES ==  8)
      System.out.println("Agosto");
    else if (MES ==  9)
      System.out.println("Setembro");
    else if (MES == 10)
      System.out.println("Outubro");
    else if (MES == 11)
      System.out.println("Novembro");
    else if (MES == 12)
      System.out.println("Dezembro");
    else 
      System.out.println("Mes invalido");

    System.out.println();

  }
}
