/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Travel {
    private String start;
    private int duration;
    private Hotel hotel;
    private BookedFlight outbound;
    private BookedFlight returns;

    public Travel(String start, int duration,int flightNumber, String departure, String arrival,int flightNumber2, String departure2, String arrival2) {
        this.start = start;
        this.duration = duration;
        this.outbound = new BookedFlight(flightNumber, departure, arrival);
        this.returns = new BookedFlight(flightNumber2, departure2, arrival2);
    }
    
}
