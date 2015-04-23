import java.util.Scanner;
public class DiretSwitch {
   public static void main (String args[]) {
      byte b; // declara variável
      // lê valor para c
      Scanner s = new Scanner(System.in);
      System.out.print("b ? ");
      b =  s.nextByte();
      // avalia valor com switch
      switch(b) {
         case 0:
            System.out.println("Zero");
            break;
         case 1:
         case 2:
            System.out.print("Um ou Dois");
         case 3:
         case 4:
            System.out.println("...mas nao mais que Quatro");
            break;
         default:
            System.out.println("Valor<0 ou Valor>4");
      }
   }
}
