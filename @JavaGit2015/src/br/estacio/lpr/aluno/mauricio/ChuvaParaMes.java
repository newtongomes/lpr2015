package br.estacio.lpr.aluno.mauricio;

/*****************************************************************************
 * Exercicio Chuva Para Mês (c) Mauricio Muñoz Lucero, 2015
 * Precisamos armazenar a precipitação de chuva diária para um determinado
 * mês do ano, respeitando a quantidade de dias no mês solicitado. Ao final 
 * mostrar a precipitação de chuva média do mês e o dia que ocorreu a maior
 * chuva.
 *****************************************************************************/

import java.util.Scanner; 	// Entrada de teclado
import java.util.Random;    // Random(), nextInt(), setSeed()

public class ChuvaParaMes {

    // Definição das constantes
    final String version = "$VER:Exercicio Chuva para Mês v1.0";

    static final int MESES_ANO = 12;
    static final float MAX_PLUVIOSIDADE = (float) 200.0;    // Máxima pluviosidade diária

    // Para simular o tipo tupla do C++
    static class ClasseResultado {
        int indice;
        float valor; 
        
        // Constructor da classe por omissão
        private ClasseResultado(int indice, float valor) {
            this.indice = indice;
            this.valor = (float) valor;
        }
    }
    
    static class ClasseDadosMes {
        String nome;
        int num_dias;       // Número de dias do mês

        // Construtor da classe por omissão
        public ClasseDadosMes() {
            nome = "";
            num_dias = 0;
        }

        // Construtor da classe com parâmetros
        private ClasseDadosMes(String nome, int num_dias) {
            this.nome = nome;
            this.num_dias = num_dias;
        }
    };
    
    static final ClasseDadosMes[] MESES = { new ClasseDadosMes("Janeiro", 31), 
                                            new ClasseDadosMes("Fevereiro", 28),
                                            new ClasseDadosMes("Março", 31),
                                            new ClasseDadosMes("Abril", 30),
                                            new ClasseDadosMes("Maio", 31),
                                            new ClasseDadosMes("Junho", 30),
                                            new ClasseDadosMes("Julho", 31),
                                            new ClasseDadosMes("Agosto", 31),
                                            new ClasseDadosMes("Setembro", 30),
                                            new ClasseDadosMes("Outubro", 31),
                                            new ClasseDadosMes("Novembro", 30),
                                            new ClasseDadosMes("Dezembro", 31)};

    // ----------------------------------------------------------------------------
    // Variáveis globais
    static float[] precipitacaoMensual;
    static Scanner teclado;
	static int mesParaUsar;
	
    // ----------------------------------------------------------------------------
    // Funções
    
    /**************************************************************************
	 * 'perguntaMesParaUsar'                                                  *
     **************************************************************************/
	static int perguntaMesParaUsar(boolean usaTexto) {
		boolean mesCorreito = false;
		String nomeMes = "";
		int numMes = 0;
		do {
            System.out.print("Forneça mês a usar ");
            if (usaTexto) {
                System.out.print("(Janeiro, ...):");
                nomeMes = teclado.nextLine();
                for(int i = 0; i < MESES_ANO; i++)
                    if (nomeMes.equalsIgnoreCase(MESES[i].nome)) {
                        numMes = i;
                        mesCorreito = true;
                    }
            } else {
                System.out.print("(1-12):");
                numMes = teclado.nextInt();
                if ((numMes >=1) && (numMes <= 12)) {
                    numMes--;
                    mesCorreito = true;
                }
            }
		} while (!mesCorreito);
		
		return numMes;
	}
	
    /**************************************************************************
     * 'formateaNumero' é uma função que redondea um número decimal a só uma 
     * cifra depois da virgula.
     * ENTRADAS:
     *      Valor a converter (float)
     * SAIDAS:
     *      Valor convertido (float)
     **************************************************************************/
    static float formateaNumero (float numero) {
        return (float) (Math.floor(numero * 10 + 0.5) / 10.0);
    }
    
