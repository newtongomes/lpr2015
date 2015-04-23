public class Retangulo { // declara��o da classe Retangulo
   private double largura, altura; // dimens�es s�o campos privados
   public Retangulo ( ) { this (2, 1); } // chamada a outro construtor da classe
   public Retangulo (double largura, double altura) { this.setTamanho(largura, altura); }
   public void setTamanho(double largura, double altura) {
      if(largura>=0 && altura>=0) { // verifica valor das vari�veis locais
         // ajusta campos com vari�veis locais
         this.largura = largura; this.altura = altura;
      }
   }
   // uso impl�cito de this
   public double getLargura() { return largura; } // retorna valor do campo this.lagura
   public double getAltura() { return altura; } // retorna valor do campo this.altura
}
