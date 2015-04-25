package br.estacio.lpr.aluno.douglas.exercicios.grupo2;

public class TempoLivre 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) 
	{
		// Programa que calcula o tempo livre de um aluno.
		
		int disciplinas = 6;
		int tempo = 100; // tempo em minutos.
		int tempoDisciplina = tempo/disciplinas;
		int tempoLivre = tempo%disciplinas;
		System.out.printf("Tempo disponivel para cada disciplina = %d min\n",tempoDisciplina);
		System.out.printf("Tempo livre %d min", tempoLivre);
	}

}
