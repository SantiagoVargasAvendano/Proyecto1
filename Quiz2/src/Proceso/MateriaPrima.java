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
public class MateriaPrima extends Producto{
    private String granja;

    public MateriaPrima(String nombre, String detino, Fecha fechaLlegada, Fecha fechaSalida, String granja) {
        super(nombre, detino, fechaLlegada, fechaSalida);
        this.granja = granja;
    }

    public String getGranja() {
        return granja;
    }  
}
