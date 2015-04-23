package br.estacio.lpr.exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha 
{
    //Programa Exemplo de exercicio java 
    //Programador: Jeorge Maia 
    //Data: 28/02/2011 
     
    public static void main(String[] args)  
    { 
      int numero, contador, palpite; 
      Scanner ler = new Scanner (System.in); 
      Random rand = new Random (); 
      numero = rand.nextInt(100); 
      System.out.println("Adivinha o" +numero); 
      contador = 0; 
      palpite = -1; 
      while (palpite != numero) 
      { 
        System.out.print("Digite o palpite: "); 
        palpite = ler.nextInt(); 
        contador++; 
        if (palpite > numero) 
        { 
          System.out.println("Digite um numero MENOR!"); 
        } 
        else 
        { 
          if (palpite < numero) 
          { 
            System.out.println("Digite um numero MAIOR!"); 
          } 
          else 
          { 
            System.out.println("PARABÉNS!"); 
            System.out.println("Voce acertou com " 
                +contador+" tentativas"); 
          } 
        } 
      } 
    } 
}
