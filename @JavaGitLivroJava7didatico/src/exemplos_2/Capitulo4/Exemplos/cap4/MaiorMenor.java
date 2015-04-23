package cap04;
import javax.swing.JOptionPane;
public class MaiorMenor {
    public static void main(String args[]) {
        float num1 = Float.parseFloat(
                JOptionPane.showInputDialog("Forneça o primeiro número"));
        float num2 = Float.parseFloat(
                JOptionPane.showInputDialog("Forneça o segundo número"));
        JOptionPane.showMessageDialog(null, "Números fornecidos: " + num1 + " , " + num2 +
                "\nO maior é " + Math.max(num1, num2) +
                "\nO menor é " + Math.min(num1, num2));
        System.exit(0);
    }
}



