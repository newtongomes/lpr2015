package br.estacio.lpr.prova;

import java.util.Random;

/**
 *
 * @author Dom
 */
public class Questoes {

        public static void Segunda()
        {
            int a = 1+3/2;
            System.out.println(a);
        }
        public static void Terceira()
        {
            int a=3,b=4,c=4;
            a=b<c?b:c;
            System.out.println(a);
        }
        public static void Sexta()
        {
             int x;
            System.out.println("ExemploA:");
            x=10;
            while(x>2)
            {
                x-=1;
                if (x>3)
                    System.out.println("Java.");
            }
             System.out.println("------------------");
            
            System.out.println("ExercicioB:");
            x=2;
            while(x<15)
            {
                x*=2;
                if (x!=5)
                    System.out.println("Fic.");
            }
            System.out.println("------------------");
            
            System.out.println("ExercicioC:");
            x=15;
            while(x!=3)
            {
                x-=3;
                if (x>5)
                    System.out.println("Teste.");
            }
            System.out.println("------------------");
            
            System.out.println("ExercicioD:");
            x=10;
            while(x>3)
            {
                x-=2;
                if (x>5)
                    System.out.println("Prova.");
            }
            System.out.println("------------------");
        }
        public static void Setima()
        {
            float f[] = new float[200];
            for(int i=0;i<f.length;i++)
            {
                f[i]=9*(i/5)+32;
                System.out.println(f[i]);
            }
            System.out.println("------------------");
        }
        
        public static void Oitava()
        {
            Random r = new Random();
            //float r = gerador.nextFloat()*20+40;
            //System.out.printf("%.2f",r);
            float temp[] = new float[30];
            float soma=0;
            int cont=0;
            for(int i=0;i<temp.length;i++)
            {
                temp[i]=r.nextFloat()*((40-20+1)+20);
                if (temp[i]>35)
                    cont++;
                soma+=temp[i];
                System.out.printf("Dia %d %s %.2f" ,(i+1),": ", temp[i]);
                System.out.println();
                
            }
             System.out.printf("Média de temperaturas geral: %.2f \n", soma/temp.length);
             System.out.println("Quantidade de dias que a média ultrapassou os 35º: "+cont);
        }
    public static void main (String args[])
    {
        System.out.println("2ª Questão:");
        Segunda();
        System.out.println("3ª Questão:");
        Terceira();
        System.out.println("6ª Questão:");
        Sexta();
        System.out.println("7ª Questão:");
        Setima();
        System.out.println("8ª Questão:");
        Oitava();
        
    }
}

