/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author SERVER
 */
public class Jugadas extends javax.swing.JFrame{
    
    static public ArrayList<Personajes> ListaPersonajes = new ArrayList<Personajes>();
    int vidaJ1;
    int estaminaJ1;
    int ataqueJ1;
    int ataquefinalJ1;
    int defensaJ1;
    int curacionJ1;
    int vidaJ2;
    int estaminaJ2;
    int ataqueJ2;
    int ataquefinalJ2;
    int defensaJ2;
    int curacionJ2;
    ClsJugador jugador;
    Personajes personajes;

    
    public Jugadas(ClsJugador jugador, Personajes personajes) {
        this.jugador = jugador;
        this.personajes = personajes;
    }

    public ClsJugador getJugador() {
        return jugador;
    }

    public void setJugador(ClsJugador jugador) {
        this.jugador = jugador;
    }

    public Personajes getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Personajes personajes) {
        this.personajes = personajes;
    }
    
    
}
