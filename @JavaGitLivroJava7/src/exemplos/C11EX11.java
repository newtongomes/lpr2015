package exemplos;
import java.io.*;
import java.util.Scanner;

class C11EX11 {

  private static RandomAccessFile ARQUIVO;

  public static void main(String args[]) {

    class Taluno {
      byte CODIGO;
      char NOME[] = new char[40];
      char SERIE;
      double MEDIA;
    }

    Taluno ALUNO = new Taluno();
    File NOMEARQ = new File("ARQALUX.DBJ");
    int I;
    long POSICAO = 0;
    byte CODALU;
    boolean ACHOU = false;
    Scanner s = new Scanner(System.in); 

    try {
      ARQUIVO = new RandomAccessFile(NOMEARQ, "r"); }
    catch (FileNotFoundException enfe) {
      System.out.println("Arquivo sem acesso");
    }

    System.out.println();

    System.out.print("Codigo ...: ");
    CODALU = s.nextByte();  

    try {
      do {
 
        ARQUIVO.seek(POSICAO);
        if(CODALU == ARQUIVO.readByte()) {

          ACHOU = true;

          ARQUIVO.seek(POSICAO + 1);
          System.out.print("Nome .....: ");
          for (I = 0; I < 80; I+=2) {
            ARQUIVO.seek(I + POSICAO + 1);
            System.out.print(ARQUIVO.readChar());
          }
          System.out.println();

          ARQUIVO.seek(POSICAO + 81);
          System.out.println("Serie ....: " + 
            ARQUIVO.readChar());

          ARQUIVO.seek(POSICAO + 83);
          System.out.println("Media ....: " + 
            ARQUIVO.readDouble()); 
        }
        POSICAO += 91; } 

      while (true && ACHOU == false); }
    catch (EOFException eofe) {
      System.out.println("Fim de arquivo");
    }
    catch (IOException ioe) {
      System.out.println("Erro de leitura");
    }
    if (ACHOU == false)
      System.out.println("Registro inexistente");
 
  }
}
