/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private int xref;
    private int yref;
    private int ancho;
    private int alto;
    private Chasis chasis;
    private Llanta[] llantas;

    public Carro(int xref, int yref, int ancho, int alto) {
        this.xref = xref;
        this.yref = yref;
        this.ancho = ancho;
        this.alto = alto;
        //Chasis chasis;
        //Llantas
    }

    public int getXref() {
        return xref;
    }

    public int getYref() {
        return yref;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setXref(int xref) {
        this.xref = xref;
    }  

    public void setYref(int yref) {
        this.yref = yref;
    }
        
    public void mover(){
       this.xref++;
    }
    
    public void movervuelta(){
       this.xref--;
    }
    public void moverDerecha(){
      this.xref++;
    }
    public void moverIzquierda(){
      this.xref--;
    }
    
    
    public void moverArriba(){
      this.yref--;
    }
    
    
     public void moverAbajo(){
      this.yref++;
    }
    
}
