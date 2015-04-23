package cap05;
import javax.swing.JOptionPane;
public class BuscaNumerosSorteados {
    public static void main(String[] args) {
        int[][] numeros = new int[50][20];
        for (int linhas=0;linhas<50;linhas++)
            for (int colunas=0;colunas<20;colunas++){
               numeros[linhas][colunas]=(int)(Math.random()*1000);
        }
        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Forneça um número de 0 a 999"));
        String resultado = "Número não encontrado";
        for (int linhas=0;linhas<50;linhas++)
            for (int colunas=0;colunas<20;colunas++)
               if(numeros[linhas][colunas]==numero)
                    resultado = "Numero encontrado na posição: [" + linhas + "," + colunas + "]";
        
        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);
    }
}
