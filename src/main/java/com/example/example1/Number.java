package com.example.example1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Number", value = "/Number")
public class Number extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        int numero = Integer.parseInt(request.getParameter("Number"));
        numero = (int) Math.pow(numero,2);
        response.getWriter().println("el cuadrado del numero ingresado es :"+numero);
    }
}
