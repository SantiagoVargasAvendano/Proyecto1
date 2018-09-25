import java.util.ArrayList;
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
public class Estanteria {
    private String categoriaOrigen; 
    private String categoria;
    private boolean estaLlena;
    private int numEstanteria;
    private ArrayList<Libro> libros;

    /**
     * Constructor para la estanteria
     * @param categoriaOrigen el parametro es si la estanteria tiene libros nuevos o usados
     * @param categoria el parametro es el genero del libro, si es literatura o es universitario
     * @param estaLlena el parametro es un indicador de si la estanteria esta llena
     * @param numEstanteria el parametro es el numero de la estanteria
     * @param libros el parametro son los libros que estan ubicados en esa estanteria
     */
    public Estanteria(String categoriaOrigen, String categoria, boolean estaLlena, int numEstanteria, ArrayList<Libro> libros) {
        this.categoriaOrigen = categoriaOrigen;
        this.categoria = categoria;
        this.estaLlena = estaLlena;
        this.numEstanteria = numEstanteria;
        this.libros = libros;
    }

    /**
     * Metodo que devulve la catrgoria de origen de la estanteria
     * @return devuelve la categoria de origen de los libros que deberian estar en la estanteria
     */
    public String getCategoriaOrigen() {
        return categoriaOrigen;
    }

    /**
     * Metodo que asigna una categoria del origen de los libros a la estanteria
     * @param categoriaOrigen el parametro es la categoria de origen de los libros de la estanteria
     */
    public void setCategoriaOrigen(String categoriaOrigen) {
        this.categoriaOrigen = categoriaOrigen;
    }

    /**
     * Metodo que devuelve el genero de los libros de la estanteria
     * @return devuelve el genero de los libros que estan en la estanteria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Metodo que asigna un genero a la estanteria
     * @param categoria el parametro es el genero de los libros que hay en la estanteria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Medoto para saber si la estanteria esta llena
     * @return si o no, dependiendo si la estanteria esta o no llena
     */
    public boolean isEstaLlena() {
        return estaLlena;
    }

    /**
     * Metodo para asignar a un estanteria la cualidad de llena o con espacio
     * @param estaLlena el parametro es si la libreria esta o no llena
     */
    public void setEstaLlena(boolean estaLlena) {
        this.estaLlena = estaLlena;
    }

    /**
     * Metodo para conocer los libros que hay en la estanteria
     * @return devuelve los libros que estan en la estanteria
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * Metodo para agregar libros a la estanteria
     * @param libro el parametro es el libro a agregar a la estanteria
     */
    public void addLibros(Libro libro){
        libros.add(libro);
    }

    /**
     * Metodo para saber el numero de una estanteria
     * @return el numero de la estanteria
     */
    public int getNumEstanteria() {
        return numEstanteria;
    }

    /**
     * Metodo para asignar un numero a la estanteria
     * @param numEstanteria el parametro es el numero de la estanteria
     */
    public void setNumEstanteria(int numEstanteria) {
        this.numEstanteria = numEstanteria;
    }
        
}
