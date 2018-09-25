/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta clase es para conocer la cantidad de ejemplares disponibles de un libro
 * @author Santiago Vargas, Jonathan Jimenez, Diego Irreño
 * @version 24/09/2018 
 */
public class EjemplaresDisponibles {
    private int ejemplaresDisponibles;
    private Libro libro;

    /**
     * Constructor para los ejemplares disponibles
     * @param ejemplaresDisponibles el parametro es la cantidad de ejemplares disponibles en la biblioteca
     * @param libro el parametro es el libro sobre el cual se desea saber los ejemplares
     */
    public EjemplaresDisponibles(int ejemplaresDisponibles, Libro libro) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
        this.libro = libro;
    }

    /**
     * Medoto que devuelve la cantidad de ejemplares disponibles de un libro
     * @return devuelve la cantidad de ejemplares disponibles de un libro
     */
    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    /**
     * Metodo que asigna una cantidad de ejmplares disponible a un libro
     * @param ejemplaresDisponibles el parametro es la cantidad de ejemplares disponibles de un libro
     */
    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    /**
     * Metodo que devuelve el libro del cual se sabe la cantidad de ejemplares
     * @return devuelve el libro 
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Metodo que asigna los datos a un libro 
     * @param libro el parametro es el los datos del libro
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

}
