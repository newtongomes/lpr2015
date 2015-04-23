package cap06;
public class ChamaMetodos {
    public static void main(String args[]) {
        String nome = EntradaDeDadosComMetodos.leString();
        int idade = EntradaDeDadosComMetodos.leNumeroInt(0, 120);
        float n1 = EntradaDeDadosComMetodos.leNumeroFloat(0, 10);
        float n2 = EntradaDeDadosComMetodos.leNumeroFloat(0, 10);
        float media = (n1 + n2) / 2;
        // acrescentar um JOP para mostrar os dados
    }
}


