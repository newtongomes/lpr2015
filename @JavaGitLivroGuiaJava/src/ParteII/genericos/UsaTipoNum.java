import java.util.*;

public class UsaTipoNum {
   public static void main(String a[]) {
      Scanner sc = new Scanner(System.in);
      List<TipoNum<String>> lista = new ArrayList<TipoNum<String>>();
      while(true) {
         System.out.print("Digite um nome (. finaliza): ");
         String nome = sc.next();
         if (nome.equals(".")) break;
         System.out.print("Digite um numero: ");
         int id = sc.nextInt();
         lista.add(new TipoNum<String>(id, nome));
      }
      for(TipoNum<String> elem: lista) {
         System.out.println("#" + elem.getId() + ": " + elem.getValor());
      }
   }
}
