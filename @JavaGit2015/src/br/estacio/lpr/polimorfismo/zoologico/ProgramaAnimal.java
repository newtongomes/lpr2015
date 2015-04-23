package br.estacio.lpr.polimorfismo.zoologico;

public class ProgramaAnimal
{
   public static void main(String... args)
   {
      Animal a1;
      Veterinario vet = new Veterinario();

      a1 = new Cachorro("P�-Duro",3);
      a1.emitirSom();
      vet.examinar(a1);

      a1 = new Cavalo("Alaz�o",5);
      a1.emitirSom();
      vet.examinar(a1);

      a1 = new Preguica("Cidy",3);
      a1.emitirSom();
      vet.examinar(a1);

   }

}
