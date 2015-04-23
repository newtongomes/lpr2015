public class Retangulo3 { // declaração da classe Retangulo3
   private double largura, altura; // dimensões são campos privados
   public Retangulo3 ( ) throws Exception {
      this (2, 1); } // chamada a outro construtor da classe
   public Retangulo3 (double largura, double altura) throws Exception {
      this.setTamanho(largura, altura); }
   public void setTamanho(double largura, double altura) throws Exception {
      if(largura>=0 && altura>=0) { // verifica valor das variáveis locais
         this.largura = largura; // ajusta campo com variável local
         this.altura = altura; // ajusta campo com variável local
      } else { // se dimensões inadequadas lança exceção não monitorada
         throw new Exception("Dimensoes invalidas.");
      }
   }
   // uso implícito de this
   public double getLargura() { return largura; } // retorna valor do campo this.lagura
   public double getAltura() { return altura; } // retorna valor do campo this.altura
   public String toString() { return "Retangulo2[largura="+largura+",altura="+altura +"]"; }
}
