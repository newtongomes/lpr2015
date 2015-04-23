package cap04;
import javax.swing.JOptionPane;
public class CaracteresDaFrase {
    public static void main(String args[]) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        String trecho = "";
        for (int i = 11; i <= 14; i++) {
            trecho += frase.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "Frase: " + frase +
            "\nCaractere 2: " + frase.charAt(1) +
            "\nTrecho: " + trecho);
        System.exit(0);
    }
}


