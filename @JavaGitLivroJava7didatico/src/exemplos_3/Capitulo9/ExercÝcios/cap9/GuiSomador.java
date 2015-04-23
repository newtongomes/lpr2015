package cap09;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class GuiSomador extends JFrame {
    private JLabel lbNumero1, lbNumero2, lbSoma;
    private JTextField tfNumero1, tfNumero2, tfSoma;

    public static void main(String[] args) {
        JFrame janela = new GuiSomador();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public GuiSomador(){
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setTitle("Somador");
        setBounds(200,200,250,100);
        setLayout(new GridLayout(3, 2));
        lbNumero1 = new JLabel("Numero 1");
        lbNumero2 = new JLabel("Numero 2");
        lbSoma = new JLabel("Soma");
        tfNumero1 = new JTextField();
        tfNumero2 = new JTextField();
        tfSoma = new JTextField();
        tfSoma.setEditable(false);
        add(lbNumero1);
        add(tfNumero1);
        add(lbNumero2);
        add(tfNumero2);
        add(lbSoma);
        add(tfSoma);
    }

    public void definirEventos() {
        tfNumero1.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                atualizar();
            }
            public void removeUpdate(DocumentEvent e) {
                atualizar();
            }
            public void changedUpdate(DocumentEvent e) {
            }
        });
        tfNumero2.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                atualizar();
            }
            public void removeUpdate(DocumentEvent e) {
                atualizar();
            }
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }

    private void atualizar(){ // Não tratado erro de conversao numerica
        if(!tfNumero1.getText().equals("") && !tfNumero2.getText().equals("")) {
            tfSoma.setText(""+(Double.parseDouble(tfNumero1.getText()) + Double.parseDouble(tfNumero2.getText())));
        }
        else
            tfSoma.setText("0");
    }
}
