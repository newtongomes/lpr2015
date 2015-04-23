package cap06;
/* java 7 - Ensino didático
 * Autor Sérgio Furgeri
 */
import javax.swing.*;
public class ImprimeIdade {
    public static void main(String args[]) {

        String aux = JOptionPane.showInputDialog("Forneça a idade:");
        double idade = Double.parseDouble(aux);
        String mensagem = ImprimeIdade.idade(idade);
        
        JOptionPane.showMessageDialog(null,  "Idade: " + idade + "\nMensagem: " + mensagem);
   }
    public static String idade(double a) {
        String mensagem = "";
        if (a >= 0 && a <= 2) {
            mensagem = "Bebê";
        }
        else if (a >= 3 && a <= 11) {
            mensagem = "Criança";
        }
        else if (a >= 12 && a <= 19) {
            mensagem = "Adolescente";
        }
        else if (a >= 20 && a <= 30) {
            mensagem = "Jovem";
        }
        else if (a >= 31 && a <= 60) {
            mensagem = "Adulto";
        }
        else {
            mensagem = "Idoso";
        }
        return mensagem;
    }
}

        



