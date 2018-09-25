/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta clase es para agregar el nombre y apellido de un autor al libro
 * @author Santiago Vargas, Jonathan Jimenez
 * @version 23/09/2018 
 */
public class Autor {
    private String nombre;
    private String apellido;

    /**
     * Constructor para el autor
     * @param nombre el parametro es el nombre del autor
     * @param apellido el parametro es el apellido del autor
     */
    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Metodo que devuelve el nombre del autor
     * @return devuelve el nombre del autor del libro
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que asigna un nombre al autor
     * @param nombre el parametro es el nombre del autor del libro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el apellido del autor
     * @return devuelve el apellido del autor del libro
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * /**
     * Metodo que asigna un apellido al autor
     * @param apellido el parametro es el apellido del autor del libro
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
