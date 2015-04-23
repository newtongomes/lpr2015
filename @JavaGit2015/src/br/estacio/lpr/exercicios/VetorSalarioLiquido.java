package br.estacio.lpr.exercicios;

import java.util.Scanner;
public class VetorSalarioLiquido 
{
	  public static void main(String[] args)  
	  { 
	    Scanner sc = new Scanner(System.in); 
	    String func[] = new String[10];
	    float salario[], liquido[], total;
	    
	    salario = new float[10];
	    liquido = new float[10];
	    total = 0;

	    for(int i=0; i<10; i++)
	    {
		    System.out.println("Digite o nome : #"+(i+1)); 
		    func[i] = sc.nextLine(); 
		    System.out.println("Digite o salario "+(i+1)+":"); 
		    salario[i] = sc.nextFloat(); sc.nextLine();
		    if (salario[i] <= 500) 
		      liquido[i] = salario[i] - salario[i]*0.06f; 
		    else 
		      liquido[i] = salario[i] - salario[i]*0.095f;
		    
		    total += liquido[i];
	    }
	     
	    for(int i=0; i<10; i++)
	    {
		    System.out.printf("Funcionario: %s   Liquido: R$ %.2f",
		    		func[i],liquido[i]); 
	    }
	    System.out.printf("Total = R$ %.2f",total);
	  }
}
