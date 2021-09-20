package com.example.example1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletCuatro", value = "/ServletCuatro")
public class ServletCuatro extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        int numero = Integer.parseInt(request.getParameter("dato"));
        double raiz = Math.sqrt(numero);
        //response.getWriter().println(numero);
        response.getWriter().println(
                "<!DOCTYPE html>\n" + "<html>\n"
                        + "<head><title>Hola mundo recargado</title></head>\n"
                        + "<body bgcolor=\"#fdf5e6\">\n"
                        + "<h1><b><i>RAIZ CUADRADA</i></b></h1>\n"
                        + "<p>del numero ingresado es</p>\n"+raiz
                        + "</body></html>");
    }
}
