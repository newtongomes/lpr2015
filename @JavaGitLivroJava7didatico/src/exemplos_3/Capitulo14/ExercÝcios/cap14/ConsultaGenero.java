package cap14;
import java.sql.*;
import java.io.*;
import javax.servlet.http.*;
public class ConsultaGenero extends HttpServlet {
    private PrintStream tela = null;
	private PreparedStatement statement;
	private ResultSet resultSet;
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        String genero = req.getParameter("genero");
        BD bd = new BD();
        try {
            tela = new PrintStream(res.getOutputStream());
            tela.println("<html><body>");
            if (bd.getConnection()) {
                String sql = "select * from Filmes where genero = ? order by titulo";
				statement = bd.connection.prepareStatement(sql);
				statement.setString(1, genero);
                resultSet = statement.executeQuery();
                tela.println("<b>FILMES LOCALIZADOS DO GÊNERO: </b>"+genero+"<br><br>");
                tela.println("<table border=1 cellspacing=0>");
                tela.println("<tr bgcolor=beige><td>Código</td><td>Titulo</td><td>Produtora</td><td>Data de Compra</td>");
                while (resultSet.next()) {
                    tela.println("<tr><td>" + resultSet.getString("codigo") + "</td>");
                    tela.println("<td>" + resultSet.getString("titulo") + "</td>");
                    tela.println("<td>" + resultSet.getString("produtora") + "</td>");
                    tela.println("<td>" + resultSet.getString("datacompra") + "</td></tr>");
                }
                tela.println("</table>");
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
