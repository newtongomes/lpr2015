package br.estacio.lpr.polimorfismo.zoologico;

public class Zoologico
{
    public static void main(String... args)
    {
        Animal jaula[] = new Animal[10];
        jaula[0] = new Cachorro("aaa",10);
        jaula[1] = new Cavalo("aaa",10);
        jaula[2] = new Preguica("aaa",10);
        jaula[3] = new Cavalo("aaa",10);
        jaula[4] = new Cachorro("aaa",10);
        jaula[5] = new Cavalo("aaa",10);
        jaula[6] = new Cachorro("aaa",10);
        jaula[7] = new Preguica("aaa",10);
        jaula[8] = new Preguica("aaa",10);
        jaula[9] = new Cavalo("aaa",10);

        for(int i=0; i<10; i++)
        {
           jaula[i].emitirSom();

           if (jaula[i] instanceof Cachorro)
           {
	      ( (Cachorro)jaula[i] ).correr();
           }

           if (jaula[i] instanceof Cavalo)
           {
	      ( (Cavalo)jaula[i] ).correr();
           }
   
        }

  
    }


}