    /**************************************************************************
     * 'procurarMaximo' é uma função que procura o maior elemento de um vetor.
     * ENTRADA:
     *     vetor: Vetor para buscar.
     *     valor_minimo: o valor minimo que podemos encontrar
     *     elementos: Número de elementos do vetor.
     * SAIDA:
     *     maximo: Valor máximo do vetor.
     *     indice: Indice do vetor em que está esse valor.
     **************************************************************************/
    static ClasseResultado procurarMaximo (float vetor [], float valor_minimo, int elementos) {
        float maximo = valor_minimo;
        int indice = 0;
        
        // Obtemos o máximo
        for(int i = 0; i < elementos; i++)
            if (maximo < vetor[i]) {
                maximo = vetor[i];
                indice = i;
            }
    
        return new ClasseResultado(indice, maximo);
    }
    
    /**************************************************************************
     * 'calcularMedia' é uma função que calcula a média dos elementos de um 
     * vetor.
     * ENTRADA:
     *      vetor: Vetor para calcular a média.
     *      elementos: Número de elementos do vetor.
     * SAIDA:
     *      Média do vetor.
     **************************************************************************/
    static float calcularMedia (float vetor[], int elementos) {
        float resultado = (float) 0.0;
    
        // Acumulamos todos os elementos
        for(int i = 0; i < elementos; i++)
            resultado += vetor[i];
        
        // Calculamos a média
        return formateaNumero((float) (resultado / elementos));
    }
    
    /**************************************************************************
     * 'armazenaDadosPrecipitacaoMensual' é um procedimento que armazena os dados da 
     * precipitação diária.
     * ENTRADA:
     *      aleatorio: Usamos valores randómicos ou pedimos ao usuario.
     **************************************************************************/
    static void armazenaDadosPrecipitacaoMensual(boolean aleatorio) {
        if (aleatorio) {
            // Inicializamos o gerador de números randómicos
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());

            // Carrega vetor de precipitações
            for(int i = 0; i < MESES[mesParaUsar].num_dias; i++) {
                // Geramos as precipitações
                System.out.printf("Forneça a precipitação do dia %d: ", i + 1);
                precipitacaoMensual[i] = formateaNumero((float) MAX_PLUVIOSIDADE 
                                                                * random.nextFloat());
                System.out.printf("%4.1f%n", precipitacaoMensual[i]);
            }
        } else
            // Carrega vetor de precipitações
            for(int i = 0; i < MESES[mesParaUsar].num_dias; i++) {
                do {
                    System.out.printf("Forneça a precipitação do dia %d: ", i + 1);
                    precipitacaoMensual[i] = teclado.nextFloat();
                    System.out.println();
                    } while ((precipitacaoMensual[i] < (float) 0.0) ||
                                (precipitacaoMensual[i] > MAX_PLUVIOSIDADE));
            }
        System.out.println();
    }

    // ----------------------------------------------------------------------------
    // Programa principal
    public ChuvaParaMes () {
        // Criamos as variáveis para a entrada
        teclado = new Scanner(System.in);

        ClasseResultado diaCandidato;

        // Obtemos o mês
		mesParaUsar = perguntaMesParaUsar(false);

        precipitacaoMensual = new float [MESES[mesParaUsar].num_dias];

        // Geramos a precipitação
        armazenaDadosPrecipitacaoMensual(true);

        // Mostramos a média do mês
        System.out.printf("A precipitação média durante o mês de " + 
                            MESES[mesParaUsar].nome + " foi %4.1f mm.%n",
                            formateaNumero((float) calcularMedia(precipitacaoMensual,
                                                                    MESES[mesParaUsar].num_dias)));
       
        // Procuramos o dia de maior precipitação do mês
        diaCandidato = procurarMaximo (precipitacaoMensual, (float) 0.0,
                                        MESES[mesParaUsar].num_dias);
        System.out.printf("O dia de maior precipitação do mês foi o %d" +
                            ", com uma pluviosidade de %3.1f mm.%n%n", 
                            diaCandidato.indice + 1, diaCandidato.valor);
        
        // Fechamos o teclado para que eclipse não proteste (Warning)
        teclado.close();
    }

    public static void main(String[] args) {
    	// Instanciamos um objeto anônimo
    	new ChuvaParaMes();
    }
}
