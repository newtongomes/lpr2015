package cap11;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class Apuracao extends JFrame {
    private JButton btVer;
    private JTextArea taVotos;

    public static void main(String[] args) {
        JFrame frame = new Apuracao();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Apuracao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        setTitle("Apuração dos votos");
        setBounds(300, 300, 250, 180);
        btVer = new JButton("Ver");
        btVer.setBounds(75, 20, 90, 25);
        taVotos = new JTextArea();
        taVotos.setBounds(60, 60, 120, 50);
        add(btVer);
        add(taVotos);
    }

    private void definirEventos() {
        btVer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String arquivo = "c:/votos.txt";
                int[] candidatos = new int[3];
                try {
                    BufferedReader br = new BufferedReader(new FileReader(arquivo));
                    String linha;
                    int i = 0;
                    while ((linha = br.readLine()) != null) {
                        candidatos[i] = Integer.parseInt(linha);
                        i++;
                    }
                    br.close();
                } catch (IOException erro) {
                    // arquivo não existe, zerar os votos
                    for (int i = 0; i < candidatos.length; i++) {
                        candidatos[i] = 0;
                    }
                }
                taVotos.setText("Candidato1...:  " + candidatos[0] +
                        "\nCandidato2...:  " + candidatos[1] +
                        "\nCandidato3...:  " + candidatos[2]);
            }
        });
    }
}

