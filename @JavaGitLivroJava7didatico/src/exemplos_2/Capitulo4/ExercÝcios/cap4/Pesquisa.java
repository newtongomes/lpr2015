package cap04;
import javax.swing.JOptionPane;
/* Java 7 - Ensino Didático
 * Autor Sérgio Furgeri
 */
public class Pesquisa {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        String palavra = JOptionPane.showInputDialog("Forneça uma palavra");
        int pos = 0;
        int qtde = 0;
        while (true){
            pos = frase.indexOf(palavra,pos);
            if (pos!=-1){
                qtde++;
                pos++;
            }
            else
                break;
        }
        JOptionPane.showMessageDialog(null,
            "\nFrase fornecida: " + frase +
            "\nPalavra fornecida: " + palavra +
            "\nQuantidade de Ocorrências: " + qtde);
        System.exit(0);
    }
}
