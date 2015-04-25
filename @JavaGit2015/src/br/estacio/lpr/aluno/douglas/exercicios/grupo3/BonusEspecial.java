package br.estacio.lpr.aluno.douglas.exercicios.grupo3;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class BonusEspecial 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String nomes[] = new String[15];
		float valor[] = new float[15];
		
		for(int i = 0; i<nomes.length;i++)
		{
			System.out.println("Informe o nome do cliente:");
			nomes[i] = input.next();
			System.out.printf("Informe o valor da compra do cliente '%s':\n",nomes[i]);
			valor[i] = input.nextFloat();
		}
		for (int i = 0; i<nomes.length;i++)
		{
			if(valor[i] < 1000)
				System.out.printf("O bonus para o cliente %s sera de %d%%\n",nomes[i],10);
			else
				System.out.printf("O bonus para o cliente %s sera de %d%%\n",nomes[i],15);
		}
	}

}
