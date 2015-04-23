package exemplos;
import java.io.*;
import java.util.Scanner;

class C04EX18 {
  public static void main(String args[]) {

    int I, RESP;
    Scanner s = new Scanner(System.in); 

    RESP = 1;
    while (RESP == 1)
      {

        System.out.println();

        I = 1;
        while (I <= 5)
          {
            System.out.println("Valor = " + I);
            I++;
          }

        System.out.println();
        System.out.println("Deseja continuar?");
        System.out.print("Tecle: [1] para SIM / [2] para NAO: ");
        RESP = s.nextInt();  
      }

  }
}
