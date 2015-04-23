import java.util.Scanner;

public class ForAvancado {
   public static void main(String arg[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("No de elementos ? ");
      int tamanho = sc.nextInt();
      assert tamanho>0;
      int arranjo[] = new int[tamanho];
      // for tradicional para leitura
      for(int i=0; i<tamanho; i++) {
         System.out.print("Elemento[" + i + "]? ");
         arranjo[i] = sc.nextInt();
      }
      int soma = 0;
      System.out.print("[ ");
      // for avançado para processamento/exibição
      for(int elemento: arranjo) {
         soma += elemento; // soma elemento
         System.out.print(elemento + " ");
      }
      System.out.println("] soma = " + soma);
   }
}
