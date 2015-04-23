package cap06;
/* java 7 - Ensino didático
 * Autor Sérgio Furgeri
 */
public class CalculaMedia {

    public static void main(String args[]) {
        System.out.println("Duas notas = " + media(7, 8));
        System.out.println("Três notas = " + media(7, 8, 9));
        System.out.println("Quatro notas = " + media(7, 8, 9, 6));
    }

    public static double media(double a, double b) {
        return (a + b)/2;
    }

    public static double media(double a, double b, double c) {
        return (a + b + c)/3;
    }

    public static double media(double a, double b, double c, double d) {
        return (a + b + c + d)/4;
    }
}
