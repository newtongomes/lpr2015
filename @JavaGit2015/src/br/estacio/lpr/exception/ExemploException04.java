package br.estacio.lpr.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ExemploException04 
{

	static String alunos[]; 
	
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		
		alunos = new String[10];
		lerNomes();
		int alu = 1;
		while (alu != 0)
		{
			try
			{
				System.out.print("Numero na turma: ");
				alu = sc.nextInt();
				sc.nextLine();
				if (alu == 0)
					continue;
				if (alu < 0 || alu > 10)
					throw new NumeroAlunoInvalidoException();
				System.out.println("Aluno > "+alunos[alu-1]);
			}
			catch (InputMismatchException e)
			{
				System.out.println("Entrada de Ddadso Inválida. Digite um número!");
				sc.nextLine();
			}
			catch (NumeroAlunoInvalidoException e)
			{
				System.out.println("Número do Aluno Inválido. Digite 1 a 10!");
				sc.nextLine();
			}
			finally
			{
				sc.nextLine();
			}
		}
		
		gravarNomes();
		
	}
	
	public static void gravarNomes()
	{
		BufferedWriter arquivo;
		try
		{
			arquivo = new BufferedWriter(new FileWriter("nomes.txt"));
			for(String s : alunos)
			{
				arquivo.write(s); 
				arquivo.newLine();
			}
			arquivo.close();
		}
		catch(IOException e)
		{
			System.out.println("Erro de I/O");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Erro Geral (Exception)");
			e.printStackTrace();
		}
		
	}
	
	public static void lerNomes() throws IOException, FileNotFoundException
	{
		BufferedReader arquivo;
		int cont=0;
		String s;
		

			arquivo = new BufferedReader(new FileReader("nomes.txt"));
			s = arquivo.readLine();
			while (s != null)
			{
				alunos[cont++] = s;
				s = arquivo.readLine();
			}
			arquivo.close();

	
	}
	
}
