package br.estacio.lpr.exemplos.objetos.programas;

import br.estacio.lpr.exemplos.objetos.ContaBancaria;


public class ProgramaContaBancaria 
{
	public static void main(String[] args) 
	{
		ContaBancaria conta1;

		conta1 = new ContaBancaria();
		conta1.abrirConta(101,"Anderson");
		
		conta1 = new ContaBancaria(123,"Alex");
		
		conta1.creditar(1000);
		
		conta1.debitar(300);
		
		System.out.println("Cliente= " + conta1.getNomeCliente());
		System.out.println("Saldo = " + conta1.getSaldo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		//conta1 = new ContaBancaria_MANHA();
		
		//conta1.abrirConta(101, "Cliente1");
		//conta1.creditar(1000);
		//conta1.debitar(200);
		
		//System.out.println("Saldo="+conta1.obterSaldo());
		
		//conta1.abrirConta(101, "Novo Cliente");
		
		//conta1.setNome("Anderson Silva");
		
		
		//System.out.println("Cliente:" + conta1.getNomeCliente());
		//System.out.println("Saldo:" + conta1.obterSaldo());

	}

}
