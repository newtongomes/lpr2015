package br.estacio.lpr.aluno.mauricio;

/*****************************************************************************
 * Exercicio Professor Profissão (c) Mauricio Muñoz Lucero, 2015
 * Deseja-se ler o nome e o tempo de profissão de um grupo de 10 professores 
 * da faculdade, em seguida deve-se mostrar o tempo médio de profissão dos 
 * professores, e o nome do professor mais antigo da faculdade pelo tempo de
 * profissão.
 *****************************************************************************/

import java.util.Scanner;   // Entrada de teclado
import java.util.Random;    // Random(), nextInt(), setSeed()

public class ProfessorProfissao {
    // Definição das constantes
    final String version = "$VER:Professor Profissão v1.0";

    class DadosProfessor {
        String nome;
        int anosDeProfissao;
        
        // Construtor padrão
        public DadosProfessor () {
            nome = "";
            anosDeProfissao = 0;
        }
        
        public DadosProfessor (String nome, int anos) {
            this.nome = nome;
            this.anosDeProfissao = anos;
        }
    }
    
    // Constantes da classe
    static final int NUM_PROFESSORES = 10;
    static final int MAX_ANOS_PROFISSAO = 40;

    // Atributos da classe
    static Scanner teclado;
    static DadosProfessor[] professores;

    /**************************************************************************
     * Obtemos os dados dos professores
     **************************************************************************/
    static void obtemDadosProfessores(boolean aleatorio) {
        if (aleatorio) {
            // Inicializamos o gerador de números randómicos
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());
            
            // Carega o vetor de professores
            for(int i = 0; i < NUM_PROFESSORES; i++) {
                professores[i].nome = "Nome " + (i + 1);
                System.out.printf("Forneça o nome do professor %d: " +
                                    professores[i].nome + "%n", i + 1);
                professores[i].anosDeProfissao = random.nextInt(MAX_ANOS_PROFISSAO) + 1;
                System.out.printf("Forneça os anos trabalhando por esse professor: %d%n",
                                    professores[i].anosDeProfissao);
            }
        } else
            // Carega o vetor de professores
            for(int i = 0; i < NUM_PROFESSORES; i++) {
                System.out.printf("Forneça o nome do professor %d: ", i + 1);
                professores[i].nome = teclado.nextLine();

                do {
                    System.out.print("Forneça os anos trabalhando por esse professor: ");
                    professores[i].anosDeProfissao = teclado.nextInt();
                } while ((professores[i].anosDeProfissao <= 0) ||
                            (professores[i].anosDeProfissao >= MAX_ANOS_PROFISSAO));

                // Para pegar o salto de linha (Fixa nextInt/Float() + nextLine()
                teclado.nextLine();
            }
        System.out.println();
    }
        
    /**************************************************************************
     * Obtemos a média de os elementos de um vetor
     **************************************************************************/
    static float calculaMedia(DadosProfessor[] vetor, int numElementos) {
        float media = 0.0f;
        
        for(int i = 0; i < numElementos; i++)
            media += (float) vetor[i].anosDeProfissao;
        
        return (float) (media / numElementos);
    }
                            
    /**************************************************************************
     * Procura o elemento máximo de um vetor
     **************************************************************************/
    static int procuraMaximo(DadosProfessor[] vetor, int numElementos) {
        int maximo = 0;
        
        // Procura o elemento máximo no vetor
        for(int i = 1; i < numElementos; i++)
            if (vetor [maximo].anosDeProfissao < vetor [i].anosDeProfissao)
                maximo = i;
            
        return maximo;
    }
    
    public ProfessorProfissao () {
    	// Inicializa atributos da classe
        teclado = new Scanner(System.in);
        professores = new DadosProfessor[NUM_PROFESSORES];
        for(int i = 0; i < NUM_PROFESSORES; i++)
        	professores[i] = new DadosProfessor();
        
        // Obtemos os dados dos professores
        obtemDadosProfessores(true);
        
        // Obtemos a média de tempo trabalhando dos professores
        System.out.printf("A média de tempo trabalhado pelos professores é %.1f.%n",
                            calculaMedia(professores, NUM_PROFESSORES));
                            
        // Obtemos o nome do professor mais antigo
        System.out.println("O professor mais antigo é " +
                            professores [procuraMaximo(professores, NUM_PROFESSORES)].nome +
                            ".");
        // Fechamos o teclado para que eclipse não proteste (Warning)
        teclado.close();
    }
    
    public static void main (String[] args) {
        // Instanciamos um objeto anônimo
        new ProfessorProfissao();
    }
}
