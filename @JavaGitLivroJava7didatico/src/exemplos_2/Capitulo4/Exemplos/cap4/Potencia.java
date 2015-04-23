package cap04;
import javax.swing.JOptionPane;
public class Potencia {
    public static void main(String args[]) {
        float base = Float.parseFloat(
                JOptionPane.showInputDialog("Forneça o valor da base"));
        float potencia = Float.parseFloat(
                JOptionPane.showInputDialog("Forneça o valor da potência"));
        JOptionPane.showMessageDialog(null, "Potência com pow: " +
                "\nValor da base = " + base +
                "\nValor da potência = " + potencia +
                "\nResultado = "+Math.pow(base,potencia));
        System.exit(0);
    }
}

