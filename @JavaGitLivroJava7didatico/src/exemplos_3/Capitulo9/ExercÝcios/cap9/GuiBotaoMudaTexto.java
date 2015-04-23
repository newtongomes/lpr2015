package cap09;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiBotaoMudaTexto extends JFrame {
    private JButton btBeep;

    public static void main(String[] args) {
        JFrame janela = new GuiBotaoMudaTexto();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public GuiBotaoMudaTexto(){
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setTitle("Emite um Beep");
        setBounds(200,200,250,100);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        btBeep = new JButton("Beep");
        add(btBeep);
    }

    public void definirEventos() {
        btBeep.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
                Toolkit.getDefaultToolkit().beep();
            }
            public void mouseExited(MouseEvent e) {
            }
        });
    }
}
