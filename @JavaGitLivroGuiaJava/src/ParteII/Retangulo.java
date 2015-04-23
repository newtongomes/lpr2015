public class Retangulo { // declaração da classe Retangulo
   private double largura, altura; // dimensões são campos privados
   public Retangulo ( ) { this (2, 1); } // chamada a outro construtor da classe
   public Retangulo (double largura, double altura) { this.setTamanho(largura, altura); }
   public void setTamanho(double largura, double altura) {
      if(largura>=0 && altura>=0) { // verifica valor das variáveis locais
         // ajusta campos com variáveis locais
         this.largura = largura; this.altura = altura;
      }
   }
   // uso implícito de this
   public double getLargura() { return largura; } // retorna valor do campo this.lagura
   public double getAltura() { return altura; } // retorna valor do campo this.altura
}
