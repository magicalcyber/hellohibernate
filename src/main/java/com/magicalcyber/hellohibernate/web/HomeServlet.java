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
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PersonDAO dao = new PersonDAO();
        req.setAttribute("persons", dao.listPerson());
        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }
}
