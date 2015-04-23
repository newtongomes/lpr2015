import java.util.Scanner;
public class UsaConversores { // declaração da classe UsaConversores
   public static void main(String arg[ ]) {
      Scanner sc = new Scanner(System.in); // prepara scanner
      System.out.print("Digite temperatura Celsius: ");
      double tempC = sc.nextDouble(); // lê temperatura Celsius

      // cria conversor Celsius p/ Kelvin, exibe info e efetua conversão
      CelsiusKelvin ck = new CelsiusKelvin();
      System.out.println("ck : " + ck); // uso implícito de toString()
      double tempK = ck.converter(tempC);
      System.out.println("tempK = " + tempK + "K"); // resultado

      // cria conversor Kelvin p/ Celsius, exibe info, desfaz conversão
      KelvinCelsius kc = new KelvinCelsius();
      System.out.println("kc : " + kc); // uso implícito de toString()
      System.out.println("tempC = " + kc.converter(tempK) + "C");
   }
}
