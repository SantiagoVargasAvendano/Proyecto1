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
        
        LigaFutbol postobon = new LigaFutbol("Postobon");
        Jugador jugador1 = new Jugador("Pepe", "Alero");
        Jugador jugador2 = new Jugador("Juan", "Defensa");
        Gerente gerente1 = new Gerente("Pedro");
        Gerente gerente2 = new Gerente("Jacobo");
        
        postobon.addEquipo("1", gerente1);
        postobon.addEquipo("2", gerente2);
        
        postobon.getEquipos().get(0).addJugador(jugador1);
        postobon.getEquipos().get(1).addJugador(jugador2);
        
    }
}
