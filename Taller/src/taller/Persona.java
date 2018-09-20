/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author Estudiante
 */
import java.util.ArrayList;
public class Persona {
    private ArrayList<Carro> carros;

    public Persona() {
        this.carros = new ArrayList<>();
    }
    public boolean addCarro(Carro c){
        return this.carros.add(c);
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

}
