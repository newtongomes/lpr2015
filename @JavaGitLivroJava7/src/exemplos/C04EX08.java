package exemplos;
import java.io.*;
import java.util.Scanner;

class C04EX08 {
  public static void main(String args[]) {

    String NOME1, NOME2;
    int SEXO1, SEXO2, I;
    Scanner s1 = new Scanner(System.in); 
    Scanner s2 = new Scanner(System.in); 

    System.out.println();

    System.out.print("Entre o primeiro nome ....................: ");
    NOME1 = s1.nextLine(); 

    System.out.print("Entre o sexo: M --> [1] // F --> [2] .....: ");
    SEXO1 = s1.nextInt();  

    System.out.print("Entre o segundo nome .....................: ");
    NOME2 = s2.nextLine(); 

    System.out.print("Entre o sexo: M --> [1] // F --> [2] .....: ");
    SEXO2 = s2.nextInt();  

    if (SEXO1 == 1 ^ SEXO2 == 1)
      System.out.println(NOME1 + " pode se casar com " + NOME2);
    else
      System.out.println(NOME1 + " nao pode se casar com " + NOME2);

    System.out.println();

  }
}
