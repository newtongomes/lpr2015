package br.estacio.lpr.aluno.mauricio;

/*****************************************************************************
 * Exercicio M�dia Turma (c) Mauricio Mu�oz Lucero, 2015                     *
 * Elabore um programa para receber as 2 notas de uma turma de 30 alunos, a  *
 * para cada aluno mostrar sua m�dia calculada. Ao final mostrar a maior     *
 * m�dia e a menor m�dia da turma, bem com a m�dia geral da turma.           *
 *****************************************************************************/

import java.util.Scanner; 	// Entrada de teclado
import java.util.Random;    // Random(), nextInt(), setSeed()

public class MediaTurma {

    // Defini��o das constantes
    final String version = "$VER:M�dia Turma v1.0";
    static final int NUM_NOTAS = 2;
    static final int NUM_ALUNOS = 30;

    // Vari�vel global � clase
    static Scanner teclado;
    
    // Defini��o da classe Aluno
    class ClasseAluno {
        float[] notas;
        float media;

        // Construtor da classe
        public ClasseAluno() {
            // Inicializamos os atributos
            media = (float) 0.0;
            notas = new float[NUM_NOTAS];
            for(int i=0; i < NUM_NOTAS; i++)
                notas[i] = (float) 0.0;
        }
    };

    // Defini��o da classe Media
    class ClasseMedia {
        float maior, menor, global;
    };

    // ----------------------------------------------------------------------------
    // Funciones

    /**************************************************************************
     * 'converteNota' � uma fun��o que redondea um n�mero decimal a s� uma    *
     * cifra depois da virgula.                                               *
     * ENTRADAS:                                                              *
     *      nota_tmp: Nota a converter (float)                                *
     * SAIDAS:                                                                *
     *      Nota convertida (float)                                           *
     **************************************************************************/
    static float convierteNota (float notaTmp) {
        // Redondea um n�mero decimal a s� uma cifra depois da virgula
        return (float) (Math.floor(notaTmp * 10 + 0.5) / 10.0);
    }
    
    /*************************************************************************
     * 'geraNotasTurma' � um procedimento que gera as notas e m�dia de cada  *
     * aluno.                                                                *
     * ENTRADAS:                                                             *
     *      turma: Vetor com os dados do aluno a modificar                   *
     *      aleatorio: Pedir ao usuario ou gerar rand�micamente as notas     *
     *************************************************************************/
    static void geraNotasTurma (ClasseAluno[] turma, boolean aleatorio) {
        if (aleatorio) {
            // Inicializamos o gerador de n�meros rand�micos
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());

            // Carrega vetor de alunos
            for(int i = 0; i < NUM_ALUNOS; i++) {
                System.out.printf("Forne�a as notas do aluno %d%n", i + 1);
    
                // Geramos as notas
                for(int j = 0; j < NUM_NOTAS; j++) {
                    turma[i].notas[j] = convierteNota((float) 10.0 * random.nextFloat());
                    System.out.printf("Nota %d: %3.1f%n", j + 1, turma[i].notas[j]);
                }

                // Gera e mostra m�dia
                turma[i].media = convierteNota((turma[i].notas[0] + turma[i].notas[1]) / (float) 2.0);
                System.out.printf("M�dia: %3.1f %n%n", turma[i].media);
            }
        } else
            // Carrega vetor de notas
            for(int i = 0; i < NUM_ALUNOS; i++) {
                System.out.printf("Forne�a as notas do aluno %d%n", i + 1);
    
                // Pedimos notas
                for(int j = 0; j < NUM_NOTAS; j++)
                    do {
                        System.out.printf("Nota %d: ", j + 1);
                        turma[i].notas[j] = teclado.nextFloat();
                        System.out.println();
                    } while ((turma[i].notas[j] < 0.0) || (turma[i].notas[j] > 10.0));
    
                // Gera e mostra m�dia
                turma[i].media = convierteNota((turma[i].notas[0] + turma[i].notas[1]) / (float) 2.0);
                System.out.printf("M�dia: %3.1f %n%n", turma[i].media);
            }
    }
    
    /**************************************************************************
     * 'obtemMedias' � um procedimento que gera as m�dias maior, menor e da   *
     * turma.                                                                 *
     * ENTRADAS:                                                              *
     *      turma: Vetor com os dados do aluno a modificar                    *
     *      media: Estrutura com as m�dias a calcular (referencia)            *
     **************************************************************************/
    static void obtemMedias(ClasseAluno[] turma, ClasseMedia medias) {
        System.out.println("Procurando m�dia global, maior e menor...");
    
        // Iniciali�a estrutura
        medias.maior = turma[0].media;
        medias.menor = turma[0].media;
        medias.global = (float) 0.0;
    
        // Obtemos maior e minor
        for(int i = 0; i < NUM_ALUNOS; i++) {
            if (medias.menor > turma[i].media)
                medias.menor = turma[i].media;
    
            if (medias.maior < turma[i].media)
                medias.maior = turma[i].media;
    
            // Acumulamos m�dias
            medias.global += turma[i].media;
        }
    
        // Calculamos m�dia global
        medias.global = convierteNota((float) medias.global / NUM_ALUNOS);
    }
    
    /**************************************************************************
     * 'mostrarMedias' � um procedimento que mostra as m�dias maior, menor e  *
     * da turma.                                                              *
     * ENTRADAS:                                                              *
     *      media: Estrutura com as m�dias a calcular (referencia)            *
     **************************************************************************/
    static void mostrarMedias (ClasseMedia medias) {
        System.out.printf("A maior m�dia da turma �: %3.1f%n", medias.maior);
        System.out.printf("A menor m�dia da turma �: %3.1f%n", medias.menor);
        System.out.printf("A m�dia da turma �: %3.1f%n%n", medias.global);
    }

    // ----------------------------------------------------------------------------
    // Programa principal
    public MediaTurma () {
        // Criamos as vari�veis para a entrada e para o aluno
        teclado = new Scanner(System.in);
        
        ClasseMedia medias = new ClasseMedia();
        ClasseAluno[] turma = new ClasseAluno [NUM_ALUNOS];
        for(int i = 0; i < NUM_ALUNOS; i++)
            turma[i] = new ClasseAluno();
        
        geraNotasTurma (turma, true);
        obtemMedias(turma, medias);
        mostrarMedias(medias);

        // Fechamos o teclado para que eclipse n�o proteste (Warning)
        teclado.close();
    }

    public static void main(String[] args) {
    	// Instanciamos um objeto an�nimo
        new MediaTurma();
    }
}
