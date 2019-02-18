
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Estudiante implements Serializable{
    private String nombre;
    private String apellido;
    private String colegioGrado;
    private int annioGrado;
    private String programaRegistrado;

    public Estudiante(String nombre, String apellido, String colegioGrado, int annioGrado, String programaRegistrado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colegioGrado = colegioGrado;
        this.annioGrado = annioGrado;
        this.programaRegistrado = programaRegistrado;
    }
    
    
}
