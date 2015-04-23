package br.estacio.lpr.exercicios;

import java.util.Scanner;

public class Votacao 
{
	
	static Scanner sc = new Scanner(System.in);
	
	 public static void main(String[] args)  
	  { 
		String[] candidatos = new String[5]; 
	    int[] contador = new int[5]; 
	    int voto; 
	    
	    iniciar();

	    for(int i=0; i<5; i++) 
	    { 
	      System.out.println("Candidato "+(i+1)+":"); 
	      candidatos[i] = sc.next(); 
	        contador[i] = 0; 
	    }
	    
	    mensagem("digitar votos");
	    
	    int votos = quantidade();
	     
	    for(int i=0; i<10; i++) 
	    { 
	      System.out.println("Digite o voto: "); 
	      voto = sc.nextInt(); 
	      if (voto >= 1 && voto <= 5) 
	        contador[voto-1]++; 
	    } 
	     
	    for(int i=0; i<5; i++) 
	    { 
	      System.out.println("Candidato: "+candidatos[i]+ 
	          " obteve "+contador[i]+" votos"); 
	    } 
	     
	  }


	 static void iniciar()
	 {
		 System.out.println("Inicio do Programa");
		 System.out.println("Seja bem-vindo");
		 
	 }
	 
	 static void mensagem(String m)
	 {
		 System.out.println(m);
	 }

	 static int quantidade()
	 {
		 int x;
		 System.out.println("Quantos votos: ");
		 x = sc.nextInt();
		 return x;
	 }



}
