import java.util.*;
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
public class Organizacion {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Premio> premios;
    private ArrayList<RegistroCarta> cartas;

    public Organizacion(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean addPremio(Premio premio){
        return this.premios.add(premio);
    }
    
    public boolean addEstudiante(Estudiante estudiante){
        return this.estudiantes.add(estudiante);
    }
    
    public boolean addCarta(RegistroCarta registroCarta){
        return this.cartas.add(registroCarta);
    }

    public ArrayList<RegistroCarta> getCartas() {
        return cartas;
    }
    
}
