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
    
    public ArrayList darInformacion(){
        ArrayList informacion = new ArrayList<>();
        informacion.add(nombre);
        informacion.add(direccion);
        informacion.add(telefono);
        informacion.add(areaConstruida);
        for (int i = 0; i<programas.size(); i++) {
            informacion.add(programas.get(i).getNombre());
            informacion.add(programas.get(i).getDescripcion());
        }
        return informacion;
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public ArrayList<ProgramaFormacion> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<ProgramaFormacion> programas) {
        this.programas = programas;
    }
    
    public ProgramaFormacion getPrograma(String nomPrograma){
        for(int i=0;i<programas.size();i++){
            if(programas.get(i).getNombre().equals(nomPrograma))
                return programas.get(i);
        }
        return null;
    }
}
