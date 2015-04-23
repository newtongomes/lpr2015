package cap02;
/* Java 7 - Ensino Didatico
 * Autor Sergio Furgeri
 */
import javax.swing.*;
public class IMC {
    public static void main(String args[]) {
        String seuPeso = JOptionPane.showInputDialog(null, "Forneça seu peso:");
        if (seuPeso == null) {
            System.exit(0);
        }
        String suaAltura = JOptionPane.showInputDialog(null, "Forneça sua altura:");
        if (suaAltura == null) {
            System.exit(0);
        }
        try {
            float peso = Float.parseFloat(seuPeso);
            float altura = Float.parseFloat(suaAltura);
            float imc = peso / (altura * altura);

            String mensagem = "";
            if (imc < 18.5) {
                mensagem = "Você está abaixo do peso";
            } else if (imc >= 18.5 && imc < 24.5) {
                mensagem = "Seu peso está ideal";
            } else if (imc >= 24.5 && imc < 30) {
                mensagem = "Pré-obesidade";
            } else if (imc >= 30 && imc < 34.9) {
                mensagem = "Obesidade classe I";
            } else if (imc >= 35 && imc < 39.9) {
                mensagem = "Obesidade classe II (severa)";
            } else {
                mensagem = "Obesidade classe III (mórbida)";
            }
            JOptionPane.showMessageDialog(null, "Seu índice de massa corporal (IMC) é = " + imc +
                    "\n" + mensagem);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conversão, forneça apenas valores numéricos \n" + erro.toString());
        }
        System.exit(0);
    }
}
