package br.estacio.lpr.exercicios.mauricio;

/*****************************************************************************
 * Exercicio Salario Liquido (c) Mauricio Muñoz Lucero, 2015                 
 * Deseja-se calcular o salario liquido para um grupo de 10 funcionários de 
 * uma empresa e o salário liquido total a ser pago pela empresa. Cada 
 * funcionário deve entrar com sua matricula, seu nome e o salário bruto. Em 
 * seguida deve-se calcular para cada funcionário o salário líquido, 
 * considerando o cálculo de desconto de 6% para salários até R$ 1.500,00 e 
 * um desconto de 9,5% para salários maiores que R$ 1.500,00. Ao final 
 * mostrar a lista com todos os dados dos funcionários, incluindo o salário 
 * líquido de cada um. Após a lista, mostrar o valor total do salário líquido
 * a ser pago pela empresa.
 *****************************************************************************/

import java.util.Scanner; 	// Entrada de teclado
import java.util.Random;    // Random(), nextInt(), setSeed()

public class SalarioLiquido {

    // Definição das constantes
    final String version = "$VER:Salario Liquido v1.0";
    static final int NUM_FUNCIONARIOS = 10;
    static final float MAX_SALARIO = (float) 5000.0;

    // Variável global à clase
    static Scanner teclado;
    
    // Definição da classe Funcionario
    class ClasseFuncionario {
		int matricula;
		String nome;
        float salarioBruto;
        float salarioLiquido;

        // Construtor da classe
        public ClasseFuncionario() {
            // Inicializamos os atributos
			matricula = 0;
			nome = "";
			salarioBruto = (float) 0.0;
			salarioLiquido = (float) 0.0;
        }
    };

    // ----------------------------------------------------------------------------
    // Funciones

    /**************************************************************************
     * 'converteSalario'                                                      *
     **************************************************************************/
    static float converteSalario (float salarioTmp) {
        return (float) (Math.floor(salarioTmp * 10 + 0.5) / 10.0);
    }
    
    /*************************************************************************
     * 'entraFuncionarios'                                                   *
     *************************************************************************/
    static void entraFuncionarios (ClasseFuncionario[] funcionarios, boolean aleatorio) {
        if (aleatorio) {
            // Inicializamos o gerador de números randómicos
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());

            // Carrega vetor de funcionarios
            for(int i = 0; i < NUM_FUNCIONARIOS; i++) {
                System.out.printf("Forneça as dados do funcionario %d%n", i + 1);
    
                // Geramos as dados
				funcionarios[i].matricula = i + 1;
				System.out.printf("Matricula: %d%n", funcionarios[i].matricula);
				funcionarios[i].nome = "Nome " + (i + 1);
				System.out.println("Nome: " + funcionarios[i].nome);
				funcionarios[i].salarioBruto = converteSalario((float) MAX_SALARIO * random.nextFloat());
				System.out.printf("Salário Bruto: %.2f%n%n", funcionarios[i].salarioBruto);
				funcionarios[i].salarioLiquido = (float) 0.0;
            }
        } else
            // Carrega vetor de funcionarios
            for(int i = 0; i < NUM_FUNCIONARIOS; i++) {
                System.out.printf("Forneça as dados do funcionario %d%n", i + 1);
    
                // Pedimos os dados
				funcionarios[i].matricula = i + 1;
				System.out.printf("Matricula: %d%n", funcionarios[i].matricula);
				System.out.print("Nome: ");
				funcionarios[i].nome = teclado.nextLine();
                do {
					System.out.print("Salário Bruto: ");
					funcionarios[i].salarioBruto = converteSalario(teclado.nextFloat());
                } while ((funcionarios[i].salarioBruto < (float) 0.0) ||
                			(funcionarios[i].salarioBruto > MAX_SALARIO));
				funcionarios[i].salarioLiquido = (float) 0.0;
		        System.out.println();
            }
    }
    
    /**************************************************************************
     * 'geraSalarioLiquido'                                                   *
     **************************************************************************/
    static void geraSalarioLiquido (ClasseFuncionario[] funcionarios) {
        System.out.println("Gerando o salário liquido dos funcionarios...");
    
        for(int i = 0; i < NUM_FUNCIONARIOS; i++)
            if (funcionarios[i].salarioBruto <= (float) 1500.0)
				funcionarios[i].salarioLiquido = (float) (funcionarios[i].salarioBruto - 
															(funcionarios[i].salarioBruto * 6.0 / 100.0));
			else
				funcionarios[i].salarioLiquido = (float) (funcionarios[i].salarioBruto -
															(funcionarios[i].salarioBruto * 9.5 / 100.0));
    }
    
    /**************************************************************************
     * 'geraSalarioLiquidoTotal'                                              *
     **************************************************************************/
    static float geraSalarioLiquidoTotal (ClasseFuncionario[] funcionarios) {
        System.out.println("Gerando o salário liquido total...");
    
		float salarioLiquidoTotal = (float) 0.0;
		
        for(int i = 0; i < NUM_FUNCIONARIOS; i++)
			salarioLiquidoTotal += funcionarios[i].salarioLiquido;
		
		return salarioLiquidoTotal;
    }

    /**************************************************************************
     * 'mostraDadosFuncionarios'                                              *
     **************************************************************************/
    static void mostraDadosFuncionarios (ClasseFuncionario[] funcionarios) {
        for(int i = 0; i < NUM_FUNCIONARIOS; i++)
			System.out.printf("O funcionario " + funcionarios[i].nome + 
								" tem um salário de %.2f R$%n", funcionarios[i].salarioLiquido);
        System.out.println();
    }

    // ----------------------------------------------------------------------------
    // Programa principal
    public SalarioLiquido () {
        // Criamos as variáveis para a entrada e para os funcionarios
        teclado = new Scanner(System.in);
        
        ClasseFuncionario[] funcionarios = new ClasseFuncionario [NUM_FUNCIONARIOS];
        for(int i = 0; i < NUM_FUNCIONARIOS; i++)
            funcionarios[i] = new ClasseFuncionario();
        
		entraFuncionarios (funcionarios, true);
		geraSalarioLiquido (funcionarios);
		mostraDadosFuncionarios(funcionarios);
		System.out.printf("O total geral a ser pago aos funcionario é %.2f R$%n",
							geraSalarioLiquidoTotal(funcionarios));

        // Fechamos o teclado para que eclipse não proteste (Warning)
        teclado.close();
    }

    public static void main(String[] args) {
    	// Instanciamos um objeto anônimo
        new SalarioLiquido();
    }
}
