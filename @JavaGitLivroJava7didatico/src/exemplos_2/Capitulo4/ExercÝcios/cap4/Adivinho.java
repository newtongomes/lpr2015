package cap04;
import javax.swing.JOptionPane;
/* Java 7 - Ensino Didático
 * Autor Sérgio Furgeri
 */
public class Adivinho {
    public static void main(String[] args) {
        int numero = (int) (Math.random()*10);
        int usuario = Integer.parseInt(
                JOptionPane.showInputDialog("Forneça um número de 0 a 9"));
        if(numero == usuario)
            JOptionPane.showMessageDialog(null, "Você adivinhou!!" +
                    "\nNúmero sorteado: " + numero +
                    "\nNúmero digitado: " + usuario);
        else{
            JOptionPane.showMessageDialog(null, "Você errou!!" +
                    "\nNúmero sorteado: " + numero +
                    "\nNúmero digitado: " + usuario);
        }
        System.exit(0);
    }
}
