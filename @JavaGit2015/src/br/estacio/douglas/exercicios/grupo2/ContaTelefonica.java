package br.estacio.douglas.exercicios.grupo2;

public class ContaTelefonica 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) {
		// Programa que calcula o valor de uma conta telefonica.
		
		final float assinatura = 17.90f;
		final float impulso = 0.04f;
		final float chamCelInt = 0.20f;
		final int impulsosPlano = 90;
		
		int impulsosUsados = 254;
		int chamIntrurbanas = 34;
		int chamCel = 23;
		
		float totalGeral = assinatura+((impulsosUsados-impulsosPlano)*impulso)+
				(chamCel*chamCelInt)+(chamIntrurbanas*chamCelInt);
		
		System.out.println("Custos da Conta:");
		System.out.printf("Assinatura: R$ %.2f\n",assinatura);
		
		System.out.printf("Impulsos do plano: %d\n",impulsosPlano);
		System.out.printf("Impulsos excedentes: %d - %d = %d x %.2f. total = R$ %.2f\n",
		impulsosUsados,impulsosPlano,impulsosUsados-impulsosPlano,impulso,(impulsosUsados-impulsosPlano)*impulso);
		System.out.printf("Chamadas interurbanas: %d x %.2f. total = R$ %.2f\n",
		chamIntrurbanas,chamCelInt,(chamIntrurbanas*chamCelInt));
		System.out.printf("Chamadas para celular: %d x %.2f. total = R$ %.2f\n",
		chamCel,chamCelInt,chamCel*chamCelInt);
		System.out.printf("Total Geral da conta R$ %.2f", totalGeral);
		
	}

}
