package exemplos;
import java.io.*;
import java.util.Scanner;

class C07EX08 {

  public static void main(String args[]) {

    Taluno6 ALUNO = new Taluno6();
    Scanner s = new Scanner(System.in); 
 
    System.out.println();
    System.out.print("Entre nome .....: ");
    ALUNO.NOME = s.nextLine(); 
   
    System.out.print("Entre a nota 1 .: ");
    ALUNO.N1 = s.nextFloat();   

    System.out.print("Entre a nota 2 .: ");
    ALUNO.N2 = s.nextFloat();   

    System.out.print("Entre a sala ...: ");
    ALUNO.SALA = s.nextInt();   

    System.out.println();
    System.out.println("Nome ........: " + ALUNO.NOME);
    System.out.println("Media .......: " +
    ALUNO.CalcMedia(ALUNO.N1,ALUNO.N2));
    System.out.println("Sala ........: " + ALUNO.SALA);
    System.out.println();
    System.out.print("Situacao ....: ");

    if (Taluno2.CondAluno(ALUNO.CalcMedia(ALUNO.N1,ALUNO.N2), 5.0))
      System.out.println("Aprovado");
    else     
      System.out.println("Reprovado");
    System.out.println();

  }
}
