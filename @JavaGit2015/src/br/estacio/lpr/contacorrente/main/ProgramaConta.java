package br.estacio.lpr.contacorrente.main;

import javax.swing.JOptionPane;

import br.estacio.lpr.contacorrente.entidade.Conta;

public class ProgramaConta 
{
	public static void main(String[] args) 
	{
		Conta conta = new Conta();
		int opcao = 1, contador = 0;
		String opcoes = 
				"Programa de Conta Corrente\n\n" +
				"1-Criar Conta\n" +
				"2-Depositar Valor\n" +
				"3-Creditar Valor\n" +
				"4-Consultar Saldo\n" +
				"5-Mostar Hist�rico\n" +
				"0-Finalizar\n\n" +
				"Digite a op��o desejada:";

		while (opcao != 0) 
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,opcoes,
					"Conta Corrente - 2014",JOptionPane.QUESTION_MESSAGE));
			if (opcao == 0)
				continue;
		
			switch(opcao)
			{
			  case 1:
				  // op��o 1
				  break;
			  case 2:
				  // op��o 2
				  break;
			  case 3:
				  // op��o 3
				  break;
			  case 4:
			  {
				  // op��o 4
				  break;
			  }
			  case 5:
				  // op��o 5
				  break;
			  default:
				  JOptionPane.showMessageDialog(null,
						  "Op��o Inv�lida.\nSelecione uma op��o do Menu",
						  "ERRO!",JOptionPane.ERROR_MESSAGE);
			}
		}
		System.out.println("# Fim do Programa #");
		System.out.println("bye...");
	}

}
