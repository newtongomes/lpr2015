import java.util.Scanner;
public class DiretBreak {
   public static void main (String args[]) {
      int pares = 0; // vari�vel p/ contar pares encontrados
      int max = 0; // vari�vel p/ indicar numero maximo de pares
      // leitura do n�mero m�ximo de pares desejados
      System.out.print("Maximo no pares ? ");
      Scanner s = new Scanner(System.in);
      max = s.nextInt();
      // for com vari�vel imediata
      for (int i=0; i<1000; i++) {
         System.out.println("i = " + i);
         if (i%2==0) {
            pares++;
         }
         if (pares==max) {
            break;
         }
      }
   }
}
