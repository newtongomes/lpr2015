package br.estacio.lpr.polimorfismo.zoologico;

public abstract class Animal
{
  private String nome;
  private int idade;

  public Animal()
  {
  }

  public Animal(String nome, int idade)
  {
     this.nome = nome;
     this.idade = idade;
  }

  public String getNome()
  {
     return nome;
  }

  public int getIdade()
  {
     return this.idade;
  }
 
  public void setNome(String nome)
  {
     this.nome = nome;
  }
  
  public void setIdade(int idade)
  {
     this.idade = idade;
  }

 
  public abstract void emitirSom();

}
