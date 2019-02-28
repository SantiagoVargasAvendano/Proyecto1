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
public class Producto {
    protected String nombre;
    protected String destino;
    protected Fecha fechaLlegada;
    protected Fecha fechaSalida;

    public Producto(String nombre, String destino, Fecha fechaLlegada, Fecha fechaSalida) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
    }
    
    
}
