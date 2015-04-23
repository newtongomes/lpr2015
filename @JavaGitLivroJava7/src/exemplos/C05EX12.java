package exemplos;
import java.io.*;
import java.util.Scanner;

class C05EX12 {
  public static void main(String args[]) {

    int ASCII;
    String STR;
    Scanner s = new Scanner(System.in); 

    System.out.println();
    System.out.print("Entre um codigo ASCII: ");
    ASCII = s.nextInt();  
    STR = new Character((char)ASCII).toString();

    System.out.println();
    System.out.print(ASCII + " corresponde ao caractere " + STR);
    System.out.println();
    
  }
}
