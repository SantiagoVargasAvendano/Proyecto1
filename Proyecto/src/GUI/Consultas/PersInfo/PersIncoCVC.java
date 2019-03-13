/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.PersInfo;

import GUI.Singleton;
import java.io.FileNotFoundException;

/**
 *
 * @author Asus
 */
public class PersIncoCVC {
    private PersInfoC vista;

    public PersIncoCVC() throws FileNotFoundException {
        this.vista= new PersInfoC();
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
    }
    
}
