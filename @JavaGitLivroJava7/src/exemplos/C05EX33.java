package exemplos;
import java.io.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Scanner;

class C05EX33 {
  public static void main(String args[]) {

    Calendar DATA1 = Calendar.getInstance();
    Calendar DATA2 = Calendar.getInstance();

    int DIA1, MES1, ANO1;
    int DIA2, MES2, ANO2;

    long DT1;
    long DT2;
    long DIFERENCA;

    String EDATA1;
    String EDATA2;
    Scanner s = new Scanner(System.in); 

    System.out.println();

    System.out.print("Entre a 1a. data no formato DD/MM/AAAA: ");
    EDATA1 = s.nextLine(); 

    System.out.print("Entre a 2a. data no formato DD/MM/AAAA: ");
    EDATA2 = s.nextLine(); 

    System.out.println();

    DIA1 = Integer.parseInt(EDATA1.substring( 0, 2)); 
    MES1 = Integer.parseInt(EDATA1.substring( 3, 5)) - 1;
    ANO1 = Integer.parseInt(EDATA1.substring( 6,10));

    DATA1.set(ANO1, MES1, DIA1);

    DIA2 = Integer.parseInt(EDATA2.substring( 0, 2)); 
    MES2 = Integer.parseInt(EDATA2.substring( 3, 5)) - 1;
    ANO2 = Integer.parseInt(EDATA2.substring( 6,10));

    DATA2.set(ANO2, MES2, DIA2);

    DT1 = DATA1.getTimeInMillis();
    DT2 = DATA2.getTimeInMillis();

    if (DATA1.compareTo(DATA2) > 0)
      DIFERENCA = (DT1 - DT2) / 86400000;
    else
      DIFERENCA = (DT2 - DT1) / 86400000;
  
    System.out.println("Diferenca de dias = " + DIFERENCA);

  }
}
