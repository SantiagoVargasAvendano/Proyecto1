import java.util.Scanner;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int i;
        System.out.println("Ingrese el nombre de la organizacion: ");
        String nombre = lectura.next();
        ArrayList<Patrocinador> patrocinadores = new ArrayList<>();
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Organizacion organzacion = new Organizacion(nombre);
        do{
            System.out.println("1. Agregar patrocinador");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Agregar premio");
            System.out.println("4. Generar carta");
            System.out.println("5. Listar cartas");
            System.out.println("0. Salir");
            i = lectura.nextInt();
            
            switch(i){
                case 1:
                    System.out.println("Ingrese el nombre del patrocinador: ");
                    String nombre1 = lectura.next();
                    Patrocinador patrocinador = new Patrocinador(nombre1);
                    patrocinadores.add(patrocinador);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre2 = lectura.next();
                    Estudiante estudiante = new Estudiante(nombre2);
                    estudiantes.add(estudiante);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de estudiantes a los que esta dirigido el premio: ");
                    int p = lectura.nextInt();
                    ArrayList<Estudiante> estudiantesPremios = new ArrayList<>();
                    for(int g=0;g<p;g++){
                        int t = g+1;
                        System.out.println("Ingrese el nombre del estudiante numero " + t + " :");
                        String nombreEstudiante = lectura.next();
                        for(int j=0;j<estudiantes.size();j++){
                            if(nombreEstudiante.equals(estudiantes.get(i).getNombre()))
                                estudiantesPremios.add(estudiantes.get(i));
                        }
                    }
                    System.out.println("Ingrese el nombre del patrocinador que creo el premio: ");
                    String nombrePatrocinador = lectura.next();
                    Patrocinador patrocinadorPremio = null;
                    int h=0;
                    for(int y=0;y<patrocinadores.size();y++){
                        if(nombrePatrocinador.equals(patrocinadores.get(i).getNombre()))
                            h = i;
                    }
                    System.out.println("Ingrese el nombre del premio: ");
                    String nombrePremio = lectura.next();
                    patrocinadores.get(h).addPremio(nombrePremio, estudiantesPremios);
                    break;
                case 4:
                    System.out.println("Ingrese el texto de la carta: ");
                    String mensaje = lectura.next();
                    Carta carta = new Carta(mensaje);
                    System.out.println("Ingrese la fecha de la carta: ");
                    String fecha = lectura.next();
                    System.out.println("Ingrese el nombre del estudiante que remite la carta: ");
                    String remitente = lectura.next();
                    ArrayList<Patrocinador> destinatarios= null;
                    int g=0;
                    for(int r=0;r<estudiantes.size();r++){
                        if(remitente.equals(estudiantes.get(r).getNombre()))
                            g = r;
                    }
                    destinatarios = estudiantes.get(g).getPremio().getPatrocinadores();
                    RegistroCarta carta1 = new RegistroCarta(fecha, carta, estudiantes.get(g), destinatarios);
                    organzacion.addCarta(carta1);
                    break;
                case 5:
                    for(int s=0;s<organzacion.getCartas().size();s++){
                        System.out.println(organzacion.getCartas().get(s));
                    }
                    break;
                default: 
                    break;            
            }
        }while(i<5 && i>0); 
    }

}
