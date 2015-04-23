package exemplos;
import java.io.*;
import java.util.Scanner;

class C04EX16A {

  public static void main(String args[]) {

    int DIVIDENDO, DIVISOR, QUOCIENTE;
    Scanner s = new Scanner(System.in); 
 
    System.out.println();

    try {

      System.out.print("Informe um valor do dividendo...: ");
      DIVIDENDO = s.nextInt();  

      System.out.print("Informe um valor do divisor.....: ");
      DIVISOR = s.nextInt();  

      QUOCIENTE = DIVIDENDO / DIVISOR;

      System.out.println();
      System.out.print("Resultado = " + QUOCIENTE);
      System.out.println();

    }

    //catch (final ArithmeticException | Exception erro) {
    catch (Exception erro) {

      System.out.println();
      System.out.print("Erro de divisao por zero ou outro erro.\n");
      System.out.print("Tipo de excecao: " + erro + ".");
      System.out.println();

    }

  }
}
