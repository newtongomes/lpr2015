package br.estacio.lpr.aluno.douglas.exercicios.grupo1;

public class TiposPrimitivos 
{
	/**
	 * @author Douglas Santos
	 */
	public static void main(String[] args) {
		// Declare all primitive types and their values negative and positive
		
		char caracter = 'A'; // o tipo char pode armazenar caracteres unicode ISO e utiliza 16 bits.
		boolean vOuF = true; // o tipo boolean pode armazenar apenas os valores lógicos verdadriro ou falso.
		
		byte minByte = -128; // o tipo byte armazena valores inteiros de até 8 bits, podendo ser negativo ou positivo.
		byte maxByte = 127; // valor maximo do tipo byte.
		
		short minShort = -32768; // short é um inteiro de 16 bits.
		short maxShort = 32767; // valor máximo do tipo short.
		
		int minInt = -2147483648; // int é um inteiro de 32 bits
		int maxInt = 2147483647; // valor máximo do tipo int.
		
		long minLong = -9223372036854775808L; // long é um inteiro de 64 bits.
		long maxLong = 9223372036854775807L; // valor máximo do tipo long. 
		// 'L' é o formato quando o número não cabe em um tipo inteiro.
		
		/* o tipo float representa valores de ponto flutuante e possui intervalo de valores negativos e positivos.
		ele utiliza 32 bits.*/
		
		// Intervalo negativo.
		float negFloat1 = -3.4028234663852886e+38f;  // a expressão 'valor'e+38 significa valor x 10 elevado a 38.
		float negFloat2 = -1.40129846432481707e-45f; // 0 menos(-) significa elevado a menos 45.
		
		// Intervalo positivo
		float positFloat1 = 1.40129846432481707e-45f;
		float positFloat2 = 3.4028234663852886e+38f;
		
		/* Assim como o tipo float, o tipo double também representa valores de ponto flutuante.
		 A diferença é a quantidade de bits do tipo double, que é 64. O tipo double possui uma maior precisão.
		 */
		
		// Intervalo negativo
		double negDouble1 = -1.7976931348623157e+308;
		double negDouble2 = -4.94065645841246544e-324;
		
		// Intervalo Positivo
		
		double positDouble1 = 4.94065645841246544e-324;
		double positDouble2 = 1.7976931348623157e+308;
		
		System.out.println("Valores:");
		System.out.printf("tipo char: %c\n", caracter);
		System.out.printf("tipo boolean: %b\n",vOuF);
		System.out.printf("tipo byte: \nmaximo: %d\nminimo: %d\n",maxByte,minByte);
		System.out.printf("tipo short: \nmaximo: %d\nminimo: %d\n",maxShort,minShort);
		System.out.printf("tipo inteiro: \nmaximo: %d\nminimo: %d\n",maxInt,minInt);
		System.out.printf("tipo long: \nmaximo: %d\nminimo: %d\n",maxLong,minLong);
		System.out.printf("tipo float intervalo negativo: \nmaximo: %f\nminimo: %f\n",negFloat1,negFloat2);
		System.out.printf("tipo float intervalo positivo: \nmaximo: %f\nminimo: %f\n",positFloat1,positFloat2);
		System.out.printf("tipo double intervalo negativo: \nmaximo: %f\nminimo: %f\n",negDouble1,negDouble2);
		System.out.printf("tipo double intervalo positivo: \nmaximo: %f\nminimo: %f\n",positDouble1,positDouble2);
		
	}

}
