package br.estacio.lpr.exercicios;

import java.util.Scanner;

public class String1 
{
	 public static void main(String[] args)  
	  { 
	    Scanner sc = new Scanner(System.in); 
	    String nome1, nome2; 
	    System.out.println("Digite o primeiro nome:"); 
	    nome1 = sc.next(); 
	    System.out.println("Digite o segundo nome:"); 
	    nome2 = sc.next(); 
	 
	    System.out.println("Tamanho do primeiro: "+nome1.length()); 
	    System.out.println("Tamanho do segundo: "+nome2.length()); 
	     
	    String concat1 = nome1.toUpperCase()+nome2.toUpperCase(); 
	    String concat2 = nome1.toLowerCase()+nome2.toLowerCase(); 
	     
	    System.out.println("Concatenacao Maiuscula: " + concat1); 
	    System.out.println("Concatenacao Minuscula: " + concat2); 
	 
	  } 
}
