
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
public class Profesional extends Sede{
    private int numProgramasAltaCalidad;

    public Profesional(int numProgramasAltaCalidad, String nombre, String direccion, int telefono, double areaConstruida, String tipoPrograma, String nombrePrograma, String descripcion) {
        super(nombre, direccion, telefono, areaConstruida, tipoPrograma, nombrePrograma, descripcion);
        this.numProgramasAltaCalidad = numProgramasAltaCalidad;
    }

    public int getNumProgramasAltaCalidad() {
        return numProgramasAltaCalidad;
    }

    public void setNumProgramasAltaCalidad(int numProgramasAltaCalidad) {
        this.numProgramasAltaCalidad = numProgramasAltaCalidad;
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
    
    public ArrayList<ProgramaFormacion> programasTecnicos(){
        ArrayList<ProgramaFormacion> programasTecnicos = new ArrayList<>();
        for(int i=0;i<programas.size();i++){
            if(programas.get(i).getTipoPrograma().equals("tecnologicos"))
                programasTecnicos.add(programas.get(i));
        }
        return programasTecnicos;
    }

    @Override
    public ArrayList darInformacion() {
        ArrayList informacion = super.darInformacion(); 
        informacion.add(numProgramasAltaCalidad);
        return informacion;
    }

    
}
