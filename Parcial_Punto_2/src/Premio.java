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
public class Premio {
    private String premio;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Patrocinador> patrocinadores;

    public Premio(String premio, ArrayList<Estudiante> estudiantes, Patrocinador patrocinadores) {
        this.premio = premio;
        this.estudiantes = estudiantes;
        this.patrocinadores.add(patrocinadores);
    }

    public String getPremio() {
        return premio;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }
    
    public boolean addPatrocinador(Patrocinador patrocinador){
        return this.patrocinadores.add(patrocinador);
    }  
    
    public boolean addEstudiante(Estudiante estudiante){
        return this.estudiantes.add(estudiante);
    }  
}
