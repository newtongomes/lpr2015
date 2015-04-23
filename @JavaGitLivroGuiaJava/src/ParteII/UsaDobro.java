public class UsaDobro { // declaração da classe UsaDobro
   public static void main (String args[ ]) {
      // uso de método estático da classe Dobro sem instância
      System.out.println("No Instancias de Dobro = " + Dobro.getInstancias() );
      int x = 7; // declara e inicializa variável inteira com valor arbitrário
      System.out.println("Instanciando objeto Dobro");
      Dobro d = new Dobro (); // instanciação
      // uso de métodos estáticos e não estáticos da classe Dobro
      System.out.println("No Instancias de Dobro = " + d.getInstancias() );
      System.out.println("O dobro de " + x + " e " + d.dobro(x) );
      System.out.println("Ultimo valor usado: " + d.ultimoValor);
   }
}
