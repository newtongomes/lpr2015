public class Ponto2D { // declara��o da classe Ponto2D
   // campos p�blicos pois n�o existe restri��o de valores p/ coord. x e y
   public double x, y;
   // construtor default: ponto definido na origem (0, 0)
   public Ponto2D( ) {
      x = 0; y = 0;
   }
   // construtor parametrizado: ponto definido na instancia��o
   public Ponto2D (double px, double py) {
      x = px;  y = py;
   }
   // m�todo que determina dist�ncia entre inst�ncia e coordenada dada
   public double distancia (double px, double py) {
      return Math.sqrt(Math.pow(x - px, 2) + Math.pow(y - py, 2));
   }
   // m�todo que determina dist�ncia entre inst�ncia e coordenada dada
   public double distancia (Ponto2D p) {
      return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
   }
   // m�todo toString para auxiliar representa��o textual dos objetos
   public String toString( ) {
      return "Ponto2D[x=" + x + ",y=" + y + "]";
   }
}
