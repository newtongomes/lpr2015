package cap10;
import java.util.Calendar;
import javax.swing.*;
public class HorarioEscolar {

    public static void main(String args[]) {
        Calendar calendario = Calendar.getInstance();
        int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
        String men = "";
        switch (diaSemana) {
            case 1:
                men = "Domingo: Final de Semana!";
                break;
            case 2:
                men = "Segunda: Aulas de matematica e fisica!";
                break;
            case 3:
                men = "Terça: Aulas de ciencia e biologia";
                break;
            case 4:
                men = "Quarta: Aulas de Ingles e Informatica";
                break;
            case 5:
                men = "Quinta: Aulas de Ed. Fisica e matemática ";
                break;
            case 6:
                men = "Sexta: Aulas de portugues";
                break;
            case 7:
                men = "Sabado: Final de Semana!";
                break;
        }
        JOptionPane.showMessageDialog(null, men);
        System.exit(0);
    }
}
