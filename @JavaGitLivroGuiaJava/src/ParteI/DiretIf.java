public class DiretIf {
   public static void main (String args[]) {
      double a=3.4, b=-1.7, c=2.1; // declara e inicializa vari�veis
      System.out.println("a=" + a + "\tb=" + b); // exibe vari�veis
      if (a>b+c) {
         System.out.println("a e' maior que b+c");
      }
      if (b>=0) { // bloco executado se condi��o verdadeira
         System.out.println("b positivo");
      } else { // bloco executado se condi��o falsa
         System.out.println("b negativo");
      }
   }
}
