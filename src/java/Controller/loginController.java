/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UsuarioDao;
import DAO.alumnoDao;
import DAO.loginDao;
import Modelo.Usuario;
import Modelo.persona;
import conexion.Conexion;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "loginController", urlPatterns = {"/loginc"})
public class loginController extends HttpServlet {
public HttpSession session;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
response .setContentType("text/html;charset=UTF-8");
// Recibimos parametros del formulario de login
        String userParam = request.getParameter("usuario");
        String passParam = request.getParameter("password");
        String msg = "";
        // Recuperamos una instancia del objeto HttpSession
        session = request.getSession();
        Conexion conn=new Conexion();
 //   Autenticacion objAutenticacion = new Autenticacion(conn);
   // Verificamos en la BD, si es un usuario correcto.
        loginDao logindao= new loginDao();
        Usuario objUsuario = logindao.login(userParam, passParam);
       int login = objUsuario.getIdUsuario();
System.out.println("canturando"+objUsuario.getIdUsuario());
        RequestDispatcher rd;
        if (objUsuario.getIdUsuario() >0) {
            alumnoDao objLoginDao = new alumnoDao();
            
           ArrayList<persona> list =objLoginDao.listAlumno(login);
            
            
            // Creamos una variable de session, con el registro de usuario (Bean)
            // Verificar en el administrador de aplicaciones de tomcat.
          session.setAttribute("alumnos", list);
           
            rd = request.getRequestDispatcher("Principal.jsp");
        } else {
            msg = "Usuario y/o password incorrectos";
            request.setAttribute("message", msg);
            rd = request.getRequestDispatcher("logins.jsp");

        }

        rd.forward(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
