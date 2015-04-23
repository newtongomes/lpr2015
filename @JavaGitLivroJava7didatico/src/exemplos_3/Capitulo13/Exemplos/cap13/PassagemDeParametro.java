package cap13;
import java.awt.*;
import javax.swing.*;
public class PassagemDeParametro extends JApplet {
    private JLabel lbCorFundo, lbCorBotoes, lbCorTexto;
    private JButton bt1, bt2;
    private JTextField tfFundo, tfCorBotao, tfTextoBotao;
    private String corFundo, corBotao, textoBotao;
    public void init() {
        corFundo = getParameter("CorDeFundo");
        corBotao = getParameter("CorDoBotao");
        textoBotao = getParameter("TextoDoBotao");
        lbCorFundo = new JLabel("Cor de Fundo:");
        lbCorFundo.setForeground(Color.black);
        lbCorBotoes = new JLabel("Cor dos Botoes:");
        lbCorBotoes.setForeground(Color.black);
        lbCorTexto = new JLabel("Cor do Texto do Botao:");
        lbCorTexto.setForeground(Color.black);
        setLayout(new GridLayout(4, 2));
        bt1 = new JButton("Botao 1");
        bt2 = new JButton("Botao 2");
        tfFundo = new JTextField(corFundo);
        tfCorBotao = new JTextField(corBotao);
        tfTextoBotao = new JTextField(textoBotao);
        tfFundo.setBackground(new Color(Integer.parseInt(corFundo, 16)));
        bt1.setBackground(new Color(Integer.parseInt(corBotao, 16)));
        bt2.setBackground(new Color(Integer.parseInt(corBotao, 16)));
        bt1.setForeground(new Color(Integer.parseInt(textoBotao, 16)));
        bt2.setForeground(new Color(Integer.parseInt(textoBotao, 16)));
        add(lbCorFundo);  add(tfFundo);  add(lbCorBotoes);  add(tfCorBotao);
        add(lbCorTexto);  add(tfTextoBotao); add(bt1);  add(bt2);
    }
}