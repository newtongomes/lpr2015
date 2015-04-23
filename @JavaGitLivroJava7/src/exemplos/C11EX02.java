package exemplos;
import java.io.*;
import java.util.Scanner;

class C11EX02 {
  public static void main(String args[]) {

    String NOMEARQ = "ARQNUM.XXX";
    long VALOR;
    int I;
    File CHECAGEM = new File(NOMEARQ);

    Scanner s = new Scanner(System.in); 

    System.out.println();
    try {
      FileOutputStream ARQNUMERO = new FileOutputStream(NOMEARQ);
      BufferedOutputStream 
        MEMOACESSO = new BufferedOutputStream(ARQNUMERO);
      DataOutputStream DADO = new DataOutputStream(MEMOACESSO);
      CHECAGEM.createNewFile();
      for (I = 1; I <= 8; I++) { 
        System.out.print("Entre o " + I + "o valor: ");
        VALOR = s.nextInt();  
        DADO.writeLong(VALOR);
      }
      DADO.close(); }
    catch (IOException ioe) {
      System.out.println("Erro");
    }
 
  }
}
