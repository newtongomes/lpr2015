import java.util.Scanner;
public class OperArit {
   public static void main (String args[]) {
      int a, b, c; // declara variáveis
      // lê valores para a e b
      Scanner s = new Scanner(System.in);
      System.out.print("a ? "); a = s.nextInt();
      System.out.print("b ? "); b = s.nextInt();
      // realiza operações com valores dados
      c = a + b;
      System.out.println("a + b = " + c);
      System.out.println("b - a = " + (b - a));
      System.out.println("a * b = " + (a * b));
      System.out.println("a / b = " + (a / b));
      System.out.println("a % b = " + (a % b));
      System.out.println("a = " + a + " b = " + b);
      System.out.println("c =  -a = " +  (-a));
      System.out.println("c = ++a = " + (++a));
      System.out.println("c = b-- = " + (b--));
      System.out.println("a = " + a + " b = " + b);
   }
}
