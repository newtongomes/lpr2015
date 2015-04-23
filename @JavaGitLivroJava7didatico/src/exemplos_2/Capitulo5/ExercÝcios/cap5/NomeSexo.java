package cap05;
import javax.swing.JOptionPane;
public class NomeSexo {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        String[] sexo = new String[5];
        for (int i=0;i<5;i++){
            nomes[i] = JOptionPane.showInputDialog("Forneça o nome da pessoa " + (i+1));
            sexo[i] = JOptionPane.showInputDialog("Forneça o sexo da pessoa " + (i+1));
        }
        String busca = JOptionPane.showInputDialog("Forneça o sexo a mostrar ");
        for (int i=0;i<5;i++){
            if(sexo[i].equals(busca))
                System.out.println(nomes[i]);
        }
        System.exit(0);
    }
}
