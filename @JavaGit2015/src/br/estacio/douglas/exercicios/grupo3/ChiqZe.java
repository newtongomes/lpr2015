package br.estacio.douglas.exercicios.grupo3;

public class ChiqZe 
{
	/**
	 * @author Douglas santos
	 */
	public static void main(String[] args) 
	{
		int altChiquinho = 150; // altura em cm
		int altZezinho = 110;
		int crescChiq = 2;
		int crescZez = 3;
		int anos = 0;
		
		while(altChiquinho+1 > altZezinho)
		{
			anos++;
			altChiquinho += crescChiq;
			altZezinho += crescZez;
		}
		System.out.printf("Serao necessarios %d anos para que Zezinho se torne mais alto que Chiquinho.\n",anos);
		System.out.printf("Eles terao alturas de %d (Chiquinho) %d (Zezinho).",altChiquinho,altZezinho); 
		
	}
}
