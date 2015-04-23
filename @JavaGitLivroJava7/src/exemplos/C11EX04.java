package exemplos;
import java.io.*;
import java.util.Scanner;

class C11EX04 {

  private static RandomAccessFile ARQUIVO;

  public static void main(String args[]) {

    class Taluno {
      byte CODIGO;
      char SERIE;
      double MEDIA;
    }

    Taluno ALUNO = new Taluno();
    File NOMEARQ = new File("ARQALU.DBJ");
    String ENTRASERIE;
    Scanner s = new Scanner(System.in); 

    System.out.println();

    System.out.print("Entre o codigo ...: ");
    ALUNO.CODIGO = s.nextByte(); 

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
    ALUNO.MEDIA = s.nextDouble(); 

    try {
      ARQUIVO = new RandomAccessFile(NOMEARQ, "rw"); }
    catch (FileNotFoundException fnfe) {
      System.out.println("Arquivo sem acesso");
    }

    try {
      ARQUIVO.writeByte(ALUNO.CODIGO);
      ARQUIVO.writeChar(ALUNO.SERIE);
      ARQUIVO.writeDouble(ALUNO.MEDIA); 
      ARQUIVO.close(); }
    catch (IOException ioe) {
      System.out.println("Erro de escrita");
    }
 
  }
}
