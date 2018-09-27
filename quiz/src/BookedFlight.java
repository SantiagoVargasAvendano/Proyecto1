/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class BookedFlight {
    private int flightNumber;
    private String departure;
    private String arrival;
    private Airport from;
    private Airport to;

    public BookedFlight(int flightNumber, String departure, String arrival) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getFrom() {
        return from.getDescription();
    }

    public String getTo() {
        return to.getDescription();
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public void setTo(Airport to) {
        this.to = to;
    }
    
    
}
