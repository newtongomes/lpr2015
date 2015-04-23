package exemplos;
import java.io.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.DecimalFormat;

class C05EX32 {
  public static void main(String args[]) {

    Calendar DATA = Calendar.getInstance();
    DecimalFormat df = new DecimalFormat();

    int DIA = DATA.get(Calendar.DAY_OF_MONTH);
    int MES = DATA.get(Calendar.MONTH) + 1;
    int ANO = DATA.get(Calendar.YEAR);

    String DATATEXTO;

    df.applyPattern("00");
    DATATEXTO = df.format(DIA) + "/" + df.format(MES) + "/" + ANO;
    System.out.println("Data de hoje = " + DATATEXTO);
  }
}  
