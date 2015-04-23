package br.pro.sergio.beans.usuario;
import javax.swing.JOptionPane;
public class UsuarioTestaExcluir {
	public static void main(String[] args) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.usuario.setLogin(JOptionPane.showInputDialog("Digite o login"));
		String men = usuarioDAO.atualizar(UsuarioDAO.EXCLUSAO);
		JOptionPane.showMessageDialog(null, men);
	}
}
