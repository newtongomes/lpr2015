package cap09;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiBotaoBeep extends JFrame {
    private JButton btTrocar;

    public static void main(String[] args) {
        JFrame janela = new GuiBotaoBeep();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public GuiBotaoBeep(){
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setTitle("Botão troca de texto");
        setBounds(200,200,250,100);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        btTrocar = new JButton("Fora");
        add(btTrocar);
    }

    public void definirEventos() {
        btTrocar.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
                btTrocar.setText("Dentro");
            }
            public void mouseExited(MouseEvent e) {
                btTrocar.setText("Fora");
            }
        });
    }
}
