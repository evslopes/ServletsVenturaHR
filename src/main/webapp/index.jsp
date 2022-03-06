<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Servlets Ventura HR</title>
</head>
<body>
<h1>Cadastro de Usuários
</h1>
<form action="CadastrarUsuarioServlet" method="post">
    <table border="1" cellpadding="3" cellspacing="0">
        <tr>
            <td>Nome</td>
            <td><input type="text" name="nome" maxlength="50" size="30"></td>
        </tr><tr>
            <td>Email</td>
            <td><input type="email" name="email" maxlength="15" size="15"></td>
        </tr><tr>
            <td>Senha</td>
            <td><input type="password" name="senha" maxlength="15" size="15"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Cadastrar Contato">
            </td>
        </tr>
    </table>
</form>
<%
    String msg = (String) request.getAttribute("msg");
    if(msg != null) {
        out.println("<h3 style='color:green'>" + msg + "</h3>");
    }

    ArrayList<String> erros = (ArrayList) request.getAttribute("erros");
    if(erros != null) {
        for (String erro: erros) {
            out.println("h3 style='color:red'>" + erro + "</h3>");
        }
    }
%>
<br/>
</body>
</html>