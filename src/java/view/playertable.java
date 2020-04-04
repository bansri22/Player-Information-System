/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.Player;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.PlayerLogic;

/**
 *
 * @author bansri
 */
public class playertable extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Player Table Simple</title>");            
            out.println("</head>");
            out.println("<body>");
            
            PlayerLogic logic = new PlayerLogic();
            List<Player> courses = logic.getAll();
            out.println("<table align=\"center\" border=\"1\">");
            out.println("<caption>Username</caption>");
            out.println("<tr>");
            out.println("<th> ID</th>");
            out.println("<th>FirstName</th>");
            out.println("<th>LastName</th>");
            out.println("<th>Email</th>");
            out.println("<th>Joined</th>");
            out.println("</tr>");
            for (Player course : courses) {
                out.printf("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>", course.getId(), course.getFirstName(),course.getLastName(),course.getEmail(),course.getJoined());
            }
            out.println("<tr>");
            out.println("<th> ID</th>");
            out.println("<th>FirstName</th>");
            out.println("<th>LastName</th>");
            out.println("<th>Email</th>");
            out.println("<th>Joined</th>");
            out.println("</tr>");
          
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
    }
        
    
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}