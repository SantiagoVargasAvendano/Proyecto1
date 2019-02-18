
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class EducacionContinuada extends Sede implements Serializable{
    private String claseMasPopular;

    public EducacionContinuada(String claseMasPopular, String nombre, String direccion, int telefono, double areaConstruida, String tipoPrograma, String nombrePrograma, String descripcion) {
        super(nombre, direccion, telefono, areaConstruida, tipoPrograma, nombrePrograma, descripcion);
        this.claseMasPopular = claseMasPopular;
    }

    public String getClaseMasPopular() {
        return claseMasPopular;
    }

    public void setClaseMasPopular(String claseMasPopular) {
        this.claseMasPopular = claseMasPopular;
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

    @Override
    public ArrayList darInformacion() {
        ArrayList informacion = super.darInformacion(); 
        informacion.add(claseMasPopular);
        return informacion;
    }
    
    

}
