package br.estacio.lpr.exercicios.grupo2;

public class OtimizacaoCorte 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args)
	{
		// Programa para otimizar os cortes de um marceneiro. 
		
		final int pedacos = 45; // tamanho em cm.
		final int tabua3m = 300;
		final int tabua4m = 400;
		final int tabua5m = 500;
		
		System.out.printf("Com a tabua de 3 metros podemos cortar %d pedacos e sobram %d cm de madeira.\n",
				tabua3m/pedacos,tabua3m%pedacos);
		System.out.printf("Com a tabua de 4 metros podemos cortar %d pedacos e sobram %d cm de madeira.\n",
				tabua4m/pedacos,tabua4m%pedacos);
		System.out.printf("Com a tabua de 5 metros podemos cortar %d pedacos e sobram %d cm de madeira.\n",
				tabua5m/pedacos,tabua5m%pedacos);

	}

}
