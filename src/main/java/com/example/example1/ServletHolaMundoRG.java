package com.example.example1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet.HolaMundoRG", value = "/Servlet.HolaMundoRG")
public class ServletHolaMundoRG extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        System.out.println("Imprimiendo HTML");
        out.println("<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head><title>Hola mundo recargado</title></head>\n"
                + "<body bgcolor=\"#fdf5e6\">\n"
                + "<h1><b><i>HOLA MUNDO RECARGADO</i></b></h1>\n"
                + "<p>punto numero 2</p>\n"
                + "</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
