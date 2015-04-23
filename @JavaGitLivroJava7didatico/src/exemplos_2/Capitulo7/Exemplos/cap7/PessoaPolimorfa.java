package cap07;
public class PessoaPolimorfa {
    public static void main(String args[]) {
        Pessoa pessoa = null;
        int tipo = 1;
        switch (tipo) {
            case 1:
                pessoa = new Pessoa();
                break;
            case 2:
                pessoa = new PessoaFisica();
                break;
            case 3:
                pessoa = new PessoaJuridica();
                break;
            case 4:
                pessoa = new Funcionario();
                break;
            default: {
                System.out.println("tipo desconhecido");
                System.exit(0); // encerra a execucao da classe
            }
        }
        pessoa.mostraClasse();
    }
}





