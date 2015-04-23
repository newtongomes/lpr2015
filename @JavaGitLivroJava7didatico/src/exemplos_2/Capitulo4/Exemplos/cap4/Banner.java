package cap04;
import javax.swing.JOptionPane;
public class Banner {
    public static void main(String args[]) {
        int cont = 0;
        String palavra = JOptionPane.showInputDialog("Forneça uma palavra");
        if (palavra != null) // se o usuario digitou uma palavra
        {
            System.out.println("Mostra a palavra 3 vezes, letra a letra.");
            while (cont++ < 3) // looping 3 vezes
            {
                for (int i = 0; i < palavra.length(); i++) {
                    System.out.print(palavra.charAt(i)); // varre os caracteres
                    for (int x = 0; x < 999999999; x++) {//temporizador 1
                    }
                }
                System.out.println();
                for (int y = 0; y < 999999999; y++) {// temporizador 2
                }
            }
            System.out.println();
            System.out.println("Banner encerrado");
        } else {
            System.out.println("Entre com uma palavra qualquer.");
        }
        System.exit(0);
    }
}
