package exemplos;
import javax.swing.*;
import java.awt.event.*;

public class C09EX04 {

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {

          JDialog.setDefaultLookAndFeelDecorated(true);

          String[] L = {"A", "B", "C", "D"};
          int N;

          String M = "Selecione um dos bot�es:";
          String T = "Op��es";

          N = JOptionPane.showOptionDialog(null, M, T, 1, 1, null,
              L, "A");

          if (N == 0)
            JOptionPane.showMessageDialog(null, 
            "Acionou o bot�o [A]");
          if (N == 1)
            JOptionPane.showMessageDialog(null, 
            "Acionou o bot�o [B]");
          if (N == 2)
            JOptionPane.showMessageDialog(null, 
            "Acionou o bot�o [C]");
          if (N == 3)
            JOptionPane.showMessageDialog(null, 
            "Acionou o bot�o [D]");

        }
      }
    );
  }
}
