package cap08;
import java.awt.*;
import javax.swing.*;
public class GuiModificaLabel extends JPanel {
    private JLabel lbTexto;
    private ImageIcon icJava;

    public GuiModificaLabel() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setLayout(null);
        icJava = new ImageIcon("java.jpg");
        setBackground(new Color(200, 100, 200));
        lbTexto = new JLabel("Java 7 - Ensino Didático", icJava, JLabel.CENTER);
        lbTexto.setFont(new Font("Arial Narrow", Font.BOLD, 50));
        lbTexto.setForeground(Color.white);
        lbTexto.setBounds(100, 100, 600, 300);
        add(lbTexto);
    }
}