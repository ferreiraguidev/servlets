package com.alura.servlets;

import com.alura.servlets.model.Business;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String businessName = request.getParameter("name");
        String paramOpeningDate = request.getParameter("date");
        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        Date openingDate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            openingDate = sdf.parse(paramOpeningDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Banco banco = new Banco();
        Business business = banco.searchById(id);
        business.setName(businessName);
        business.setOpeningDate(openingDate);

        response.sendRedirect("lst");

    }
}
