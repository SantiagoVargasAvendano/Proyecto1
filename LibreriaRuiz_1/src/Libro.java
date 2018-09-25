/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta clase es para agregar los datos de un libro
 * @author Santiago Vargas, Jonathan Jimenez, Diego Irreño
 * @version 24/09/2018 
 */
public class Libro {
    private String titulo;
    private String origen;
    private String editorial;
    private String genero;
    private int estanteria;
    private Precio precio;
    private Autor autor;

    /**
     * Constructor para el libro
     * @param titulo el parametro es el titulo del libro
     * @param origen el parametro es si el libro es nuevo o usado
     * @param editorial el parametro es el el nombre de la editorial
     * @param genero el parametro es el si el libro es literatura o universitario
     * @param estanteria el parametro es la estanteria donde esta el libro
     * @param precio el parametro es el precio del libro
     * @param descuento el parametro es el descuento del libro (puede ser 0)
     * @param autor el parametro es el nombre del autor del libro
     * @param apellido el parametro es el apellido del autor del libro
     */
    public Libro(String titulo, String origen, String editorial, String genero, int estanteria, double precio, double descuento,String autor, String apellido) {
        this.titulo = titulo;
        this.origen = origen;
        this.editorial = editorial;
        this.genero = genero;
        this.estanteria = estanteria;
        this.precio = new Precio(precio,descuento);
        this.autor = new Autor(autor, apellido);
    }

    /**
     * Metodo que devuelve el titulo del libro
     * @return devuelve el titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Metodo que asigna un titulo al libro
     * @param titulo el parametro es el el titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo devuelve el origen del libro
     * @return devuelve el origen del libro
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Metodo que asinga un origen al libro
     * @param origen el parametro es el origen del libro, es decir si es nuevo o usado
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Metodo que devuelve la editorial del libro
     * @return devuelve la editorial del libro
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Metodo que asigna una editorial al libro
     * @param editorial el parametro es el nombre de la editorial del libro
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Metodo que devuelve el genero del libro
     * @return devuelve el genero del libro
     */
    public String getGenero() {
        return genero;
    }
    
    /**
     * Metodo que asigna un genero al libro
     * @param genero el parametro es el genero del libro, es decir si el libro es de literatura o es un libro universitario
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Metodo que devuelve el numero de la estanteria
     * @return devuelve el numero de la estanteria
     */
    public int getEstanteria() {
        return estanteria;
    }

    /**
     * Metodo que asigna una estanteria al libro
     * @param estanteria el parametro es el numero de la estanteria en la cual se ubica el libro
     */
    public void setEstanteria(int estanteria) {
        this.estanteria = estanteria;
    }

    /**
     * Metodo que devuelve el precio y descuento del libro
     * @return devuelve el precio y descuento del libro 
     */
    public Precio getPrecio() {
        return precio;
    }

    /**
     * Metodo que asigna un precio y un descuento al libro
     * @param precio el parametro es el precio y descuento del libro
     */
    public void setPrecio(Precio precio) {
        this.precio = precio;
    }

    /**
     * Metodo que devuelve el autor del libro
     * @return devuelve el autor del libro
     */
    public Autor getAutor() {
        return autor;
    }
    
    /**
     * Metodo que asigna un autor al libro
     * @param autor el parametro es el nombre y apellido del autor
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
       
}
