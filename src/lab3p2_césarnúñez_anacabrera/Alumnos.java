
package lab3p2_césarnúñez_anacabrera;
import java.util.ArrayList;
import java.util.Date;


public class Alumnos extends Persona{
    ArrayList <Clase> listaClases = new ArrayList();
    private int idEstudiante;  

    public Alumnos(int idEstudiante, ArrayList<Clase> listaClases, String nombre, int Identidad, Date fecha) {
        super(nombre, Identidad, fecha);
        this.idEstudiante = idEstudiante;  
        this.listaClases = listaClases;
    }
    
    public Alumnos(int idEstudiante, String nombre, int Identidad, Date fecha) {
        super(nombre, Identidad, fecha);
        this.idEstudiante = idEstudiante;  
    }

    public Alumnos(String nombre, int Identidad, Date fecha) {
        super();
    }  
    
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public void setListaClases(ArrayList<Clase> listaClases) {
        this.listaClases = listaClases;
    }


    @Override
    public String toString() {
        return super.toString()+ ", idEstudiante = " + idEstudiante + ", listaClases = " + listaClases;
    }
    
    
}
