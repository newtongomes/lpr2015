import java.net.*;
import java.awt.event.*;
import javax.swing.*;
public class PessoaApplet extends JApplet {
    private JTextField tfNome, tfProfissao;
    private JLabel label1, label2, label3, label4;
    private JButton btGravar, btLimpar;
    private JRadioButton rbMasculino, rbFeminino;
    private JCheckBox ckBanco, ckProgramacao, ckRedes;
    private ButtonGroup bgSexo;

    public void init() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        label1 = new JLabel("Nome");
        label1.setBounds(5,5,100,20);
        label2 = new JLabel("Profissao");
        label2.setBounds(5,50,100,20);
        label3 = new JLabel("Sexo:");
        label3.setBounds(5,95,100,20);
        label4 = new JLabel("Areas de Interesse:");
        label4.setBounds(5,160,200,20);
        tfNome = new JTextField();
        tfNome.setBounds(5,25,300,20);
        tfProfissao = new JTextField(30);
        tfProfissao.setBounds(5,70,300,20);
        setLayout(null);
        btGravar = new JButton("Gravar");
        btGravar.setBounds(210,190,100,20);
        btLimpar = new JButton("Limpar");
        btLimpar.setBounds(210,220,100,20);
        rbMasculino = new JRadioButton("Masculino");
        rbMasculino.setBounds(5,115,100,20);
        rbMasculino.setSelected(true);
        rbFeminino = new JRadioButton("Feminino");
        rbFeminino.setBounds(5,135,100,20);
        bgSexo = new ButtonGroup();
        bgSexo.add(rbMasculino);
        bgSexo.add(rbFeminino);
        ckBanco = new JCheckBox("Banco de Dados");
        ckBanco.setBounds(5,180,200,20);
        ckProgramacao = new JCheckBox("Programacao");
        ckProgramacao.setBounds(5,200,200,20);
        ckRedes = new JCheckBox("Redes de Computadores");
        ckRedes.setBounds(5,220,200,20);
        add(label1);
        add(tfNome);
        add(label2);
        add(tfProfissao);
        add(label3);
        add(rbMasculino);
        add(rbFeminino);
        add(label4);
        add(ckBanco);
        add(ckProgramacao);
        add(ckRedes);
        add(btGravar);
        add(btLimpar);
    }
    public void definirEventos() {
        btGravar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String sexo = "Masculino";
                    if (rbFeminino.isSelected())
                        sexo = "Feminino";
                    String banco = "", redes = "", programacao = "";
                    if (ckBanco.isSelected())
                        banco = "Banco de dados";
                    if (ckProgramacao.isSelected())
                        programacao = "Programacao de Computadores";
                    if (ckRedes.isSelected())
                        redes = "Redes de Computadores";
                    String param = "nome=" + tfNome.getText() +
                                   "&profissao=" + tfProfissao.getText() +
                                   "&sexo=" + sexo +
                                   "&banco=" + banco +
                                   "&programacao=" + programacao +
                                   "&redes=" + redes;
                    URL end = new URL("http://localhost:8080/cap14/pessoa?" + param); // Tomcat
                    getAppletContext().showDocument(end);
                }
                catch (Exception erro) {
                    tfNome.setText("Ocoreu um erro\n" + erro.toString());
                }
            }
        });
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfNome.setText("");
                tfProfissao.setText("");
                rbMasculino.setSelected(true);
                ckBanco.setSelected(false);
                ckProgramacao.setSelected(false);
                ckRedes.setSelected(false);
            }
        });
    }
}








