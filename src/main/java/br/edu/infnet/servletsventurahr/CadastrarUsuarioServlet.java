package br.edu.infnet.servletsventurahr;

import br.edu.infnet.domain.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CadastrarUsuarioServlet", urlPatterns = "/CadastrarUsuarioServlet")
public class CadastrarUsuarioServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        //Passo 1 receber os dados da requisição
        Usuario usuario = new Usuario();
        usuario.setNome(request.getParameter("nome"));
        usuario.setEmail(request.getParameter("email"));
        usuario.setSenha(request.getParameter("senha"));

        //Passo 2 validar os dados da requisição
        ArrayList<String> erros = new ArrayList<>();
//        if(StringUtils.isBlack(usuario.getNome())){
//            erros.add("O campo nome é obrigatório");
//        }

        //Passo 3 - Cadastrar o usuario
        if (erros.isEmpty()) {
            //cadastro

            //Passo 4.1 Incluir dados na requisição
            request.setAttribute("msg", "Contato cadastro com sucesso");
        } else {
            //Passo 4.2 Incluir dados na requisção
            request.setAttribute("erros", erros);
        }

        //Passo 5 0 Redirecionar para o JSP que vai finalizar o processamento
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}
