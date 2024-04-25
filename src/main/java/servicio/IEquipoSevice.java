/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import dominio.equipos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Michael Torres
 */

@Local
public interface IEquipoSevice {
    
    public List<equipos> buscarTodosEquipos();
    public equipos buscarEquiposPorId(int ID);
    public equipos buscarEquiposPorNombres(equipos equipo);
    public void insertarEquipos(equipos equipo);
    public void modificarEquipos(equipos equipo);
    public void eliminarEquipos(int ID);
    
}
