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
public class DistributionCenter extends Eslabon{
    private ArrayList<Distribuido> produDistri;

    public DistributionCenter(String nombre, String descripcion, int latitud, int longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.produDistri = new ArrayList<>();
    }
    
    public boolean addProduDistri(Producido productoProducido, String nombre, String destino, Fecha fechaLlegada, Fecha fechaSalida){
        return produDistri.add(new Distribuido(productoProducido, nombre, destino, fechaLlegada, fechaSalida));
    }
    
}
