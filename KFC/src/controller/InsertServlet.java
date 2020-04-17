package controller;

import entity.KFC;
import service.impl.KFCServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InsertServlet")
public class InsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String start_time = request.getParameter("start_time");
        String work_time = request.getParameter("work_time");
        String address_id = request.getParameter("address_id");

        KFC kfc = new KFC(name,start_time,work_time,Integer.parseInt(address_id));
        new KFCServiceImpl().insert(kfc);

        response.sendRedirect("index.jsp");

    }
}
