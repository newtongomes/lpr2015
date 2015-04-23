public class OperBitwise {
   public static void main (String args[]) {
      // declara e inicializa algumas variáveis
      byte a = 0x1F, b = 0x10;
      // exibe valores de a e b
      System.out.println("a = " + a + "  b = " + b);
      // realiza as operações bit a bit
      System.out.println("  a & b = " + (a & b));
      System.out.println("  a | b = " + (a | b));
      System.out.println("  a ^ b = " + (a ^ b));
      System.out.println("     ~b = " + (~b));
      System.out.println(" a << 2 = " + (a << 2));
      System.out.println("-a >> 4 = " + (-a >> 4));
      System.out.println("-a >>> 4 = " + (-a >>> 4));
   }
}
