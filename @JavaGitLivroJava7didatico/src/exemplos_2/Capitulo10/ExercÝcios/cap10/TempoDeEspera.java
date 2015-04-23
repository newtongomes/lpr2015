package cap10;
import javax.swing.*;
import javax.time.calendar.*;
public class TempoDeEspera {
    public static void main(String args[]) {
        String sHora = JOptionPane.showInputDialog(null, "Digite a hora no formato: hh:mm:ss");
        int iHora = Integer.parseInt(sHora.substring(0, 2)); //erros não tratados
        int iMinuto = Integer.parseInt(sHora.substring(3, 5));
        int iSegundo = Integer.parseInt(sHora.substring(6, 8));
        LocalTime hora = LocalTime.time(iHora, iMinuto, iSegundo);
        JOptionPane.showMessageDialog(null, "Início: " + hora + "\nPróxima atração: " + hora.plusMinutes(45));
    }
}
