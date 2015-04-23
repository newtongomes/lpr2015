package br.estacio.lpr.exercicios;

import java.util.Scanner;

public class VetorAlunos 
{
	  public static void main(String[] args)  
	  { 
	    Scanner input = new Scanner(System.in); 
	    String aluno[] = new String[10]; 
	    float[] nota1, nota2, media; 
	    nota1 = new float[10]; 
	    nota2 = new float[10]; 
	    media = new float[10]; 
	    float soma = 0, mediageral;
	    int maiorMedia; 
	     
	    for(int i=0; i < 5; i++) 
	    { 
	      System.out.print("Digite o nome do aluno: "); 
	      aluno[i] = input.nextLine(); 
	      System.out.print("Nota 1: "); 
	      nota1[i] = input.nextFloat(); 
	      System.out.print("Nota 2: "); 
	      nota2[i] = input.nextFloat(); input.nextLine();
	      media[i] = (nota1[i]+nota2[i])/2; 
	      soma += media[i]; 
	    } 
	    mediageral = soma/10; 
	     
	    System.out.println("Lista dos Alunos:"); 
	    for(int i=0; i < 10; i++) 
	    { 
	      System.out.println(aluno[i]+" - nota1="+nota1[i]+ 
	          " nota2="+nota2[i]+" Media = "+media[i]); 
	    } 
	    System.out.printf("Media Geral da Turma: %.1f\n", 
	        mediageral); 
	     
	    System.out.println("Melhor Aluno: ?????");
	    
	    maiorMedia = 0;
	    for (int i=1; i < 10; ++i)
	    {
	    	if (media[i] > media[maiorMedia])
	    	{
	    		maiorMedia = i;
	    	}
	    }

	    System.out.println("Maior Media: "+media[maiorMedia]);
	    System.out.println("Melhor Aluno: "+aluno[maiorMedia]);

	    input.close();
	    
	  }
}






