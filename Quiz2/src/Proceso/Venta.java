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
public class Venta{
    private float precio;
    private int codVenta;
    private Distribuido productoDistribuido;

    public Venta(float precio, int codVenta, Distribuido productoDistribuido) {
        this.precio = precio;
        this.codVenta = codVenta;
        this.productoDistribuido = productoDistribuido;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public Distribuido getProductoDistribuido() {
        return productoDistribuido;
    }
    
    

    
}
