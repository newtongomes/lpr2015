public class TipoNum<T> {
   private int id;
   private T valor; // campo genérico
   public TipoNum (int id, T valor) { // parâmetro genérico
      setId(id);
      setValor(valor);
   }
   public void setId(int id) {
      if (id<0) throw new RuntimeException("id<0");
      this.id = id;
   }
   public int getId() { return id; }
   public void setValor(T valor) { // parâmetro genérico
      if (valor==null) throw new RuntimeException("valor==null");
      this.valor = valor;
   }
   public T getValor() { // valor de retorno genérico
      return valor; }
   public void troca(TipoNum<T> p) { // parâmetro genérico compatível
      T valorAux = p.valor; // variável local genérica
      p.valor = valor;
      valor = valorAux;
   }
}
