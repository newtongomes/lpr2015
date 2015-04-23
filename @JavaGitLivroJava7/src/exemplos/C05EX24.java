package exemplos;
import java.io.*;

class C05EX24 {
  public static void main(String args[]) {

    String STR = "10.89";
    double VALOR;

    VALOR = Double.valueOf(STR).doubleValue();

    System.out.println();
    System.out.print("Valor = " + VALOR);
    System.out.println();
    
  }
}
