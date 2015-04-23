package exemplos;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class C10EX07 extends JFrame {

  public C10EX07() {

    super("Efeito de Transparencia");

    final JSlider DESLIZA = new JSlider(0, 100, 100);
    JLabel ROTUL1 = new JLabel("+ TRANSPARENTE");
    JLabel ROTUL2 = new JLabel("- TRANSPARENTE");

    ChangeListener cl = new ChangeListener() {
      public void stateChanged(ChangeEvent ce) {
        JSlider BARRADESLIZ = (JSlider) ce.getSource();
        C10EX07.this.setOpacity(BARRADESLIZ.getValue() / 100.0f);
      }
    };

    DESLIZA.addChangeListener(cl);	
    getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
    getContentPane().add(ROTUL1);
    getContentPane().add(new JPanel() {{add(DESLIZA);}});
    getContentPane().add(ROTUL2);
    setSize(550, 150);
    setVisible(true);
    setResizable(false);

  }
  
  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable () {
        public void run() {

          JFrame.setDefaultLookAndFeelDecorated(true);

          C10EX07 VISUAL = new C10EX07();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        }
      }
    );
  }

}
