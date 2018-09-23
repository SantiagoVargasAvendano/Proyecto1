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
public class Libreria {
    private ArrayList<Estanteria> estanterias;
    ArrayList<EjemplaresDisponibles> catalogo;

    public Libreria() {
        this.estanterias = new ArrayList<>();
        this.catalogo = new ArrayList<>();
    }

    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    public ArrayList<EjemplaresDisponibles> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<EjemplaresDisponibles> catalogo) {
        this.catalogo = catalogo;
    }
    
    public void addEstanteria(Estanteria estanteria){
        estanterias.add(estanteria);
    }
    
    public void addLibro(EjemplaresDisponibles nuevoLibro){
        catalogo.add(nuevoLibro);
    }
    
    public int buscarUbicacionXTitulo(String titulo){
        for(int i=0;i<catalogo.size();i++){
            if(catalogo.get(i).getLibro().getTitulo().equals(titulo))
                return catalogo.get(i).getLibro().getEstanteria();
        }
        return 0;
    }
        
    public int ejemplaresDispobilesXTitulo(String titulo){
        for(int i=0;i<catalogo.size();i++){
            if(catalogo.get(i).getLibro().getTitulo().equals(titulo))
                return catalogo.get(i).getEjemplaresDisponibles();
        }
        return 0;
    }
    
    public String origenXTitulo(String titulo){
        for(int i=0;i<catalogo.size();i++){
            if(catalogo.get(i).getLibro().getTitulo().equals(titulo))
                return catalogo.get(i).getLibro().getOrigen();
        }
        return null;
    }
    
    public double precioXTitulo(String titulo){
        for(int i=0;i<catalogo.size();i++){
            if(catalogo.get(i).getLibro().getTitulo().equals(titulo))
                return catalogo.get(i).getLibro().getPrecio().getPrecio();
        }
        return 0;
    }

    
}