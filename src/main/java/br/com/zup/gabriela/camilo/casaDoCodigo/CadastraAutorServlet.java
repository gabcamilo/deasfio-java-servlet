package br.com.zup.gabriela.camilo.casaDoCodigo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CadastraAutorServlet", value = "/cadastraAutor")
public class CadastraAutorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeAutor = request.getParameter("nome");
        String emailAutor = request.getParameter("email");

        Autor autor = new Autor();
        autor.setNome(nomeAutor);
        autor.setEmail(emailAutor);

        Banco banco = new Banco();
        banco.adiciona(autor);

        response.sendRedirect("listaAutores");
    }
}
