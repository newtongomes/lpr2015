package cap05;
import javax.swing.JOptionPane;
public class OperacoesNumericas {
    public static void main(String[] args) {
        // erros não tratados
        int[] numeros = new int[10];
        numeros[0] = Integer.parseInt(JOptionPane.showInputDialog("Forneça o número (1):" ));
        int maior = numeros[0];
        int soma = numeros[0];
        int menor = numeros[0];
        for (int i=1;i<10;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Forneça o número (" + (i+1)+"):"));
            soma += numeros[i];
            maior = Math.max(maior,numeros[i]);
            menor = Math.min(menor,numeros[i]);
        }
        JOptionPane.showMessageDialog(null,
                "\nMaior: " + maior +
                "\nMenor: " + menor +
                "\nSoma: " + soma);
        System.exit(0);
    }
}
