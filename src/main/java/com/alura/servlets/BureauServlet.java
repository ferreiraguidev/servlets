package com.alura.servlets;

import com.alura.servlets.model.Business;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/newBusiness")
public class BureauServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String businessName = request.getParameter("name");
        String openingDate = request.getParameter("date");

        Business business = new Business();
        business.setName(businessName);

        Banco banco = new Banco();
        banco.add(business);

        response.sendRedirect("lst");

    }

}
