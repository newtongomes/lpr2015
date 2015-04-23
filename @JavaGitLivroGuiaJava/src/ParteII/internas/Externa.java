public class Externa {
   private int valor;
   public Externa(int valor) { this.valor = valor; }
   public class Aninhada {
      public void exibir() { System.out.println("valor = " + valor); }
   }

   public static void main(String a[]) {
      // instancia��o da classe externa
      Externa externa = new Externa(10);
      // instancia��o da classe aninhada
      Externa.Aninhada aninhada = externa.new Aninhada();
      // produz a exibi��o do conte�do da vari�vel privada valor
      aninhada.exibir();
   }
}
