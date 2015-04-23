package br.estacio.lpr.exemplos.objetos;

public class ProgramaAluno 
{
	public static void main(String[] args) 
	{
		Aluno al1;
		al1 = new Aluno();
		al1.nome = "Paulo";
		al1.nota1 = 7.5f;
		al1.nota2 = 6;

		System.out.println("Media = " + al1.calcularMedia());

		System.out.print("Aluno ");
		al1.verificarAprovacao();
	}


}
