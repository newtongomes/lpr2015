public class Externa {
   private int valor;
   public Externa(int valor) { this.valor = valor; }
   public class Aninhada {
      public void exibir() { System.out.println("valor = " + valor); }
   }

   public static void main(String a[]) {
      // instanciação da classe externa
      Externa externa = new Externa(10);
      // instanciação da classe aninhada
      Externa.Aninhada aninhada = externa.new Aninhada();
      // produz a exibição do conteúdo da variável privada valor
      aninhada.exibir();
   }
}
