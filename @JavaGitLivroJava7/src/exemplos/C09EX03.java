package exemplos;
import javax.swing.*;
import java.awt.event.*;

public class C09EX03 {

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {

          JDialog.setDefaultLookAndFeelDecorated(true);

          String M0 = "Selecione um dos botões:";
          String M1 = "Acionou o botão: NO";
          String M2 = "Acionou o botão: YES";
          String M3 = "Acionou o botão: FECHAR";
          String T1 = "Opções";
          String T2 = "Saída";
          int N;

          N = JOptionPane.showConfirmDialog(null, M0, T1, 0, 1);

          if (N == JOptionPane.NO_OPTION)
             JOptionPane.showMessageDialog(null, M1, T2, 2);             
          if (N == JOptionPane.OK_OPTION)
             JOptionPane.showMessageDialog(null, M2, T2, 2);        
          if (N == JOptionPane.CLOSED_OPTION)
             JOptionPane.showMessageDialog(null, M3, T2, 0);        

 
        }
      }
    );
  }
}
