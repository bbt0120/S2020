package controller;

import entity.KFC;
import service.KFCService;
import service.impl.KFCServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FindKFCByAreaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String area_id = request.getParameter("area_id");
        if (area_id == null){
            area_id = "0";
        }
        KFCService kfcService = new KFCServiceImpl();
        List<KFC> ks = kfcService.findKFCByArea(Integer.parseInt(area_id));
        request.setAttribute("ks",ks);
        request.getRequestDispatcher("search.jsp").forward(request,response);
    }
}
