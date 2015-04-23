package br.estacio.lpr.exception;

import javax.swing.JOptionPane;

public class ExercicioExcecaoNomeMesJOP 
{
	public static void main(String[] a)
	{
		
		String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril",
				"Maio", "Junho", "Julho", "Agosto","Setembro",
				"Outubro", "Novembro", "Dezembro" };
		int mes = 1;
		String mesStr;
		
		while (mes != 0)
		{
			try
			{
				mesStr = JOptionPane.showInputDialog("Numero do mês (0 para finalizar):");
				mes = Integer.parseInt(mesStr);
				if (mes != 0)
				{
					JOptionPane.showMessageDialog(null,"Nome do mês = " + meses[mes-1]);
				}
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null,"Valor digitado inválido! Tente novamente.",
						"Erro!",JOptionPane.ERROR_MESSAGE);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				JOptionPane.showMessageDialog(null,"Número do mês inválido! Tente novamente.",
						"Erro!",JOptionPane.ERROR_MESSAGE);
			}
		}
		System.out.println("# fim do programa #");
	}

}
