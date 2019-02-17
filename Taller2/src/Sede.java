
import static java.lang.System.in;
import java.util.Scanner;

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

    public Sede(String nombre, String direccion, int telefono, double areaConstruida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.areaConstruida = areaConstruida;
    }

    
}
