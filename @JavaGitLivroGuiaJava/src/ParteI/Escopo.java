public class Escopo {
   public static void main (String args[]) { // bloco 1
      System.out.print("Bloco 1: ");
      int i = 1; // vari�vel declarada no bloco 1
      System.out.println("i=" + i);
      { // bloco 2
         System.out.print("Bloco 2: ");
         int j = 2; // vari�vel declarada no bloco 2
         System.out.println("i=" + i + " j=" + j);
         { // bloco 3
            System.out.print("Bloco 3: ");
            int k = i + j; // vari�vel declarada no bloco 3
            System.out.println("i=" + i + " j=" + j + " k=" + k);
         } // uso de k torna-se inv�lido
         System.out.print("Bloco 2: ");
         System.out.println("i=" + i + " j=" + j);
      } // uso de j e k tornam-se inv�lidos
      System.out.print("Bloco 1: ");
      System.out.println("i=" + i);
   }
}
