package cap03;
import javax.swing.JOptionPane;
public class CaixaEletronico {
    public static void main(String[] args) {
        int cont = 0;
        while (cont<3) {
            String senha = JOptionPane.showInputDialog("Forneça a senha");
            if (senha.equals("Java")) {
                JOptionPane.showMessageDialog(null, "Senha Válida!");
                cont = 3; //ou break;
            } else {
                JOptionPane.showMessageDialog(null, "Senha Inválida!");
                if (++cont == 3) 
                    JOptionPane.showMessageDialog(null, "Cartão Cancelado!");
            }
        }
        System.exit(0);
    }
}
