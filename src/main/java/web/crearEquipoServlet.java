/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;


import dominio.equipos;
import dominio.pais;
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

@WebServlet("/nuevoEquipo")
public class crearEquipoServlet extends HttpServlet {
    @Inject
    IEquipoSevice equipoService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        request.getRequestDispatcher("/nuevoEquipo.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String nombres = request.getParameter("nombres");
        String deporte = request.getParameter("deporte");
        String anioFundacion = request.getParameter("anioFundacion");
        int idPais = Integer.parseInt(request.getParameter("idPais"));
       
        pais nacion = new pais(); // Aquí necesitaríamos buscar el país por el ID.
        nacion.setAnioFundacion(anioFundacion);
        nacion.setConfederacion(anioFundacion);
        nacion.setIdNacion(idPais);
        

        equipos equipo = new equipos();
        equipo.setNombres(nombres);
        equipo.setDeporte(deporte);
        equipo.setNacion(nacion); 
        

        equipoService.insertarEquipos(equipo);
        response.sendRedirect("equipos");
    }
}
