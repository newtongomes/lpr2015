package cap04;
import javax.swing.JOptionPane;
public class ArredondamentoParaCima {
    public static void main(String args[]) {
        double n1 = 5.2, n2 = 5.6, n3 = -5.8;
        JOptionPane.showMessageDialog(null, "Arredondando com ceil: " +
                "\n" + n1 + "=" + Math.ceil(n1) +
                ",   " + n2 + "=" + Math.ceil(n2) +
                ",   " + n3 + "=" + Math.ceil(n3));
        System.exit(0);
    }
}


