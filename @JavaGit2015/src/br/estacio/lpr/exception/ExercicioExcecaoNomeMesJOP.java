package br.estacio.lpr.exception;

import javax.swing.JOptionPane;

public class ExercicioExcecaoNomeMesJOP 
{
	public static void main(String[] a)
	{
		
		String meses[] = {"Janeiro", "Fevereiro", "Mar�o", "Abril",
				"Maio", "Junho", "Julho", "Agosto","Setembro",
				"Outubro", "Novembro", "Dezembro" };
		int mes = 1;
		String mesStr;
		
		while (mes != 0)
		{
			try
			{
				mesStr = JOptionPane.showInputDialog("Numero do m�s (0 para finalizar):");
				mes = Integer.parseInt(mesStr);
				if (mes != 0)
				{
					JOptionPane.showMessageDialog(null,"Nome do m�s = " + meses[mes-1]);
				}
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null,"Valor digitado inv�lido! Tente novamente.",
						"Erro!",JOptionPane.ERROR_MESSAGE);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				JOptionPane.showMessageDialog(null,"N�mero do m�s inv�lido! Tente novamente.",
						"Erro!",JOptionPane.ERROR_MESSAGE);
			}
		}
		System.out.println("# fim do programa #");
	}

}
