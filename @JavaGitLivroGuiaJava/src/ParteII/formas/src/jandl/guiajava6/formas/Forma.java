package jandl.guiajava6.formas;

public abstract class Forma { // classe abstrata Forma
   private double medida[]; // array c/ medidas

   public Forma(int numMedidas) { // construtor parametrizado
      medida = new double[numMedidas]; // aloca array de medidas
   }
   public double getMedida(int i) { // obtem uma medida da forma
      if (i<0 || i>=medida.length) {
         throw new RuntimeException("Numero invalido de medida.");
      }
      return medida[i];
   }
   protected void setMedida(int i, double m) { // ajusta uma medida da forma
      if (i<0 || i>=medida.length) {
         throw new RuntimeException("Numero invalido de medida.");
      }
      if (m<0) {
         throw new RuntimeException("Medida #" + i + "invalida.");
      }

      medida[i] = m;
   }
   public String toString() { // representação textual
      StringBuffer sb = new StringBuffer(getClass().getName());
      sb.append("[medidas:");
      for(int i=0; i<medida.length-1; i++) {
         sb.append(medida[i]);
         sb.append(",");
      }
      sb.append(medida[medida.length-1]);
      sb.append("]");
      return sb.toString();
   }
   public int getNumMedidas() { // retorna no de medidas da forma
      return medida.length;
   }
   public abstract double area(); // método abstrato que determinará área
}
