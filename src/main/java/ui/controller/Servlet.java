package ui.controller;

import domain.db.TeamDB;
import domain.model.Team;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    private Team team = new Team("Ferrari");
    private final TeamDB db = new TeamDB();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String teamParam = request.getParameter("teamnaam");
        String result = team.teamnaam(teamParam);
        request.setAttribute("result", result);
        RequestDispatcher view = request.getRequestDispatcher("/overzicht.jsp");
        view.forward(request, response);


        String coureursParam = request.getParameter("coureurs");
        String result1 = team.coureurs(coureursParam);
        request.setAttribute("result1", result1);
        RequestDispatcher view1 = request.getRequestDispatcher("/overzicht.jsp");
        view1.forward(request, response);


        String powerunitParam = request.getParameter("powerunit");
        String result2 = team.powerunit(powerunitParam);
        request.setAttribute("result2", result2);
        RequestDispatcher view2 = request.getRequestDispatcher("/overzicht.jsp");
        view2.forward(request, response);


        int wchampsParam = Integer.parseInt(request.getParameter("wchamps"));
        int result3 = team.wchamps(wchampsParam);
        request.setAttribute("result3", result3);
        RequestDispatcher view3 = request.getRequestDispatcher("/overzicht.jsp");
        view3.forward(request, response);




    }


    private String meesteKampioenschappen(HttpServletRequest request, HttpServletResponse response){

        request.setAttribute("meesteKampioenschappen", db.getMeesteKampioenschappen());
        return "overzicht.jsp";
    }
}
