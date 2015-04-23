package exemplos;
import java.io.*;
import java.util.Scanner;

class C04EX12STR {
  public static void main(String args[]) {

    String MES;
    Scanner s = new Scanner(System.in); 

    System.out.println();
    System.out.print("Entre um valor referente a um MES: ");
    MES = s.nextLine();  
    System.out.println();

    switch (MES)
      {
        case "um":     System.out.println("Janeiro");      break;
        case "dois":   System.out.println("Fevereiro");    break;
        case "tres":   System.out.println("Marco");        break;
        case "quatro": System.out.println("Abril");        break;
        case "cinco":  System.out.println("Maio");         break;
        case "seis":   System.out.println("Junho");        break;
        case "sete":   System.out.println("Julho");        break;
        case "oito":   System.out.println("Agosto");       break;
        case "nove":   System.out.println("Setembro");     break;
        case "dez":    System.out.println("Outubro");      break;
        case "onze":   System.out.println("Novembro");     break;
        case "doze":   System.out.println("Dezembro");     break;
        default:       System.out.println("Mes invalido"); break;
      }
    System.out.println();

  }
}
