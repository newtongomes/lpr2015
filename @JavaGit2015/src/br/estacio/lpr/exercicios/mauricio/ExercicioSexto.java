package br.estacio.lpr.exercicios.mauricio;

/*****************************************************************************
 * Exercicio 06 (c) Mauricio Muñoz Lucero, 2015                              *
 * Temos a precipitação diária durante o ano de 2013 no Estado do Ceará, e   *
 * pretende-se armazenar todos os dados em um programa para gerar as         *
 * seguintes estatísticas sobre os dados armazenados.                        *
 * - total de precipitação para cada mês do ano                              *
 * - dia de maior e menor precipitação no ano                                *
 * - mês de maior e menor precipitação no ano                                *
 * - média de precipitação do ano                                            *
 * - média da precipitação de cada mês do ano                                *
 * - Os 10 Dias de maior precipitação no ano                                 *
 *****************************************************************************/

import java.util.Scanner; // Entrada de teclado
import java.util.Random; // Random(), nextInt()

public class ExercicioSexto {

    // Definição das constantes
    final String version = "$VER:Exemplo 06 v1.0";

    static final int MESES_ANO = 12;
    static final int DIAS_ANO = 365;                        // 2013 foi não bissexto
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
        int dia_comeco;     // Dia de começo de mês com respeito a 1 de janeiro

        // Construtor da classe por omissão
        public ClasseDadosMes() {
            nome = "";
            num_dias = 0;
            dia_comeco = 0;
        }

