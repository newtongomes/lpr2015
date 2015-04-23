public class OutraExterna {
   private static int valor;
   public static class AninhadaEstatica {
      public void exibir() { System.out.println("valor = " + valor); }
   }

   public static void main(String a[]) {
      // instancia��o da classe aninhada
      OutraExterna.AninhadaEstatica aninhadaEstatica = new OutraExterna.AninhadaEstatica();
      // produz a exibi��o do conte�do da vari�vel privada est�tica valor
      aninhadaEstatica.exibir();
   }
}
