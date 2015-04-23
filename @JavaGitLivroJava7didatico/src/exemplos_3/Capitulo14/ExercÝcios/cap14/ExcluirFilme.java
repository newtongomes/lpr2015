package cap14;
import java.sql.*;
import java.io.*;
import javax.servlet.http.*;
public class ExcluirFilme extends HttpServlet {
    private PrintStream tela = null;
	private PreparedStatement statement;
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        String codigo = req.getParameter("codigo");
        BD bd = new BD();
        String men = "<b>Filme excluído com sucesso!</b>";
        try {
            tela = new PrintStream(res.getOutputStream());
            tela.println("<html><body>");
            if (bd.getConnection()) {
                String sql = "delete from Filmes where codigo = ?";
				statement = bd.connection.prepareStatement(sql);
				statement.setString(1, codigo);
                if(statement.executeUpdate()==0){
                	men = "<b>Filme não localizado!</b>";
                }
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
