package cap04;

import javax.swing.JOptionPane;
/* Java 7 - Ensino Didático
 * Autor Sérgio Furgeri
 */
public class Dado {
    public static void main(String[] args) {
        int numero = 1 + (int)(Math.random()*6); 
        JOptionPane.showMessageDialog(null, "Número sorteado: " + numero);
        System.exit(0);
    }
}
