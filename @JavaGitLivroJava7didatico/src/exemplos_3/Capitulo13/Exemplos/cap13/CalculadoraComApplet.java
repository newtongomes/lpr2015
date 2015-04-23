package cap13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculadoraComApplet extends JApplet{
    private float n1,n2;
    JLabel lbNum1, lbNum2, lbTotal;
    JButton btSomar, btSubtrair, btMultiplicar, btDividir, btLimpar;
    JTextField tfNum1, tfNum2, tfTotal;

    public void init() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(new GridLayout(3, 4));
        lbNum1 = new JLabel("Num.1");
        lbNum1.setForeground(Color.black);
        lbNum1.setFont(new Font("", Font.BOLD, 14));
        lbNum2 = new JLabel("Num.2");
        lbNum2.setForeground(Color.black);
        lbNum2.setFont(lbNum1.getFont());
        lbTotal = new JLabel("Total");
        lbTotal.setFont(lbNum1.getFont());
        btSomar = new JButton("+");
        btSubtrair = new JButton("-");
        btMultiplicar = new JButton("x");
        btDividir = new JButton("/");
        btLimpar = new JButton("Limpar");
        btLimpar.setBackground(Color.black);
        btLimpar.setForeground(Color.white);
        tfNum1 = new JTextField();
        tfNum2 = new JTextField();
        tfTotal = new JTextField();
        tfTotal.setEditable(false);
        add(lbNum1); add(tfNum1); add(btSomar);
        add(btSubtrair); add(lbNum2); add(tfNum2);
        add(btMultiplicar); add(btDividir); add(lbTotal);
        add(tfTotal); add(btLimpar);
    }

    private void definirEventos() {
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfNum1.setText(""); tfNum2.setText(""); tfTotal.setText("");
            }
        });
        btSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular(1);
            }
        });
        btSubtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular(2);
            }
        });
        btMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular(3);
            }
        });
        btDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular(4);
            }
        });
    }

    public void calcular(int operacao) {
        try {
            n1 = Float.parseFloat(tfNum1.getText());
            n2 = Float.parseFloat(tfNum2.getText());
            if (operacao==1) tfTotal.setText("" + (n1 + n2));
            else if (operacao==2) tfTotal.setText("" + (n1 - n2));
            else if (operacao==3) tfTotal.setText("" + (n1 * n2));
            else if (operacao==4) tfTotal.setText("" + (n1 / n2));
        } catch (NumberFormatException erro) {
            tfTotal.setText("Erro");
        }
    }
}