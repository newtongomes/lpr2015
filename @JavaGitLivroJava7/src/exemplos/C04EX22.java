package exemplos;
import java.io.*;
import java.util.Scanner;

class C04EX22 {
  public static void main(String args[]) {

    int I, RESP = 1;
    Scanner s = new Scanner(System.in); 

    do 
      {

        System.out.println();

        I = 1;
        do
          {
            System.out.println("Valor = " + I);
            I++;
          }
        while (I <= 5);

        System.out.println();
        System.out.println("Deseja continuar?");
        System.out.print("Tecle: [1] para SIM / [2] para NAO: ");
        RESP = s.nextInt();  

      }
    while (RESP == 1); 

  }
}
