package cap02;
/* Java 7 - Ensino Didatico
 * Autor Sergio Furgeri
 */
import java.util.*;
public class Saldo {
    public static void main(String args[]) {
        float saldo = 0, deposito = 0, retirada = 0;
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Entre com o valor do deposito:");
            deposito = sc.nextFloat();
            saldo = saldo + deposito;
            System.out.println("Seu saldo atual : " + saldo);
            System.out.println("Entre com o valor da retirada:");
            retirada = sc.nextFloat();
            saldo = saldo - retirada;
            System.out.println("Seu saldo atual : " + saldo);
        }
        catch (NumberFormatException erro) {
            System.out.println("Houve erro na conversao, digite apenas caracteres numericos"
                    + erro.toString());
        }
    }
}


