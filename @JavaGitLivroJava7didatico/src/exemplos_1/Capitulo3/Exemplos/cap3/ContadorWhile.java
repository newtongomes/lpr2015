package cap03;
import javax.swing.JOptionPane;
public class ContadorWhile {
    public static void main(String args[]) {
        try {
            int limite = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite a quantidade"));
            int contador = limite;
            while (contador >= 0) {
                System.out.println(contador);
                contador--;
            }
            System.out.println("Fim do contador regressivo\n");
            contador = 0;
            do {
                System.out.println(contador);
                contador++;
            } while (contador <= limite);
            System.out.println("Fim do contador progressivo");
        } catch (NumberFormatException erro) {
            System.out.println("Nao foi fornecido um numero inteiro valido!\n" +
                    erro.toString()); // se o argumento for invalido
        }
        System.exit(0);
    }
}


