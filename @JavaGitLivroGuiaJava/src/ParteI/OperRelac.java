import java.util.Scanner;
public class OperRelac {
   public static void main (String args[]) {
      double a, b; // declara vari�veis
      // l� valores para a e b
      Scanner s = new Scanner(System.in);
      System.out.print("a ? "); a = s.nextDouble();
      System.out.print("b ? "); b = s.nextDouble();
      // realiza as opera��es relacionais
      System.out.println("a == b = " + (a == b));
      System.out.println("a != b = " + (a != b));
      System.out.println("a >  b = " + (a > b));
      System.out.println("a >= b = " + (a >= b));
      System.out.println("a <  b = " + (a < b));
      System.out.println("a <= b = " + (a <= b));
   }
}
