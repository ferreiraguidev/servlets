package com.alura.servlets;

import com.alura.servlets.model.Business;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/showServlet")
public class ShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        Banco banco = new Banco();
        Business business =  banco.searchById(id);

        request.setAttribute("business", business);
        RequestDispatcher rd = request.getRequestDispatcher("/formUpdateBusiness.jsp");
        rd.forward(request, response);

    }
}
