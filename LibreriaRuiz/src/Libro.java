/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Libro {
    private String titulo;
    private String origen;
    private String editorial;
    private String genero;
    private int estanteria;
    private Precio precio;
    private Autor autor;

    public Libro(String titulo, String origen, String editorial, String genero, int estanteria, double precio, double descuento,String autor, String apellido) {
        this.titulo = titulo;
        this.origen = origen;
        this.editorial = editorial;
        this.genero = genero;
        this.estanteria = estanteria;
        this.precio = new Precio(precio,descuento);
        this.autor = new Autor(autor, apellido);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(int estanteria) {
        this.estanteria = estanteria;
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
       
}
