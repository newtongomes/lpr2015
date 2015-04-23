package br.estacio.lpr.polimorfismo.zoologico;

public class Cavalo extends Animal
{
  public Cavalo(String nome, int idade)
  {
     super(nome,idade);
  }

  public void emitirSom()
  {
      System.out.println("Hiihihihhiiii...");
  }
 
  public void correr()
  {
     System.out.println("pocotó...pocotó....");
  }

}
