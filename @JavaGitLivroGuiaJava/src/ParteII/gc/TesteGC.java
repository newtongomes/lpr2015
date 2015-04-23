public class TesteGC {
   public static void main(String a[]) {
      System.out.println("Instancias = " + Objeto.getInstancias());
      for(int i=0; i<10; i++) {
         Objeto o = new Objeto();
      }
      System.out.println("Instancias = " + Objeto.getInstancias());
      System.gc();
      System.out.println("Instancias = " + Objeto.getInstancias());
   }
}
