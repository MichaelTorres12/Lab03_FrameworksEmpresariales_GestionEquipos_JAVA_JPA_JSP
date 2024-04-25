/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Mi entitad/modelo equipos que se crea en la DB usando code firts con sus getters y setters
package dominio;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Michael Torres
 */

@Entity
@Table(name="equipos")
public class equipos implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType. IDENTITY)
    @Column(name = "idEquipo")
    private int id;
    
    @Column(name = "nombres", nullable = false, length = 100)
    private String nombres;
    
    @Column(name = "deporte", nullable = false, length = 100)
    private String deporte;   
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPais")
    private pais nacion;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public pais getNacion() {
        return nacion;
    }

    public void setNacion(pais nacion) {
        this.nacion = nacion;
    }

    @Override
    public String toString() {
        return "equipos{" + "id=" + id + ", nombres=" + nombres + ", deporte=" + deporte + '}';
    }
    
    
}
