public class Escopo {
   public static void main (String args[]) { // bloco 1
      System.out.print("Bloco 1: ");
      int i = 1; // variável declarada no bloco 1
      System.out.println("i=" + i);
      { // bloco 2
         System.out.print("Bloco 2: ");
         int j = 2; // variável declarada no bloco 2
         System.out.println("i=" + i + " j=" + j);
         { // bloco 3
            System.out.print("Bloco 3: ");
            int k = i + j; // variável declarada no bloco 3
            System.out.println("i=" + i + " j=" + j + " k=" + k);
         } // uso de k torna-se inválido
         System.out.print("Bloco 2: ");
         System.out.println("i=" + i + " j=" + j);
      } // uso de j e k tornam-se inválidos
      System.out.print("Bloco 1: ");
      System.out.println("i=" + i);
   }
}
