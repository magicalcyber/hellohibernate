package com.magicalcyber.hellohibernate.web;

import com.magicalcyber.hellohibernate.dao.PersonDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MagicalCyber on 10/30/2014.
 */
@WebServlet(name = "AddPersonServlet", urlPatterns = {"/add"})
public class AddPersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if(name != null){
            PersonDAO dao = new PersonDAO();
            dao.save(name);
        }
        resp.sendRedirect("/home");
    }
}
