public class Boxing {
   public static void main(String a[]) {
       // autoboxing: valores são convertidos em Float
      Float array1[ ] = { -4.65f, 0.18f, 7.329f };
      float soma = 0;
      Double array2[] = new Double[array1.length]; // aloca novo array
      System.out.print("array1 [ ");
      for(int i=0; i<array1.length; i++) {
         System.out.print(array1[i] + " ");
         float aux = array1[i]; // auto-unboxing
         soma += aux;
         array2[i] = 2.0*array1[i]; // autoboxing
      }
      System.out.println("]");
      System.out.println("Soma: " + soma);
   }
}
