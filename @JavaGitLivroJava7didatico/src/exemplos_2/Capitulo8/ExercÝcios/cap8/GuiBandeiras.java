package cap08;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GuiBandeiras extends JPanel {
    private JRadioButton rbBrasil;
    private JRadioButton rbItalia;
    private JRadioButton rbJapao;
    private ButtonGroup bg;
    private ImageIcon icBandeira;
    private JLabel lbImagem;

    public GuiBandeiras() {
        inicializarComponentes();
	definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        rbBrasil = new JRadioButton ("Brasil");
        rbItalia = new JRadioButton ("Italia");
        rbJapao = new JRadioButton ("Japao");
        lbImagem = new JLabel(icBandeira);
        bg = new ButtonGroup();
        bg.add(rbBrasil);
        bg.add(rbItalia);
        bg.add(rbJapao);
        rbBrasil.setBounds (40, 25, 100, 25);
        rbItalia.setBounds (40, 75, 100, 25);
        rbJapao.setBounds (40, 125, 100, 25);
        lbImagem.setBounds (180, 20, 320, 240);
        add (rbBrasil);
        add (rbItalia);
        add (rbJapao);
        add (lbImagem);
    }
     private void definirEventos() {
        rbBrasil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                icBandeira = new ImageIcon("brasil.jpg");
                lbImagem.setIcon(icBandeira);
            }
        });
        rbItalia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                icBandeira = new ImageIcon("italia.jpg");
                lbImagem.setIcon(icBandeira);
            }
        });
        rbJapao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                icBandeira = new ImageIcon("japao.jpg");
                lbImagem.setIcon(icBandeira);
            }
        });
     }      
}