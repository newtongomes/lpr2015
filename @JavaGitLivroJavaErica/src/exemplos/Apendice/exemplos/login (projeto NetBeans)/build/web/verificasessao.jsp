<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verifica se a sess�o est� aberta</title>
</head>
<body>
<%
	String dados = (String)session.getValue("login");
	if (dados != null){
	   out.println("Sess�o encontrada! Os dados armazenados s�o: <br><b>" + dados + "</b>");
	}    
	else
	   out.println("A sess�o expirou. V� para a p�gina de login novamente !!");
%>
</body>
</html>
