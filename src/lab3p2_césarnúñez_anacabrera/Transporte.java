package lab3p2_césarnúñez_anacabrera;
import java.awt.Color;
import java.util.ArrayList;

public class Transporte {
    
    protected int placa; // única
    protected Color color;
    protected String transportista;
    protected ArrayList<Estacion> estaciones = new ArrayList();

    public Transporte() {
    }

    public Transporte(int placa, Color color, String transportista) {
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

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
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
        return "placa = " + placa + ", color = " + color + ", transportista = " + transportista + ", estaciones = " + estaciones;
    }   
    
    
} // clase

