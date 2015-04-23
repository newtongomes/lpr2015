package br.estacio.lpr.faculdade;

public class TesteProfessor {

	public static void main(String[] args) 
	{
		
		// Erro! Pofessor é uma Classe Abstrata
		//Professor teste = new Professor();		
		//teste.setNome("xx");

		ProfessorDE p1;
		p1 = new ProfessorDE();
		p1.setMatricula(100);
		p1.setNome("Paulo");
		p1.setSalario(3000);
		
		ProfessorHorista p2;
		p2 = new ProfessorHorista();
		p2.setMatricula(101);
		p2.setNome("Joaquim");
		p2.setNumeroHoras(400);
		p2.setValorHora(400);
		
		ProfessorDE p3 = new ProfessorDE(100,"Pedro",4000);
		
		
		
		
		
		
		
	}

}
