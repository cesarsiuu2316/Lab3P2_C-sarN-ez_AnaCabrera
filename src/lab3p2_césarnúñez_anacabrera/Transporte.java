package lab3p2_césarnúñez_anacabrera;
import java.awt.Color;
import java.util.ArrayList;

public class Transporte {
    
    private int placa; // única
    private Color color;
    private Transportistas transportista;
    private ArrayList<Estacion> estaciones = new ArrayList();

    public Transporte() {
    }

    public Transporte(int placa, Color color, Transportistas transportista) {
        this.placa = placa;
        this.color = color;
        this.transportista = transportista;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Transportistas getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportistas transportista) {
        this.transportista = transportista;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "placa = " + placa + ", color = " + color + ", transportista = [" + transportista + "], estaciones = " + estaciones;
    }   
    
    
} // clase

