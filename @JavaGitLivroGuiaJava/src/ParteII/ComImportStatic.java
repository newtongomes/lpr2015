import static java.lang.Math.*; // importação estática
public class ComImportStatic {
   public static void main(String a[ ]) {
      // uso abreviado (direto) da constante
      double perim = 2 * PI * Double.parseDouble(a[0]);
      System.out.println("Perimetro = " + perim);
   }
}
