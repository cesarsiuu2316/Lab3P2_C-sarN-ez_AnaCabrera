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

    public Taxis(int nTaxi, int placa, Color color, String transportista) {
        super(placa, color, transportista);
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
    
    public void a(){
        String texto = "hola";
        JOptionPane.showMessageDialog(null, texto + "Ana");
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1) \n"
                + "2) \n"
                + "3) "
                + "Ingrese una opción"));
    }
    
    
}
