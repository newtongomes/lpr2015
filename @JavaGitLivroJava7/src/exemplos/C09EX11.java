package exemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class C09EX11 extends JFrame {

  JTextField TEXT1;
  JTextField TEXT2;
  JTextField TEXT3;

  JLabel ROTUL1;
  JLabel ROTUL2;
  JLabel ROTUL3;

  public C09EX11() {

    super("Ficha Biométrica");

    Container CONT = getContentPane();

    JLabel ROTUL4 = new JLabel("Nome:");
    JLabel ROTUL5 = new JLabel("Idade:");
    JLabel ROTUL6 = new JLabel("Altura:");

    TEXT1 = new JTextField();
    TEXT2 = new JTextField();
    TEXT3 = new JTextField();

    JButton BOTAO = new JButton("OK");

    JLabel ROTUL7 = new JLabel("Nome:");
    JLabel ROTUL8 = new JLabel("Idade:");
    JLabel ROTUL9 = new JLabel("Altura:");

    ROTUL1 = new JLabel();
    ROTUL2 = new JLabel();
    ROTUL3 = new JLabel();

    setLayout(null);
 
    CONT.add(ROTUL4);
    CONT.add(ROTUL5);
    CONT.add(ROTUL6);

    CONT.add(TEXT1);
    CONT.add(TEXT2);
    CONT.add(TEXT3);

    CONT.add(BOTAO);

    CONT.add(ROTUL7);
    CONT.add(ROTUL8);
    CONT.add(ROTUL9);

    CONT.add(ROTUL1);
    CONT.add(ROTUL2);
    CONT.add(ROTUL3);

    ROTUL4.setBounds(30,20,150,20);
    ROTUL5.setBounds(30,50,150,20);
    ROTUL6.setBounds(30,80,150,20);

    TEXT1.setBounds(80,20,150,20);
    TEXT2.setBounds(80,50,150,20);
    TEXT3.setBounds(80,80,150,20);

    BOTAO.setBounds(95,110,70,20);

    ROTUL7.setBounds(30,140,150,20);
    ROTUL8.setBounds(30,170,150,20);
    ROTUL9.setBounds(30,200,150,20);

    ROTUL1.setBounds(80,140,150,20);
    ROTUL2.setBounds(80,170,150,20);
    ROTUL3.setBounds(80,200,150,20);

    AcionaBotao EVENTO = new AcionaBotao();
    BOTAO.addActionListener(EVENTO);

    setSize(273, 273);
    setVisible(true);

  }
 
  private class AcionaBotao implements ActionListener {
    public void actionPerformed(ActionEvent ae) {

      String NOME   = TEXT1.getText();
      String IDADE  = TEXT2.getText() + " anos";
      String ALTURA = TEXT3.getText();

      ROTUL1.setText(NOME);
      ROTUL2.setText(IDADE);
      ROTUL3.setText(ALTURA);

    }
  } 

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);

          C09EX11 VISUAL = new C09EX11();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
      }
    );
  }

}
