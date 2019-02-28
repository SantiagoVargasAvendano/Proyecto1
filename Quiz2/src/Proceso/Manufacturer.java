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
public class Manufacturer extends Eslabon{
    private ArrayList<Producido> produManu;

    public Manufacturer(String nombre, String descripcion, int latitud, int longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.produManu = new ArrayList<>();
    }
    
    public boolean addProduManu(ArrayList<MateriaPrima> materiaPrima, String nombre, String destino, Fecha fechaLlegada, Fecha fechaSalida, int numLote){
        return produManu.add(new Producido(materiaPrima, nombre, destino, fechaLlegada, fechaSalida, numLote));
    }
    
}
