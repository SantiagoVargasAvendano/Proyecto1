import java.util.Scanner;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase main
 * @author Santiago Vargas, Jonathan Jimenez, Diego Irreño
 * @version 24/09/2018 
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner bf = new Scanner(System.in);
        int opcion;
        Libreria libreria = new Libreria();
        do{
            System.out.println("Titulo: ");
            String titulo = bf.next();
            System.out.println("Origen: ");
            String origen = bf.next();
            System.out.println("Editorial: ");
            String editorial = bf.next();
            System.out.println("Genero: ");
            String genero = bf.next();
            System.out.println("Estanteria: ");
            int estanteria = bf.nextInt();
            System.out.println("Precio: ");
            int precio = bf.nextInt();
            System.out.println("Descuento: ");
            int descuento = bf.nextInt();
            System.out.println("Nombre del autor: ");
            String nombre = bf.next();
            System.out.println("Apellido del autor: ");
            String apellido = bf.next();
            Libro libro = new Libro(titulo, origen, editorial, genero, estanteria, precio, descuento, nombre, apellido);
            System.out.println("Ejemplares disponibles: ");
            int ejemplaresDisponibles = bf.nextInt();
            EjemplaresDisponibles cuantosHay = new EjemplaresDisponibles(ejemplaresDisponibles, libro);
            System.out.println("1. Agregar libro");
            System.out.println("0. Salir");
            opcion = bf.nextInt();
            libreria.addLibro(cuantosHay);
        }while(opcion != 0);
        
        System.out.println(libreria.ejemplaresDispobilesXTitulo("pepe"));
    }
}
