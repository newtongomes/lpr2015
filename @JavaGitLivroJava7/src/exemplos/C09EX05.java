package exemplos;
import javax.swing.*;
import java.awt.event.*;

public class C09EX05 {

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {

          JDialog.setDefaultLookAndFeelDecorated(true);

          JFrame TELA = new JFrame();
          String L[] = new String[25];

          for (int I = 0; I < L.length; I++) {
            L[I] = Integer.toString(I + 1);
          }

          String M = "Selecione um dos botões:";
          String T = "Opções";

          JOptionPane.showInputDialog(TELA, M, T, 2, null, L, L[4]);

        }
      }
    );
  }
}
