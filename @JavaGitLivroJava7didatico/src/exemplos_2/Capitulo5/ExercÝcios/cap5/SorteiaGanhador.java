package cap05;
import javax.swing.JOptionPane;
public class SorteiaGanhador {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        for (int i=0;i<10;i++){
            nomes[i] = JOptionPane.showInputDialog("Forneça o nome da pessoa " + (i+1));
            if (nomes[i]==null)
                System.exit(0);
        }
        int numeroSorteado = (int)(Math.random()*10);
        JOptionPane.showMessageDialog(null,"Ganhador: " +nomes[numeroSorteado]);
        System.exit(0);
    }
}
