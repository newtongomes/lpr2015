<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="br.pro.sergio.beans.usuario.*,br.pro.sergio.beans.seguranca.*,java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logon no Sistema</title>
</head>
<body>
<%
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	usuarioDAO.usuario.setLogin(request.getParameter("p_login"));
	usuarioDAO.usuario.setPassword(request.getParameter("p_password"));
	if(usuarioDAO.logar())
	{
			      // propriedade, conte�do
		session.putValue("login", Criptografia.criptografar(usuarioDAO.usuario.getLogin()) + "-" +
                        new Date());
		// session.setMaxInactiveInterval(60); faz a sess�o expirar ap�s 60 segundos 
        out.println("<font size='4' color='blue'>Sess�o aberta!</font><br><br>");
        out.println("<font size='4' color='blue'>A Sess�o ser� encerrada quando o" + 
        		" browser for fechado</font><br>");
	}
	else
		out.println("<b>Falha no Logon.</b>");
	// para encerrar uma sess�o: session.invalidate();
%>
</body>
</html>

