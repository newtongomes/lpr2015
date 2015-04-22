package br.estacio.lpr.exercicios.mauricio;

/*****************************************************************************
 * Exercicio Dias do Mês (c) Mauricio Muñoz Lucero, 2015
 * Deve-se ler um número inteiro correspondente ao número do mês do ano (1 a
 * 12), em seguida mostrar o nome do mês com a quantidade de dias que o mês 
 * tem (28,29,30 ou 31 dias). Perguntar ao usuário se deseja executar o
 * programa novamente, caso a resposta seja "SIM", repetir a execução, caso
 * contrário finalizar o programa.
 *****************************************************************************/

import java.util.Scanner; // Entrada de teclado

public class DiasDoMes {

    // Definição das constantes
    final String version = "$VER:Dias do Mês v1.0";
    static final int MESES_ANO = 12;
    
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
    static Scanner teclado;
	
    // ----------------------------------------------------------------------------
    // Funções
    
    /**************************************************************************
	 * 'perguntaMes'                                                  *
     **************************************************************************/
	static int perguntaMes(boolean usaTexto) {
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
                // Pulamos o salto de linha (fixa nextInt/Float + nextLine)
                teclado.nextLine();
                if ((numMes >=1) && (numMes <= 12)) {
                    numMes--;
                    mesCorreito = true;
                }
            }
		} while (!mesCorreito);
		
		return numMes;
	}
	
    // ----------------------------------------------------------------------------
    // Programa principal
    public DiasDoMes () {
		int mesFornecido;
        String resposta;
        teclado = new Scanner(System.in);
        
        do {
            // Obtemos o mês
            mesFornecido = perguntaMes(false);

            // Mostramos o nome e o numero de dias do mês
            System.out.printf("O mês de " + 
                                MESES[mesFornecido].nome + 
                                " tem %d dias.%n%n",
                                MESES[mesFornecido].num_dias);
        
            // Perguntamos se queremos voltar a executar o programa
            System.out.print("Deseja executar o programa novamente: ");
            resposta = teclado.nextLine();
        } while (resposta.equalsIgnoreCase("sim"));

        // Fechamos o teclado para que eclipse não proteste (Warning)
        teclado.close();
    }

    public static void main(String[] args) {
    	// Instanciamos um objeto anônimo
    	new DiasDoMes();
    }
}
