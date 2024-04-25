/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import dominio.equipos;
import java.util.List;

/**
 *
 * @author Michael Torres
 */
public interface IEquiposDao {
    
    public List<equipos> buscarTodosEquipos();
    
    public equipos buscarEquiposPorId(int ID);
    
    public equipos buscarEquiposPorNombres(equipos equipo);
    
    public void insertarEquipos(equipos equipo);
    
    public void modificarEquipos(equipos equipo);
    
    public void eliminarEquipos(int ID);
}
