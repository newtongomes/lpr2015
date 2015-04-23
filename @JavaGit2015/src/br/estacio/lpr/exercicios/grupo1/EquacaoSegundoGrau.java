package br.estacio.lpr.exercicios.grupo1;
import java.util.Scanner;

public class EquacaoSegundoGrau 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
	// Programa para encontrar as raízes de uma equação do segundo grau.		
	// Serão utilizados valores inteiros nos coeficientes.
	
	Scanner input = new Scanner(System.in);
	int a,b,c,control = 0;
	double delta;
	double x1 = 0;
	double x2=0;
	
	System.out.println("Digite os valores dos coeficientes (a) (b) e (c):");
	System.out.println("a:");
	a = input.nextInt();
	System.out.println("b:");
	b = input.nextInt();
	System.out.println("c:");
	c = input.nextInt();
	delta = (b*b) -4*(a)*(c);
	
		if(delta == 0)
		{
		x1 = (-(b)+ (Math.sqrt(delta)))/(2*a);
		x2 = x1;
		control = 1;
		}
		else
		{
			if(delta > 0)
			{
				x1 = (-(b) + (Math.sqrt(delta)))/(2*a);
				x2 = (-(b) - (Math.sqrt(delta)))/(2*a);
				control = 2;
			}
			else
				{
				System.out.printf("Nao existem raizes reais para delta = %.2f.",delta);
				}
		}
		if (control == 1 || control == 2)
		{
			System.out.printf("As Raizes da equacao %dx²+%dx+%d sao:\nx1 = %.2f e x2 = %.2f",a,b,c,x1,x2);
		}
	}
}
