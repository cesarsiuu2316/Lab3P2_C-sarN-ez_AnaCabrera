package lab3p2_césarnúñez_anacabrera;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Taxis extends Transporte {
    
    private ArrayList<Alumnos> alumnos = new ArrayList();
    private int nTaxi; // número de taxi

    public Taxis() {
        super();
    }

    public Taxis(int nTaxi, int placa, String color) {
        super(placa, color);
        this.nTaxi = nTaxi;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    public int getnTaxi() {
        return nTaxi;
    }

    public void setnTaxi(int nTaxi) {
        this.nTaxi = nTaxi;
    }

    @Override
    public String toString() {
        return super.toString() + ", alumnos = " + alumnos + ", nTaxi = " + nTaxi;
    } 
       
}
