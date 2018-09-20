import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Cuenta {
    private int numeroCuenta;
    private double cuentaCorriente;
    private Fecha fechaCreacion;
    private String nomCliente;
    private ArrayList<Movimiento> movimiento;

    public Cuenta(int numeroCuenta, double cuentaCorriente, Fecha fechaCreacion, String nomCliente, ArrayList<Movimiento> movimiento) {
        this.numeroCuenta = numeroCuenta;
        this.cuentaCorriente = cuentaCorriente;
        this.fechaCreacion = fechaCreacion;
        this.nomCliente = nomCliente;
        this.movimiento = new ArrayList<>(movimiento);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(double cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public ArrayList<Movimiento> getMovimiento() {
        return movimiento;
    }
    
    public Movimiento getUnMovimiento(int n){
        return movimiento.get(n);
    }

    public void setMovimiento(ArrayList<Movimiento> movimiento) {
        this.movimiento = movimiento;
    }
}
