public class Retangulo2 { // declara��o da classe Retangulo2
   private double largura, altura; // dimens�es s�o campos privados
   public Retangulo2 ( ) { this (2, 1); } // chamada a outro construtor da classe
   public Retangulo2 (double largura, double altura) { this.setTamanho(largura, altura); }
   public void setTamanho(double largura, double altura) {
      if(largura>=0 && altura>=0) { // verifica valor das vari�veis locais
         this.largura = largura; // ajusta campo com vari�vel local
         this.altura = altura; // ajusta campo com vari�vel local
      } else { // se dimens�es inadequadas lan�a exce��o n�o monitorada
         throw new RuntimeException("Dimensoes invalidas.");
      }
   }
   // uso impl�cito de this
   public double getLargura() { return largura; } // retorna valor do campo this.lagura
   public double getAltura() { return altura; } // retorna valor do campo this.altura
   public String toString() { return "Retangulo2[largura="+largura+",altura="+altura +"]"; }
}
