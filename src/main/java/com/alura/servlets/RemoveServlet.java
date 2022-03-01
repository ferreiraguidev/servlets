package com.alura.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/removeServlet")
public class RemoveServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String paramId = request.getParameter("id");
        Integer id  = Integer.valueOf(paramId);
        System.out.println(id);

        Banco banco = new Banco();
        banco.remove(id);

        response.sendRedirect("lst");

    }
}
