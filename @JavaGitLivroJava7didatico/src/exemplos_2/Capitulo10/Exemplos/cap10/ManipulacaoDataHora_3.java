package cap10;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ManipulacaoDataHora_3 extends JFrame {
    private JTextArea taTexto;
    private JButton btMostrar;
    private Date agora;
    final long MILI_SEGUNDOS_POR_DIA = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        JFrame janela = new ManipulacaoDataHora_3();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    public ManipulacaoDataHora_3(){
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setTitle("Manipulação de Datas e Horas");
        setBounds(100,100,300,200);
        taTexto = new JTextArea();
        btMostrar = new JButton("Mostrar");
        add(taTexto,"Center");
        add(btMostrar,"North");
        agora = new Date();
    }

    public void definirEventos() {
       btMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  String formato = "dd/MM/yyyy, hh:mm:ss";
                  DateFormat dateFormat =  new SimpleDateFormat(formato);
                  taTexto.setText("Data Normal: " + agora +
                    "\nData Formatada: "  + dateFormat.format(agora));
            }
        });
    }
}
