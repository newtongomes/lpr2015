public class Eco {
   public static void main(String args[]) {
      for(int i=0; i<args.length; i++) {
         System.out.printf("Argumento #%d: %s", i, args[i]);
         try { // verifica se arg[i] � inteiro
            int n = Integer.parseInt(args[i]);
            System.out.printf(" (inteiro:%d)%n", n);
         } catch (NumberFormatException e1) {
            // se ocorre exce��o n�o � inteiro
            try { // verifica se arg[i] � real
               double d = Double.parseDouble(args[i]);
               System.out.printf(" (real:%f)%n", d);
            } catch (NumberFormatException e2) {
               // se ocorre exce��o n�o � real tamb�m
               System.out.printf(" (String:%s)%n", args[i]);
            }
         }
      }
   }
}
