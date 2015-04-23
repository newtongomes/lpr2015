import java.util.Scanner;
public class UsaConversores { // declara��o da classe UsaConversores
   public static void main(String arg[ ]) {
      Scanner sc = new Scanner(System.in); // prepara scanner
      System.out.print("Digite temperatura Celsius: ");
      double tempC = sc.nextDouble(); // l� temperatura Celsius

      // cria conversor Celsius p/ Kelvin, exibe info e efetua convers�o
      CelsiusKelvin ck = new CelsiusKelvin();
      System.out.println("ck : " + ck); // uso impl�cito de toString()
      double tempK = ck.converter(tempC);
      System.out.println("tempK = " + tempK + "K"); // resultado

      // cria conversor Kelvin p/ Celsius, exibe info, desfaz convers�o
      KelvinCelsius kc = new KelvinCelsius();
      System.out.println("kc : " + kc); // uso impl�cito de toString()
      System.out.println("tempC = " + kc.converter(tempK) + "C");
   }
}
