public enum Opcoes {
   // constantes enum: devem estar no come�o, como lista
   COMPACTAR("Compactacao", 0),
   DESCOMPACTAR("Descompactacao", 1);

   // campos devem ser final
   private final String nome;
   private final int valor;

   // construtor n�o tem especificador de acesso
   Opcoes(String n, int v) { nome = n; valor = v; }

   public int getValor() { return valor; }
   public String getNome() {return nome; }

   public String toString() {
      return nome + "(" + valor + ")";
   }
}
