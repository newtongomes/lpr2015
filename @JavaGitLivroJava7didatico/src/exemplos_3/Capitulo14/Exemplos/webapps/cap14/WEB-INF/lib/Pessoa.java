package cap14;
import java.io.*;
import javax.servlet.http.*;
public class Pessoa extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        String nome = req.getParameter("nome");
        String sexo = req.getParameter("sexo");
        String profissao = req.getParameter("profissao");
        String banco = req.getParameter("banco");
        String programacao = req.getParameter("programacao");
        String redes = req.getParameter("redes");
        if (banco == null) {
            banco = "";
        }
        if (programacao == null) {
            programacao = "";
        }
        if (redes == null) {
            redes = "";
        }
        try {
            PrintWriter out = new PrintWriter(new FileWriter("c:/pessoa.txt"));
            out.println("Nome: " + nome);
            out.println("Sexo: " + sexo);
            out.println("Profissao: " + profissao);
            out.println("Áreas de interesse: ");
            String areas = "";
            if (!banco.equals("")) {
                areas += "Banco de Dados, ";
            }
            if (!programacao.equals("")) {
                areas += "Programação de Computadores, ";
            }
            if (!redes.equals("")) {
                areas += "Redes de Computadores, ";
            }
            out.close();
            PrintStream tela = new PrintStream(res.getOutputStream());
            tela.println("<html><head>");
            tela.println("<meta http-equiv='Content-Type'content='text/html; charset=ISO-8859-1'>");
            tela.println("<title>Criação de Servlets</title>");
            tela.println("</head><body>");
            tela.println("Obrigado, suas informações foram gravadas com sucesso!");
            tela.println("<br><P>");
            tela.println("<b> Nome       : </b>" + nome + "<br>");
            tela.println("<b> Sexo       : </b>" + sexo + "<br>");
            tela.println("<b> Profissao  : </b>" + profissao + "<br>");
            tela.println("<b> Áreas de interesse  : </b>" + areas + "<br>");
            tela.println("</body></html>");
        }
        catch (IOException erro1) {
            try {
                PrintStream tela = new PrintStream(res.getOutputStream());
                tela.println("<html><body>");
                tela.println("Erro! Não foi possível receber os dados enviados");
                tela.println("<br><p>Tente novamente mais tarde");
                tela.println("</body></html>");
            }
            catch (IOException erro2) {
            }
        }
    }
}


