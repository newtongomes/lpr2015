package br.estacio.lpr.aluno.mauricio.objetos;

import java.util.Scanner;

public class ProgramaProduto {
	public static void main(String[] args) {
        final String[] MESES = { "Janeiro", "Fevereiro", "Março", "Abril",
                                    "Maio", "Junho", "Julho", "Agosto",
                                    "Setembro", "Outubro", "Novembro", "Dezembro"};
        final int NUM_PRODUTOS = 2;
        Produto[] vetorProdutos = new Produto[NUM_PRODUTOS];
		Scanner teclado = new Scanner(System.in);
        
        // Obtemos os dados dos produtos
		for (int i=0; i < NUM_PRODUTOS; i++) {
            vetorProdutos[i] = new Produto();
            System.out.printf("Dados Produto %d%n---------------%n", i + 1);
			System.out.printf("Forneça o precio de Custo do produto %d: ", i + 1);
            vetorProdutos[i].precioCusto = teclado.nextFloat();
			System.out.printf("Forneça o precio de Venda do produto %d: ", i + 1);
            vetorProdutos[i].precioVenda = teclado.nextFloat();
            for(int j = 0; j < 12; j++) {
                System.out.printf("Forneça as vendas do produto %d para o mes de " +
                                    MESES[j] + ": ", i + 1);
                vetorProdutos[i].vendasMensuais[j] = teclado.nextInt();
            }
        }

        // Calculamos os lucros anuais de cada produto e os totais
        float lucroTotal = 0.0f;
		for (int i=0; i < NUM_PRODUTOS; i++) {
            lucroTotal += vetorProdutos[i].lucroAnual();
            System.out.printf("O lucro anual do produto %d foi %.2f R$.%n",
                                i + 1, vetorProdutos[i].lucroAnual());
        }

        System.out.printf("O lucro anual da empresa foi %.2f R$.%n", lucroTotal);

        // Fechamos o teclado para que eclipse não proteste (Warning)
        teclado.close();
    }
}
