package cap12;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NavegaFilmes extends JFrame {
    private JLabel label1, label2, label3, label4, label5;
    private JButton btProximo, btAnterior, btPrimeiro, btUltimo, btMais10, btMenos10, btSair;
    private JTextField tfCodigo, tfTitulo, tfGenero, tfProdutora, tfDatcom;
    private BD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public static void main(String args[]) {
        JFrame frame = new NavegaFilmes();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public NavegaFilmes() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        label1 = new JLabel("Codigo ");
        label2 = new JLabel("Titulo");
        label3 = new JLabel("Genero");
        label4 = new JLabel("Produtora");
        label5 = new JLabel("Data de Compra  ");
        tfCodigo = new JTextField(10);
        tfTitulo = new JTextField(35);
        tfGenero = new JTextField(10);
        tfProdutora = new JTextField(15);
        tfDatcom = new JTextField(8);
        btProximo = new JButton(null,new ImageIcon("proximo.gif"));
        btProximo.setToolTipText("Próximo");
        btAnterior = new JButton(null,new ImageIcon("anterior.gif"));
        btAnterior.setToolTipText("Anterior");
        btPrimeiro = new JButton(null,new ImageIcon("primeiro.gif"));
        btPrimeiro.setToolTipText("Primeiro");
        btUltimo = new JButton(null,new ImageIcon("ultimo.gif"));
        btUltimo.setToolTipText("Ultimo");
        btMais10 = new JButton(null,new ImageIcon("mais.png"));
        btMais10.setToolTipText("+10");
        btMenos10 = new JButton(null,new ImageIcon("menos.png"));
        btMenos10.setToolTipText("-10");
        btSair = new JButton(null,new ImageIcon("sair.png"));
        btSair.setToolTipText("Sair");
        add(label1);
        add(tfCodigo);
        add(label2);
        add(tfTitulo);
        add(label3);
        add(tfGenero);
        add(label4);
        add(tfProdutora);
        add(label5);
        add(tfDatcom);
        add(btPrimeiro);
        add(btAnterior);
        add(btProximo);
        add(btUltimo);
        add(btMais10);
        add(btMenos10);
        add(btSair);
        setTitle("Navegando na tabela de Filmes");
        setBounds(200, 400, 620, 120);
        setResizable(false);
        bd = new BD();
        if (!bd.getConnection()) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar, o sistema sera fechado!");
            System.exit(0);
        }
        carregaTabela();
        atualizaCampos();
    }

    public void definirEventos(){
        btProximo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    resultSet.next();
                    atualizaCampos();
                } catch (SQLException erro) {}
            }
        });
        btAnterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    resultSet.previous();
                    atualizaCampos();
                } catch (SQLException erro) {}
            }
        });
        btPrimeiro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    resultSet.first();
                    atualizaCampos();
                } catch (SQLException erro) {}
            }
        });
        btUltimo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    resultSet.last();
                    atualizaCampos();
                } catch (SQLException erro) {}
            }
        });
        btMais10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    resultSet.relative(10);
                    atualizaCampos();
                } catch (SQLException erro) {}
            }
        });
        btMenos10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    if (resultSet.getRow()>10)
                        resultSet.relative(-10);
                    else
                        resultSet.first();
                    atualizaCampos();
                } catch (SQLException erro) {}
            }
        });
        btSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    resultSet.close();
                    statement.close();
                }
                catch(SQLException erro){
                }
                bd.close();
                System.exit(0);
            }
        });

    }
    public void carregaTabela() {
        String sql = "select * from filmes";
        try {
            statement = bd.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro! " + erro.toString());
        }
    }

    public void atualizaCampos() {
        try {
            if (resultSet.isAfterLast()) {
                resultSet.last();
            }
            if (resultSet.isBeforeFirst()) {
                resultSet.first();
            }
            tfCodigo.setText(resultSet.getString("codigo"));
            tfTitulo.setText(resultSet.getString("titulo"));
            tfGenero.setText(resultSet.getString("genero"));
            tfProdutora.setText(resultSet.getString("produtora"));
            tfDatcom.setText("" + resultSet.getDate("datacompra"));

        } catch (SQLException erro) {}
    }
}
