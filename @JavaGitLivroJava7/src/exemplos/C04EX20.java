package exemplos;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

class C04EX20 {
  public static void main(String args[]) {

    long X = 1_000_000, Y, R;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in); 

    System.out.println();
    System.out.print("Entre um valor inteiro (-128/127): ");
    Y = s.nextByte();  

    R = X + Y + 3000000;

    df.applyPattern("#,###,##0");
    System.out.println("Resultado = " + df.format(R));

  }
}
