package cap06;
public class AreaComSobrecarga {
    public static void main(String args[]) {
        System.out.println("área de um quadrado..." + area(3));
        System.out.println("área de um retangulo.." + area(3, 2));
        System.out.println("área de um cubo......." + area(3, 2, 5));
    }
    public static double area(int x) {
        return (x * x);
    }
    public static double area(int x, int y) {
        return (x * y);
    }
    public static double area(int x, int y, int z) {
        return (x * y * z);
    }
}



