package Proceso;

import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Producido extends Producto{
    private ArrayList<MateriaPrima> materiaPrima;
    private int numLote;

    public Producido(ArrayList<MateriaPrima> materiaPrima, String nombre, String destino, Fecha fechaLlegada, Fecha fechaSalida, int numLote) {
        super(nombre, destino, fechaLlegada, fechaSalida);
        this.materiaPrima = materiaPrima;
        this.numLote = numLote;
    }

    public ArrayList<MateriaPrima> getMateriaPrima() {
        return materiaPrima;
    }

    public int getNumLote() {
        return numLote;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDestino() {
        return destino;
    }

    public Fecha getFechaLlegada() {
        return fechaLlegada;
    }

    public Fecha getFechaSalida() {
        return fechaSalida;
    }
    
    

    
}
