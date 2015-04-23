package cap08;
import java.awt.event.*;
import javax.swing.*;  //não foram tratados os erros de conversão e formatação
public class GuiImpostos extends JPanel {
    private JLabel lbValor, lbTotal;
    private JTextField tfValor, tfIcms, tfIpi, tfTotal;
    private JCheckBox ckIpi, ckIcms;
    private JButton btCalcular, btLimpar;

    public GuiImpostos() {
        inicializarComponentes();
	definirEventos();
    }

    private void inicializarComponentes() {
	setLayout(null);
        lbValor = new JLabel ("Valor da Venda:");
        tfValor = new JTextField();
        tfIcms = new JTextField ("0");
        tfIcms.setEditable(false);
        ckIcms = new JCheckBox ("ICMS (18%)");
        ckIpi = new JCheckBox ("IPI  ( 5%)");
        tfIpi = new JTextField ("0");
        tfIpi.setEditable(false);
        lbTotal = new JLabel ("Valor total:");
        tfTotal = new JTextField ("0");
        tfTotal.setEditable(false);
        btCalcular = new JButton ("Calcular");
        btLimpar = new JButton ("Limpar");
        lbValor.setBounds (50, 15, 100, 25);
        tfValor.setBounds (160, 15, 105, 25);
        tfIcms.setBounds (160, 50, 105, 25);
        ckIcms.setBounds (50, 50, 100, 25);
        ckIpi.setBounds (50, 90, 100, 25);
        tfIpi.setBounds (160, 90, 105, 25);
        lbTotal.setBounds (50, 130, 100, 25);
        tfTotal.setBounds (160, 130, 105, 25);
        btCalcular.setBounds (55, 170, 100, 25);
        btLimpar.setBounds (160, 170, 100, 25);
        add (lbValor);
        add (tfValor);
        add (tfIcms);
        add (ckIcms);
        add (ckIpi);
        add (tfIpi);
        add (lbTotal);
        add (tfTotal);
        add (btCalcular);
        add (btLimpar);
    }
    private void definirEventos() {
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent E) {
                tfIcms.setText("0");
                tfIpi.setText("0");
                tfTotal.setText("0");
                tfValor.setText("");
                tfValor.requestFocus();
            }
        });
        ckIcms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent E) {
                atualizar();
            }
        });
        ckIpi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent E) {
                atualizar();
            }
        });
        btCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent E) {
                atualizar();
            }
        });

    }
    private void atualizar(){
        if(!tfValor.getText().equals("")){
            double valorVenda = Double.parseDouble(tfValor.getText());
            double valorIcms = 0, valorIpi = 0, valorTotal = 0;
            if (ckIcms.isSelected()){
                  valorIcms = valorVenda * 18/100;
                  tfIcms.setText(""+valorIcms);
            }
            else
                tfIcms.setText("0");

            if (ckIpi.isSelected()){
                  valorIpi = valorVenda * 5/100;
                  tfIpi.setText(""+valorIpi);
            }
            else
                tfIpi.setText("0");

            valorTotal = valorVenda + valorIcms + valorIpi;
            tfTotal.setText(""+valorTotal);
       }
    }
}
