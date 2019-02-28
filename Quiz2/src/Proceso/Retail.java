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
public class Retail extends Eslabon{
    private ArrayList<Venta> produVenta;

    public Retail(String nombre, String descripcion, int latitud, int longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.produVenta = new ArrayList<>();
    }
    
    public boolean addProduVenta(float precio, int codVenta, Distribuido productoDistribuido){
        return this.produVenta.add(new Venta(precio, codVenta, productoDistribuido));
    }
    
}
