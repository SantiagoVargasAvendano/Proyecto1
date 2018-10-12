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
public class Patrocinador {
    private String nombre;
    private ArrayList<Premio> premios;

    public Patrocinador(String nombre) {
        this.nombre = nombre;
        this.premios = new ArrayList<>();                
    }
    
    public boolean addPremio(String premio, ArrayList<Estudiante> estudiantes){
        Patrocinador patrocinador = new Patrocinador(nombre);
        return premios.add(new Premio(premio, estudiantes, patrocinador));
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Premio> getPremios() {
        return premios;
    }
    
    
}
