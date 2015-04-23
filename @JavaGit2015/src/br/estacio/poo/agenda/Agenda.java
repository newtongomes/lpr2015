package br.estacio.poo.agenda;

import java.util.Scanner;

/*
 	Programa para estudo da sintaxe da linguagem Java (Básico)
 	Newton Gomes - 2014.1
*/

// Classe Contato da Agenda
class Contato
{
	String nome;
	String telefone;
	String email;
}

public class Agenda 
{
	private static final int TAMANHO_AGENDA = 100;
	static Scanner scanner = new Scanner(System.in);
	static Contato agenda[] = new Contato[TAMANHO_AGENDA];
	static int quantidade = 0;


	// Programa Principal 
	public static void main(String[] args) 
	{
		int opcao=0;
		while (opcao != 5)
		{
			System.out.println("\n* Agenda Eletronica de Contatos *");
			System.out.printf("%d contatos cadastrados na agenda eletronica\n",quantidade);
			opcao = ler_opcao();
			switch (opcao)
			{
				case 1: // cadastrar
					cadastrar();
					break;
				case 2: // consultar
					consultar();
					break;
				case 3: // alterar
					alterar();
					break;
				case 4: // listar
					listar();
					break;
			}
		}
		finalizar();
	}

	// função para finalizar programa 
	
	static void finalizar()
	{
		System.out.println("# Fim do Programa #");
	}
	
	// função para mostrar mensagem com pausa
	
	static void pausa(String mensagem)
	{
		System.out.printf("%s",mensagem);
		scanner.nextLine();
	}
	
	// função para ler opção escolhida
	
	static int ler_opcao()
	{
		int x;
		System.out.println("Opcoes:");
		System.out.println("-------");
		System.out.println("1-Cadastrar Contato");
		System.out.println("2-Consultar Contato");
		System.out.println("3-Alterar Contato");
		System.out.println("4-Listar Cadastrados");
		System.out.println("5-Finalizar Programa");
		System.out.print(">>> ");
		x = scanner.nextInt();
		scanner.nextLine();
		return x;
	}

	
	// função para cadastrar contato na agenda
	static void cadastrar()
	{
		if (quantidade == TAMANHO_AGENDA)
	{
			System.out.println("Agenda Cheia!");
	}
	else
	{
		agenda[quantidade] = new Contato();
		System.out.printf("Posicao.: %d\n",quantidade+1);
		System.out.print("Nome....: ");
		agenda[quantidade].nome = scanner.nextLine();
		System.out.print("Telefone: ");
		agenda[quantidade].telefone = scanner.nextLine();
		System.out.print("Email...: ");
		agenda[quantidade].email = scanner.nextLine();
		quantidade++;
	}
	pausa("Tecle algo...");
	}
	
	// função para consultar contato na agenda
	static void consultar()
	{
		int pos;
		System.out.print("Digite a posicao do contato: ");
		pos = scanner.nextInt(); scanner.nextLine();
		if (pos < 1 || pos > quantidade)
			System.out.println("Posicao Invalida ou Inexistente.");
		else
		{
			System.out.printf("Posicao.: %d\n",pos); 
			System.out.printf("Nome....: %s\n",agenda[pos-1].nome); 
			System.out.printf("Telefone: %s\n",agenda[pos-1].telefone);
			System.out.printf("Email...: %s\n",agenda[pos-1].email);
		}
		pausa(">>> Pressione algo para continuar...");
	}
	
	// função para alterar contato na agenda
	static void alterar()
	{
		int pos;
		String str;
		System.out.print("Digite a posicao do contato: ");
		pos = scanner.nextInt(); scanner.nextLine();
		if (pos < 1 || pos > quantidade )
			System.out.println("Posicao Invalida ou Inexistente.");
		else
		{
			System.out.printf("Posicao.: %d\n",pos); 
			System.out.printf("Nome....: %s\n>",agenda[pos-1].nome);
			str = scanner.nextLine();
			if (! str.equals(""))
				agenda[pos-1].nome = str;
			System.out.printf("Telefone: %s\n>",agenda[pos-1].telefone);
			str = scanner.nextLine();
			if (! str.equals(""))
				agenda[pos-1].telefone = str;
			System.out.printf("Email...: %s\n>",agenda[pos-1].email);
			str = scanner.nextLine();
			if (! str.equals(""))
				str = agenda[pos-1].email = str;
		}
		pausa(">>> Pressione algo para continuar...");
	}

	// função para listar contatos da agenda
	static void listar()
	{
		if ( quantidade > 0 )
		{
			for(int i=0; i < quantidade; i++)
			{
				System.out.printf("---\nPosicao.: %d\n",i+1); 
				System.out.printf("Nome....: %s\n",agenda[i].nome); 
				System.out.printf("Telefone: %s\n",agenda[i].telefone);
				System.out.printf("Email...: %s\n",agenda[i].email);
			}
		}
		else
			System.out.println("Agenda Vazia!");

		pausa(">>> Pressione algo para continuar...");
	}

}

// Fim do Programa

