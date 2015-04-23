package br.estacio.lpr.exception;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ExemploException03 
{

	static String alunos[] =  
	{
		"Alexandre Moura Silva", "Marcio Felix de Sousa", 
		"Alvaro Pessoa Jr.", "Bernardino Silva Nascimento", 
		"Wellington Peres de Sousa", "Luis Alvaro Fontenele Silva", 
		"Camila Soares Peixoto", "Carla Mercia Silva Moura", 
		"Maria da Graça Peixoto", "Frederico Alves de Lima" 
	};
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//alunos = new String[10];
		try {
			lerNomes();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Arquivo inexistente");
		}
		catch(IOException e)
		{
			System.out.println("Arquivo inexistente");
		}
		int alu = 1;
		while (alu != 0)
		{
			try
			{
				System.out.print("Numero na turma: ");
				alu = sc.nextInt();
			
				if (alu < 1 || alu >= alunos.length)
					throw new NumeroAlunoInvalidoException();
			
				System.out.println("Aluno > "+alunos[alu-1]);
			}
			catch(NumeroAlunoInvalidoException e)
			{
				System.out.println("Erro: " + e.getMessage());
			}
		}
		
		try
		{
			gravarNomes();
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	public static void gravarNomes() throws IOException
	{
		//BufferedReader arquivo = new BufferedReader(new FileReader("nomes.txt"));
		BufferedWriter arquivo = new BufferedWriter(
				new FileWriter("nomes.txt"));
		for(String s : alunos)
		{
			arquivo.write(s); 
			arquivo.newLine();
		}
		arquivo.close();
		
	}
	
	public static void lerNomes() throws FileNotFoundException, IOException
	{

		BufferedReader arquivo = new BufferedReader(
				new FileReader("nomes.txt"));
		int cont=0;
		String s = arquivo.readLine();
		while (s != null)
		{
			alunos[cont++] = s;
			s = arquivo.readLine();
		}
		arquivo.close();


	}
	
}
