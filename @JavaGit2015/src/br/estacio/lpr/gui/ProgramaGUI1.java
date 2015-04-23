package br.estacio.lpr.gui;

import javax.swing.*;
import java.awt.*;

public class ProgramaGUI1 
{

	public static void main(String[] args) 
	{
		JFrame janela = new JFrame();
		janela.setTitle("Exemplo de Janela");
		janela.setSize(400,300);
		janela.setLocationRelativeTo(null);
		
		janela.setLayout(new FlowLayout());
	
		JLabel label1 = new JLabel("Digite seu nome:");
		JButton botao = new JButton("Click Aqui");
		JTextField text = new JTextField(20);
		
		janela.add(label1);
		janela.add(text);
		janela.add(botao);

		
		
		

		janela.setVisible(true);

	}

}
