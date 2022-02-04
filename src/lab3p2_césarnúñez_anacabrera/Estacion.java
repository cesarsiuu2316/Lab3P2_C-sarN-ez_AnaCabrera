package lab3p2_césarnúñez_anacabrera;

public class Estacion {
    
    private String nombre;
    private int coordenadaX;
    private int coordenadaY;

    public Estacion() {
    }

    public Estacion(String nombre, int coordenadaX, int coordenadaY) {
        this.nombre = nombre;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", coordenadaX = " + coordenadaX + ", coordenadaY = " + coordenadaY;
    } 
    
} // clase
