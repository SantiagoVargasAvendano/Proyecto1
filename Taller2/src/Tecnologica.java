
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
public class Tecnologica extends Sede{
    private int estudiantesMatriculados;

    public Tecnologica(int estudiantesMatriculados, String nombre, String direccion, int telefono, double areaConstruida, String tipoPrograma, String nombrePrograma, String descripcion) {
        super(nombre, direccion, telefono, areaConstruida, tipoPrograma, nombrePrograma, descripcion);
        this.estudiantesMatriculados = estudiantesMatriculados;
    }

    public int getEstudiantesMatriculados() {
        return estudiantesMatriculados;
    }

    public void setEstudiantesMatriculados(int estudiantesMatriculados) {
        this.estudiantesMatriculados = estudiantesMatriculados;
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
    public ArrayList<String> darInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
