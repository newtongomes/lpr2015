package exemplos;
import javax.swing.*;
import java.awt.event.*;

public class C09EX01 {

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {

          JFrame.setDefaultLookAndFeelDecorated(true);
          JDialog.setDefaultLookAndFeelDecorated(true);

          JFrame TELA = new JFrame("Entrada e Saída");
          JLabel TEXTO = new JLabel("Acione o botão: Entrada.");
          JButton BOTAO = new JButton("Entrada");

          BOTAO.addActionListener(
            new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
                String N;    
                String T1 = "Entrada";
                String T2 = "Saída";
                String M1 = "Entre seu nome:";
                String M2 = "Olá, ";
                String M3 = "O botão: Cancel, foi acionado.";
                N = JOptionPane.showInputDialog(null, M1, T1, 1);
                if (N != null)
                  JOptionPane.showMessageDialog(null, M2+N, T2, 1);
                else
                  JOptionPane.showMessageDialog(null, M3, T2, 1);
              }
            }
          );

          TELA.setLayout(null);
          TELA.getContentPane().add(TEXTO);
          TELA.getContentPane().add(BOTAO);
 
          TEXTO.setBounds(30,20,210,20);
          BOTAO.setBounds(30,50,210,20);
 
          TELA.setSize(280,130);
          TELA.setVisible(true); 
          TELA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        }
      }
    );
  }
}
