/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.Opciones;

import GUI.Consultas.PersInfo.PersIncoCVC;
import GUI.Singleton;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author Asus
 */
public class OpcionesCVC {
    private OpcionesC vista;

    public OpcionesCVC() throws FileNotFoundException {
        this.vista = new OpcionesC();
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
        vista.getSeleccionar().setOnMousePressed(new opcion());
    }
    
    class opcion implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            String opc = vista.getOpciones().getValue().toString();
            switch(opc){
                case "Informacion personal":
                    PersIncoCVC pantalla = null;
            try {
                pantalla = new PersIncoCVC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OpcionesCVC.class.getName()).log(Level.SEVERE, null, ex);
            }
                    pantalla.mostrarVista();
                    break;
                case "P":
                    break;
            }
        }
        
    }
}