package br.pro.sergio.beans.usuario;
import javax.swing.JOptionPane;
public class UsuarioTestaInserir {
	public static void main(String[] args) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.usuario.setLogin(JOptionPane.showInputDialog("Digite o login"));
		usuarioDAO.usuario.setPassword(JOptionPane.showInputDialog("Digite a senha"));
		String men = usuarioDAO.atualizar(UsuarioDAO.INCLUSAO);
		JOptionPane.showMessageDialog(null, men);
	}
}
