import java.util.*;

public class ComG { // Classe faz uso dos gen�ricos
   public static void main(String a[]) {
      // cria lista com indica��o de par�metro de tipo
      List<Integer> num = new ArrayList<Integer>();
      num.add(new Integer(10));
      num.add(new Integer(20));
      // opera��o abaixo geraria erro na compila��o
      // num.add(new String("qualquer coisa"));
      int tot = 0;
      // coer��o n�o � necess�ria
      tot += num.get(0).intValue();
      tot += num.get(1).intValue();
      System.out.println("tot=" + tot);
   }
}
