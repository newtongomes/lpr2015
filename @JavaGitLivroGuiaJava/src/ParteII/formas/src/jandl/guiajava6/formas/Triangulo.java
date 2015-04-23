package jandl.guiajava6.formas;

public class Triangulo extends Forma {
   public Triangulo(double l1, double l2, double l3) {
      super(3); // uso obrigat�rio do construtor da superclasse
      setMedida(0, l1); // ajuste da medida dos lados
      setMedida(1, l2);
      setMedida(2, l3);
   }
   // implementa��o espec�fica do m�todo abstrato �rea
   public double area() {
      // usando f�rmula de Her�o
      double sp = (getMedida(0) + getMedida(1) + getMedida(2))/2;
      return Math.sqrt(sp*(sp-getMedida(0))*(sp-getMedida(1))*(sp-getMedida(2)));
   }
}
