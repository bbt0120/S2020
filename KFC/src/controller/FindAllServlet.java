package controller;

import entity.KFC;
import service.impl.KFCServiceImpl;

import java.io.IOException;
import java.util.List;

public class FindAllServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        List<KFC> kfcs = new KFCServiceImpl().findAll();

        request.setAttribute("kfcs",kfcs);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
