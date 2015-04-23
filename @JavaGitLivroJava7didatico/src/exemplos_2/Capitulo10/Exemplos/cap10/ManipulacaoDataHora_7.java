package cap10;
import java.awt.event.*;
import javax.swing.*;
import javax.time.calendar.*;
public class ManipulacaoDataHora_7 extends JFrame {
    private JTextArea taTexto;
    private JButton btMostrar;

    public static void main(String[] args) {
        JFrame janela = new ManipulacaoDataHora_7();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public ManipulacaoDataHora_7() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setTitle("Manipulação de Datas e Horas");
        setBounds(100, 100, 300, 200);
        taTexto = new JTextArea();
        btMostrar = new JButton("Mostrar");
        add(taTexto, "Center");
        add(btMostrar, "North");
    }

    public void definirEventos() {
        btMostrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                LocalDate data = LocalDate.date(2010, 2, 1);
                LocalTime hora = LocalTime.time(21, 29, 40);
                taTexto.setText("Data = " + data + "\n20 dias depois = " + data.plusDays(20) +
                     "\nHora = " + hora + "\n10 minutos depois = " + hora.plusMinutes(10) +
                     "\nMes = " + data.getMonthOfYear().getValue() +
                     "\n15 meses depois = " + data.plusMonths(15));
            }
        });
    }
}
//https://jsr-310.dev.java.net/nonav/doc-2009-01-29/index.html
//https://jsr-310.dev.java.net/
//adicionar a pasta jre/lib/ext