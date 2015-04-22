package br.estacio.lpr.exercicios.mauricio;

/*****************************************************************************
 * Exercicio M�dia Tr�s Notas (c) Mauricio Mu�oz Lucero, 2015                              *
 * Elabore um programa para receber o nome e as 3 notas notas de um aluno, em*
 * seguida  calcular e mostrar a m�dia das notas do aluno com o respectivo   *
 * resultado de aprova��o.                                                   *
 * (Aprovado se m�dia >= 6)                                                  *
 *****************************************************************************/

import java.util.Scanner; 	// Entrada de teclado

public class MediaTresNotas {

    // Defini��o das constantes
    final String version = "$VER:M�dia Tr�s Notas v1.0";
    static final int NUM_NOTAS = 3;

    // Vari�vel global � clase
    static Scanner teclado;

    // Defini��o da classe Aluno
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
    // Fun��es

    /*************************************************************************
     * 'converteNota' � uma fun��o que redondea um n�mero decimal a s� uma   *
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
     * 'obtemDadosAluno' � um procedimento que obtem os dados de um aluno.   *
     * ENTRADAS:                                                             *
     *      aluno: Vari�vel com os dados do aluno a modificar (referencia)   *
     *************************************************************************/
    static void obtemDadosAluno (ClasseAluno aluno) {
        // Carrega o nome do aluno
        System.out.print("Entre seu nome: ");
        aluno.nome = teclado.nextLine();
    
        // Carrega vetor de notas
        System.out.println("Forne�a suas notas...");
        for(int i = 0; i < NUM_NOTAS; i++) 
            // Pedimos nota
            do {
                System.out.printf("Nota %d: ", i + 1);
                aluno.notas[i] = teclado.nextFloat();
                System.out.println();
            } while ((aluno.notas[i] < 0.0) || (aluno.notas[i] > 10.0));
    }

    /*************************************************************************
     * 'calculaMediaAluno' � um procedimento que calcula a media das notas de*
     * um aluno.                                                             *
     * ENTRADAS:                                                             *
     *      aluno: Vari�vel com os dados do aluno (referencia)               *
     *************************************************************************/
    static void calculaMediaAluno (ClasseAluno aluno) {
        // Generamos a m�dia
        for(int i = 0; i < NUM_NOTAS; i++)
            aluno.media += aluno.notas[i];
    
        aluno.media = converteNota((float) aluno.media / NUM_NOTAS);
    }

    /*************************************************************************
     * 'mostraDadosAlunos' � um procedimento que mostra os dados do aluno.   *
     * ENTRADAS:                                                             *
     *      aluno: Vari�vel com os dados do aluno (referencia)               *
     *************************************************************************/
    static void mostraDadosAluno (ClasseAluno aluno) {
        System.out.printf("O aluno " + aluno.nome + " tem m�dia de %3.1f e foi ",
                            aluno.media);
        if  (aluno.media >= 6.0) 
            System.out.println("aprovado.");
        else
            System.out.println("reprovado.");
    }

    // ----------------------------------------------------------------------------
    // Programa principal
    public MediaTresNotas () {
        // Criamos as vari�veis para a entrada e para o aluno
        ClasseAluno aluno = new ClasseAluno();
        teclado = new Scanner(System.in);
        
        // Obtemos os dados do aluno
        obtemDadosAluno(aluno);
    
        // Calcula m�dia das notas do aluno
        calculaMediaAluno(aluno);
    
        // Mostramos a saida
        mostraDadosAluno(aluno);

        // Fechamos o teclado para que eclipse n�o proteste (Warning)
        teclado.close();
    }

    public static void main (String[] args) {
    	// Instanciamos um objeto an�nimo
        new MediaTresNotas();
    }
}
