package br.estacio.lpr.exercicios;

import java.util.Random;

import javax.swing.JOptionPane; 
public class LanceDados  
{ 
  public static void main(String[] args)  
  { 
    final int NUM_LANCES = 350; 
     
    LanceDados jogar; 
    jogar = new LanceDados(); 
    int lances[] = new int[NUM_LANCES]; 
    int cont1, cont2, cont3, cont4, cont5, cont6; 
    cont1 = cont2 = cont3 = cont4 = cont5 = cont6 = 0; 
    float total; 
     
    for(int i=0; i<NUM_LANCES; i++) 
    { 
      lances[i] = jogar.lancarDado(); 
       
      switch(lances[i]) 
      { 
        case 1: cont1++; break;  
        case 2: cont2++; break;  
        case 3: cont3++; break;  
        case 4: cont4++; break;  
        case 5: cont5++; break;  
        case 6: cont6++; break;  
      }
    }
    System.out.println("Resultado dos Lances do Dado:");
    System.out.printf("Face 1 : %d vezes - %.2f %%\n", 
            cont1,(float)cont1/NUM_LANCES*100); 
        System.out.printf("Face 2 : %d vezes - %.2f %%\n", 
            cont2,(float)cont2/NUM_LANCES*100); 
        System.out.printf("Face 3 : %d vezes - %.2f %%\n", 
            cont3,(float)cont3/NUM_LANCES*100); 
        System.out.printf("Face 4 : %d vezes - %.2f %%\n", 
            cont4,(float)cont4/NUM_LANCES*100); 
        System.out.printf("Face 5 : %d vezes - %.2f %%\n", 
            cont5,(float)cont5/NUM_LANCES*100); 
        System.out.printf("Face 6 : %d vezes - %.2f %%\n", 
            cont6,(float)cont6/NUM_LANCES*100); 
         
        total = (float)cont1/NUM_LANCES*100 + 
        (float)cont2/NUM_LANCES*100 + (float)cont3/NUM_LANCES*100 + 
        (float)cont4/NUM_LANCES*100 + (float)cont5/NUM_LANCES*100 + 
        (float)cont6/NUM_LANCES*100; 
     
        System.out.printf("Total = %.2f %%\n",total); 
     
      } 
       
       
      int lancarDado() 
      {     
        JOptionPane.showMessageDialog(null, "Lançando o Dado!"); 
        Random aleatorio = new Random(); 
        return aleatorio.nextInt(6)+1; 
      } 
}