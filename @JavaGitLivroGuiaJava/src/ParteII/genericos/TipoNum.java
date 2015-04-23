public class TipoNum<T> {
   private int id;
   private T valor; // campo gen�rico
   public TipoNum (int id, T valor) { // par�metro gen�rico
      setId(id);
      setValor(valor);
   }
   public void setId(int id) {
      if (id<0) throw new RuntimeException("id<0");
      this.id = id;
   }
   public int getId() { return id; }
   public void setValor(T valor) { // par�metro gen�rico
      if (valor==null) throw new RuntimeException("valor==null");
      this.valor = valor;
   }
   public T getValor() { // valor de retorno gen�rico
      return valor; }
   public void troca(TipoNum<T> p) { // par�metro gen�rico compat�vel
      T valorAux = p.valor; // vari�vel local gen�rica
      p.valor = valor;
      valor = valorAux;
   }
}
