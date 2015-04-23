package exemplos;
import java.io.*;
import java.util.Scanner;
import java.util.Date;

class C05EX38 {
  public static void main(String args[]) {

    Date DATA1 = new Date();
    Date DATA2 = new Date();
    Scanner s = new Scanner(System.in); 

    int DIA1, MES1, ANO1;
    int DIA2, MES2, ANO2;
    long DIFERENCA;

    String EDATA1;
    String EDATA2;

    System.out.println();

    System.out.print("Entre a 1a. data no formato DD/MM/AAAA: ");
    EDATA1  = s.nextLine();

    System.out.print("Entre a 2a. data no formato DD/MM/AAAA: ");
    EDATA2  = s.nextLine();

    System.out.println();

    DIA1 = Integer.parseInt(EDATA1.substring( 0, 2)); 
    MES1 = Integer.parseInt(EDATA1.substring( 3, 5));
    ANO1 = Integer.parseInt(EDATA1.substring( 6,10));

    DATA1.setDate(DIA1);
    DATA1.setMonth(MES1 - 1);
    DATA1.setYear(ANO1 - 1900);

    DIA2 = Integer.parseInt(EDATA2.substring( 0, 2)); 
    MES2 = Integer.parseInt(EDATA2.substring( 3, 5));
    ANO2 = Integer.parseInt(EDATA2.substring( 6,10));

    DATA2.setDate(DIA2);
    DATA2.setMonth(MES2 - 1);
    DATA2.setYear(ANO2 - 1900);

    if (DATA1.getTime() > DATA2.getTime())
      DIFERENCA = (DATA1.getTime() - DATA2.getTime()) / 86400000;
    else
      DIFERENCA = (DATA2.getTime() - DATA1.getTime()) / 86400000;
  
    System.out.println("Diferenca de dias = " + DIFERENCA);

  }
}
