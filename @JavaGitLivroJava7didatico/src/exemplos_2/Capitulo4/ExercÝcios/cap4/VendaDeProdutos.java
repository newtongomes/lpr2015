package cap04;
/* Java 7 - Ensino Didático
 * Autor Sérgio Furgeri
 */
import javax.swing.JOptionPane;
public class VendaDeProdutos {
    public static void main(String[] args) {
        double valorVenda = Float.parseFloat(
                JOptionPane.showInputDialog("Forneça o valor da venda"));
        double desconto = Float.parseFloat(
                JOptionPane.showInputDialog("Forneça o percentual de desconto"));
        double valorFinal = Math.floor(valorVenda - (valorVenda * desconto / 100));
        JOptionPane.showMessageDialog(null, "Valor Original: " + valorVenda +
                "\nPercentual de Desconto: " + desconto +
                "\nValor Final com Desconto: " + valorFinal);
        System.exit(0);
    }
}
