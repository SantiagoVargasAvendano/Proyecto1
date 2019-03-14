/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.ProgramasColombia;

import GUI.Consultas.Opciones.OpcionesCVC;
import GUI.Singleton;
import java.io.FileNotFoundException;

/**
 *
 * @author Asus
 */
public class ProgramsColombiaCVC {
    private ProgramsColombiaC vista;

    public ProgramsColombiaCVC() throws FileNotFoundException {
        this.vista = new ProgramsColombiaC();
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
    }
    
}
