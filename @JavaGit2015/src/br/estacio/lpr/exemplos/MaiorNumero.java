package br.estacio.lpr.exemplos;
import java.util.Scanner;

public class MaiorNumero 
{
	public static void main(String a[])
	{
		System.out.println("* Maior N�mero *");
		Scanner teclado = new Scanner(System.in); 
		int n1, n2;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = teclado.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = teclado.nextInt();
		
		if (n1 > n2)
		{
			System.out.println("Maior n�mero � : " + n1);
		}
		else
		{
			System.out.println("Maior n�mero � : " + n2);
		}
		
		System.out.println("Maior n�mero � " + (n1>n2 ? n1 : n2) );

		
		teclado.close();
	}

}
