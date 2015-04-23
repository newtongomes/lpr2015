package exemplos;
import java.io.*;

class C05EX17 {
  public static void main(String args[]) {

    String BINSTR = "1010";
    int INTEIRO;

    INTEIRO = Integer.valueOf(BINSTR, 2).intValue();

    System.out.println();
    System.out.print("Valor = " + INTEIRO);
    System.out.println();
    
  }
}
