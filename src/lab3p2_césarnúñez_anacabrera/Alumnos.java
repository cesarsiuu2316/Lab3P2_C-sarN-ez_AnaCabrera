
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
