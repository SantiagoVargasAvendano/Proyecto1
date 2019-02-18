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
    
    void administrarSede(){
        
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido, aqui podras crear tu propia universidad y administrarla\n1. Ingresa el nombre de la universidad: ");
        String nombre = leer.next();
        Universidad uni = new Universidad(nombre);
        
        int opc;
        do{
            System.out.println("Este es tu menu de opciones, elige que quieres hacer: ");
            System.out.println("1. Agregar una nueva sede\n2. Administrar una sede\n3. Eliminar una sede\n4. Obtener informacion de una sede\n0. Salir del menu");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Elige el tipo de sede que deseas crear: \n1. Profesional\n2. Tecnologica\n3. Educacion Continuada");
                    int tipoSede = leer.nextInt();
                    System.out.println("Ingresa el nombre de la sede: ");
                    String nombreSede = leer.next();
                    System.out.println("Ingresa la direccion de la sede: ");
                    String direccion = leer.next();
                    System.out.println("Ingresa el numero de telefono de la sede: ");
                    int telefonoSede = leer.nextInt();
                    System.out.println("Ingrese el Area en metros cuadrados construidos de la sede: ");
                    double AreaConsSede = leer.nextDouble();                 
                    
                    switch(tipoSede){
                        case 1:
                            System.out.println("Elige el tipo de programa para tu sede:\n1. profesional\n2. tecnologico\n3. educacion continuada ");
                            int opcPro = leer.nextInt();
                            System.out.println("Ingrese el nombre del programa: ");
                            String nomPrograma = leer.next();
                            System.out.println("Ingrese alguna descripcion del programa: ");
                            String descripcion = leer.next();
                            System.out.println("Si el programa que ingreso es de alta calidad, ingrese 1, sino ingrese 0: ");
                            int num = leer.nextInt();
                            String tipoPrograma = null;
                            if(opcPro==1){
                                tipoPrograma = "profesional";
                            }if(opcPro==2){
                                tipoPrograma = "profesional";
                            }if(opcPro==3){
                                tipoPrograma = "profesional";
                            }
                            uni.addSedePro(num, nombreSede, direccion, telefonoSede, AreaConsSede, tipoPrograma, nomPrograma, descripcion);
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del programa: ");
                            String nomPrograma1 = leer.next();
                            System.out.println("Ingrese alguna descripcion del programa: ");
                            String descripcion1 = leer.next();
                            System.out.println("Ingrese el numero de estudiantes de la sede: ");
                            int num2 = leer.nextInt();
                            uni.addSedeTec(num2, nombreSede, direccion, telefonoSede, AreaConsSede, "tecnologico", nomPrograma1, descripcion1);
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre del programa: ");
                            String nomPrograma2 = leer.next();
                            System.out.println("Ingrese alguna descripcion del programa: ");
                            String descripcion2 = leer.next();
                            uni.addSedeEdCon(nomPrograma2, nombreSede, direccion, telefonoSede, AreaConsSede, "educacion continuada", nomPrograma2, descripcion2);
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
            
        }while(opc<1 || opc>4);
    }
    
}
