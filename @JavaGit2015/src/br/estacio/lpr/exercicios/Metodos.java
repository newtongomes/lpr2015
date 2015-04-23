package br.estacio.lpr.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Metodos 
{
	 public static void main(String a[]) 
	  { 
	    Scanner ler = new Scanner(System.in); 
	    String seuNome; 
	    System.out.print("Qual seu nome? "); 
	    seuNome = ler.nextLine(); 
	    System.out.println("Ola, "+seuNome+"!\nEu so o Java."); 
	     
	    Random rnd = new Random(); 
	    int num1, num2; 
	    String continua="SIM"; 
	     
	    while (continua == "SIM")//((continua.toUpperCase()).equals("SIM")) 
	    { 
	      num1 = rnd.nextInt(100); 
	      num2 = rnd.nextInt(100); 
	      System.out.println("Numero 1 = "+num1); 
	      System.out.println("Numero 2 = "+num2); 
	      System.out.println("Soma = "+(num1+num2)); 
	      System.out.println("Produto = "+num1*num2); 
	      if (num1>num2) 
	        System.out.println("Maior = "+num1); 
	      else 
	        System.out.println("Maior = "+num1); 
	      System.out.print("Executa Novamente ? (Sim ou Nao) "); 
	      continua = ler.nextLine(); 
	    } 
	    System.out.println("#Fim do Programa#"); 
	  } 
	   
	  int soma(int a,int b) { 
	    int s; 
	    s = a+b; 
	    return s;  
	  } 
	   
	  int produto(int a,int b) { 
	    return a*b; 
	  } 
	   
	  float dobro(float n) { 
	    return n*2; 
	  } 
	   
	  int maior2(int a,int b) { 
	    return (a>b?a:b); 
	  } 
	   
	  int maior3(int a,int b,int c) { 
	    return 0; 
	  }
}
