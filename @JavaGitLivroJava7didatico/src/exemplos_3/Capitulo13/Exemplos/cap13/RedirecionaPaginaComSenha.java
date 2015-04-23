package cap13;
import java.awt.FlowLayout;
import java.net.*;
import javax.swing.*; 
import java.awt.event.*;
public class RedirecionaPaginaComSenha extends JApplet {
    private JLabel lbSenha;
    private JPasswordField t1;
    private JButton b1;

    public void init() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setLayout(new FlowLayout());
        lbSenha = new JLabel("Senha: ");
        t1 = new JPasswordField(10);
        t1.setEchoChar('*');
        b1 = new JButton("Entrar");
        add(lbSenha);
        add(t1);
        add(b1);
    }

    public void definirEventos() {
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                redirecionar();
            }
        });
        t1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                redirecionar();
            }
        });
    }

    public void redirecionar() {
        try {
            String site = "http://www.minhapagina.com.br/erro.html";
            String senha = String.valueOf(t1.getPassword());
            if (senha.equals("SENHA01")) {
                site = "http://www.minhapagina.com.br/pagina1.html";
            } else if (senha.equals("SENHA02")) {
                site = "http://www.minhapagina.com.br/pagina2.html";
            } else if (senha.equals("SENHA03")) {
                site = "http://www.minhapagina.com.br/pagina3.html";
            }
            URL endereco = new URL(site);
            getAppletContext().showDocument(endereco, "_blank");
        } catch (Exception erro) {
            getAppletContext().showStatus("Erro ao carregar o URL\n" + erro.toString());
        }
    }
}