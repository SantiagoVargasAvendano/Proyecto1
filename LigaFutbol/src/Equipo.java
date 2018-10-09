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
public class Equipo {
    private String nombre;
    private Gerente gerente;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, Gerente gerente) {
        this.nombre = nombre;
        this.gerente = gerente;
    }
    
    public boolean addJugador(Jugador jugador){
        return jugadores.add(jugador);
    }
    
    public boolean deleteJugadorXNombre(String nombreJugador){
        for(int i=0;i<jugadores.size();i++){
            if(jugadores.get(i).getNombre()==nombreJugador){
                jugadores.set(i, null);
                return true;
            }
        }
        return false;
    }

    public Gerente getGerente() {
        return gerente;
    }
    
}
