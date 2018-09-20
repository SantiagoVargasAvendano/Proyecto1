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
public class Main {
    public static void main(String[] args) {
        Persona pepito = new Persona();
        Motor motorV8 = new Motor();
        Motor motorW = new Motor();
        Ruedas llantasROF = new Ruedas();
        Ruedas llantasDeportivas = new Ruedas();
        Carro aveo = new Carro(motorV8,llantasROF);
        Carro monza = new Carro(motorW,llantasDeportivas);
        pepito.addCarro(aveo);
        pepito.addCarro(monza);
    }
}
