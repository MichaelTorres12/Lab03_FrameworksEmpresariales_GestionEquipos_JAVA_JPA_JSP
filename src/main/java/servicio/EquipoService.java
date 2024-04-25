/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import datos.IEquiposDao;
import dominio.equipos;
import java.util.List;
import javax.inject.Inject;


/**
 *
 * @author Michael Torres
 */

//Aqui tengo la logica de negocio por asi decirlo que hace punte entre los DAO (Data Acces Object) y los servlets

public class EquipoService implements IEquipoSevice{
    
    @Inject
    private IEquiposDao IEquipos;
    
    @Override
    public List<equipos> buscarTodosEquipos() {
        return IEquipos.buscarTodosEquipos();
    }

    @Override
    public equipos buscarEquiposPorId(int ID) {
        return IEquipos.buscarEquiposPorId(ID);
    }

    @Override
    public equipos buscarEquiposPorNombres(equipos equipo) {
        return IEquipos.buscarEquiposPorNombres(equipo);
    }

    @Override
    public void insertarEquipos(equipos equipo) {
        IEquipos.insertarEquipos(equipo);
    }

    @Override
    public void modificarEquipos(equipos equipo) {
        IEquipos.modificarEquipos(equipo);  
    }

    @Override
    public void eliminarEquipos(int ID) {
        IEquipos.eliminarEquipos(ID);
    }
    
}
