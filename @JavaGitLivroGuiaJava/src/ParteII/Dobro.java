public class Dobro { // declara��o da classe Dobro
   // armazena n�mero de inst�ncias da classe
   private static int instancias = 0;
   // armazena �ltimo valor usado por m�todo dobro(int)
   public int ultimoValor;
   // construtor que atualiza no. de inst�ncias
   public Dobro ( ) { instancias++; }
   // retorna no. de inst�ncias
   public static int getInstancias ( ) { return instancias; }
   // calcula o dobro
   public int dobro (int valor) { ultimoValor = valor; return 2*valor; }
}
