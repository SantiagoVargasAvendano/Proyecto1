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
public class Farmer extends Eslabon{
    private ArrayList<MateriaPrima> produCulti;

    public Farmer(String nombre, String descripcion, int latitud, int longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.produCulti = new ArrayList<>();
    }
    
    public boolean addProduCulti(String nombre, String destino, Fecha fechaLlegada, Fecha fechaSalida){
        String granja = super.nombre;
        return produCulti.add(new MateriaPrima(nombre, destino, fechaLlegada, fechaSalida, granja));
    }
    
}
