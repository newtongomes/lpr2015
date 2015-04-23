package cap04;
import javax.swing.JOptionPane;
public class CartaoLoteria {
    public static void main(String[] args) {
        for (int cartao = 1; cartao <= 4; cartao++) { //controla o número do cartão
            String numerosCartao = "";
            for (int numCartao = 1; numCartao <= 6; numCartao++) { //controla os números de cada cartão
                int num = (int) (Math.random() * 100);
                numerosCartao += num + "   ";
            }
            JOptionPane.showMessageDialog(null, "Números do cartão: " + cartao +
                    "\n" + numerosCartao);
        }
        System.exit(0);
    }
}




