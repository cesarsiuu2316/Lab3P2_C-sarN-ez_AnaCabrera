/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_césarnúñez_anacabrera;

import java.util.ArrayList;

/**
 *
 * @author BAC
 */
public class Alumnos extends Persona{
    ArrayList <Clase> listaClases = new ArrayList();
    private int idEstudiante;
  

    public Alumnos(int idEstudiante, int listaClases, String nombre, int Identidad, int fecha) {
        super(nombre, Identidad, fecha);
        this.idEstudiante = idEstudiante;
       
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }


    @Override
    public String toString() {
        return super.toString()+ "Alumnos{" + "idEstudiante=" + idEstudiante + ", listaClases=" + listaClases + '}';
    }
    
    
}
