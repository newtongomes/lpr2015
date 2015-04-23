import java.util.*;

public class ComG { // Classe faz uso dos genéricos
   public static void main(String a[]) {
      // cria lista com indicação de parâmetro de tipo
      List<Integer> num = new ArrayList<Integer>();
      num.add(new Integer(10));
      num.add(new Integer(20));
      // operação abaixo geraria erro na compilação
      // num.add(new String("qualquer coisa"));
      int tot = 0;
      // coerção não é necessária
      tot += num.get(0).intValue();
      tot += num.get(1).intValue();
      System.out.println("tot=" + tot);
   }
}
