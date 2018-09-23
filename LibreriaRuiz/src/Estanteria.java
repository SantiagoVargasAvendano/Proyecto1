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
public class Estanteria {
    private String categoriaOrigen; 
    private String origen;
    private boolean estaLlena;
    private int numEstanteria;
    private ArrayList<Libro> libros;

    public Estanteria(String categoriaOrigen, String origen, boolean estaLlena, int numEstanteria, ArrayList<Libro> libros) {
        this.categoriaOrigen = categoriaOrigen;
        this.origen = origen;
        this.estaLlena = estaLlena;
        this.numEstanteria = numEstanteria;
        this.libros = libros;
    }

    public String getCategoriaOrigen() {
        return categoriaOrigen;
    }

    public void setCategoriaOrigen(String categoriaOrigen) {
        this.categoriaOrigen = categoriaOrigen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isEstaLlena() {
        return estaLlena;
    }

    public void setEstaLlena(boolean estaLlena) {
        this.estaLlena = estaLlena;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void addLibros(Libro libro){
        libros.add(libro);
    }

    public int getNumEstanteria() {
        return numEstanteria;
    }

    public void setNumEstanteria(int numEstanteria) {
        this.numEstanteria = numEstanteria;
    }
        
}
