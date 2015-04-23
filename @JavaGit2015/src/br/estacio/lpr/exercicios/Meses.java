package br.estacio.lpr.exercicios;

import java.util.Scanner;

public class Meses 
{
	  public static void main(String a[]) 
	  { 
	    Scanner ler = new Scanner(System.in); 
	     
	    //String mes = new String[12]; 
	    String mes[] = {"jan","fev","mar","abr","mai","jun", 
	            "jul","ago","set","out","nov","dez"}; 
	    int x; 
	    do 
	    { 
	      System.out.print("Numero do Mes ? "); 
	      x = ler.nextInt(); 
	      if (x>=1 && x<=12) 
	        System.out.println(mes[x-1]); 
	      else 
	        if (x != 0) 
	          System.out.println("Numero Invalido!"); 
	    } while (x!=0); 
	    System.out.println("# Fim do Programa #"); 
	 
	  } // main() 
	 
	} // class