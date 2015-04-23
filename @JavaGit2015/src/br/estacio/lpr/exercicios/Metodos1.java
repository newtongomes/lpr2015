package br.estacio.lpr.exercicios;

import java.util.Scanner;

public class Metodos1 
{
	 static int x,y; 
	  static Scanner teclado = new Scanner(System.in); 
	 
	  public static void main(String[] args)  
	  { 
	    int z; 
	    x = lerInt("Primeiro Numero: "); 
	    y = lerInt("Segundo Numero: "); 
	    z = lerInt("Terceiro Numero: "); 
	     
	    imprima("Soma: "+somar(x,y)); 
	    imprima("Teste: "+somar(20,13)); 
	    imprima("Produto: "+multiplicar(x,y)); 
	    imprima("Dobro do Primeiro: "+dobro(x)); 
	    imprima("Dobro do Segundo : "+dobro(y)); 
	  } 
	   
	  public static void imprima(String s) 
	  { 
	    System.out.println(s); 
	  } 
	   
	   
	   
	  public static int somar(int a, int b) 
	  { 
	    //int s; 
	    //s = a+b; 
	    //return s; 
	    return a+b; 
	  } 
	   
	  public static int multiplicar(int a,int b) 
	  { 
	    return a*b; 
	  } 
	   
	  public static int dobro(int a) 
	  { 
	    return somar(a,a); 
	  } 
	   
	  public static int lerInt(String texto) 
	  { 
	    int num; 
	    System.out.print(texto); 
	    num = teclado.nextInt(); 
	    return num; 
	  } 
	   
	  //lerFolat(...) 
	  //lerString(...)
}
