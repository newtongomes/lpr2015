package cap02;
/* Java 7 - Ensino Didático
 * Autor Sérgio Furgeri
 */
import java.io.*;
public class AreaTriangulo {
    public static void main(String args[]) {
        String s = "";
        float base = 0, altura = 0, area = 0;
        BufferedReader dado;
        try {
            System.out.println("Entre com o valor da base");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            base = Float.parseFloat(s);

            System.out.println("Entre com o valor da altura:");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            altura = Float.parseFloat(s);

            area = (base * altura) / 2;
            System.out.println("Area do triangulo : " + area);
        }
        catch (IOException erro) {
            System.out.println("Houve erro na entrada de dados \n" + erro.toString());
        }
        catch (NumberFormatException erro) {
            System.out.println("Houve erro na conversao, digite apenas caracteres numericos \n"
                    + erro.toString());
        }
    }
}


