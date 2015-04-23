package cap13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TecladoVirtual extends JApplet {
    private JButton btA, btB, btC, btD, btE, btLimpar;
    private JPasswordField pfSenha;

    public void init() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setLayout(new FlowLayout());
        btA = new JButton("A");
        btB = new JButton("B");
        btC = new JButton("C");
        btD = new JButton("D");
        btE = new JButton("E");
        btLimpar = new JButton("Limpar");
        pfSenha = new JPasswordField(10);
        add(btA);
        add(btB);
        add(btC);
        add(btD);
        add(btE);
        add(btLimpar);
        add(pfSenha);
    }

    private void definirEventos() {
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pfSenha.setText("");
            }
        });
        btA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                digitar("a");
            }
        });
        btB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                digitar("b");
            }
        });
        btC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                digitar("c");
            }
        });
        btD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                digitar("d");
            }
        });
        btE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                digitar("e");
            }
        });

    }
    private void digitar(String tecla) {
        pfSenha.setText(pfSenha.getPassword()+tecla);
        Toolkit.getDefaultToolkit().beep(); //Emite um beep sonoro
    }
}
