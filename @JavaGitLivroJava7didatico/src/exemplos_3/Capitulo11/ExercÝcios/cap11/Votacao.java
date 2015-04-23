package cap11;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Votacao extends JFrame {
    private JButton btVotar;
    private JList liCandidatos;
    private JScrollPane spLista;

    public static void main(String[] args) {
        JFrame frame = new Votacao();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public Votacao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        setTitle("Apuração");
        setBounds(400, 300, 200, 150);
        String[] liItems = {"Candidato1", "Candidato2", "Candidato3"};
        liCandidatos = new JList(liItems);
        spLista = new JScrollPane(liCandidatos);
        btVotar = new JButton("Votar");
        spLista.setBounds(50, 20, 100, 55);
        btVotar.setBounds(50, 80, 90, 25);
        add(btVotar);
        add(spLista);
    }

    private void definirEventos() {
        btVotar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                if (liCandidatos.getSelectedIndex() < 0) {
                    JOptionPane.showMessageDialog(null, "Selecione um candidato");
                } else {
                    registrarVoto(liCandidatos.getSelectedIndex());
                }

            }
        });
    }

    private void registrarVoto(int indice) {
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

        try {
            candidatos[indice]++;
            PrintWriter out = new PrintWriter(arquivo);
            for (int i = 0; i < candidatos.length; i++) {
                out.println(candidatos[i]);
            }
            out.close();
            JOptionPane.showMessageDialog(null, "Voto Computado!");
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao gravar arquivo! " + erro.toString());
        }
    }
}
