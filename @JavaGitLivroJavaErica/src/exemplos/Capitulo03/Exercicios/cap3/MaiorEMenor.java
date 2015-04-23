package cap03;
/* java 7 - Ensino didático
 * Autor Sérgio Furgeri
 */
import javax.swing.*;
public class MaiorEMenor {
    public static void main(String args[]) {
        String idade1 = JOptionPane.showInputDialog(null, "Forneça a 1ª idade:");
        if (idade1 == null) {
            System.exit(0);
        }
        String idade2 = JOptionPane.showInputDialog(null, "Forneça a 2ª idade:");
        if (idade2 == null) {
            System.exit(0);
        }
        String idade3 = JOptionPane.showInputDialog(null, "Forneça a 3ª idade::");
        if (idade3 == null) {
            System.exit(0);
        }
        String idade4 = JOptionPane.showInputDialog(null, "Forneça a 4ª idade::");
        if (idade4 == null) {
            System.exit(0);
        }

        try {
            int menor = Integer.parseInt(idade1);
            int num2 = Integer.parseInt(idade2);
            int num3 = Integer.parseInt(idade3);
            int num4 = Integer.parseInt(idade4);

            if (num2 < menor) {
                menor = num2;
            }
            if (num3 < menor) {
                menor = num3;
            }
            if (num4 < menor) {
                menor = num4;
            }

            int maior = Integer.parseInt(idade1);
            if (num2 > maior) {
                maior = num2;
            }
            if (num3 > maior) {
                maior = num3;
            }
            if (num4 > maior) {
                maior = num4;
            }

            JOptionPane.showMessageDialog(null, "Idades fornecidas:\n" + idade1 + ", " + idade2 + ", " + idade3 + ", " + idade4 +
                    "\nA maior idade é: " + maior +
                    "\nA menor idade é: " + menor);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Nao foi fornecido um numero inteiro valido" + erro.toString());
        }
        System.exit(0);
    }
}
