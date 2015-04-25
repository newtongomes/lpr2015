package br.estacio.lpr.aluno.douglas.exercicios.grupo3;

public class Consorcio 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		int prestacoes = 48; // número total de prestações.
		int prestacoesPagas = 30; // prestações que já foram pagas.
		float valorPrestacao = 482.50f; // valor de cada prestação
		
		System.out.printf("Valor total pago - R$ %,.2f\n",prestacoesPagas*valorPrestacao);
		System.out.printf("Saldo Devedor - R$ %,.2f",(prestacoes-prestacoesPagas)*valorPrestacao);
	}
}
