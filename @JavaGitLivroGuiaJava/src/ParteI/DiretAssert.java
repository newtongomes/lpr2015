import java.util.Scanner;
public class DiretAssert {
   public static void main(String a[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Forneca inteiro>0: ");
      int valor = sc.nextInt();
      assert valor>0; // espera-se valor maior que zero
      int soma=0;
      for(int i=1; i<valor; i++) soma+=i;
      // espera-se soma<30
      assert soma<30: "soma="+soma+">=30";
      System.out.println("soma 1.." + valor + " = " + soma);
   }
}
