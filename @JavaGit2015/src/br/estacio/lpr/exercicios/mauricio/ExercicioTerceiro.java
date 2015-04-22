package br.estacio.lpr.exercicios.mauricio;

/*****************************************************************************
 * Exercicio 03 (c) Mauricio Mu�oz Lucero, 2015                              *
 * Elabore um novo programa para calcular a m�dia do Problema 2, considerando*
 * apenas as duas maiores notas do aluno.                                    *
 *****************************************************************************/

import java.util.Scanner; // Entrada de teclado

public class ExercicioTerceiro {

    // Defini��o das constantes
    final String version = "$VER:Exemplo 03 v1.0";
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
    // Funciones

    /*************************************************************************
     * 'converte_nota' � uma fun��o que redondea um n�mero decimal a s� uma  * 
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
     * 'procuraMenorNotaAluno' � uma fun��o obtem o indice da menor nota do  * 
     * aluno.                                                                *
     * ENTRADAS:                                                             *
     *      aluno: Vari�vel com os dados do aluno (referencia)               *
     * SAIDAS:                                                               *
     *      Indice da menor nota do aluno (int)                              *
     *************************************************************************/
    static int procuraMenorNotaAluno (ClasseAluno aluno) { 
        float menor = aluno.notas[0];
        int indice = 0;
    
        for(int i = 0; i < NUM_NOTAS; i++)
            if (menor > aluno.notas[i]) {
                menor = aluno.notas[i];
                indice = i;
            }
    
        return indice;
    }
    
    /*************************************************************************
     * 'calculaMediaAluno' � um procedimento que calcula a media das notas   *
     * de um aluno.                                                          *
     * ENTRADAS:                                                             *
     *      aluno: Vari�vel com os dados do aluno (referencia)               *
     *************************************************************************/
    static void calculaMediaAluno (ClasseAluno aluno) {
        int indice = procuraMenorNotaAluno(aluno);
    
        switch (indice) {
            case 0:
                aluno.media = aluno.notas [1] + aluno.notas [2];
                break;
            case 1:
                aluno.media = aluno.notas [0] + aluno.notas [2];
                break;
            case 2:
                aluno.media = aluno.notas [0] + aluno.notas [1];
                break;
            default:
                aluno.media = (float) 0.0;
                break;
        }
    
        // Generamos a media
        aluno.media = converteNota((float) aluno.media / (float) 2.0);
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
    public ExercicioTerceiro () {
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

    public static void main(String[] args) {
        ExercicioTerceiro exemplo = new ExercicioTerceiro();
    }
}
