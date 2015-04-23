package exemplos;
import java.io.*;
import java.util.Calendar;

class C05EX31 {
  public static void main(String args[]) {

    Calendar DATA = Calendar.getInstance();
    int DDS = DATA.get(Calendar.DAY_OF_WEEK);
    int DDM = DATA.get(Calendar.DAY_OF_MONTH);
    int MES = DATA.get(Calendar.MONTH);
    int ANO = DATA.get(Calendar.YEAR);
  
    System.out.println();
    System.out.println("Data do sistema .: " + DATA.getTime());
    System.out.println("Dia da semana ...: " + DDS);
    System.out.print("Nome do dia .....: ");
    switch (DDS)
      {
        case  1: System.out.println("Domingo");       break;
        case  2: System.out.println("Segunda-feira"); break;
        case  3: System.out.println("Terca-feira");   break;
        case  4: System.out.println("Quarta-feira");  break;
        case  5: System.out.println("Quinta-feira");  break;
        case  6: System.out.println("Sexta-feira");   break;
        case  7: System.out.println("Sabado");        break;
      }

    System.out.println("Dia do mes ......: " + DDM);
    System.out.println("Mes .............: " + MES + 1);
    System.out.print("Nome do mes .....: ");
    switch (MES)
      {
        case  0: System.out.println("Janeiro");      break;
        case  1: System.out.println("Fevereiro");    break;
        case  2: System.out.println("Marco");        break;
        case  3: System.out.println("Abril");        break;
        case  4: System.out.println("Maio");         break;
        case  5: System.out.println("Junho");        break;
        case  6: System.out.println("Julho");        break;
        case  7: System.out.println("Agosto");       break;
        case  8: System.out.println("Setembro");     break;
        case  9: System.out.println("Outubro");      break;
        case 10: System.out.println("Novembro");     break;
        case 11: System.out.println("Dezembro");     break;
      }
    System.out.println("Ano .............: " + ANO);

  }
}
