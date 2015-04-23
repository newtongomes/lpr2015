package exemplos;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

class C08EX01 {
  public static void main(String args[]) {

    float MDG[] = new float[8];
    float SOMA = 0, MEDIA;
    int I;
    DecimalFormat df = new DecimalFormat("0.00");
    Scanner s = new Scanner(System.in); 

    System.out.println();

    for (I = 0; I <= 7; I++) {
      System.out.print("Media media " + (I + 1) + "o. aluno: ");
      MDG[I] = s.nextFloat();   
      SOMA += MDG[I];
    }
 
    MEDIA = SOMA / 8;

    System.out.println();
    System.out.println("Media Geral = " + df.format(MEDIA));
 
  }
}
