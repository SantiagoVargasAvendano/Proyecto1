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
public class Banco {
    private String code;
    private ArrayList<Type> types;
    private ArrayList<Cuenta> cuentas;

    public Banco(String code, ArrayList<Type> types, ArrayList<Cuenta> cuentas) {
        this.code = code;
        this.types = types;
        this.cuentas = cuentas;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Type> types) {
        this.types = types;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public String getNombreCliente(int i){
        return cuentas.get(i).getNomCliente();
    }
    public int getNumeroCuenta(int i){
        return cuentas.get(i).getNumeroCuenta();
    }
    public double getCuentaCorriente(int i){
        return cuentas.get(i).getCuentaCorriente();
    }
    public Fecha getFechaCreacion(int i){
        return cuentas.get(i).getFechaCreacion();
    }
    public Fecha getFechaMovimiento(int i, int n){
        return cuentas.get(i).getUnMovimiento(n).getFecha();
    }
    public double getSaldoAnterior(int i, int n){
        return cuentas.get(i).getUnMovimiento(n).getSaldoAnterior();
    }
    public double getCantidad(int i, int n){
        return cuentas.get(i).getUnMovimiento(n).getCantidad();
    }
    public Type getType(int i, int n){
        return cuentas.get(i).getUnMovimiento(n).getType();
    }
    
    
}
