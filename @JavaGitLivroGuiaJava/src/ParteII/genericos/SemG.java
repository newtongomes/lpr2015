import java.util.*;

public class SemG { // Classe n�o faz uso dos gen�ricos
   public static void main(String a[]) {
      List num = new ArrayList(); // cria lista p/ Integer's
      num.add(new Integer(10));   // adiciona Integer
      num.add(new Integer(20));
      num.add(new String("qualquer coisa")); // uso inconsistente
      int tot = 0;
      tot += ((Integer)num.get(0)).intValue(); //uso de coer��o
      tot += ((Integer)num.get(1)).intValue();
      System.out.println("tot=" + tot);
   }
}
