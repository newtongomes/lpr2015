package cap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Date;

public class Detetive extends JFrame {

    private JButton btAbrir, btGravar, btLimpar;
    private String arquivo = "c:/detetive.txt";
    public static void main(String[] args) {
        JFrame frame = new Detetive();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Detetive() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setTitle("Detetive");
        setBounds(250, 50, 340, 160);
        setBackground(new Color(150, 150, 150));
        btAbrir = new JButton("Abrir");
        btGravar = new JButton("Gravar");
        btLimpar = new JButton("Limpar");
        setLayout(null);
        btAbrir.setBounds(10, 20, 75, 20);
        btGravar.setBounds(95, 20, 75, 20);
        btLimpar.setBounds(180, 20, 75, 20);
        add(btAbrir);
        add(btGravar);
        add(btLimpar);
    }

    public void definirEventos() {
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gravar("Limpar");
            }
        });
        btGravar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gravar("Gravar");
            }
        });

        btAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gravar("Abrir");
            }
        });
    }

    public void gravar(String botao) {
        String texto = "", linha = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(arquivo));
            while ((linha = br.readLine()) != null) {
                texto = texto + linha + "\n";
            }
            br.close();
        } catch (IOException erro) {
            texto = "";
        }

        try {
            PrintWriter out = new PrintWriter(arquivo);
            texto = texto + new Date() + " Botão " + botao + " Pressionado" + "\n";
            out.println(texto);
            out.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar no arquivo " + erro);
        }

    }
}
