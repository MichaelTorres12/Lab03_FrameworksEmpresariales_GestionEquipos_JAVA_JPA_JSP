/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.IEquipoSevice;

/**
 *
 * @author Michael Torres
 */
@WebServlet("/eliminarEquipo")
public class eliminarEquipoServlet extends HttpServlet {
    @Inject 
    IEquipoSevice equipoService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.getRequestDispatcher("/eliminarEquipo.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        int idEquipo = Integer.parseInt(request.getParameter("idEquipo"));
        equipoService.eliminarEquipos(idEquipo);
        response.sendRedirect("equipos");
    }
}
