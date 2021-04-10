package br.com.zup.gabriela.camilo.casaDoCodigo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastraAutorServlet", value = "/cadastraAutor")
public class CadastraAutorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        System.out.println("cadastrado");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Cadastrado com sucesso </h1>");
        out.println("</body></html>");
    }
}
