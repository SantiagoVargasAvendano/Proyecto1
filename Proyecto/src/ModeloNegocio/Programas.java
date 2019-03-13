/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloNegocio;

/**
 *
 * @author Asus
 */
public class Programas {
    protected String ID;
    protected String nombre;

    public Programas(String ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
