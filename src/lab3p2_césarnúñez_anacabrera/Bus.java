package lab3p2_césarnúñez_anacabrera;
import java.awt.Color;
import java.util.ArrayList;

public class Bus extends Transporte {
    
    private ArrayList<Alumnos> alumnos = new ArrayList();
    private int nSillas;
    private int nDePie; // capacidad máxima de personas de pie

    public Bus() {
        super();
    }    

    public Bus(int nSillas, int nDePie, int placa, Color color, Transportistas transportista) {
        super(placa, color, transportista);
        this.nSillas = nSillas;
        this.nDePie = nDePie;
    }
    
           
    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    public int getnSillas() {
        return nSillas;
    }

    public void setnSillas(int nSillas) {
        this.nSillas = nSillas;
    }

    public int getnDePie() {
        return nDePie;
    }

    public void setnDePie(int nDePie) {
        this.nDePie = nDePie;
    }

    @Override
    public String toString() {
        return super.toString() + ", Alumnos = " + alumnos + ", Número de sillas = " + nSillas + ", Capacidad máxima de personas de pie = " + nDePie;
    }
    
    
    
} // Clase
