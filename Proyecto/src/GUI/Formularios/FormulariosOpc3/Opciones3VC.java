/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormulariosOpc3;

import GUI.Formularios.FormularioICCPAssign.FormICCPAssignVC;
import GUI.Formularios.FormularioLocalVolunProg.FormLocalVolProgVC;
import GUI.Formularios.FormulariosOpc.*;
import GUI.Formularios.FormularioProgAssign.FormProgAssignVC;
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
public class Opciones3VC {
    private Opciones3 vista;

    public Opciones3VC() throws FileNotFoundException {
        this.vista = new Opciones3();
        vista.getB1().setOnMousePressed(new b1Pressed());
        vista.getB2().setOnMousePressed(new b2Pressed());
        vista.getB3().setOnMousePressed(new b3Pressed());
        vista.getRegresar().setOnMousePressed(new regresar());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
    }
    
    class b1Pressed implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            FormProgAssignVC vista1 = null;
            try {
                vista1 = new FormProgAssignVC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Opciones3VC.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista1.mostrarVista();
        }
    }
    
    class b2Pressed implements EventHandler<Event>{
        @Override
        public void handle(Event event) {
            FormLocalVolProgVC vista1 = null;
            try {
                vista1 = new FormLocalVolProgVC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Opciones3VC.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista1.mostrarVista();
        }      
    }
    
    class b3Pressed implements EventHandler<Event>{
        @Override
        public void handle(Event event) {
            FormICCPAssignVC vista1 = null;
            try {
                vista1 = new FormICCPAssignVC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Opciones3VC.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista1.mostrarVista();
        }
    }
    
    class regresar implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            OpcionesVC vista = null;
            try {
                vista = new OpcionesVC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Opciones3VC.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista.mostrarVista();;
        }
        
    }
    
}
