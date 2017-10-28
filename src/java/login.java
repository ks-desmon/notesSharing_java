/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bin.service;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Desmon
 */
public class login extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String userid = request.getParameter("userid");
            String password = request.getParameter("password");
            service ser = new service();
            com.bin.binclass binobj = ser.login_permission(userid, password);
            String oemail = "", opass = "", name = "";
            oemail = binobj.getUserid();
            opass = binobj.getPassword();
            name = binobj.getFname();
            String rollno = binobj.getRollno();
            response.setContentType("text/html;charset=UTF-8");
            //out.print("welcome,"+oemail);
            //out.print("welcome,"+opass);
            //request.getRequestDispatcher("login.jsp").include(request, response);
            if (!userid.equals(oemail)) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('E-Mail is not existing.');");
                out.println("</script>");
                request.getRequestDispatcher("login.jsp").include(request, response);
            } else if (!password.equals(opass)) {
                String message = "sorry, password is wrong!";
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Wrong password is entered.');");
                out.println("</script>");
                request.getRequestDispatcher("login.jsp").include(request, response);
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("name", name);
//                out.println("<script type=\"text/javascript\">");
//                out.println("alert('Successfully login.');");
//                out.println("</script>");
                request.getRequestDispatcher("courses.jsp").include(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
