import java.util.Scanner;
public class UsaHora {
   public static void main (String args[ ]) {
      Hora hora = new Hora (); // declara e instancia objeto tipo Hora
      hora.setHorario(15, 30, 10); // ajusta objeto com valores válidos
      System.out.println("Hora: " + hora.toString()); // exibe hora
      Scanner s = new Scanner(System.in);
      int h, m; // variáveis auxiliares
      System.out.print("Horas ? "); h = s.nextInt();
      System.out.print("Minutos ? "); m = s.nextInt();
      hora.setHorario(h, m, 0); // ajusta objeto com valores dados
      System.out.println("Hora: " + hora.toString()); // exibe hora
      if (hora.getHoras()>=18 || hora.getHoras()<6)
         System.out.println("E noite!");
      else
         System.out.println("E dia!");
   }
}
