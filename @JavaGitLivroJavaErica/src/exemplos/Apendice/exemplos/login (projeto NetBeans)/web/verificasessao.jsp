<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verifica se a sessão está aberta</title>
</head>
<body>
<%
	String dados = (String)session.getValue("login");
	if (dados != null){
	   out.println("Sessão encontrada! Os dados armazenados são: <br><b>" + dados + "</b>");
	}    
	else
	   out.println("A sessão expirou. Vá para a página de login novamente !!");
%>
</body>
</html>
