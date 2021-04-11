package br.com.zup.gabriela.camilo.casaDoCodigo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListaAutoresServlet", value = "/listaAutores")
public class ListaAutoresServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Banco banco = new Banco();
        List<Autor> lista = banco.getListaAutor();

        request.setAttribute("autores", lista);

        RequestDispatcher rd = request.getRequestDispatcher("/listaAutores.jsp");
        rd.forward(request, response);
    }
}
