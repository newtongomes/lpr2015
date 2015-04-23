package exemplos;
import javax.swing.*;
import java.awt.*;

public class C09EX09 extends JFrame {

  public C09EX09() {

    super("Formulário 3");

    Container  CONT   = getContentPane();

    JTextField TEXTO  = new JTextField();
    JButton    BOTAO  = new JButton("OK");
    JLabel     ROTULO = new JLabel("Texto");

    setLayout(null);

    CONT.add(TEXTO);
    CONT.add(BOTAO);
    CONT.add(ROTULO);

    TEXTO.setBounds(138,20,150,20);
    BOTAO.setBounds(138,50,70,20);
    ROTULO.setBounds(138,80,100,20);

    setSize(427, 273);
    setVisible(true);

  }
  
  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);

          C09EX09 VISUAL = new C09EX09();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
      }
    );
  }

}
