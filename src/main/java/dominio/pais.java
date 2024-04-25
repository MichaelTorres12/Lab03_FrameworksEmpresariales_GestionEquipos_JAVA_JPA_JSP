/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Mi entitad/modelo pais que se crea en la DB usando code firts con sus getters y setters
package dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Michael Torres
 */

@Entity
@Table(name="pais")
public class pais implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType. IDENTITY)
    @Column(name = "idNacion")
    private int idNacion;
    
    @Column(name = "confederacion", nullable = false, length = 50)
    private String confederacion;
    
    @Column(name = "anioFundacion", nullable = false, length = 50)
    private String anioFundacion;
    
    @OneToOne(mappedBy ="nacion")
    private equipos equipo;

    public int getIdNacion() {
        return idNacion;
    }

    public void setIdNacion(int idNacion) {
        this.idNacion = idNacion;
    }

    public String getConfederacion() {
        return confederacion;
    }

    public void setConfederacion(String confederacion) {
        this.confederacion = confederacion;
    }

    public String getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(String anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(equipos equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "pais{" + "idNacion=" + idNacion + ", confederacion=" + confederacion + ", anioFundacion=" + anioFundacion + '}';
    }
    
}
