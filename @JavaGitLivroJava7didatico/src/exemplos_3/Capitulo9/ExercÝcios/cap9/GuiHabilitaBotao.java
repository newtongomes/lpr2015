package cap09;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
public class GuiHabilitaBotao extends JFrame {
    private JButton btMostrar;
    private JTextField tfTexto;

    public static void main(String[] args) {
        JFrame janela = new GuiHabilitaBotao();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public GuiHabilitaBotao(){
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setTitle("Habilita Botao");
        setBounds(200,200,200,100);
        setLayout(new GridLayout(2,1));
        tfTexto = new JTextField(10);
        btMostrar = new JButton("Mostrar");
        btMostrar.setEnabled(false);
        add(btMostrar);
        add(tfTexto);
    }

    public void definirEventos() {
        tfTexto.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                btMostrar.setEnabled(true);
            }
            public void removeUpdate(DocumentEvent e) {
                if(tfTexto.getText().length()==0)
                    btMostrar.setEnabled(false);
            }
            public void changedUpdate(DocumentEvent e) {
            }
        });

    }
}
