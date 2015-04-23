import jandl.guiajava6.formas.*;

public class InstanceOf {
   public static void main(String a[]) {
      // cria triângulo de medidas 1.5 x 1.5 x 2.0
      Object obj = new Triangulo(1.5, 1.5, 2.0);
      System.out.println(obj); // exibe info do obj (triângulo)
      // verifica de quem obj é instância...
      System.out.printf("%s instancia de Triangulo.\n",
         obj instanceof Triangulo ? "E'" : "Nao e'");
      System.out.printf("%s instancia de Retangulo.\n",
         obj instanceof Retangulo ? "E'" : "Nao e'");
      System.out.printf("%s instancia de Forma.\n",
         obj instanceof Forma ? "E'" : "Nao e'");
      System.out.printf("%s instancia de Object.\n",
         obj instanceof Object ? "E'" : "Nao e'");
      System.out.printf("%s instancia de Runnable.\n",
         obj instanceof Runnable ? "E'" : "Nao e'");
   }
}
