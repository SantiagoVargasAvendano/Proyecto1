import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class RegistroCarta {
    private String fecha;
    private Carta carta;
    private Estudiante remitente;
    private ArrayList<Patrocinador> destinatario;

    public RegistroCarta(String fecha, Carta carta, Estudiante remitente, ArrayList<Patrocinador> destinatario) {
        this.fecha = fecha;
        this.carta = carta;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public String getFecha() {
        return fecha;
    }

    public Carta getCarta() {
        return carta;
    }

    public Estudiante getRemitente() {
        return remitente;
    }

    public ArrayList<Patrocinador> getDestinatario() {
        return destinatario;
    }

    public boolean addDestinatario(Patrocinador destinatario){
        return this.destinatario.add(destinatario);
    }  
}
