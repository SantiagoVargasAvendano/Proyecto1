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
public class Distribuido extends Producto{
    private Producido productoProducido;

    public Distribuido(Producido productoProducido, String nombre, String destino, Fecha fechaLlegada, Fecha fechaSalida) {
        super(nombre, destino, fechaLlegada, fechaSalida);
        this.productoProducido = productoProducido;
    }

    public Producido getProductoProducido() {
        return productoProducido;
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
