package cap08;
import java.awt.event.*;
import javax.swing.*;
public class GuiExcluir extends JPanel {
    private JButton btExcluir;

    public GuiExcluir() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        btExcluir = new JButton("Excluir");
        btExcluir.setBounds(55, 50, 100, 25);
        add(btExcluir);
        
    }

    private void definirEventos() {
        btExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?",
                        "Confirmação", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(resp==0)
                    JOptionPane.showMessageDialog(null, "Escolheu Sim");
                else
                    JOptionPane.showMessageDialog(null, "Escolheu Não");
            }
        });
    }
}
