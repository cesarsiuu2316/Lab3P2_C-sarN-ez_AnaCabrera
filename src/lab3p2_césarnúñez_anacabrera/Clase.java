/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
   
        String nombreClase;
        int codeClase;
        
        String nombreClase = (JOption.showInputDialog("Ingrese el nombre de la clase"));
        int codeClase = Integer.parseInt(JOption.showInputDialog("Ingrese el codigo de la clase"));
        boolean codeExiste = false;
        for (Clase code: clases){
           
            if (code.getCodeClase() == codeClase){
                codeExiste = true;
                break;      
        } 
            if(codeExiste == false){
                clases.add(new Clase(nombreClase, codeClase));
            }
            
            
    }

 
    
}




     
     
}
