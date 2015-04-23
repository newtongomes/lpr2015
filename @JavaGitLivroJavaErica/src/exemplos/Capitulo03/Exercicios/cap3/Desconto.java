package cap03;
/* java 7 - Ensino didático
 * Autor Sérgio Furgeri
 */
import javax.swing.*;
public class Desconto {
    public static void main(String args[]) {
        String produto = JOptionPane.showInputDialog(null, "Forneça o valor do produto:");
        if (produto == null) {
            System.exit(0);
        }
        String desconto = JOptionPane.showInputDialog(null, "Forneça o código do desconto:");
        if (desconto == null) {
            System.exit(0);
        }
        try {
            float valorProduto = Float.parseFloat(produto);
            int codigoDesconto = Integer.parseInt(desconto);
            String mensagem = "Valor do produto com desconto: R$";
            switch (codigoDesconto) {
                case 1:
                    mensagem += (valorProduto * 0.95);
                    break;
                case 2:
                    mensagem += (valorProduto * 0.90);
                    break;
                case 3:
                    mensagem += (valorProduto * 0.80);
                    break;
                case 4:
                    mensagem += (valorProduto * 0.50);
                    break;
                default:
                    mensagem =  "Código de desconto desconhecido!";
            }
            JOptionPane.showMessageDialog(null, "Valor do produto: R$" + produto +
                    "\nCódigo do Desconto: " + desconto +
                    "\n" + mensagem);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos!" + erro.toString());
        }
        System.exit(0);
    }
}



