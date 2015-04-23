package cap10;
import java.util.Calendar;
import javax.swing.*;
public class DataAtual {
    private static Calendar calendario = Calendar.getInstance();

    public static void main(String args[]) {
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int ano = calendario.get(Calendar.YEAR);
        JOptionPane.showMessageDialog(null, "São Paulo" + ", dia " + dia + " de " + mes() + " de " + ano + " (" + diaSemana() + ")");
    }

    public static String diaSemana() {
        int num = calendario.get(Calendar.DAY_OF_WEEK);
        String aux = "";
        switch (num) {
            case 1:
                aux = "Domingo";
                break;
            case 2:
                aux = "Segunda-Feira";
                break;
            case 3:
                aux = "Terca-Feira";
                break;
            case 4:
                aux = "Quarta-Feira";
                break;
            case 5:
                aux = "Quinta-Feira";
                break;
            case 6:
                aux = "Sexta-Feira";
                break;
            case 7:
                aux = "Sabado";
                break;
        }
        return aux;
    }

    public static String mes() {
        int num = calendario.get(Calendar.MONTH);
        String aux = "";
        switch (num) {
            case 0:
                aux = "Janeiro";
                break;
            case 1:
                aux = "Fevereiro";
                break;
            case 2:
                aux = "Marco";
                break;
            case 3:
                aux = "Abril";
                break;
            case 4:
                aux = "Maio";
                break;
            case 5:
                aux = "Junho";
                break;
            case 6:
                aux = "Julho";
                break;
            case 7:
                aux = "Agosto";
                break;
            case 8:
                aux = "Setembro";
                break;
            case 9:
                aux = "Outubro";
                break;
            case 10:
                aux = "Novembro";
                break;
            case 11:
                aux = "Dezembro";
                break;
        }
        return aux;
    }
}
