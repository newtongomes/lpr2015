<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>P�gina Principal</title>
    </head>
    <body>
<%
	String dados = (String)session.getValue("login");
	if (dados == null){
%>
	   <h1>A sess�o expirou. <br>
            Volte para a p�gina de <a href='login.html'>login</a> novamente!!</h1>
<%
        }
        else {
%>
        <h1>P�gina principal do site</h1>
        <h4>Acesso permitido somente para usu�rios logados!</h4>
    </body>
<%
    }
%>
</html>
