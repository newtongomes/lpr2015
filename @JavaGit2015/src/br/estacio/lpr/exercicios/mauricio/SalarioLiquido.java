package br.estacio.lpr.exercicios.mauricio;

/*****************************************************************************
 * Exercicio Salario Liquido (c) Mauricio Mu�oz Lucero, 2015                 
 * Deseja-se calcular o salario liquido para um grupo de 10 funcion�rios de 
 * uma empresa e o sal�rio liquido total a ser pago pela empresa. Cada 
 * funcion�rio deve entrar com sua matricula, seu nome e o sal�rio bruto. Em 
 * seguida deve-se calcular para cada funcion�rio o sal�rio l�quido, 
 * considerando o c�lculo de desconto de 6% para sal�rios at� R$ 1.500,00 e 
 * um desconto de 9,5% para sal�rios maiores que R$ 1.500,00. Ao final 
 * mostrar a lista com todos os dados dos funcion�rios, incluindo o sal�rio 
 * l�quido de cada um. Ap�s a lista, mostrar o valor total do sal�rio l�quido
 * a ser pago pela empresa.
 *****************************************************************************/

import java.util.Scanner; 	// Entrada de teclado
import java.util.Random;    // Random(), nextInt(), setSeed()

public class SalarioLiquido {

    // Defini��o das constantes
    final String version = "$VER:Salario Liquido v1.0";
    static final int NUM_FUNCIONARIOS = 10;
    static final float MAX_SALARIO = (float) 5000.0;

    // Vari�vel global � clase
    static Scanner teclado;
    
    // Defini��o da classe Funcionario
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
            // Inicializamos o gerador de n�meros rand�micos
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());

            // Carrega vetor de funcionarios
            for(int i = 0; i < NUM_FUNCIONARIOS; i++) {
                System.out.printf("Forne�a as dados do funcionario %d%n", i + 1);
    
                // Geramos as dados
				funcionarios[i].matricula = i + 1;
				System.out.printf("Matricula: %d%n", funcionarios[i].matricula);
				funcionarios[i].nome = "Nome " + (i + 1);
				System.out.println("Nome: " + funcionarios[i].nome);
				funcionarios[i].salarioBruto = converteSalario((float) MAX_SALARIO * random.nextFloat());
				System.out.printf("Sal�rio Bruto: %.2f%n%n", funcionarios[i].salarioBruto);
				funcionarios[i].salarioLiquido = (float) 0.0;
            }
        } else
            // Carrega vetor de funcionarios
            for(int i = 0; i < NUM_FUNCIONARIOS; i++) {
                System.out.printf("Forne�a as dados do funcionario %d%n", i + 1);
    
                // Pedimos os dados
				funcionarios[i].matricula = i + 1;
				System.out.printf("Matricula: %d%n", funcionarios[i].matricula);
				System.out.print("Nome: ");
				funcionarios[i].nome = teclado.nextLine();
                do {
					System.out.print("Sal�rio Bruto: ");
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
        System.out.println("Gerando o sal�rio liquido dos funcionarios...");
    
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
        System.out.println("Gerando o sal�rio liquido total...");
    
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
								" tem um sal�rio de %.2f R$%n", funcionarios[i].salarioLiquido);
        System.out.println();
    }

    // ----------------------------------------------------------------------------
    // Programa principal
    public SalarioLiquido () {
        // Criamos as vari�veis para a entrada e para os funcionarios
        teclado = new Scanner(System.in);
        
        ClasseFuncionario[] funcionarios = new ClasseFuncionario [NUM_FUNCIONARIOS];
        for(int i = 0; i < NUM_FUNCIONARIOS; i++)
            funcionarios[i] = new ClasseFuncionario();
        
		entraFuncionarios (funcionarios, true);
		geraSalarioLiquido (funcionarios);
		mostraDadosFuncionarios(funcionarios);
		System.out.printf("O total geral a ser pago aos funcionario � %.2f R$%n",
							geraSalarioLiquidoTotal(funcionarios));

        // Fechamos o teclado para que eclipse n�o proteste (Warning)
        teclado.close();
    }

    public static void main(String[] args) {
    	// Instanciamos um objeto an�nimo
        new SalarioLiquido();
    }
}
