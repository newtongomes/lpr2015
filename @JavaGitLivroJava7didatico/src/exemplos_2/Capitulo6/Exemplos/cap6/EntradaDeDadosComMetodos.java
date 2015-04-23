package cap06;
import javax.swing.*;
public class EntradaDeDadosComMetodos {
    static String aux = "";
    public static float leNumeroFloat(float minimo, float maximo) {
        float n = 0;
        while (true) {
            try {
                aux = JOptionPane.showInputDialog("forneça um valor entre 0 e 10");
                n = Float.parseFloat(aux);
                if (n < minimo || n > maximo) 
                    JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida !!");
                 else
                    break;  // encerra o loop infinito
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos !!\n" + erro.toString());
            }
        }
        return (n);
    }

    public static int leNumeroInt(int minimo, int maximo) {
        int n = 0;
        while (true) {
            try {
                aux = JOptionPane.showInputDialog("forneça um valor inteiro entre " + minimo + " e " + maximo);
                n = Integer.parseInt(aux);
                if (n < minimo || n > maximo) 
                    JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida !!");
                 else
                    break;  // encerra o loop infinito
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos !!\n" + erro.toString());
            }
        }
        return (n);
    }

    public static String leString() {
        aux = JOptionPane.showInputDialog("forneça um nome");
        return (aux);
    }
}
