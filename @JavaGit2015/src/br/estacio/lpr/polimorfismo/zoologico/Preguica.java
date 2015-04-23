package br.estacio.lpr.polimorfismo.zoologico;

public class Preguica extends Animal
{
  public Preguica(String nome, int idade)
  {
     super(nome,idade);
  }

  public void emitirSom()
  {
      System.out.println("ZZZzzzzz...");
  }
 
  public void subirArvore()
  {
     System.out.println("subindo...subindo...");
  }

}
