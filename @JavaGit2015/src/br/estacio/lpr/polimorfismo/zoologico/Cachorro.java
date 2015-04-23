package br.estacio.lpr.polimorfismo.zoologico;

public class Cachorro extends Animal
{
  public Cachorro(String nome, int idade)
  {
     super(nome,idade);
  }

  public void emitirSom()
  {
      System.out.println("au...au...");
  }
 
  public void correr()
  {
     System.out.println("pega...pega...");
  }

}

