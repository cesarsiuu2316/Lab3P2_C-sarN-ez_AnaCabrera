package lab3p2_césarnúñez_anacabrera;
import java.awt.Color;
import java.util.ArrayList;

public class Mototaxi extends Transporte{
    
    ArrayList<Alumnos> alumnos = new ArrayList();

    public Mototaxi() {
        super();
    }

    public Mototaxi(int placa, String color) {
        super(placa, color);
    }

    public Mototaxi(int placa, String color, Transportistas transportista) {
        super(placa, color, transportista);
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return super.toString() + ", alumnos = " + alumnos;
    }   
        
}
