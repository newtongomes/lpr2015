package exemplos;
import javax.swing.*;

public class C09EX07 extends JFrame {
  public C09EX07() {

    super("Formulário 1");
    setSize(427, 273);
    setVisible(true);

  }
  
  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);

          C09EX07 VISUAL = new C09EX07();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   
        }
      }
    );
  }

}
