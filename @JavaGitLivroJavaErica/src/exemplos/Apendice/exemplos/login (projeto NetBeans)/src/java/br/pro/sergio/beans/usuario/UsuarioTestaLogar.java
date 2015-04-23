package br.pro.sergio.beans.usuario;
import javax.swing.JOptionPane;
public class UsuarioTestaLogar {
	public static void main(String[] args) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.usuario.setLogin(JOptionPane.showInputDialog("Digite o login"));
		usuarioDAO.usuario.setPassword(JOptionPane.showInputDialog("Digite a senha"));
		if(usuarioDAO.logar())
			JOptionPane.showMessageDialog(null, "Logado no sistema");	
		else
			JOptionPane.showMessageDialog(null, "Falha no logon, verifique usuário e senha!");
		}
}
