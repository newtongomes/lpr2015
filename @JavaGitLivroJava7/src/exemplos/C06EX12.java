package exemplos;
import java.io.*;
import java.text.DecimalFormat;
import exemplos.FinanMax;

class C06EX12 {
  public static void main(String args[]) { 

    DecimalFormat df = new DecimalFormat("0.0");

    double PMT = 1174.60;
    double I   = 0.10;
    double FV  = -10000;
    double R = FinanMax.term(PMT, I, FV);

    System.out.println();
    System.out.println("Levara " + df.format(R) + " meses");

  }
}
