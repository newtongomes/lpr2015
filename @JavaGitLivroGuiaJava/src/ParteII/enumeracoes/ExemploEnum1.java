public class ExemploEnum1 {
   public enum Opcoes { COMPACTAR, DESCOMPACTAR };

   public static void main(String a[]) {
      for(Opcoes opcao: Opcoes.values()) {
         System.out.println(opcao);
      }
   }
}
