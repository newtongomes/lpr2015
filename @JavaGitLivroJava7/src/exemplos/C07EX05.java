package exemplos;
import java.io.*;
import java.util.Scanner;

class C07EX05 {

  public static void main(String args[]) {

    Taluno3 ALUNO = new Taluno3();
    Scanner s = new Scanner(System.in); 

    System.out.println();
    System.out.print("Entre nome ....: ");
    ALUNO.NOME = s.nextLine(); 
   
    System.out.print("Entre media ...: ");
    ALUNO.MEDIA = s.nextFloat();   

    System.out.print("Entre a sala ..: ");
    ALUNO.SALA = s.nextInt();   

    System.out.println();
    System.out.println("Nome ........: " + ALUNO.NOME);
    System.out.println("Media .......: " + ALUNO.MEDIA);
    System.out.println("Sala ........: " + ALUNO.SALA);
    System.out.println();
    System.out.print("Situacao ....: ");

    if (Taluno2.CondAluno(ALUNO.MEDIA, 5.0))
      System.out.println("Aprovado");
    else     
      System.out.println("Reprovado");
    System.out.println();

  }
}
