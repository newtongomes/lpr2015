package cap02;
/* Java 7 - Ensino Didatico
 * Autor Sergio Furgeri
 */
import javax.swing.*;
public class BandaLarga {
    public static void main(String args[]) {
        double tamanho, tempoParaDownloadEmSegundos;
        final int velocidadeEmBytes = 2000000 / 8; // em bytes
        String bytes = JOptionPane.showInputDialog(null, "Forneca o tamanho do arquivo em Bytes:");
        if (bytes == null) {
            System.exit(0);
        }
        try {
            tamanho = Double.parseDouble(bytes);
            tempoParaDownloadEmSegundos = (tamanho / velocidadeEmBytes);

            JOptionPane.showMessageDialog(null,
                    "Tamanho do arquivo em bytes: " + bytes +
                    "\nSegundos necessários para download: " + tempoParaDownloadEmSegundos);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,"Erro de conversão, forneça apenas valores numéricos \n" + erro.toString());
        }
        System.exit(0);
    }
}
