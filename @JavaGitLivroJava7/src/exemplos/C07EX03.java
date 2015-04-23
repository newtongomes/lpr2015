package exemplos;
import java.io.*;
import java.util.Scanner;

class C07EX03 {

  public static void main(String args[]) {

    Taluno2 ALUNO = new Taluno2();
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
    System.out.print("Situacao ....: ");

    if (ALUNO.CondAluno(ALUNO.MEDIA, 5.0))
      System.out.println("Aprovado");
    else     
      System.out.println("Reprovado");
    System.out.println();

  }
}
