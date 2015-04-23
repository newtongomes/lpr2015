package exemplos;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

class C04EX03 {

  public static void main(String args[]) {

    String NOME;
    int IDADE;
    float ALTURA;

    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in); 

    System.out.println();

    System.out.print("Entre seu nome ....: ");
    NOME = s.nextLine(); 
   
    System.out.print("Entre sua idade ...: ");
    IDADE = s.nextInt();  
   
    System.out.print("Entre sua altura ..: ");
    ALTURA = s.nextFloat();   

    System.out.println();
    System.out.print("Nome ..............: " + NOME);
    System.out.print("\nIdade .............: " + IDADE + " anos");
    df.applyPattern("0.00");
    System.out.print("\nAltura ............: " + df.format(ALTURA));
    System.out.println();

  }
}
