package cap12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class TextoParaBD {
    public static void main(String[] args) {
        BD bd = new BD();
        String codigo="", titulo="", genero="", produtora="", data="";
        if(bd.getConnection()){
            try{
                PreparedStatement statement = bd.connection.prepareStatement("INSERT INTO FILMES VALUES (?,?,?,?,?)");
                BufferedReader br = new BufferedReader(new FileReader("c:/backup.txt"));
                String linha="";
                for (int i=0;i<4;i++){
                    linha = br.readLine();
                    int pos = 0, next=0;
                    next = linha.indexOf("#",pos);
                    codigo = linha.substring(pos, next);

                    pos = next+1;
                    next = linha.indexOf("#",pos);
                    titulo = linha.substring(pos, next);

                    pos = next+1;
                    next = linha.indexOf("#",pos);
                    genero = linha.substring(pos, next);

                    pos = next+1;
                    next = linha.indexOf("#",pos);
                    produtora = linha.substring(pos, next);

                    pos = next+1;
                    data = linha.substring(pos);

                    statement.setString(1, codigo);
                    statement.setString(2, titulo);
                    statement.setString(3, genero);
                    statement.setString(4, produtora);
                    statement.setString(5, data);
                    statement.executeUpdate();
                }
            }
            catch(IOException erro){
                System.out.println("Arquivo backup.txt não encontrado");
            }
            catch(SQLException erro){
                System.out.println("Erro: " + erro.toString());
            }
            bd.close();
       }
    }
}
