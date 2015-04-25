package br.estacio.lpr.aluno.mauricio;

/*****************************************************************************
 * Exercicio Votacao Turma (c) Mauricio Mu�oz Lucero, 2015                   *
 * Elabore um programa para receber os nomes dos 5 candidatos a l�der de     *
 * turma, em seguida receber os votos dos alunos existentes na sala, e ao    *
 * final mostrar o total de votos de cada candidato e ainda o candidato      *
 * vencedor da elei��o.                                                      *
 *****************************************************************************/

import java.util.Random;    // Random(), nextInt(), setSeed()

public class VotacaoTurma {

    // Defini��o das constantes
    final String version = "$VER:Vota��o Turma v1.0";

    public VotacaoTurma () {
        // Defini��o das constantes
        final int NUM_ALUNOS = 30, NUM_CANDIDATOS = 5;
        
        // Declara��o das vari�veis
        int[] votacion;
        int votosVencedor, candidatoVencedor, contadorVencedores;
        Random random;

        // Pedimos memoria para as vari�veis
        votacion = new int[NUM_CANDIDATOS];
        random = new Random();
        
        // Inicializamos o gerador de n�meros rand�micos
        random.setSeed(System.currentTimeMillis());
    
        do {
            // Inicializa as vari�veis relacionadas com a vota��o
            votosVencedor = 0;
            contadorVencedores = 0;
            candidatoVencedor = 0;
            for (int i=0; i < NUM_CANDIDATOS; i++)
                votacion [i] = 0;
        
            // Geramos a vota��o
            System.out.println("Gerando as vota��es...");
            for(int i = 0; i < NUM_ALUNOS; i++)
                votacion [random.nextInt(NUM_CANDIDATOS)] += 1;
        
            // Mostrar os votos de cada candidato
            for (int i=0; i < NUM_CANDIDATOS; i++)
                System.out.printf("Votos do candidato %d: %d.%n", i + 1, votacion [i]);
        
            System.out.println();

            // Obtemos o candidato mais votado
            for(int i = 0; i < NUM_CANDIDATOS; i++)
                if (votosVencedor < votacion[i]) {
                    votosVencedor = votacion[i];
                    candidatoVencedor = i;
                }
        
            // Mas testamos se temos s� um vencedor
            contadorVencedores = 0;
            for(int i = 0; i < NUM_CANDIDATOS; i++)
                if (votosVencedor == votacion[i])
                    contadorVencedores += 1;
                
            if (contadorVencedores > 1)
                System.out.printf("Temos mais de um vencedor, repetimos a vota��o.%n%n");
        } while (contadorVencedores != 1);
        
        System.out.printf("O vencedor foi o candidato %d.%n", candidatoVencedor + 1);
    }

    public static void main(String[] args) {
    	// Instanciamos um objeto an�nimo
        new VotacaoTurma();
    }
}
