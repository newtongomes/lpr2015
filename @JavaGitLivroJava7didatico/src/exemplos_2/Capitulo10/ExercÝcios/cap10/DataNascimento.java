package cap10;
import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.ParseException;
import javax.swing.*;
public class DataNascimento {
    public static void main(String args[]) {
        final long MSPA = 24 * 60 * 60 * 1000; // milisegundos por dia
        System.out.println(MSPA);
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Calendar calendario1 = Calendar.getInstance();
        Calendar calendario2 = Calendar.getInstance();
        try {
            String dn = JOptionPane.showInputDialog(null, "Digite sua data de nascimento: dia/mes/ano");
            Date data1 = df.parse(dn); // pode gerar erro (ParseException) 
            Date data2 = new Date(); // data atual
            calendario1.setTime(data1);
            calendario2.setTime(data2);
            System.out.println(data1 + " - " + calendario1.getTimeInMillis());
            System.out.println(data2 + " - " + calendario2.getTimeInMillis());
            long diaData1 = calendario1.getTimeInMillis();
            long diaData2 = calendario2.getTimeInMillis();
            long dif = (diaData2 - diaData1) / (MSPA * 365);
            JOptionPane.showMessageDialog(null, "Data de Nascimento: " + dn +
                    "\nVoce tem " + dif + " anos.");
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Data Invalida " + erro.getErrorOffset());
        }
        System.exit(0);
    }
}



