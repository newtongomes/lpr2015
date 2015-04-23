public class OutraExterna {
   private static int valor;
   public static class AninhadaEstatica {
      public void exibir() { System.out.println("valor = " + valor); }
   }

   public static void main(String a[]) {
      // instanciação da classe aninhada
      OutraExterna.AninhadaEstatica aninhadaEstatica = new OutraExterna.AninhadaEstatica();
      // produz a exibição do conteúdo da variável privada estática valor
      aninhadaEstatica.exibir();
   }
}
