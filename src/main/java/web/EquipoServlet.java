/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import dominio.equipos;
import java.io.IOException;
import java.util.List;
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

@WebServlet("/equipos")
public class EquipoServlet extends HttpServlet {
    
    @Inject
    IEquipoSevice iEquipoSevice;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<equipos> equipos = iEquipoSevice.buscarTodosEquipos();
        System.out.println("Equipos: " + equipos);
        request.setAttribute("equipos", equipos); 
        request.getRequestDispatcher("/listadoEquipos.jsp").forward(request, response);
    }
}
