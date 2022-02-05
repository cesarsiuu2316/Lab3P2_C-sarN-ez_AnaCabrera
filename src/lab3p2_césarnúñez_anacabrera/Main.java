/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_césarnúñez_anacabrera;

import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author BAC
 */
public class Main {
    public static int simulacion(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(" M E N U\n"
                + "0. Salir \n"
                + "1. Subir alumno a transporte\n"
                + "2. Bajar alumno del transporte\n"
                + "3. Listar alumno del transporte\n"
                + "4. Escoger transportista\n"
                + "5. Quitar transportista\n"
                + "6. Añadir ruta\n"
                + "7. Quitar ruta\n"
                + "8. Imprimir transporte\n"
                + "9) Comenzar\n"
                + "Ingrese una opción: "));
        return opcion; 
    }
    public static void main(String[] args) throws ParseException {
     while(true){
            switch(simulacion()){
                case 0:{
                    System.exit(0);
                    break;                    
                } // case
                
                case 1:{
                     int tipoT = Integer.parseInt(JOptionPane.showInputDialog(" Seleccione el tipo de transporte\n"
                             + "1. Buses\n"
                             + "2.Rapiditos\n"
                             + "3.Taxis\n"
                             + "Mototaxis"));  
                            if (tipoT == 1){
                                
                            }
                    break;                    
                } // case
                case 2:{
                 break;   
                }
                case 3:{
                    break;
                }
                case 4:{
                    int Transportista = Integer.parseInt(JOptionPane.showInputDialog(" Seleccione el transportista\n"));
                    for(Transportistas: transp: transportistas){
                    System.out.println(transportistas.toString());
                
                }
                    break;
                }
            }
     }
}
}
