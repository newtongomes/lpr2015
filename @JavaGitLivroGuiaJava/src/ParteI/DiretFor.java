public class DiretFor {
   public static void main (String args[]) {
      int soma = 0; // vari�vel auxiliar
      // for com duas vari�veis imediatas
      // i cresce a partir de 0
      // j descresce a partir de 20
      for (int i=0, j=20; i<j; i++, j--) {
         soma = soma + i*j;
         System.out.println("soma = " + soma);
      }
   }
}
