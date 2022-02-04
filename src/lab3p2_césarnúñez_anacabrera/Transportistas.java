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
public class Transportistas extends Persona{
    
    private int Aexpe; //Años de experiencia 
    private String barrio;

    public Transportistas(int Aexpe, String barrio, String nombre, int Identidad, int fecha) {
        super(nombre, Identidad, fecha);
        this.Aexpe = Aexpe;
        this.barrio = barrio;
    }

    public int getAexpe() {
        return Aexpe;
    }

    public void setAexpe(int Aexpe) {
        this.Aexpe = Aexpe;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return super.toString()+ "Transportistas{" + "Aexpe=" + Aexpe + ", barrio=" + barrio + '}';
    }
    
}
