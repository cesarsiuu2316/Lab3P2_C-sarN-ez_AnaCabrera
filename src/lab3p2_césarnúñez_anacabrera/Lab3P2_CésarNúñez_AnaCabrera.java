package lab3p2_césarnúñez_anacabrera;
import java.text.DateFormat;
import java.text.ParseException;
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
    private static ArrayList<Transporte> transportes = new ArrayList();

    public static void main(String[] args) throws ParseException {
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
                    crearEstacion();
                    break;                    
                } // case
                
                case 3:{ // crear alumno
                    crearAlumno();
                    break;                    
                } // case
                
                case 4:{
                    crearTransportista();
                    break;                    
                } // case
                
                case 5:{
                    crearTransporte();
                    break;                    
                } // case
                
                case 6:{
                    
                    break;                    
                } // case
                
                case 7:{
                    /*while(true){
                        switch(menuSimulacion()){
                            case 1:{
                                System.exit(0);
                                break;
                            }
                        }
                    }
                    break;      */              
                } // case                
                
                case 8:{
                    for (Clase clase : clases) {
                        JOptionPane.showMessageDialog(null, clase.toString());
                    }
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
    
    public static int menuSimulacion(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(" M E N U\n"
                + "0. Salir \n"
                + "1. Subir alumno a transporte\n"
                + "2. Bajar alumno del transporte\n"
                + "3. Listar alumnos del transporte\n"
                + "4. Escoger transportista\n"
                + "5. Quitar transportista\n"
                + "6. Añadir estación\n"
                + "7. Quitar estación\n"
                + "8. Imprimir transporte\n"
                + "9) Comenzar\n"
                + "Ingrese una opción: "));
        return opcion;        
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
    
    public static void crearAlumno() throws ParseException{
        String nombre = JOptionPane.showInputDialog("Nombre del estudiante:");
        Date fecha = new Date();
        DateFormat fechaNacimiento = new SimpleDateFormat("yyyy/MM/dd");
        fecha = fechaNacimiento.parse(JOptionPane.showInputDialog("Fecha de nacimiento (yyyy/MM/dd):"));
        int iD = Integer.parseInt(JOptionPane.showInputDialog("Identidad: "));
        int iD_Estudiante = Integer.parseInt(JOptionPane.showInputDialog("Identidad de estudiante: "));
        if(identidadUnica(iD, "a") && identidadEstudianteUnica(iD_Estudiante)){
            alumnos.add(new Alumnos(iD_Estudiante, nombre, iD, fecha));
        }       
    }
    
    public static void crearEstacion(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la estación:");
        int coordenadaX = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada X:"));
        int coordenadaY = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada Y:"));
        estaciones.add(new Estacion(nombre, coordenadaX, coordenadaY));
    }
    
    public static void agregarClaseAlumno(){
        String nombre = JOptionPane.showInputDialog("Nombre del alumno al que desea agregar clase:");
        for (Alumnos alumno : alumnos) {
            if(alumno.getNombre().equals(nombre)){
                String clase_ = JOptionPane.showInputDialog("Nombre de la clase que desea asignar:");
                for (Clase clase : clases) {
                    if(clase_.equals(clase.getNombreClase())){
                        alumno.getListaClases().add(clase);
                    }
                } // segundo for
            }
        } // primer for        
    }
    
    public static void crearTransportista() throws ParseException{
        String nombre = JOptionPane.showInputDialog("Nombre del estudiante:");
        DateFormat fechaNacimiento = new SimpleDateFormat("yyyy/MM/dd");
        Date fecha = fechaNacimiento.parse(JOptionPane.showInputDialog("Fecha de nacimiento (yyyy/MM/dd):"));
        int iD = Integer.parseInt(JOptionPane.showInputDialog("Identidad: "));
        int exp = Integer.parseInt(JOptionPane.showInputDialog("Años de experiencia: "));
        String apodo = JOptionPane.showInputDialog("Apodo:");
        if(identidadUnica(iD, "t")){
            transportistas.add(new Transportistas(exp, apodo, nombre, iD, fecha));
        }       
    }
    
    public static void crearTransporte(){
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("*** Tipos de transporte ***\n"
                + "1) Bus\n"
                + "2) Taxi\n"
                + "3) MotoTaxi\n"
                + "4) Rapidito\n"));
        
        String color = JOptionPane.showInputDialog("Color: ");

        int placa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la placa del transporte: "));
        boolean placaExiste = false;
        for(Transporte placa_: transportes){
            if(placa_.getPlaca() == placa){
                placaExiste = true;
                break;
            }
        }
        if (placaExiste == false){
            String nombretranst = JOptionPane.showInputDialog("Ingrese el nombre del transportista:");
            boolean nombreExiste = false;
            for(Transportistas nombre: transportistas){
                if (nombre.getNombre() == nombretranst){
                    nombreExiste = true;
                    break;  
                }
            }
            if(nombreExiste == false){
                switch(tipo){
                    case 1:{
                        int nSillas = Integer.parseInt(JOptionPane.showInputDialog("Número de sillas: "));
                        int nDePie = Integer.parseInt(JOptionPane.showInputDialog("Capacidad máxima de personas de pie: "));
                        
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
                    
                }
            }
        }

        
    }
    
    public static void Simulacion(){
        
    }
    
} // main
