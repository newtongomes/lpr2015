package br.estacio.lpr.aluno.mauricio;

/*****************************************************************************
 * Exercicio Chuva Para M�s (c) Mauricio Mu�oz Lucero, 2015
 * Precisamos armazenar a precipita��o de chuva di�ria para um determinado
 * m�s do ano, respeitando a quantidade de dias no m�s solicitado. Ao final 
 * mostrar a precipita��o de chuva m�dia do m�s e o dia que ocorreu a maior
 * chuva.
 *****************************************************************************/

import java.util.Scanner; 	// Entrada de teclado
import java.util.Random;    // Random(), nextInt(), setSeed()

public class ChuvaParaMes {

    // Defini��o das constantes
    final String version = "$VER:Exercicio Chuva para M�s v1.0";

    static final int MESES_ANO = 12;
    static final float MAX_PLUVIOSIDADE = (float) 200.0;    // M�xima pluviosidade di�ria

    // Para simular o tipo tupla do C++
    static class ClasseResultado {
        int indice;
        float valor; 
        
        // Constructor da classe por omiss�o
        private ClasseResultado(int indice, float valor) {
            this.indice = indice;
            this.valor = (float) valor;
        }
    }
    
    static class ClasseDadosMes {
        String nome;
        int num_dias;       // N�mero de dias do m�s

        // Construtor da classe por omiss�o
        public ClasseDadosMes() {
            nome = "";
            num_dias = 0;
        }

        // Construtor da classe com par�metros
        private ClasseDadosMes(String nome, int num_dias) {
            this.nome = nome;
            this.num_dias = num_dias;
        }
    };
    
    static final ClasseDadosMes[] MESES = { new ClasseDadosMes("Janeiro", 31), 
                                            new ClasseDadosMes("Fevereiro", 28),
                                            new ClasseDadosMes("Mar�o", 31),
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
    // Vari�veis globais
    static float[] precipitacaoMensual;
    static Scanner teclado;
	static int mesParaUsar;
	
    // ----------------------------------------------------------------------------
    // Fun��es
    
    /**************************************************************************
	 * 'perguntaMesParaUsar'                                                  *
     **************************************************************************/
	static int perguntaMesParaUsar(boolean usaTexto) {
		boolean mesCorreito = false;
		String nomeMes = "";
		int numMes = 0;
		do {
            System.out.print("Forne�a m�s a usar ");
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
     * 'formateaNumero' � uma fun��o que redondea um n�mero decimal a s� uma 
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
     * 'procurarMaximo' � uma fun��o que procura o maior elemento de um vetor.
     * ENTRADA:
     *     vetor: Vetor para buscar.
     *     valor_minimo: o valor minimo que podemos encontrar
     *     elementos: N�mero de elementos do vetor.
     * SAIDA:
     *     maximo: Valor m�ximo do vetor.
     *     indice: Indice do vetor em que est� esse valor.
     **************************************************************************/
    static ClasseResultado procurarMaximo (float vetor [], float valor_minimo, int elementos) {
        float maximo = valor_minimo;
        int indice = 0;
        
        // Obtemos o m�ximo
        for(int i = 0; i < elementos; i++)
            if (maximo < vetor[i]) {
                maximo = vetor[i];
                indice = i;
            }
    
        return new ClasseResultado(indice, maximo);
    }
    
    /**************************************************************************
     * 'calcularMedia' � uma fun��o que calcula a m�dia dos elementos de um 
     * vetor.
     * ENTRADA:
     *      vetor: Vetor para calcular a m�dia.
     *      elementos: N�mero de elementos do vetor.
     * SAIDA:
     *      M�dia do vetor.
     **************************************************************************/
    static float calcularMedia (float vetor[], int elementos) {
        float resultado = (float) 0.0;
    
        // Acumulamos todos os elementos
        for(int i = 0; i < elementos; i++)
            resultado += vetor[i];
        
        // Calculamos a m�dia
        return formateaNumero((float) (resultado / elementos));
    }
    
    /**************************************************************************
     * 'armazenaDadosPrecipitacaoMensual' � um procedimento que armazena os dados da 
     * precipita��o di�ria.
     * ENTRADA:
     *      aleatorio: Usamos valores rand�micos ou pedimos ao usuario.
     **************************************************************************/
    static void armazenaDadosPrecipitacaoMensual(boolean aleatorio) {
        if (aleatorio) {
            // Inicializamos o gerador de n�meros rand�micos
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());

            // Carrega vetor de precipita��es
            for(int i = 0; i < MESES[mesParaUsar].num_dias; i++) {
                // Geramos as precipita��es
                System.out.printf("Forne�a a precipita��o do dia %d: ", i + 1);
                precipitacaoMensual[i] = formateaNumero((float) MAX_PLUVIOSIDADE 
                                                                * random.nextFloat());
                System.out.printf("%4.1f%n", precipitacaoMensual[i]);
            }
        } else
            // Carrega vetor de precipita��es
            for(int i = 0; i < MESES[mesParaUsar].num_dias; i++) {
                do {
                    System.out.printf("Forne�a a precipita��o do dia %d: ", i + 1);
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
        // Criamos as vari�veis para a entrada
        teclado = new Scanner(System.in);

        ClasseResultado diaCandidato;

        // Obtemos o m�s
		mesParaUsar = perguntaMesParaUsar(false);

        precipitacaoMensual = new float [MESES[mesParaUsar].num_dias];

        // Geramos a precipita��o
        armazenaDadosPrecipitacaoMensual(true);

        // Mostramos a m�dia do m�s
        System.out.printf("A precipita��o m�dia durante o m�s de " + 
                            MESES[mesParaUsar].nome + " foi %4.1f mm.%n",
                            formateaNumero((float) calcularMedia(precipitacaoMensual,
                                                                    MESES[mesParaUsar].num_dias)));
       
        // Procuramos o dia de maior precipita��o do m�s
        diaCandidato = procurarMaximo (precipitacaoMensual, (float) 0.0,
                                        MESES[mesParaUsar].num_dias);
        System.out.printf("O dia de maior precipita��o do m�s foi o %d" +
                            ", com uma pluviosidade de %3.1f mm.%n%n", 
                            diaCandidato.indice + 1, diaCandidato.valor);
        
        // Fechamos o teclado para que eclipse n�o proteste (Warning)
        teclado.close();
    }

    public static void main(String[] args) {
    	// Instanciamos um objeto an�nimo
    	new ChuvaParaMes();
    }
}
