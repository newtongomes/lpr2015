package cap13;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class ManipulaTextoComApplet extends JApplet {
    private JLabel lbTexto;
    private JButton btGravar, btLer, btLimpar;
    private JTextArea taTexto;
    private JScrollPane scrollPane1;
    private String arquivo = "c:/arq.txt";

    public void init() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setLayout(new FlowLayout());
        lbTexto = new JLabel("Texto a ser editado:");
        btGravar = new JButton("Gravar");
        btLer = new JButton("Ler");
        btLimpar = new JButton("Limpar");
        taTexto = new JTextArea(8, 60);
        scrollPane1 = new JScrollPane(taTexto);
        add(lbTexto);
        add(scrollPane1);
        add(btGravar);
        add(btLer);
        add(btLimpar);
    }

    private void definirEventos() {
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                taTexto.setText("");
            }
        });
        btGravar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    PrintWriter out = new PrintWriter(arquivo);
                    out.println(taTexto.getText());
                    out.close();
                } catch (IOException erro) {
                   taTexto.append("Erro\n" + erro.toString());
                }
            }
        });
        btLer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(arquivo));
                    taTexto.setText("");
                    String linha = "";
                    while ((linha = br.readLine()) != null) {
                        taTexto.append(linha + "\n");
                    }
                    br.close();
                } catch (IOException erro) {
                    taTexto.setText("Erro\n" + erro.toString());
                }
            }
        });
    }
}
