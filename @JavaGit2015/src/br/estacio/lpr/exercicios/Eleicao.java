package br.estacio.lpr.exercicios;

import java.util.Scanner;

public class Eleicao 
{
	   
	  String nomeEleitor; 
	  int idade; 
	  int anoNascimento; 
	  Scanner teclado = new Scanner(System.in); 
	 
	  public static void main(String[] args)  
	  { 
	    new Eleicao().executar(); 
	  } 
	   
	  public void executar() 
	  { 
	    System.out.print("Qual seu nome? "); 
	    nomeEleitor = teclado.nextLine(); 
	    System.out.print("Qual o Ano de Nascimento? "); 
	    anoNascimento = teclado.nextInt(); 
	    idade = calcularIdade(anoNascimento); 
	    if (idade < 16) 
	    { 
	      System.out.println("Você NÃO pode votar!"); 
	       
	    } 
	    else 
	    { 
	      System.out.println("Você está apto a votar."); 
	    } 
	    System.out.println("Quem nasceu em 1990, tem "+ 
	        calcularIdade(1990)+" anos."); 
	  } 
	   
	  public int calcularIdade(int ano) 
	  { 
	    return 2010 - ano; 
	  } 
}
