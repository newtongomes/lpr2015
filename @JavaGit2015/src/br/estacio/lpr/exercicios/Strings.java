package br.estacio.lpr.exercicios;

import java.util.Scanner;

public class Strings 
{
	 public static void main(String a[]) 
	  { 
	    Scanner sc = new Scanner(System.in); 
	    String str; 
	    System.out.print("Digite um texto: "); 
	    str = sc.next();   // "Curso Java"; 
	    System.out.println("String: "+str); 
	    System.out.println("toUpperCase: "+str.toUpperCase()); 
	    System.out.println("toLowerCase: "+str.toLowerCase()); 
	    System.out.println("charAt(0): "+str.charAt(0)); 
	    System.out.println("charAt(1): "+str.charAt(1)); 
	    System.out.println("charAt(5): "+str.charAt(5)); 
	    System.out.println("charAt(6): "+str.charAt(6)); 
	    System.out.println(": "+str.substring(0,3)); 
	    System.out.println(": "+str.substring(6,8)); 
	    System.out.println("A: "+str.indexOf("A")); 
	    System.out.println("tamanho: "+str.length()); 
	  } 
}
