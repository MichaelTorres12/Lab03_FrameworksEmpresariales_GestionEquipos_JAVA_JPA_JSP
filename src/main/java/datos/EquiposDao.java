/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.equipos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author Michael Torres
 */

@Transactional
@Stateless
public class EquiposDao implements IEquiposDao{
    
    @PersistenceContext (unitName = "deportesUP")
    EntityManager em;

    @Override
public List<equipos> buscarTodosEquipos() {
    return em.createQuery("SELECT e FROM equipos e JOIN FETCH e.nacion ORDER BY e.nombres", equipos.class).getResultList();
}

    @Override
    public equipos buscarEquiposPorId(int ID) {
        return em.find(equipos.class, ID);
    }

    @Override
    public equipos buscarEquiposPorNombres(equipos equipo) {
        Query q = em.createQuery("from juegos e where e.nombres =:nombres");
        q.setParameter ("nombres", equipo.getNombres());
        return (equipos) q.getSingleResult();
    }

    @Override
    public void insertarEquipos(equipos equipo) {
        try
        {
            em.persist(equipo);
        }
        catch(Exception ex)
        {
            System.out.println("MENSAJES ERROR ==================" + ex.getMessage());
            System.out.println(ex);
        }
    }

    @Override
    public void modificarEquipos(equipos equipo) {
        em.merge(equipo);
    }

    @Override
    public void eliminarEquipos(int ID) {
        try
        {
            equipos equipo = em.find(equipos.class, ID);
            em.remove(em.merge(equipo));
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
