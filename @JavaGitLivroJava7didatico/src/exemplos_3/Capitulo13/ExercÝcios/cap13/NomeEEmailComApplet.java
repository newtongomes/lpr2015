package cap13;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class NomeEEmailComApplet extends JApplet {
    private JLabel lbNome, lbEmail,lbMensagem;
    private JTextField t1,t2;
    private JButton b1;

    public void init() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setLayout(new FlowLayout());
        lbNome = new JLabel("Nome: ");
        lbEmail = new JLabel("Email: ");
        lbMensagem =  new JLabel("");
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        
        b1 = new JButton("Validar");
        b1.setSize(100, 100);
        add(lbNome);
        add(t1);
        add(lbEmail);
        add(t2);
        add(b1);
        add(lbMensagem);
    }
     private void definirEventos() {
         b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if ( t1.getText().trim().equals("") || t2.getText().trim().equals("")) {
              lbMensagem.setText("Campos com conteúdo incompleto");

    }
             else {
                 lbMensagem.setText("Campos preenchidos! ");

   }
}
        });
     }
}





