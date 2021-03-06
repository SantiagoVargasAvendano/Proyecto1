import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido, aqui podras crear tu propia universidad y administrarla\n1. Ingresa el nombre de la universidad: ");
        String nombre = leer.next();
        Universidad uni = new Universidad(nombre);
        
        File guardarTexto = new File("guardarTexto.txt");
        if(!guardarTexto.exists()){
            try {
                guardarTexto.createNewFile();
                ObjectOutputStream objeto = new ObjectOutputStream(new FileOutputStream(guardarTexto));
                objeto.writeObject(uni);
                objeto.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try { 
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(guardarTexto));
                uni = (Universidad)entrada.readObject();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        int opc;
        do{
            System.out.println("Este es tu menu de opciones, elige que quieres hacer: ");
            System.out.println("1. Agregar una nueva sede\n2. Administrar una sede\n3. Eliminar una sede\n4. Obtener informacion de una sede\n5. Obtener informacion de todas las sedes\n0. Salir del menu");
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
                            System.out.println("Si el programa que ingreso es de alta calidad ingrese 1, de lo contrario ingrese 0: ");
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
                    int opcion2;
                    do{ 
                    System.out.println("Ingresa el nombre de la sede a administrar: ");
                    String nombreSedeAdm = leer.next();
                    Sede sedeAdm = uni.buscarSede(nombreSedeAdm);
                    System.out.println("Aqui esta el nuevo menu para administrar una sede: \n1. Cambiar el nombre de la sede\n2. Cambiar la direccion de la sede\n3. Cambiar numero de telefono"
                            + "             \n4. Cambiar area construida\n5. Administrar programas");
                    opcion2 = leer.nextInt();
                    switch(opcion2){
                        case 1:
                            System.out.println("Ingrese el nuevo nombre de la sede: ");
                            String nuevoNombre = leer.next();
                            uni.buscarSede(sedeAdm.getNombre()).setNombre(nuevoNombre);
                            break;
                        case 2:
                            System.out.println("Ingrese la nueva direccion de la sede: ");
                            String nuevaDir = leer.next();
                            uni.buscarSede(sedeAdm.getNombre()).setDireccion(nuevaDir);
                            break;
                        case 3:
                            System.out.println("Ingrese el nuevo telefono de la sede: ");
                            int nuevoTel = leer.nextInt();
                            uni.buscarSede(sedeAdm.getNombre()).setTelefono(nuevoTel);
                            break;
                        case 4:
                            System.out.println("Ingrese la nueva area construida de la sede: ");
                            double nueAreaCons = leer.nextDouble();
                            uni.buscarSede(sedeAdm.getNombre()).setAreaConstruida(nueAreaCons);
                            break;
                        case 5: 
                            int opcion3;
                            do{
                            System.out.println("Desde aqui puedes administrar los programas de la sede: \n1. Crear programa\n2. Borrar programa\n3. Cambiar nombre al programa\n4. Cambiar descripcion al programa");
                            opcion3 = leer.nextInt();
                            switch(opcion3){
                                case 1:
                                    System.out.println("Ingrese el nombre del programa: ");
                                    String nomPrograma = leer.next();
                                    System.out.println("Ingrese la descripcion del programa: ");
                                    String descripPrograma = leer.next();
                                    System.out.println("Ingrese el tipo del programa: ");
                                    String tipoPrograma = leer.next();
                                    uni.buscarSede(sedeAdm.getNombre()).agregarPrograma(tipoPrograma, nomPrograma, descripPrograma);
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nombre del programa a eliminar: ");
                                    String nomProgramaBorrar = leer.next();
                                    uni.buscarSede(sedeAdm.getNombre()).eliminarPrograma(nomProgramaBorrar);
                                    break;
                                case 3:
                                    System.out.println("Ingrese el nombre del programa que va a cambiar: ");
                                    String nomPrograCam = leer.next();
                                    System.out.println("Ingrese el nuevo nombre: ");
                                    String nuevoNombrePrograma = leer.next();
                                    uni.buscarSede(sedeAdm.getNombre()).getPrograma(nomPrograCam).setNombre(nuevoNombrePrograma);
                                    break;
                                case 4:
                                    System.out.println("Ingrese el nombre del programa que va a cambiar: ");
                                    String nomPrograCam1 = leer.next();
                                    System.out.println("Ingrese la nueva descripcion: ");
                                    String nuevaDescPrograma = leer.next();
                                    uni.buscarSede(sedeAdm.getNombre()).getPrograma(nomPrograCam1).setDescripcion(nuevaDescPrograma);
                                    break;                  
                            }    
                            break;                        
                            }while(opcion3>0 && opcion3<5);
                        }
                    }while(opcion2>0 && opcion2<6);                    
                    break;
                case 3:
                    System.out.println("Ingrese el nombre de la sede que quiere borrar: ");
                    String nombreSedeBorrar = leer.next();
                    uni.deleteSede(nombreSedeBorrar);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la sede de la cual quiere obtener la informacion: ");
                    String nomSedeInf = leer.next();
                    ArrayList inf = new ArrayList();
                    inf = uni.buscarSede(nomSedeInf).darInformacion();
                    for(int i=0;i<inf.size();i++){
                            System.out.println(inf.get(i));
                    }
                    break;
                case 5:
                    for(int i=0;i<uni.getSedes().size();i++){
                        ArrayList inf2 = new ArrayList();
                        inf2 = uni.getSedes().get(i).darInformacion();
                        for(int j=0;j<inf2.size();j++){
                            System.out.println(inf2.get(j));
                        }      
                    }
                    break;
            }
            
        }while(opc>0 && opc<6);
    }
    
}
