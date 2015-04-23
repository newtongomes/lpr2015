package cap07;
public class UsaProduto {
    public static void main(String[] args) {
        // teste de gravação
        ProdutoPersiste produto = new ProdutoPersiste();
        produto.setCodigo(2);
        produto.setDescricao("Sabonete");
        System.out.println(produto.gravar());
        // teste de leitura
        Produto p = ProdutoPersiste.ler(2);
        System.out.println(p.getCodigo());
        System.out.println(p.getDescricao());

    }
}


