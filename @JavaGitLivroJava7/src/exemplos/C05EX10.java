package exemplos;
import java.io.*;
import java.util.Scanner;

class C05EX10 {
  public static void main(String args[]) {

    int IDADE;
    float ALTURA;
    Scanner s = new Scanner(System.in); 
 
    System.out.println();
                        
    System.out.print("Idade ....: ");
    IDADE = s.nextInt();  
   
    System.out.print("Altura ...: ");
    ALTURA = s.nextFloat();   

     System.out.println();
     if (IDADE <= 1)
       System.out.println("Idade " + String.valueOf(IDADE) + " ano");
     else
       System.out.println("Idade " + String.valueOf(IDADE) + " anos");
     System.out.println("Altura " + String.valueOf(ALTURA));
     System.out.println();

  }
}
