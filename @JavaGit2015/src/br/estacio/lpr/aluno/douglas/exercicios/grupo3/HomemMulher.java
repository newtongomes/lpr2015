package br.estacio.lpr.aluno.douglas.exercicios.grupo3;
import java.util.Scanner;

public class HomemMulher 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		byte homem1,homem2;
		byte mulher1,mulher2;
		byte hMaisVelho,hMaisNovo;
		byte mMaisVelha,mMaisNova;
		short soma = 0;
		short produto = 0;
		
		
		System.out.println("Digite a idade do homem 1:");
		homem1 = input.nextByte();
		System.out.println("Digite a idade do homem 2:");
		homem2 = input.nextByte();
		System.out.println("Digite a idade do mulher 1:");
		mulher1 = input.nextByte();
		System.out.println("Digite a idade do mulher 2:");
		mulher2 = input.nextByte();
		
		if(homem1 > homem2)
		{
			if(mulher1 < mulher2)
			{
				hMaisVelho = homem1;
				mMaisNova = mulher1;
				hMaisNovo = homem2;
				mMaisVelha = mulher2;
				soma = (short)(homem1+mulher1);
				produto = (short)(homem2*mulher2);
			}
			else
			{
				hMaisVelho = homem1;
				mMaisNova = mulher2;
				hMaisNovo = homem2;
				mMaisVelha = mulher1;
				soma = (short)(homem1+mulher2);
				produto = (short)(homem2*mulher1);
			}
		}
		else
		{
			if(mulher1 < mulher2)
			{
				hMaisVelho = homem2;
				mMaisNova = mulher1;
				hMaisNovo = homem1;
				mMaisVelha = mulher2;
				soma = (short)(homem2+mulher1);
				produto = (short)(homem1*mulher2);
			}
			else
			{
				hMaisVelho = homem2;
				mMaisNova = mulher2;
				hMaisNovo = homem1;
				mMaisVelha = mulher1;
				soma = (short)(homem2+mulher2);
				produto = (short)(homem1*mulher1);
			}
		}
		System.out.printf("A soma das idades do homem mais velho (%d) com a mulher mais nova (%d) e = %d.\n",
				hMaisVelho,mMaisNova,soma);
		System.out.printf("O produto das idades do homem mais novo (%d) com a mulher mais velha (%d) e = %d.",
				hMaisNovo,mMaisVelha,produto);
	}

}
