package cap06;
public class MetodosSemRetorno {
    public static void main(String args[]) {
        imprimir();
        imprimirTexto("Ola");
        quadrado(10);
        somar(10, 20);
        maior(10, 20, 30);
        sexo('F');
    }
    public static void imprimir() {
        System.out.println("Aprendendo a Linguagem Java");
    }
    public static void imprimirTexto(String texto) {
        System.out.println(texto);
    }
    public static void somar(int a, int b) {
        System.out.println(a + b);
    }
    public static void quadrado(int a) {
        System.out.println(Math.pow(a, 2));
    }
    public static void maior(int a, int b, int c) {
        System.out.println(Math.max(c, Math.max(a, b)));
    }
    public static void sexo(char c) {
        if(c=='F')
            System.out.println("Feminino");
        else if(c=='M')
            System.out.println("Masculino");
        else
            System.out.println("Sexo desconhecido");
    }
}