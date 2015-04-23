package cap14;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.*;
public class Cadastro extends HttpServlet {
    private PrintStream tela = null;
    private PreparedStatement statement;
    private String men = "Dados armazenados com sucesso!";
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        BD bd = new BD();
        try {
            tela = new PrintStream(res.getOutputStream());
            String codigo = req.getParameter("codigo");
            String titulo = req.getParameter("titulo");
            String genero = req.getParameter("genero");
            String produtora = req.getParameter("produtora");
            String data = req.getParameter("data");
            if (!codigo.equals("") && !titulo.equals("") && !genero.equals("")
                                   && !produtora.equals("") && !data.equals("")) {
                if (bd.getConnection()) {
                    String sql = "INSERT INTO Filmes VALUES (?,?,?,?,?)";
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, codigo);
                    statement.setString(2, titulo);
                    statement.setString(3, genero);
                    statement.setString(4, produtora);
                    statement.setString(5, data);
                    if (statement.executeUpdate() == 0) {
                        men = "Falha na gravação, verifique se o código do Filme ja existe!";
                    }
                    bd.close();
                }
                else {
                    men = "Falha na conexão ao banco de dados!";
                }
            }
            else {
                men = "Dados incompletos, verifique o preenchimento dos campos.";
            }
        }
        catch (IOException erro) {
            erro.printStackTrace();
        }
        catch (SQLException erro) {
            erro.printStackTrace();
        }
        tela.println("<html><body bgcolor='beige'>");
        tela.println(men);
        tela.println("<a href='cadastro.html'>voltar</a>");
        tela.println("</body></html>");
    }
}


