package br.estacio.douglas.exercicios.grupo3;
import java.util.Scanner;

public class ContaBancaria 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		float saldo;
		int opc = 0;
		float valor;
		System.out.println("Informe o saldo inicial:");
		saldo = input.nextFloat();
		System.out.print("\n\n");
		while(opc != 3)
		{
			System.out.printf("Saldo: %.2f\n",saldo);
			System.out.print("1-Deposito.\n");
			System.out.print("2-Retirada.\n");
			System.out.print("3-Sair.\n");
			opc = input.nextInt();
			switch(opc)
			{
			case 1:
				System.out.print("informe a quantia.\n");
				valor = input.nextFloat();
				saldo = saldo+valor;
				break;
			case 2:
				System.out.print("informe a quantia.\n");
				valor = input.nextFloat();
				saldo = saldo-valor;
				break;
			case 3:
				if(saldo < 0)
					System.out.println("Conta Estourada!\n");
				else
				{
					if(saldo == 0)
						System.out.println("Conta Zerada\n!");
					else
						System.out.println("Conta Preferencial!\n");
				}
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("opcao invalida!");
				break;
			}
		}
	}
}
