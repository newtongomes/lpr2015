package br.estacio.lpr.heranca;

public class TesteFornecedor {

	public static void main(String[] args) 
	{
		
		Fornecedor for1;
		
		
		for1 = new Fornecedor();
		
		for1.setNome("Araripe Tecidos");
		for1.setEndereco("rua xxx");
		for1.setTelefone("rua xxx");
		for1.setValorCredito(1000);
		for1.setValorDivida(300);

		System.out.printf("Saldo = R$ %.2f\n" , for1.obterSaldo());
		

	}

}
