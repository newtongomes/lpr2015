public class UsaDobro { // declara��o da classe UsaDobro
   public static void main (String args[ ]) {
      // uso de m�todo est�tico da classe Dobro sem inst�ncia
      System.out.println("No Instancias de Dobro = " + Dobro.getInstancias() );
      int x = 7; // declara e inicializa vari�vel inteira com valor arbitr�rio
      System.out.println("Instanciando objeto Dobro");
      Dobro d = new Dobro (); // instancia��o
      // uso de m�todos est�ticos e n�o est�ticos da classe Dobro
      System.out.println("No Instancias de Dobro = " + d.getInstancias() );
      System.out.println("O dobro de " + x + " e " + d.dobro(x) );
      System.out.println("Ultimo valor usado: " + d.ultimoValor);
   }
}
