package cap10;
import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.ParseException;
import javax.swing.*;
import javax.time.calendar.*;
public class CalculaPrazo {

    public static void main(String args[]) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Calendar calendario = Calendar.getInstance();
        try {
            String sData = JOptionPane.showInputDialog(null, "Digite a data para calculo: dia/mes/ano");
            Date dataFornecida = df.parse(sData); 
            calendario.setTime(dataFornecida);
            LocalDate data = LocalDate.date(
                    calendario.get(Calendar.YEAR),
                    calendario.get(Calendar.MONTH)+1,
                    calendario.get(Calendar.DATE));
            JOptionPane.showMessageDialog(null, "Data fornecida (ano/mes/dia) = " + data + "\n30 dias depois = " + data.plusDays(30) +
                     "\n60 dias depois = " + data.plusDays(60) +
                     "\n90 dias depois = " + data.plusDays(90));
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Data Invalida " + erro.getErrorOffset());
        }
    }
}