/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Airport aeropueto = new Airport("coco");
        BookedFlight vuelo = new BookedFlight(2,"hoy","mañana");
        vuelo.setFrom(aeropueto);
        System.out.println(vuelo.getFrom());
    }
}
