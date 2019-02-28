package Proceso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Eslabon {
    protected String nombre;
    protected String descripcion;
    protected Direccion direccion;

    public Eslabon(String nombre, String descripcion,int latitud, int longitud) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = new Direccion(latitud, longitud);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    
    
    
    
}
