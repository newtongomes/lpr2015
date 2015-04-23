package cap02;
/* Java 7 - Ensino Didatico
 * Autor Sergio Furgeri
 */
import javax.swing.*;
public class OperacoesMatematicas {
    public static void main(String args[]) {
        String num1 = JOptionPane.showInputDialog("Forneca o primeiro valor");
        if (num1 == null) {
            System.exit(0);
        }
        String num2 = JOptionPane.showInputDialog("Forneca o segundo valor");
        if (num2 == null) {
            System.exit(0);
        }
        try {
            float v1 = Float.parseFloat(num1);
            float v2 = Float.parseFloat(num2);
            float soma = v1 + v2;
            float subtracao = v1 - v2;
            float multiplicacao = v1 * v2;
            float divisao = v1 / v2;
            JOptionPane.showMessageDialog(null,
                    "Números fornecidos : " + v1 + ", " + v2 +
                    "\nSoma = " + soma +
                    "\nSubtracao = " + subtracao +
                    "\nMultiplicacao = " + multiplicacao +
                    "\nDivisao = " + divisao);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conversão, forneça apenas valores numéricos \n" + erro.toString());
        }
        System.exit(0);
    }
}

