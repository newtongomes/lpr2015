package exemplos;
import javax.swing.*;
import java.awt.event.*;

public class C09EX06 {

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {

          JDialog.setDefaultLookAndFeelDecorated(true);

          String[] L = {"Sim", "N�o"};
          Icon ICONE = new ImageIcon("icone.png");

          String M = "Selecione um dos bot�es:";
          String T = "Op��es";          

          JOptionPane.showOptionDialog(null, M, T, 1, 2, ICONE, L, L[0]);

        }
      }
    );
  }
}
