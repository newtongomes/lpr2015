package cap03;
import javax.swing.JOptionPane;
public class SomaImpares {
    public static void main(String[] args) {
        int total = 0;
        for (int i=1;i<1000;i=i+2)
            total+=i;
        JOptionPane.showMessageDialog(null, "Resultado da soma: " + total);
        System.exit(0);
    }
}
