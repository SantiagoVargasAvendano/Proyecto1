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
public class LigaFutbol {
    private String nombre;
    private ArrayList<Equipo> equipos;

    public LigaFutbol(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }
    
    public boolean addEquipo(String nombre, Gerente gerente){
        return equipos.add(new Equipo(nombre,gerente));
    }
    
    public ArrayList<Gerente> getGerentes(){
        ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
        for(int i=0;i<equipos.size();i++){
            gerentes.add(equipos.get(i).getGerente());
        }
        return gerentes;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }
    
    
}
