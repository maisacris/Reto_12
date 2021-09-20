package com.example.example1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "HolaMundo", value = "/hola-mundo")
public class HolaMundo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("Hola mundo!");
    }

    public void destroy() {
    }
}