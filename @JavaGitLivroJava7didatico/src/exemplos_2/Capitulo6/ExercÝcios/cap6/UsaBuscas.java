package cap06;
public class UsaBuscas {
    public static void main(String[] args) {
        int[] numeros = {10,20,30};
        System.out.println(Buscas.buscaNumero(20, numeros));
        String[] palavras = {"camisa","penhasco","Deus","dado"};
        System.out.println(Buscas.buscaPalavra(palavras));
    }
}
