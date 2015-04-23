package exemplos;
import java.io.*;
import java.util.Scanner;

class C11EX07 {

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
    String ENTRASERIE;
    String ENTRANOME;
    int I;
    Scanner s1 = new Scanner(System.in); 
    Scanner s2 = new Scanner(System.in); 

    System.out.println();

    System.out.print("Entre o codigo ...: ");
    ALUNO.CODIGO = s1.nextByte(); 

    System.out.print("Entre o nome .....: ");
    ENTRANOME = s2.nextLine(); 
    if (ENTRANOME.length() < 40)
      for (I = 0; I < ENTRANOME.length(); I++)
        ALUNO.NOME[I] = ENTRANOME.toUpperCase().charAt(I);
    else
      for (I = 0; I < 40; I++)
        ALUNO.NOME[I] = ENTRANOME.toUpperCase().charAt(I);

    System.out.print("Entre a serie ....: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ENTRASERIE = br.readLine(); } 
    catch (Exception e) {
      ENTRASERIE = "";
    }
    ALUNO.SERIE = ENTRASERIE.toUpperCase().charAt(0);
  
    System.out.print("Entre a media ....: ");
    ALUNO.MEDIA = s1.nextDouble(); 

    try {
      ARQUIVO = new RandomAccessFile(NOMEARQ, "rw"); }
    catch (FileNotFoundException fnfe) {
      System.out.println("Arquivo sem acesso");
    }

    try {
      ARQUIVO.writeByte(ALUNO.CODIGO);
      for (I = 0; I < 40; I++)
        ARQUIVO.writeChar(ALUNO.NOME[I]);
      ARQUIVO.writeChar(ALUNO.SERIE);
      ARQUIVO.writeDouble(ALUNO.MEDIA); 
      ARQUIVO.close(); }
    catch (IOException ioe) {
      System.out.println("Erro de escrita");
    }
 
  }
}
