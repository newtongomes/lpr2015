package cap08;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;
public class GuiDiscador extends JPanel {
    private JTextField tfNumeros;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt7;
    private JButton bt8;
    private JButton bt9;
    private JButton bt10;
    private JButton bt11;
    private JButton bt12;
    private JButton bt13;

    public GuiDiscador() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        bt10 = new JButton("*");
        bt11 = new JButton("0");
        bt12 = new JButton("#");
        bt13 = new JButton("Limpar");
        tfNumeros = new JTextField();
        tfNumeros.setEditable(false);
        bt1.setBounds(55, 10, 65, 30);
        bt2.setBounds(130, 10, 65, 30);
        bt3.setBounds(205, 10, 65, 30);
        bt4.setBounds(55, 45, 65, 30);
        bt5.setBounds(130, 45, 65, 30);
        bt6.setBounds(205, 45, 65, 30);
        bt7.setBounds(55, 85, 65, 30);
        bt8.setBounds(130, 85, 65, 30);
        bt9.setBounds(205, 85, 65, 30);
        bt10.setBounds(55, 125, 65, 30);
        bt11.setBounds(130, 125, 65, 30);
        bt12.setBounds(205, 125, 65, 30);
        bt13.setBounds(55,165,216,30);
        tfNumeros.setBounds(55,205,216,28);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        add(bt7);
        add(bt8);
        add(bt9);        
        add(bt10);
        add(bt11);
        add(bt12);
        add(bt13);
        add(tfNumeros);
        
    }
    private void definirEventos() {
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("1");
            }
        });
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("2");
            }
        });
        bt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("3");
            }
        });
        bt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("4");
            }
        });
        bt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("5");
            }
        });
        bt6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("6");
            }
        });
        bt7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("7");
            }
        });
        bt8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("8");
            }
        });
        bt9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("9");
            }
        });
        bt10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("*");
            }
        });
        bt11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("0");
            }
        });
        bt12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                discar("#");
            }
        });
        bt13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                tfNumeros.setText("");
            }
        });
    }
    private void discar(String digito){
        tfNumeros.setText(tfNumeros.getText()+digito);
        Toolkit.getDefaultToolkit().beep(); //Emite um beep sonoro
    }
}
