package exemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class C09EX10 extends JFrame {

  JTextField TEXTO;

  JLabel ROTULO;

  public C09EX10() {

    super("Formulário 4");

    Container  CONT   = getContentPane();
    JButton    BOTAO  = new JButton("OK");

    TEXTO = new JTextField();
    ROTULO = new JLabel("Texto");

    setLayout(null);

    CONT.add(TEXTO);
    CONT.add(BOTAO);
    CONT.add(ROTULO);

    TEXTO.setBounds(138,20,150,20);
    BOTAO.setBounds(138,50,70,20);
    ROTULO.setBounds(138,80,160,20);

    Captura EVENTO = new Captura();
    BOTAO.addActionListener(EVENTO);

    setSize(427, 273);
    setVisible(true);

  }

  private class Captura implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
      String SAIDA = TEXTO.getText();
      ROTULO.setText(SAIDA);
    }
  } 
  
  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);

          C09EX10 VISUAL = new C09EX10();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
      }
    );
  }

}
