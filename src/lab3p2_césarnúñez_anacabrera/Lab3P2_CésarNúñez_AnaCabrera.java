package lab3p2_césarnúñez_anacabrera;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3P2_CésarNúñez_AnaCabrera {
    
    public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            switch(menu()){
                case 0:{
                    System.exit(0);
                    break;                    
                } // case
                
                case 1:{
                    
                    break;                    
                } // case
                
                case 2:{
                    
                    break;                    
                } // case
                
                case 3:{
                    
                    break;                    
                } // case
                
                case 4:{
                    
                    break;                    
                } // case
                
                case 5:{
                    
                    break;                    
                } // case
                
                case 6:{
                    
                    break;                    
                } // case
                
                case 7:{
                    
                    break;                    
                } // case                
                
                case 8:{
                    
                    break;                    
                } // case
                
                case 9:{
                    
                    break;                    
                } // case
                
                case 10:{
                    
                    break;                    
                } // case
                
                case 11:{
                    
                    break;                    
                } // case
                
                case 12:{
                    
                    break;                    
                } // case
                
            } // switch
        } // while

    } // main
    
    public static int menu(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(" M E N U\n"
                + "0. Salir \n"
                + "1. Crear clase\n"
                + "2. Crear ruta\n"
                + "3. Crear Aluno\n"
                + "4. Agregar clase a alumno\n"
                + "5. Crear transportista\n"
                + "6. Crear transporte\n"
                + "7. Simulación\n"
                + "8. Listar clases\n"
                + "9. Listar rutas\n"
                + "10. Listar alumnos\n"
                + "11. Listar transportistas\n"
                + "12. Listar transportes\n"
                + "Ingrese una opción: ")); 
        return opcion;        
    }
    
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
}
