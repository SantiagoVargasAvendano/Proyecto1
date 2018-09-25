/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta clase es para agregar el precio y descuento a un libro
 * @author Santiago Vargas, Jonathan Jimenez, Diego Irreño
 * @version 24/09/2018 
 */
public class Precio {
    private double precio;
    private double Descuento;

    /**
     * Constructor para el precio
     * @param precio el parametro es el precio del libro en pesos colombianos
     * @param Descuento el parametro es el descuento del libreo, si no tiene descuento el parametro debe ser 0
     */
    public Precio(double precio, double Descuento) {
        this.precio = precio;
        this.Descuento = Descuento;
    }

    /**
     * Metodo que devuelve el precio del libro
     * @return devuelve el precio del libro en pesos colombianos
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo que asigna un precio al libro
     * @param precio el parametro es el precio del libro
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo que devuelve el descunto del libro
     * @return devuelve el descuento del libro
     */
    public double getDescuento() {
        return Descuento;
    }

    /**
     * Metodo que asigna un descuento al libro
     * @param Descuento el parametro es el descuento del libro
     */
    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }
  
    /**
     * Metodo para saber el valor final del libro
     * @return devuelve el precio del libro afectado por el descuento
     */
    public double precioCompra(){
        double precioFinal = this.precio;
        return precioFinal*(100-Descuento)/100;
    }
    
}
