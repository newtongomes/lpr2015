package cap04;
import javax.swing.JOptionPane;
/* Java 7 - Ensino Didático
 * Autor Sérgio Furgeri
 */
public class FraseSemVogal {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        String novaFrase = "";
        for (int i=0;i<frase.length();i++){
            if( !(  frase.toLowerCase().charAt(i)=='a' ||
                    frase.toLowerCase().charAt(i)=='e' ||
                    frase.toLowerCase().charAt(i)=='i' ||
                    frase.toLowerCase().charAt(i)=='o' ||
                    frase.toLowerCase().charAt(i)=='u'))
                novaFrase += frase.charAt(i);
        }
        JOptionPane.showMessageDialog(null,
            "\nFrase fornecida: " + frase +
            "\nFrase sem vogais: " + novaFrase);
        System.exit(0);
    }
}
