package br.estacio.lpr.exercicios.mauricio;

/*****************************************************************************
 * Exercicio Média Três Notas (c) Mauricio Muñoz Lucero, 2015                              *
 * Elabore um programa para receber o nome e as 3 notas notas de um aluno, em*
 * seguida  calcular e mostrar a média das notas do aluno com o respectivo   *
 * resultado de aprovação.                                                   *
 * (Aprovado se média >= 6)                                                  *
 *****************************************************************************/

import java.util.Scanner; 	// Entrada de teclado

public class MediaTresNotas {

    // Definição das constantes
    final String version = "$VER:Média Três Notas v1.0";
    static final int NUM_NOTAS = 3;

    // Variável global à clase
    static Scanner teclado;

    // Definição da classe Aluno
    class ClasseAluno {
        String nome;
        float[] notas;
        float media;

        // Construtor da classe
        public ClasseAluno() {
            // Inicializamos os atributos
            nome = "";
            media = (float) 0.0;
            notas = new float[NUM_NOTAS];
            for(int i=0; i < NUM_NOTAS; i++)
                notas[i] = (float) 0.0;
        }
    };

    // ----------------------------------------------------------------------------
    // Funções

    /*************************************************************************
     * 'converteNota' é uma função que redondea um número decimal a só uma   *
     * cifra depois da virgula.                                              *
     * ENTRADAS:                                                             *
     *      nota_tmp: Nota a converter (float)                               *
     * SAIDAS:                                                               * 
     *      Nota convertida (float)                                          *
     *************************************************************************/
    static float converteNota (float notaTmp) {
        return (float) (Math.floor(notaTmp * 10 + 0.5) / 10.0);
    }

    /*************************************************************************
     * 'obtemDadosAluno' é um procedimento que obtem os dados de um aluno.   *
     * ENTRADAS:                                                             *
     *      aluno: Variável com os dados do aluno a modificar (referencia)   *
     *************************************************************************/
    static void obtemDadosAluno (ClasseAluno aluno) {
        // Carrega o nome do aluno
        System.out.print("Entre seu nome: ");
        aluno.nome = teclado.nextLine();
    
        // Carrega vetor de notas
        System.out.println("Forneça suas notas...");
        for(int i = 0; i < NUM_NOTAS; i++) 
            // Pedimos nota
            do {
                System.out.printf("Nota %d: ", i + 1);
                aluno.notas[i] = teclado.nextFloat();
                System.out.println();
            } while ((aluno.notas[i] < 0.0) || (aluno.notas[i] > 10.0));
    }

    /*************************************************************************
     * 'calculaMediaAluno' é um procedimento que calcula a media das notas de*
     * um aluno.                                                             *
     * ENTRADAS:                                                             *
     *      aluno: Variável com os dados do aluno (referencia)               *
     *************************************************************************/
    static void calculaMediaAluno (ClasseAluno aluno) {
        // Generamos a média
        for(int i = 0; i < NUM_NOTAS; i++)
            aluno.media += aluno.notas[i];
    
        aluno.media = converteNota((float) aluno.media / NUM_NOTAS);
    }

    /*************************************************************************
     * 'mostraDadosAlunos' é um procedimento que mostra os dados do aluno.   *
     * ENTRADAS:                                                             *
     *      aluno: Variável com os dados do aluno (referencia)               *
     *************************************************************************/
    static void mostraDadosAluno (ClasseAluno aluno) {
        System.out.printf("O aluno " + aluno.nome + " tem média de %3.1f e foi ",
                            aluno.media);
        if  (aluno.media >= 6.0) 
            System.out.println("aprovado.");
        else
            System.out.println("reprovado.");
    }

    // ----------------------------------------------------------------------------
    // Programa principal
    public MediaTresNotas () {
        // Criamos as variáveis para a entrada e para o aluno
        ClasseAluno aluno = new ClasseAluno();
        teclado = new Scanner(System.in);
        
        // Obtemos os dados do aluno
        obtemDadosAluno(aluno);
    
        // Calcula média das notas do aluno
        calculaMediaAluno(aluno);
    
        // Mostramos a saida
        mostraDadosAluno(aluno);

        // Fechamos o teclado para que eclipse não proteste (Warning)
        teclado.close();
    }

    public static void main (String[] args) {
    	// Instanciamos um objeto anônimo
        new MediaTresNotas();
    }
}
