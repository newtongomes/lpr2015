package cap03;
/* Java 7 - Ensino Didatico
 * Autor Sergio Furgeri
 */
import javax.swing.JOptionPane;
public class Operacoes {
    public static void main(String args[]) {
        try {
            String num1 = JOptionPane.showInputDialog(null, "Forneça o primeiro número:");
            if (num1 == null) {
                System.exit(0);
            }
            float n1 = Float.parseFloat(num1);
            String num2 = JOptionPane.showInputDialog(null, "Forneça o segundo número:");
            if (num2 == null) {
                System.exit(0);
            }
            float n2 = Float.parseFloat(num2);
            String operacao = JOptionPane.showInputDialog("Digite: \nA para soma, \nB para subtração, " +
                    "\nC para Multiplicação, \nD para Divisão");
            float resultado = 0;
            String operador = "";
            if (operacao.equals("A")) {
                resultado = n1 + n2;
                operador = "soma";
            } else if (operacao.equals("B")) {
                resultado = n1 - n2;
                    operador = "subtração";
            } else if (operacao.equals("C")) {
                resultado = n1 * n2;
                operador = "multiplicação";
            } else if (operacao.equals("D")) {
                if (n2 == 0) {
                    JOptionPane.showMessageDialog(null, "O valor do segundo número não pode ser zero!");
                    System.exit(0);
                }
                operador = "divisão";
                resultado = n1 / n2;
            } else {
                JOptionPane.showMessageDialog(null, "Operador não conhecido!");
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null,
                    "Numeros fornecidos: " + n1 + " e " + n2 +
                    "\nOperação escolhida: " + operador +
                    "\nResultado da Operação: " + resultado);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos!" + erro.toString());
        }
        System.exit(0);
    }
}



