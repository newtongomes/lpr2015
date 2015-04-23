import java.util.Scanner; // importação da classe Scanner do pacote java.util
public class EntradaSaida {
   public static void main (String args[]) {
      System.out.println("Ola!"); // Mensagem inicial
      // Exibe mensagem e prepara entrada de dados
      System.out.print("Digite um inteiro: ");
      Scanner s = new Scanner(System.in);
      int valor = s.nextInt(); // declara e inicializa variável
      // exibição do valor lido
      System.out.println("Valor digitado = " + valor);
   }
}
