package br.pro.sergio.beans.usuario;

import java.sql.*;
import br.pro.sergio.beans.bd.BD;
import br.pro.sergio.beans.seguranca.Criptografia;

public class UsuarioDAO {

    public Usuario usuario;
    public BD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;

    public UsuarioDAO() {
        bd = new BD();
        usuario = new Usuario();
    }

    public boolean localizar() {
        boolean ret = false;
        sql = "select * from usuarios where login = ?";
        if (bd.getConnection()) {
            try {
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, usuario.getLogin());
                resultSet = statement.executeQuery();
                if (resultSet.first()) {
                    usuario.setLogin(resultSet.getString(1));
                    usuario.setPassword(resultSet.getString(2));
                    ret = true;
                }
            } catch (SQLException erro) {
            }
            bd.close();
        }
        return ret;
    }

    public String atualizar(int operacao) {
        men = "Operacao realizada com sucesso!";
        int validacao = 1; //variavel usada para verificar se o login e a senha
        // possuem pelo menos 6 caracteres
        if (bd.getConnection()) {
            try {
                if (operacao == INCLUSAO) {
                    if (usuario.getLogin().length() < 6) {
                        men = "O usuário deve conter pelo menos 6 caracteres!";
                        validacao = 0; //não validou
                    } else if (usuario.getPassword().length() < 6) {
                        men = "A senha deve conter pelo menos 6 caracteres!";
                        validacao = 0;
                    } else {
                        sql = "insert into usuarios values (?,?)";
                        statement = bd.connection.prepareStatement(sql);
                        usuario.setLogin(Criptografia.criptografar(usuario.getLogin()));
                        usuario.setPassword(Criptografia.criptografar(usuario.getPassword()));
                        statement.setString(1, usuario.getLogin());
                        statement.setString(2, usuario.getPassword());
                    }
                } else if (operacao == ALTERACAO) {
                    sql = "update usuarios set senha = ? where login = ?";
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, Criptografia.criptografar(usuario.getPassword()));
                    statement.setString(2, Criptografia.criptografar(usuario.getLogin()));
                } else if (operacao == EXCLUSAO) {
                    sql = "delete from usuarios where login = ?";
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, Criptografia.criptografar(usuario.getLogin()));
                }
                if (validacao == 1) {
                    if (statement.executeUpdate() == 0) {
                        men = "Falha na operacao!";
                    }
                }
            } catch (SQLException erro) {
                men = "Falha na operacao " + erro.toString();
            }
            bd.close();
        } else {
            men = "Falha na conexão";
        }

        return men;
    }

    public boolean logar() {
        boolean ret = false; // supondo não encontrar login e password
        sql = "select * from usuarios where login = ? and password = ?";
        if (bd.getConnection()) {
            try {
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, Criptografia.criptografar(usuario.getLogin()));
                statement.setString(2, Criptografia.criptografar(usuario.getPassword()));
                resultSet = statement.executeQuery();
                ret = resultSet.first(); //se existir first retorna true
            } catch (SQLException erro) {
            }
            bd.close();
        }
        return ret;
    }
}

