package exemplos;
import java.io.*;
import java.util.Scanner;

class C07EX01 {

  public static void main(String args[]) {

    class Taluno {
      String NOME;
      float MEDIA;
    }

    Taluno ALUNO = new Taluno();
    Scanner s = new Scanner(System.in); 

    System.out.println();

    System.out.print("Entre nome ....: ");
    ALUNO.NOME = s.nextLine(); 

    System.out.print("Entre media ...: ");
    ALUNO.MEDIA = s.nextFloat();   

    System.out.println();
    System.out.println("Nome ........: " + ALUNO.NOME);
    System.out.println("Media .......: " + ALUNO.MEDIA);
    System.out.println();

  }
}
