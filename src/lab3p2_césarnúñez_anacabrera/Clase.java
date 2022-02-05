
package lab3p2_césarnúñez_anacabrera;

/**
 *
 * @author BAC
 */
public class Clase {

    private String nombreClase;
    private int codeClase;

    public Clase(String nombreClase, int codeClase) {
        this.nombreClase = nombreClase;
        this.codeClase = codeClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public int getCodeClase() {
        return codeClase;
    }

    public void setCodeClase(int codeClase) {
        this.codeClase = codeClase;
    }

    @Override
    public String toString() {
        return "nombreClase = " + nombreClase + ", codeClase = " + codeClase;
    }
    
    
  
     
}
