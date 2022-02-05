
package lab3p2_césarnúñez_anacabrera;

import java.util.Date;


public class Persona {
    private String nombre; 
    private int Identidad;
    private Date fecha;

    public Persona(String nombre, int Identidad, Date fecha) {
        this.nombre = nombre;
        this.Identidad = Identidad;
        this.fecha = fecha;
    }

    public Persona() {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", Identidad = " + Identidad + ", fecha = " + fecha;
    }
    
	
}
