import java.util.Scanner; // importa��o da classe Scanner do pacote java.util
public class EntradaSaida {
   public static void main (String args[]) {
      System.out.println("Ola!"); // Mensagem inicial
      // Exibe mensagem e prepara entrada de dados
      System.out.print("Digite um inteiro: ");
      Scanner s = new Scanner(System.in);
      int valor = s.nextInt(); // declara e inicializa vari�vel
      // exibi��o do valor lido
      System.out.println("Valor digitado = " + valor);
   }
}
