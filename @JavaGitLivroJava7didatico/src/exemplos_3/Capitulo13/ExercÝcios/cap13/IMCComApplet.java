package cap13;
/* Java 7 - Ensino Didatico
 * Autor Sergio Furgeri
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class IMCComApplet extends JApplet { 

    private float n1, n2;
    JLabel lbNum1, lbNum2, lbTotal;
    JButton btCalcular, btLimpar;
    JTextField tfNum1, tfNum2, tfTotal;

    public void init() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(new GridLayout(4, 2));
        lbNum1 = new JLabel("Peso:");
        lbNum1.setForeground(Color.black);
        lbNum1.setFont(new Font("", Font.BOLD, 25));
        lbNum2 = new JLabel("Altura:");
        lbNum2.setForeground(Color.black);
        lbNum2.setFont(lbNum1.getFont());
        lbTotal = new JLabel("Mensagem:");
        lbTotal.setFont(lbNum1.getFont());
        btCalcular = new JButton("Mostrar");
        btCalcular.setBackground(Color.GRAY);
        btCalcular.setForeground(Color.BLACK);
        btCalcular.setFont(lbNum1.getFont());
        btLimpar = new JButton("Limpar");
        btLimpar.setBackground(Color.GRAY);
        btLimpar.setForeground(Color.BLACK);
        btLimpar.setFont(lbNum1.getFont());
        tfNum1 = new JTextField();
        tfNum1.setFont(lbNum1.getFont());
        tfNum2 = new JTextField();
        tfNum2.setFont(lbNum1.getFont());
        tfTotal = new JTextField();
        tfTotal.setEditable(false);
        add(lbNum1); add(tfNum1);
        add(lbNum2); add(tfNum2);
        add(lbTotal); add(tfTotal);
        add(btCalcular); add(btLimpar);
        
    }

    private void definirEventos() {
        btLimpar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                tfNum1.setText("");
                tfNum2.setText("");
                tfTotal.setText("");
            }
        });
        btCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    float peso = Float.parseFloat(tfNum1.getText());
                    float altura = Float.parseFloat(tfNum2.getText());
                    float imc = peso / (altura * altura);

                    if (imc < 18.5) {
                        tfTotal.setForeground(Color.red);
                        tfTotal.setFont(lbNum1.getFont());
                        tfTotal.setText("Abaixo do peso");
                    } else if (imc >= 18.5 && imc < 24.5) {
                        tfTotal.setForeground(Color.blue);
                        tfTotal.setFont(lbNum1.getFont());
                        tfTotal.setText("Peso ideal");
                    } else if (imc >= 24.5 && imc < 30) {
                        tfTotal.setForeground(Color.red);
                        tfTotal.setFont(lbNum1.getFont());
                        tfTotal.setText("pré-obesidade");
                    } else if (imc >= 30 && imc < 34.9) {
                        tfTotal.setForeground(Color.red);
                        tfTotal.setFont(lbNum1.getFont());
                        tfTotal.setText("Obesidade I");

                    } else if (imc >= 35 && imc < 39.9) {
                        tfTotal.setForeground(Color.red);
                        tfTotal.setFont(lbNum1.getFont());
                        tfTotal.setText("Obesidade II");
                    } else {
                        tfTotal.setForeground(Color.red);
                        tfTotal.setFont(lbNum1.getFont());
                        tfTotal.setText("Obesidade III");
                    }

                } catch (NumberFormatException erro) {
                    tfTotal.setText("Erro" + erro.toString());
                }
            }
        });
    }
}












       