package exemplos;
import javax.swing.*;
import java.awt.event.*;

public class C09EX06 {

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {

          JDialog.setDefaultLookAndFeelDecorated(true);

          String[] L = {"Sim", "Não"};
          Icon ICONE = new ImageIcon("icone.png");

          String M = "Selecione um dos botões:";
          String T = "Opções";          

          JOptionPane.showOptionDialog(null, M, T, 1, 2, ICONE, L, L[0]);

        }
      }
    );
  }
}
