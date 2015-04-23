package cap09;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiTextoOculto extends JFrame {
    private JButton btTrocar;
    private JLabel lbTexto;

    public static void main(String[] args) {
        JFrame janela = new GuiTextoOculto();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public GuiTextoOculto(){
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setTitle("Botão oculta texto");
        setBounds(200,200,250,100);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        lbTexto = new JLabel("Esse texto vai sumir");
        btTrocar = new JButton("Ocultar");
        add(btTrocar);
        add(lbTexto);
    }

    public void definirEventos() {
        btTrocar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lbTexto.setVisible(!lbTexto.isVisible());
                if(lbTexto.isVisible())
                    btTrocar.setText("Ocultar");
                else
                    btTrocar.setText("Mostrar");
            }
        });

    }
}
