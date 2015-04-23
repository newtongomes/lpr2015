package cap14;
import java.sql.*;
import java.io.*;
import javax.servlet.http.*;
public class CopiarFilme extends HttpServlet {
    private PrintStream tela = null;
	private PreparedStatement statement;
	private ResultSet resultSet;	
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        String codigo = req.getParameter("codigo");
        BD bd = new BD();
        String men = "<b>Filme copiado com sucesso!</b>";
        try {
            tela = new PrintStream(res.getOutputStream());
            tela.println("<html><body>");
            if (bd.getConnection()) {
                String sql = "select * from Filmes where codigo = ?";
				statement = bd.connection.prepareStatement(sql);
				statement.setString(1, codigo);
                resultSet = statement.executeQuery();
                tela.println("<table border=1 cellspacing=0>");
                tela.println("<tr bgcolor=beige><td>Código</td><td>Titulo</td><td>Gênero</td><td>Produtora</td><td>Data de Compra</td>");
                if(resultSet.next()) {
                    tela.println("<tr><td>" + resultSet.getString("codigo") + "</td>");
                    tela.println("<td>" + resultSet.getString("titulo") + "</td>");
                    tela.println("<td>" + resultSet.getString("genero") + "</td>");
                    tela.println("<td>" + resultSet.getString("produtora") + "</td>");
                    tela.println("<td>" + resultSet.getString("datacompra") + "</td></tr>");

					sql = "INSERT INTO Filmes_temp VALUES (?,?,?,?,?)";
					statement = bd.connection.prepareStatement(sql);
					statement.setString(1, codigo);
					statement.setString(2, resultSet.getString("titulo"));
					statement.setString(3, resultSet.getString("genero"));
					statement.setString(4, resultSet.getString("produtora"));
					statement.setString(5, resultSet.getString("datacompra"));
					if (statement.executeUpdate() == 0){
						men = "<b>Falha ao copiar!</b>";
					}
                }
                else{
                    men = "<b>Filme não encontrado!</b>";
                }
                tela.println("</table>");
				
				tela.println(men);
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
