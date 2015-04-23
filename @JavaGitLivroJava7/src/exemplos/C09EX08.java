package exemplos;
import javax.swing.*;
import java.awt.*;

public class C09EX08 extends JFrame {

  public C09EX08() {

    super("Formulário 2");
 
    Container CONT = getContentPane();
    CONT.setBackground(Color.yellow);

    setSize(427, 273);
    setVisible(true);

  }
  
  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);

          C09EX08 VISUAL = new C09EX08();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   
        }
      }
    );
  }

}
