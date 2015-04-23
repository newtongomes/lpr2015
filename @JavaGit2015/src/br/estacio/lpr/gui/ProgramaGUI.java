package br.estacio.lpr.gui;

import javax.swing.*;
import java.awt.*;

public class ProgramaGUI 
{
	public static void main(String[] args) 
	{
		JFrame janela = new JFrame();
		
		janela.setTitle("Exemplo de Janela");
		janela.setSize(400,200);
		janela.setLocationRelativeTo(null);

		JLabel rotulo = new JLabel("Digite seu nome:");
		JButton botao = new JButton("Clique aqui");
		JTextField nome = new JTextField(30);
		
		FlowLayout layout = new FlowLayout();
		janela.setLayout(layout);
		
		janela.add(rotulo);
		janela.add(nome);
		janela.add(botao);

		janela.setVisible(true);
		

	}

}
