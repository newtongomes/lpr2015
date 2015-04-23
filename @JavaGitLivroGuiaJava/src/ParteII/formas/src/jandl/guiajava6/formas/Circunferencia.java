package jandl.guiajava6.formas;

public class Circunferencia extends Forma {
   public Circunferencia(double raio) {
      super(1); // uso obrigatório do construtor da superclasse
      setMedida(0, raio); // ajuste da medida do raio
   }
   // implementação específica do método abstrato área
   public double area() {
      return Math.PI*Math.pow(getMedida(0), 2);
   }
}
