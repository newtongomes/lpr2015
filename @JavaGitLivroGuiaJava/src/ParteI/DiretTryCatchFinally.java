import java.util.Scanner;
public class DiretTryCatchFinally {
   public static void main (String args[]) {
      int valor = 0; // inicialização pró-forma
      Scanner s = new Scanner(System.in);
      try {
         System.out.print("Valor inteiro para contagem? ");
         valor = s.nextInt();
      } catch (Exception e) {
         System.out.println("Valor invalido. Usando default.");
         valor = 10;
      } finally {
         for(int i=0; i<valor; i++) {
            System.out.print(i + " ");
         }
         System.out.println();
      }
   }
}
