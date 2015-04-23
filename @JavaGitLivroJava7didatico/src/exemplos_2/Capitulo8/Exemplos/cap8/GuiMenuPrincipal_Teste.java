package cap08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiMenuPrincipal_Teste extends JFrame {
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao, miCaixaSelecao, miCombo;
    private JMenuItem miLabel,miCaixaOpcao, miBarraProgresso, miBarraRolagem;
    private JMenuItem miDialogoConfirmacao, miDialogoMensagem, miDialogoOpcao, miLista;
    private JMenuItem miListaComFotos, miAreaDeTexto, miRadio, miPedido, miFrameInterno, miAbas;

    public GuiMenuPrincipal_Teste() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
        contentPane = getContentPane();
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');
        miSair = new JMenuItem("Sair", new ImageIcon("sair.jpg"));
        miSair.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miBotao = new JMenuItem("Botao");

        miCaixaSelecao = new JMenuItem("Caixa de Selecao");
        miCombo = new JMenuItem("ComboBox");
        miLabel = new JMenuItem("Label");
        miCaixaOpcao =  new JMenuItem("Caixa Opcao");
        miBarraProgresso =  new JMenuItem("Barra Progresso");
        miBarraRolagem =  new JMenuItem("Barra Rolagem");
        miDialogoConfirmacao =  new JMenuItem("Dialogo Confirmacao");
        miDialogoMensagem =  new JMenuItem("Dialogo Mensagem");
        miDialogoOpcao =  new JMenuItem("Dialogo Opcao");
        miLista =  new JMenuItem("Lista");
        miListaComFotos =  new JMenuItem("ListaComFotos");
        miRadio =  new JMenuItem("Radio");
        miAreaDeTexto = new JMenuItem("AreaDeTexto");
        miPedido = new JMenuItem("Pedido");
        miFrameInterno = new JMenuItem("FrameInterno");
        miAbas = new JMenuItem("Abas");

        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);

        mnExemplos.add(miCaixaSelecao);
        mnExemplos.add(miCombo);
        mnExemplos.add(miLabel);
        mnExemplos.add(miCaixaOpcao);
        mnExemplos.add(miBarraProgresso);
        mnExemplos.add(miBarraRolagem);
        mnExemplos.add(miDialogoConfirmacao);
        mnExemplos.add(miDialogoMensagem);
        mnExemplos.add(miDialogoOpcao);
        mnExemplos.add(miLista);
        mnExemplos.add(miListaComFotos);
        mnExemplos.add(miRadio);
        mnExemplos.add(miAreaDeTexto);
        mnExemplos.add(miPedido);
        mnExemplos.add(miFrameInterno);
        mnExemplos.add(miAbas);
        
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        setJMenuBar(mnBarra);
    }

    private void definirEventos() {
        miSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

         miBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiBotao botao = new GuiBotao();
                contentPane.removeAll();
                contentPane.add(botao);
                contentPane.validate();
            }
        });
         miCaixaSelecao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiCaixaSelecao caixaSelecao = new GuiCaixaSelecao();
                contentPane.removeAll();
                contentPane.add(caixaSelecao);
                contentPane.validate();
            }
        });

        miCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiCombo combo = new GuiCombo();
                contentPane.removeAll();
                contentPane.add(combo);
                contentPane.validate();
            }
        });
        miLabel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiLabel label = new GuiLabel();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miCaixaOpcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiCaixaOpcao label = new GuiCaixaOpcao();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miBarraProgresso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiBarraProgresso label = new GuiBarraProgresso();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miBarraRolagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiBarraRolagem label = new GuiBarraRolagem();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miDialogoConfirmacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiDialogoConfirmacao label = new GuiDialogoConfirmacao();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miDialogoMensagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiDialogoMensagem label = new GuiDialogoMensagem();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miDialogoOpcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiDialogoOpcao label = new GuiDialogoOpcao();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miLista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiLista label = new GuiLista();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miListaComFotos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiListaComFotos label = new GuiListaComFotos();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiRadio label = new GuiRadio();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miAreaDeTexto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiAreaDeTexto label = new GuiAreaDeTexto();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miAreaDeTexto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiAreaDeTexto label = new GuiAreaDeTexto();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
         miPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiPedido label = new GuiPedido();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
        miFrameInterno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiFrameInterno label = new GuiFrameInterno();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });
       miAbas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiAbas label = new GuiAbas();
                contentPane.removeAll();
                contentPane.add(label);
                contentPane.validate();
            }
        });

    }

    public static void abrir() {
        GuiMenuPrincipal_Teste frame = new GuiMenuPrincipal_Teste();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2,
                (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
}
