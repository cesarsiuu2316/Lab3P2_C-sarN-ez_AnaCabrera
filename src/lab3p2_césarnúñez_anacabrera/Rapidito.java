package lab3p2_césarnúñez_anacabrera;
import java.awt.Color;
import java.util.ArrayList;

public class Rapidito extends Transporte{
    
    private int nSillas; 
    private ArrayList<Alumnos> alumnos = new ArrayList();

    public Rapidito() {
        super();
    }

    public Rapidito(int nSillas, int placa, String color) {
        super(placa, color);
        this.nSillas = nSillas;
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

    @Override
    public String toString() {
        return super.toString() + ", Número de sillas = " + nSillas + ", alumnos = " + alumnos;
    }  
            
} // clase
