package cap08;
import java.awt.*;
import javax.swing.*;
public class GuiItemPedido extends JFrame{
    private JLabel lbDescricao, lbPrecoUnitario, lbQuantidade;
    private JButton btInserir;
    public JTextField tfDescricao, tfPrecoUnitario, tfQuantidade;

    public GuiItemPedido() {
        inicializarComponentes();
        //definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        setBounds(300,200,200,120);
        lbDescricao = new JLabel("Descricao");
        lbQuantidade = new JLabel("Quantidade");
        lbPrecoUnitario = new JLabel("PrecoUnitario");
        tfDescricao = new JTextField();
        tfPrecoUnitario = new JTextField();
        tfQuantidade = new JTextField();
        btInserir = new JButton("Inserir");
        setLayout(new GridLayout(4,2));
        add(lbDescricao);
        add(tfDescricao);
        add(lbQuantidade);
        add(tfQuantidade);
        add(lbPrecoUnitario);
        add(tfPrecoUnitario);
        add(btInserir);
    }
}
