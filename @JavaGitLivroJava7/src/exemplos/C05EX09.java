package exemplos;
import java.io.*;

class C05EX09 {
  public static void main(String args[]) {

   String TEXTO = "   Programacao com Java   ";

   System.out.println("Com  espacos: [" + TEXTO + "]"); 
   System.out.println("Sem  espacos: [" + TEXTO.trim() + "]");

  }
}
