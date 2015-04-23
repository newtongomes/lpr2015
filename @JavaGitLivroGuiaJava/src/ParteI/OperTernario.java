import java.util.Scanner;

public class OperTernario {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Preco Alcool: ");
		double alcool = sc.nextDouble();
		System.out.print("Preco Gasolina: ");
		double gasolina = sc.nextDouble();
		// atribui o maior valor
		double maior = gasolina > alcool ? gasolina : alcool;
		// exibe qual combustível é mais vantajoso
		System.out.println("Eh mais vantajoso abastecer com " + 
			(alcool/gasolina<0.7 ? "alcool" : "gasolina") + ".");
	}
}