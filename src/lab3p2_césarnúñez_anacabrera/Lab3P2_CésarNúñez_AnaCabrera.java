package lab3p2_césarnúñez_anacabrera;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3P2_CésarNúñez_AnaCabrera {
    
    public Scanner sc = new Scanner(System.in);
    private static ArrayList<Alumnos> alumnos = new ArrayList();
    private static ArrayList<Transportistas> transportistas = new ArrayList();
    private static ArrayList<Clase> clases = new ArrayList();    
    private static ArrayList<Estacion> estaciones = new ArrayList();

    public static void main(String[] args) {
        while(true){
            switch(menu()){
                case 0:{
                    System.exit(0);
                    break;                    
                } // case
                
                case 1:{
                    crearClase();
                    break;                    
                } // case
                
                case 2:{
                    
                    break;                    
                } // case
                
                case 3:{ // crear alumno
                    String nombre = JOptionPane.showInputDialog("Nombre del estudiante:");
                    Date fecha = new Date();
                    DateFormat fechaNacimiento = new SimpleDateFormat("yyyy/MM/dd");
                    fecha = fechaNacimiento.parse(JOptionPane.showInputDialog("Fecha de nacimiento (yyyy/MM/dd):"));
                    int iD, iD_Estudiante;
                    ArrayList <Clase> clases_ = new ArrayList(); // clases del alumno
                    if(identidadUnica(iD, "a") && identidadEstudianteUnica(iD_Estudiante) && claseExiste(clases_)){
                        alumnos.add(new Alumnos(iD_Estudiante, clases_, nombre, iD, fechaNacimiento));
                    }                   

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
                + "2. Crear estación\n"
                + "3. Crear Alumno\n"
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
    
    public static boolean claseExiste(ArrayList<Clase> listaClasesAlumno){
        boolean claseExiste = false;
        for (Clase clase_ : listaClasesAlumno) {
            claseExiste = false;
            for (Clase clase : clases) {
                if(clase_.equals(clase.getNombreClase())){
                    claseExiste = true;
                }
            }
            if(claseExiste == false){
                break;
            }
        }
        return claseExiste;
    }
    
    public static boolean identidadUnica(int iD, String persona){
        if(persona.equals("a")){
            for (Alumnos alumno : alumnos) {
                if(alumno.getIdentidad() == iD){
                    return false;
                }
            }
        }else if(persona.equals("t")){
            for (Transportistas transportista : transportistas) {
                if(transportista.getIdentidad() == iD){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean identidadEstudianteUnica(int iD){
        for (Alumnos alumno : alumnos) {
            if(alumno.getIdEstudiante() == iD){
                return false;
            }
        }
        return true;
    }
    
    public static void crearClase(){
        String nombreClase = (JOptionPane.showInputDialog("Ingrese el nombre de la clase"));
        int codeClase = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la clase"));
        boolean codeExiste = false;
        for (Clase code: clases){
            if (code.getCodeClase() == codeClase){
                codeExiste = true;
                break;   
            } 
        }
        if(codeExiste == false){
            clases.add(new Clase(nombreClase, codeClase));
        }        
    } 
    
} // main
