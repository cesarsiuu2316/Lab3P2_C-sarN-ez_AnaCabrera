/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_césarnúñez_anacabrera;

/**
 *
 * @author BAC
 */
public class Persona {
    private String nombre; 
    private int Identidad;
    private int fecha;

    public Persona(String nombre, int Identidad, int fecha) {
        this.nombre = nombre;
        this.Identidad = Identidad;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentidad() {
        return Identidad;
    }

    public void setIdentidad(int Identidad) {
        this.Identidad = Identidad;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    
}
