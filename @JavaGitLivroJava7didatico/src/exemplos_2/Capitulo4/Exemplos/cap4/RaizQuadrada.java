package cap04;
import javax.swing.JOptionPane;
public class RaizQuadrada {
    public static void main(String args[]) {
        float num1 = Float.parseFloat(
                JOptionPane.showInputDialog("Forneça o número"));
        JOptionPane.showMessageDialog(null, "Raiz quadrada com sqrt: " +
                "\n" + num1 + " = " + Math.sqrt(num1));
        System.exit(0);
    }
}

