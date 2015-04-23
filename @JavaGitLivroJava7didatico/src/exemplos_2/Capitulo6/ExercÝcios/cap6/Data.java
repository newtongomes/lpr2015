package cap06;
/* java 7 - Ensino didático
 * Autor Sérgio Furgeri
 */
import javax.swing.*;
public class Data {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Forneça a data:");
        String data = String.format(aux);
        String mes = data(data);
        JOptionPane.showMessageDialog(null, "Data fornecida: " + data +
                "\nMês: " + mes);
        System.exit(0);
    }
    public static String data(String data) {
        return data.substring(3, 5);
    }
}
