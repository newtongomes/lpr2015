package cap06;
/* java 7 - Ensino didático
 * Autor Sérgio Furgeri
 */
import javax.swing.*;
public class SorteioBrindes {
    public static void main(String[] args) {
        String brinde = sorteio("Casa", "Carro", "Fogão", "Geladeira");
        JOptionPane.showMessageDialog(null, "Brinde sorteado: " + brinde);
        System.exit(0);
    }
    public static String sorteio(String a, String b, String c, String d) {
        String[] brindes = {a, b, c, d};
        int num = (int) (Math.random() * 5);
        String x = brindes[num];
        return x;
       }
}



