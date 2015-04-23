package exemplos;
import javax.swing.*;
import java.awt.event.*;

public class C09EX02 {

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {

          // Decoração da parte visual

          JDialog.setDefaultLookAndFeelDecorated(true);

          // Definição das variáveis do programa

          String[] L = {"Um", "Dois", "Três", "Quatro", "Cinco"};
          int N;
          String X, M = "Mensagem", T = "Título";

          // Definição de constantes "simuladas" do programa

          final int S1 = JOptionPane.PLAIN_MESSAGE;
          final int S2 = JOptionPane.ERROR_MESSAGE;
          final int S3 = JOptionPane.INFORMATION_MESSAGE;
          final int S4 = JOptionPane.WARNING_MESSAGE;
          final int S5 = JOptionPane.QUESTION_MESSAGE;

          final int O1 = JOptionPane.DEFAULT_OPTION;
          final int O2 = JOptionPane.YES_NO_OPTION;
          final int O3 = JOptionPane.YES_NO_CANCEL_OPTION;
          final int O4 = JOptionPane.OK_CANCEL_OPTION;

          // Exemplo com método showInputDialog()

          X = JOptionPane.showInputDialog(null, M, T, -1);
          X = JOptionPane.showInputDialog(null, M, T,  0);
          X = JOptionPane.showInputDialog(null, M, T,  1);
          X = JOptionPane.showInputDialog(null, M, T,  2);
          X = JOptionPane.showInputDialog(null, M, T,  3);

          X = JOptionPane.showInputDialog(null, M, T, S1);
          X = JOptionPane.showInputDialog(null, M, T, S2);
          X = JOptionPane.showInputDialog(null, M, T, S3);
          X = JOptionPane.showInputDialog(null, M, T, S4);
          X = JOptionPane.showInputDialog(null, M, T, S5);

          X = (String) JOptionPane.showInputDialog(null, M, T, -1,
              null, L, L[0]);
          X = (String) JOptionPane.showInputDialog(null, M, T,  0,
              null, L, L[1]);
          X = (String) JOptionPane.showInputDialog(null, M, T,  1, 
              null, L, L[2]);
          X = (String) JOptionPane.showInputDialog(null, M, T,  2, 
              null, L, L[3]);
          X = (String) JOptionPane.showInputDialog(null, M, T,  3,
              null, L, L[4]);

          // Exemplo com método showOptionDialog()

          N = JOptionPane.showOptionDialog(null, M, T, 1, -1, null, 
              L, "Um");
          N = JOptionPane.showOptionDialog(null, M, T, 1,  0, null, 
              L, "Dois");
          N = JOptionPane.showOptionDialog(null, M, T, 1,  1, null, 
              L, "Três");
          N = JOptionPane.showOptionDialog(null, M, T, 1,  2, null, 
              L, "Quatro");
          N = JOptionPane.showOptionDialog(null, M, T, 1,  3, null,
              L, "Cinco");

          // Exemplo com método showConfirmDialog()

          N = JOptionPane.showConfirmDialog(null, M, T, -1, 1, 
              null);
          N = JOptionPane.showConfirmDialog(null, M, T,  0, 1,
              null);
          N = JOptionPane.showConfirmDialog(null, M, T,  1, 1, 
              null);
          N = JOptionPane.showConfirmDialog(null, M, T,  2, 1, 
              null);

          N = JOptionPane.showConfirmDialog(null, M, T, O1, 2, 
              null);
          N = JOptionPane.showConfirmDialog(null, M, T, O2, 2, 
              null);
          N = JOptionPane.showConfirmDialog(null, M, T, O3, 2, 
              null);
          N = JOptionPane.showConfirmDialog(null, M, T, O4, 2,
              null);

          // Exemplo com método showMessageDialog()

          JOptionPane.showMessageDialog(null, M, T, -1, null);
          JOptionPane.showMessageDialog(null, M, T,  0, null);
          JOptionPane.showMessageDialog(null, M, T,  1, null);
          JOptionPane.showMessageDialog(null, M, T,  2, null);
          JOptionPane.showMessageDialog(null, M, T,  3, null);
 
        }
      }
    );
  }
}
