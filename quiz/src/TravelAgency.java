/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class TravelAgency {
    private String name;
    private Hotel[] knownHotels;
    private Travel[] offeredTravels;
    private Airport[] airports;

    public TravelAgency(String name) {
        this.name = name;
        this.knownHotels = new Hotel[5];
        this.offeredTravels = new Travel[10];
        this.airports = new Airport[4];
    }
    
}
