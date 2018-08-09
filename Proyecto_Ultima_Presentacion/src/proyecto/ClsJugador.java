/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.Serializable;

/**
 *
 * @author Wendy Soto
 */
public class ClsJugador implements Serializable{
    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String usuario;
    private int victorias;


    public ClsJugador(String nombre, String apellido, String usuario, int victorias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.victorias = victorias;
       
    }

    

    public ClsJugador(int id, String nombre, String apellido, String cedula, String usuario, int victorias) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.victorias = victorias;
    }
    
    
    public ClsJugador(String usuario) {
        this.usuario = usuario;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    

    @Override
    public String toString() {
        return   " " +this.nombre +" "+this.apellido;
    }
    
    
}
