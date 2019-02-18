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
public abstract class Sede {
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected double areaConstruida;
    protected ArrayList<ProgramaFormacion> programas;

    public Sede(String nombre, String direccion, int telefono, double areaConstruida,String tipoPrograma, String nombrePrograma, String descripcion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.areaConstruida = areaConstruida;
        this.programas = new ArrayList<>();
        programas.add(new ProgramaFormacion(tipoPrograma, nombrePrograma, descripcion));
    }
    
    public abstract ArrayList<String> darInformacion();

    public boolean agregarPrograma(String tipoPrograma, String nombrePrograma, String descripcion){
        return programas.add(new ProgramaFormacion(tipoPrograma, nombrePrograma, descripcion));
    }
    
    public boolean eliminarPrograma(String nombrePrograma){
        for(int i=0;i<programas.size();i++){
            if(nombrePrograma.equals(programas.get(i).getNombre()))
                programas.set(i, null);
        }
        return false;
    }
}
