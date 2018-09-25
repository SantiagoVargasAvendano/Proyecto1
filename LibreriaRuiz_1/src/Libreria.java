import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta clase es para el control de la libreria
 * @author Santiago Vargas, Jonathan Jimenez, Diego Irreño
 * @version 24/09/2018 
 */
public class Libreria {
    private ArrayList<Estanteria> estanterias;
    ArrayList<EjemplaresDisponibles> catalogo;

    /**
     * Constructor de la libreria
     */
    public Libreria() {
        this.estanterias = new ArrayList<>();
        this.catalogo = new ArrayList<>();
    }

    /**
     * Metodo que retorna las estanterias
     * @return devuelve las estanterias que hay en la libreria
     */
    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    /**
     * Metodo que funciona como catalogo
     * @return devuelve los libros que hay, y la cantidad disponible de cada uno
     */
    public ArrayList<EjemplaresDisponibles> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<EjemplaresDisponibles> catalogo) {
        this.catalogo = catalogo;
    }
    
    /**
     * Medodo para añadir una estanteria a la libreria
     * @param estanteria el parametro es una estanteria con todas sus caracteristicas
     */
    public void addEstanteria(Estanteria estanteria){
        estanterias.add(estanteria);
    }
    
    /**
     * Metodo para agregar un libro al catalogo
     * @param nuevoLibro el parametro es todas las caracteristicas del libro y sus ejemplares disponibles
     */
    public void addLibro(EjemplaresDisponibles nuevoLibro){
        catalogo.add(nuevoLibro);
    }
    
    /**
     * Metodo para saber la ubicacion de un libro
     * @param titulo el parametro es el titulo del libro a buscar
     * @return devuelve el numero de la estanteria donde esta el libro
     */
    public int buscarUbicacionXTitulo(String titulo){
        for(int i=0;i<catalogo.size();i++){
            if(catalogo.get(i).getLibro().getTitulo().equals(titulo))
                return catalogo.get(i).getLibro().getEstanteria();
        }
        return 0;
    }
    
    /**
     * Metodo para conocer cuantoe ejemplares de un libro hay en la libreria
     * @param titulo el parametro es el titulo del libro a buscar
     * @return la cantidad de ejemplares disponibles que tiene la tienda
     */        
    public int ejemplaresDispobilesXTitulo(String titulo){
        for(int i=0;i<catalogo.size();i++){
            if(catalogo.get(i).getLibro().getTitulo().equals(titulo))
                return catalogo.get(i).getEjemplaresDisponibles();
        }
        return 0;
    }
    
    /**
     * Metodo para saber el origen del libro
     * @param titulo el parametro es el titulo del libro a buscar
     * @return devuelve si el libro es nuevo o usado
     */
    public String origenXTitulo(String titulo){
        for(int i=0;i<catalogo.size();i++){
            if(catalogo.get(i).getLibro().getTitulo().equals(titulo))
                return catalogo.get(i).getLibro().getOrigen();
        }
        return null;
    }
    
    /**
     * Metodo para sabel el precio de un libro
     * @param titulo el parametro es el titulo del libro a buscar
     * @return devuelve el precio del libro, sin decuento
     */
    public double precioXTitulo(String titulo){
        for(int i=0;i<catalogo.size();i++){
            if(catalogo.get(i).getLibro().getTitulo().equals(titulo))
                return catalogo.get(i).getLibro().getPrecio().getPrecio();
        }
        return 0;
    }

    
}