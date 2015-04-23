package cap07;
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return (cnpj);
    }
    public void mostraClasse() {
        System.out.println("classe PessoaJuridica");
    }
}



