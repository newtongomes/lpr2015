package br.estacio.lpr.aluno.mauricio.objetos;

public class ProgramaAluno {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.nome = "Paco";
		a.nota1 = 6.7f;
		a.nota2 = 8.3f;
		System.out.printf("Média = %.2f%n", a.calcularMedia());
		String status_a = (a.foiAprovado()) ? "Aprovado" : "Reprovado";
		System.out.println("O aluno " + a.nome + " foi " + status_a + ".");

		Aluno b = new Aluno ("Pedro", 4.3f, 3.0f);
		String status_b = (b.foiAprovado()) ? "Aprovado" : "Reprovado";
		System.out.printf("Média = %.2f%n", b.calcularMedia());
		System.out.println("O aluno " + b.nome + " foi " + status_b + ".");
	}
}
