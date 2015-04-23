package exemplos;
import java.io.*;

class C05EX20 {
  public static void main(String args[]) {

    int INTEIRO = 10;
    String BINSTR;

    BINSTR = Integer.toString(INTEIRO, 2);

    System.out.println();
    System.out.print("Valor = " + BINSTR);
    System.out.println();
    
  }
}
