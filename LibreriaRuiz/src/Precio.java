/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Precio {
    private double precio;
    private double Descuento;

    public Precio(double precio, double Descuento) {
        this.precio = precio;
        this.Descuento = Descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }
  
    public double precioCompra(){
        double precio = this.precio;
        return precio*(100-Descuento)/100;
    }
    
}
