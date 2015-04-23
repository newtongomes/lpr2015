public class DiretContinue {
   public static void main (String args[]) {
      for (int i=0; i<=100; i++) { // laço de 0 a 100
         // abrevia iteração se múltiplo de 2, 3 ou 5
         if (i%2==0 || i%3==0 || i%5==0) {
            continue;
         }
         // processamento normal para demais casos
         System.out.println("i = " + i);
      }
   }
}
