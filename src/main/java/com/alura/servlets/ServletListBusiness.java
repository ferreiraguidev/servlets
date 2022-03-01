package com.alura.servlets;

import com.alura.servlets.model.Business;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/lst")
public class ServletListBusiness extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Banco banco = new Banco();
        List<Business> list = banco.getBusiness();
        request.setAttribute("business",list);

        RequestDispatcher rd = request.getRequestDispatcher("/BusinessList.jsp");
        rd.forward(request, response);

    }
}
