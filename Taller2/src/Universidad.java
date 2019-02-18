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
public class Universidad {
    private String nombre;
    private ArrayList<Sede> sedes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.sedes = new ArrayList<>();
    }

    public boolean addSedePro(int numProgramasAltaCalidad, String nombre, String direccion, int telefono, double areaConstruida,String tipoPrograma, String nombrePrograma, String descripcion){
        return sedes.add(new Profesional(numProgramasAltaCalidad, nombre, direccion, telefono, areaConstruida, tipoPrograma, nombrePrograma, descripcion));
    }
    
    public boolean addSedeTec(int estudiantesMatriculados, String nombre, String direccion, int telefono, double areaConstruida,String tipoPrograma, String nombrePrograma, String descripcion){
        return sedes.add(new Tecnologica(estudiantesMatriculados, nombre, direccion, telefono, areaConstruida, tipoPrograma, nombrePrograma, descripcion));
    }
    
    public boolean addSedeEdCon(String claseMasPopular, String nombre, String direccion, int telefono, double areaConstruida,String tipoPrograma, String nombrePrograma, String descripcion){
        return sedes.add(new EducacionContinuada(claseMasPopular, nombre, direccion, telefono, areaConstruida, tipoPrograma, nombrePrograma, descripcion));
    }
    
    public void deleteSede(String nombreSede){
        for(int i=0;i<sedes.size();i++){
            if(sedes.get(i).getNombre().equals(nombreSede)){
                sedes.set(i, null);
            }
        }
    }
    
    public Sede buscarSede(String nombreSede){
        for(int i=0;i<sedes.size();i++){
            if(sedes.get(i).getNombre().equals(nombreSede)){
                return sedes.get(i);
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }
    
    
    
    
    
}
