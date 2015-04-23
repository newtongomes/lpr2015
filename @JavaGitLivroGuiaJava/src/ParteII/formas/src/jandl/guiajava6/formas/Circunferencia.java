package jandl.guiajava6.formas;

public class Circunferencia extends Forma {
   public Circunferencia(double raio) {
      super(1); // uso obrigat�rio do construtor da superclasse
      setMedida(0, raio); // ajuste da medida do raio
   }
   // implementa��o espec�fica do m�todo abstrato �rea
   public double area() {
      return Math.PI*Math.pow(getMedida(0), 2);
   }
}
