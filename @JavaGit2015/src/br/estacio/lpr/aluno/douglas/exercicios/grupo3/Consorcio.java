package br.estacio.lpr.aluno.douglas.exercicios.grupo3;

public class Consorcio 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		int prestacoes = 48; // n�mero total de presta��es.
		int prestacoesPagas = 30; // presta��es que j� foram pagas.
		float valorPrestacao = 482.50f; // valor de cada presta��o
		
		System.out.printf("Valor total pago - R$ %,.2f\n",prestacoesPagas*valorPrestacao);
		System.out.printf("Saldo Devedor - R$ %,.2f",(prestacoes-prestacoesPagas)*valorPrestacao);
	}
}
