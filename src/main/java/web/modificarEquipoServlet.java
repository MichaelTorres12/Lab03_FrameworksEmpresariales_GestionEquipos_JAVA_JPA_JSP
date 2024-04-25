/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import dominio.equipos;
import dominio.pais;
import java.io.IOException;
import java.util.HashSet;
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
@WebServlet("/modificarEquipo")
public class modificarEquipoServlet extends HttpServlet {
    @Inject
    IEquipoSevice equipoService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/modificarEquipo.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        int idEquipo = Integer.parseInt(request.getParameter("idEquipo"));
        String nombres = request.getParameter("nombres");
        String deporte = request.getParameter("deporte");
        String anioFundacion = request.getParameter("anioFundacion");
        String confederacion = request.getParameter("confederacion");
        int idPais = Integer.parseInt(request.getParameter("idPais"));

        pais nacion = new pais(); // Aquí también necesitarías buscar el país por el ID.
        nacion.setAnioFundacion(anioFundacion);
        nacion.setIdNacion(idPais);
        
        nacion.setConfederacion(confederacion);
        
        equipos equipo = equipoService.buscarEquiposPorId(idEquipo);
        equipo.setId(idEquipo);
        equipo.setNombres(nombres);
        equipo.setDeporte(deporte);
        equipo.setNacion(nacion); 
        
        equipoService.modificarEquipos(equipo);
        response.sendRedirect("equipos"); // Asumiendo que tienes un JSP que lista los equipos.
    }
}
