package exemplos;
import java.io.*;
import java.util.*;
import java.text.*;

class C05EX34 {
  public static void main(String args[]) {

    Calendar DATA1 = Calendar.getInstance();
    Calendar DATA2 = Calendar.getInstance();

    int DIA1, MES1, ANO1, HOR1, MIN1;
    int DIA2, MES2, ANO2, HOR2, MIN2;

    long DT1, DT2;

    double VLRHR, FRACAO, VLRTOT;

    String EDATA1, EHORA1;
    String EDATA2, EHORA2;

    Scanner s = new Scanner(System.in); 
    DecimalFormat df = new DecimalFormat();

    System.out.println();
    System.out.println("*** Estacionamento 24 Horas ***");
    System.out.println();
    System.out.println();

    System.out.print("Entre data de entrada [DD/MM/AAAA] ...: ");
    EDATA1 = s.nextLine(); 

    System.out.print("Entre hora de entrada [HH:MM] ........: ");
    EHORA1 = s.nextLine(); 

    System.out.print("Entre data de saida   [DD/MM/AAAA] ...: ");
    EDATA2 = s.nextLine(); 

    System.out.print("Entre hora de saida   [HH:MM] ........: ");
    EHORA2 = s.nextLine(); 

    System.out.print("Entre o valor da hora em R$ ..........: ");
    VLRHR = s.nextDouble(); 

    System.out.println();

    DIA1 = Integer.parseInt(EDATA1.substring( 0, 2)); 
    MES1 = Integer.parseInt(EDATA1.substring( 3, 5)) - 1;
    ANO1 = Integer.parseInt(EDATA1.substring( 6,10));
    HOR1 = Integer.parseInt(EHORA1.substring( 0, 2)); 
    MIN1 = Integer.parseInt(EHORA1.substring( 3, 5));

    DATA1.set(ANO1, MES1, DIA1, HOR1, MIN1);

    DIA2 = Integer.parseInt(EDATA2.substring( 0, 2)); 
    MES2 = Integer.parseInt(EDATA2.substring( 3, 5)) - 1;
    ANO2 = Integer.parseInt(EDATA2.substring( 6,10));
    HOR2 = Integer.parseInt(EHORA2.substring( 0, 2)); 
    MIN2 = Integer.parseInt(EHORA2.substring( 3, 5));

    DATA2.set(ANO2, MES2, DIA2, HOR2, MIN2);

    DT1 = DATA1.getTimeInMillis();
    DT2 = DATA2.getTimeInMillis();

    FRACAO = VLRHR / 60;

    if (DATA1.compareTo(DATA2)  > 0)
      VLRTOT = (DT1 - DT2) / 60000 * FRACAO;
    else
      VLRTOT = (DT2 - DT1) / 60000 * FRACAO;
  
    df.applyPattern("0.00");
    System.out.println("Valor a ser pago = " + df.format(VLRTOT));

  }
}
