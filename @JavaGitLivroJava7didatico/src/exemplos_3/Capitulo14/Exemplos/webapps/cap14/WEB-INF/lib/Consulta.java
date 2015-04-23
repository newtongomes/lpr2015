package cap14;
import java.sql.*;
import java.io.*;
import javax.servlet.http.*;
public class Consulta extends HttpServlet {
    private PrintStream tela = null;
    private PreparedStatement statement;
    private ResultSet resultSet;
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        String codigo = req.getParameter("codigo");
        BD bd = new BD();
        try {
            tela = new PrintStream(res.getOutputStream());
            tela.println("<html><body>");
            if (bd.getConnection()) {
                String sql = "select * from Filmes where codigo = ?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, codigo);
                resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    String nome = resultSet.getString("titulo");
                    String genero = resultSet.getString("genero");
                    String produtora = resultSet.getString("produtora");
                    String data = "" + resultSet.getDate("datacompra");
                    tela.println("FILME LOCALIZADO:<br>");
                    tela.println("<br>Código...........: <b>" + codigo + "</b>");
                    tela.println("<br>Nome.............: <b>" + nome + "</b>");
                    tela.println("<br>Gênero...........: <b>" + genero + "</b>");
                    tela.println("<br>Produtora........: <b>" + produtora + "</b>");
                    tela.println("<br>Data de Compra...: <b>" + data + "</b>");
                }
                else {
                    tela.println("Filme não localizado!");
                }
                bd.close();
            }
            else {
                tela.println("Falha na conexão ao banco de dados!");
            }
        }
        catch (IOException erro) {
            erro.printStackTrace();
        }
        catch (SQLException erro) {
            erro.printStackTrace();
        }
        tela.println("</body></html>");
    }
}



