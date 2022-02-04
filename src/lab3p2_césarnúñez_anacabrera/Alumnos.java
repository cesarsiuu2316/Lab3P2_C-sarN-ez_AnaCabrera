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
public class Alumnos extends Persona{
    
    private int idEstudiante;
    private int listaClases;

    public Alumnos(int idEstudiante, int listaClases, String nombre, int Identidad, int fecha) {
        super(nombre, Identidad, fecha);
        this.idEstudiante = idEstudiante;
        this.listaClases = listaClases;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getListaClases() {
        return listaClases;
    }

    public void setListaClases(int listaClases) {
        this.listaClases = listaClases;
    }

    @Override
    public String toString() {
        return super.toString()+ "Alumnos{" + "idEstudiante=" + idEstudiante + ", listaClases=" + listaClases + '}';
    }
    
    
}