        // Construtor da classe com parâmetros
        private ClasseDadosMes(String nome, int num_dias, int dia_comeco) {
            this.nome = nome;
            this.num_dias = num_dias;
            this.dia_comeco = dia_comeco;
        }
    };
    
    static final ClasseDadosMes[] MESES = { new ClasseDadosMes("Janeiro", 31, 0), 
                                            new ClasseDadosMes("Fevereiro", 28, 31),
                                            new ClasseDadosMes("Março", 31, 59),
                                            new ClasseDadosMes("Abril", 30, 90),
                                            new ClasseDadosMes("Maio", 31, 120),
                                            new ClasseDadosMes("Junho", 30, 151),
                                            new ClasseDadosMes("Julho", 31, 181),
                                            new ClasseDadosMes("Agosto", 31, 212),
                                            new ClasseDadosMes("Setembro", 30, 243),
                                            new ClasseDadosMes("Outubro", 31, 273),
                                            new ClasseDadosMes("Novembro", 30, 304),
                                            new ClasseDadosMes("Dezembro", 31, 334)};

    // ----------------------------------------------------------------------------
    // Variáveis globais
    static float[] precipitacaoDiaria2013;
    static float[] precipitacaoMensual2013;
    static Scanner teclado;
    static ClasseDadosMes dados_meses;

    // ----------------------------------------------------------------------------
    // Funções
    
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
     * 'dameDiaDoMes' é uma função que recebe um dia do ano e devolve um dia de
     * de mês.
     * ENTRADA:
     *      Dia do ano.
     * SAIDA:
     *      Dia do mês.
     **************************************************************************/
    static int dameDiaDoMes (int dia) {
        int dia_do_mes = 0;
        int contador = 0;
        
        // Buscamos seqüencialmente por o primeiro mês que começa depois de nossa data
        for(int i = 0; i < MESES_ANO; i++) {
            if ((MESES[contador].dia_comeco < dia))
                contador++;
        }

        if (contador == MESES_ANO) { // Dezembro
            contador--;
            if (MESES[contador].dia_comeco == dia)
                dia_do_mes = 1;
            else
                dia_do_mes = dia - MESES[contador].dia_comeco + 1;
            
        } else // O resto de meses
            if (MESES[contador].dia_comeco == dia)
                dia_do_mes = 1;
            else
                dia_do_mes = dia - MESES[contador - 1].dia_comeco + 1;
    
        return dia_do_mes;
    }
    
    /**************************************************************************
     * 'dameMesDoAno' é uma função que recebe um dia do ano e devolve o mês em 
     * que esse dia fica.
     * ENTRADA:
     *      Dia do ano.
     * SAIDA:
     *      Mês.
     **************************************************************************/
    static String dameMesDoAno (int dia) {
        int contador = 0;

        // Buscamos seqüencialmente por o primeiro mês que começa depois de nossa data
        for(int i = 0; i < MESES_ANO; i++)
            if ((MESES[i].dia_comeco < dia))
                contador++;

        if (contador == MESES_ANO) // Dezembro
            contador--;
        else // O resto de meses
            if (MESES[contador].dia_comeco != dia)
                contador--;

        return MESES[contador].nome;
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
     * 'procurarMinimo' é uma função que procura o menor elemento de um vetor.
     * ENTRADA:
     *      vetor: Vetor para buscar.
     *      valor_maximo: o valor máximo que podemos encontrar
     *      elementos: Número de elementos do vetor.
     * SAIDA:
     *      minimo: Valor minimo do vetor.
     *      indice: Indice do vetor em que está esse valor.
     **************************************************************************/
    static ClasseResultado procurarMinimo (float vetor [], float valor_maximo, int elementos) {
        float minimo = valor_maximo;
        int indice = 0;
    
        // Obtemos o minimo
        for(int i = 0; i < elementos; i++)
            if (minimo > vetor[i]) {
                minimo = vetor[i];
                indice = i;
            }
        
        return new ClasseResultado(indice, minimo);
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
     * 'armazenadadosPrecipitacao' é um procedimento que armazena os dados da 
     * precipitação diária.
     * ENTRADA:
     *      aleatorio: Usamos valores randómicos ou pedimos ao usuario.
     **************************************************************************/
    static void armazenaDadosPrecipitacao(boolean aleatorio) {
        if (aleatorio) {
            // Inicializamos o gerador de números randómicos
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());

            // Carrega vetor de precipitações
            for(int i = 0; i < DIAS_ANO; i++) {
                // Geramos as precipitações
                System.out.printf("Forneça a precipitação do dia %d: ", i + 1);
                precipitacaoDiaria2013[i] = formateaNumero((float) MAX_PLUVIOSIDADE 
                                                                * random.nextFloat());
                System.out.printf("%4.1f%n", precipitacaoDiaria2013 [i]);
            }
        } else
            // Carrega vetor de precipitações
            for(int i = 0; i < DIAS_ANO; i++) {
                do {
                    System.out.printf("Forneça a precipitação do dia %d: ", i + 1);
                    precipitacaoDiaria2013[i] = teclado.nextFloat();
                    System.out.println();
                    } while ((precipitacaoDiaria2013[i] < (float) 0.0) ||
                                (precipitacaoDiaria2013[i] > (float) 100.0));
            }
        System.out.println();
    }
    
    /**************************************************************************
     * 'calculaPrecipitacaoMensual' é um procedimento que calcula o total de 
     * precipitação para cada mês do ano.
     **************************************************************************/
    static void calculaPrecipitacaoMensual () {
        for(int i = 0; i < MESES_ANO; i++) {
            float pluviosidade = (float) 0.0;
            for(int j = MESES[i].dia_comeco; j < MESES[i].dia_comeco + MESES[i].num_dias; j++)
                pluviosidade += precipitacaoDiaria2013[j];
            precipitacaoMensual2013 [i] = pluviosidade;
        }
    }
        
    /**************************************************************************
     * 'mostrarPrecipitacaoPorMes' é um procedimento que mostra as precipitações
     * de todos os meses do ano.
     **************************************************************************/
    static void mostrarPrecipitacaoPorMes () {
        for(int i = 0; i < MESES_ANO; i++)
            System.out.printf("A precipitação para o mês de " + 
                                MESES[i].nome + " é %4.1f mm.%n",
                                precipitacaoMensual2013 [i]);
        System.out.println();
    }
    
    /**************************************************************************
     * 'mostrarDiaMaiorPrecipitacaoDoAno' é um procedimento que obtém o dia de
     * maior precipitação no ano.
     **************************************************************************/
    static void mostrarDiaMaiorPrecipitacaoDoAno () {
        ClasseResultado diaCandidato = procurarMaximo (precipitacaoDiaria2013,
                                                (float) 0.0, DIAS_ANO);
        System.out.printf("O dia de maior precipitação do ano foi o %d de " +  
                            dameMesDoAno (diaCandidato.indice) +
                            ", com uma pluviosidade de %3.1f mm.%n%n", 
                            dameDiaDoMes (diaCandidato.indice),
                            diaCandidato.valor);
    }
    
    /**************************************************************************
     * 'mostrarDiaMenorPrecipitacaoDoAno' é um procedimento que obtém o dia de
     * menor precipitação no ano.
     **************************************************************************/
    static void mostrarDiaMenorPrecipitacaoDoAno () {
        ClasseResultado diaCandidato = procurarMinimo (precipitacaoDiaria2013, 
                                                MAX_PLUVIOSIDADE, DIAS_ANO);
    
        System.out.printf("O dia de menor precipitação do ano foi o %d de " +  
                            dameMesDoAno (diaCandidato.indice) +
                            ", com uma pluviosidade de %3.1f mm.%n%n", 
                            dameDiaDoMes (diaCandidato.indice),
                            diaCandidato.valor);
    }
    
    /**************************************************************************
     * 'mostrarMesMaiorPrecipitacaoDoAno' é um procedimento que obtém o mês de
     * maior precipitação no ano.
     **************************************************************************/
    static void mostrarMesMaiorPrecipitacaoDoAno () {
        ClasseResultado mesCandidato = procurarMaximo (precipitacaoMensual2013,
                                                (float) 0.0, MESES_ANO);
    
        System.out.printf("O mês de maior precipitação do ano foi o " +  
                            MESES[mesCandidato.indice].nome +
                            ", com uma pluviosidade de %3.1f mm.%n%n", 
                            mesCandidato.valor);
    }
    
    /**************************************************************************
     * 'mostrarMesMenorPrecipitacaoDoAno' é um procedimento que obtém o mês de
     * menor precipitação no ano.
     **************************************************************************/
    static void mostrarMesMenorPrecipitacaoDoAno () {
        ClasseResultado mesCandidato = procurarMinimo (precipitacaoMensual2013,
                                                MAX_PLUVIOSIDADE * 31, MESES_ANO);
    
        System.out.printf("O mês de menor precipitação do ano foi o " +  
                            MESES[mesCandidato.indice].nome +
                            ", com uma pluviosidade de %3.1f mm.%n%n", 
                            mesCandidato.valor);
    }
    
    /**************************************************************************
     * 'mostrarMediaPrecipitacaoAnual' é um procedimento que mostra a média de
     * precipitação do ano.
     **************************************************************************/
    static void mostrarMediaPrecipitacaoAnual () {
        System.out.printf("A média de precipitação diaria anual foi %3.1f mm.%n%n", 
                            calcularMedia(precipitacaoDiaria2013, DIAS_ANO));
    }
    
    /**************************************************************************
     * 'mostrarMediaPrecipitacaoMensual' é um procedimento que mostra a média de
     * precipitação de cada mês do ano.
     **************************************************************************/
    static void mostrarMediaPrecipitacaoMensual () {
        for(int i = 0; i < MESES_ANO; i++)
            System.out.printf("A média de precipitação para " +
                                MESES[i].nome + " foi %3.1f mm.%n",
                                formateaNumero((float) (precipitacaoMensual2013[i] /
                                                            MESES[i].num_dias)));
        System.out.println();
    }
    
    /**************************************************************************
     * 'mostrarNumDiasMaiorPrecipitacao' é um procedimento que mostra os X dias
     * dias de maior precipitação do ano.
     **************************************************************************/
    static void mostrarNumDiasDeMaiorPrecipitacao (int numDias) {
        float[] copiaPrecipitacaoDiaria = new float [DIAS_ANO];
    
        // Copiamos o vetor das precipitações de 2013
        for(int i = 0; i < DIAS_ANO; i++)
            copiaPrecipitacaoDiaria [i] = precipitacaoDiaria2013 [i];
        
        // Usando a copia vamos a procurar os 10 dias de mais pluviosidade
        for(int i = 0; i < numDias; i++) {
            // Procuramos
            ClasseResultado diaCandidato = procurarMaximo (copiaPrecipitacaoDiaria,
                                                (float) 0.0, DIAS_ANO);
            // Mostramos
            System.out.printf("O dia %d de maior precipitação do ano foi o %d de " +
                                dameMesDoAno (diaCandidato.indice) + 
                                ", com uma pluviosidade de %3.1f mm.%n%n", 
                                i + 1,
                                dameDiaDoMes (diaCandidato.indice),
                                diaCandidato.valor);
            // Desmarcamos
            copiaPrecipitacaoDiaria[diaCandidato.indice] = (float) 0.0;
        }
    }

    // ----------------------------------------------------------------------------
    // Programa principal
    public ExercicioSexto () {
        // Criamos as variáveis para a entrada e para o aluno
        teclado = new Scanner(System.in);

        precipitacaoDiaria2013 = new float [DIAS_ANO];
        precipitacaoMensual2013 = new float [MESES_ANO];
        
        armazenaDadosPrecipitacao(true);
        calculaPrecipitacaoMensual();
        
        mostrarPrecipitacaoPorMes();
        mostrarMesMaiorPrecipitacaoDoAno();
        mostrarMesMenorPrecipitacaoDoAno();
        mostrarMediaPrecipitacaoMensual();
        
        mostrarDiaMaiorPrecipitacaoDoAno();
        mostrarDiaMenorPrecipitacaoDoAno();
        mostrarMediaPrecipitacaoAnual();
        
        // Mostramos os 10 dias de maior precipitação do ano
        mostrarNumDiasDeMaiorPrecipitacao(10);
        
        // Fechamos o teclado para que eclipse não proteste (Warning)
        teclado.close();
    }

    public static void main(String[] args) {
        ExercicioSexto exemplo = new ExercicioSexto();
    }
}
