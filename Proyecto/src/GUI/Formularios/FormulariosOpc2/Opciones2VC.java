/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormulariosOpc2;

import GUI.Formularios.FormularioCampsICCP.FormCampICCPVC;
import GUI.Formularios.FormulariosOpc.*;
import GUI.Formularios.FormularioProgCampColom.FormProgCampColomVC;
import GUI.Formularios.FormularioVolunteerPrograms.FormVoluntProgVC;
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
public class Opciones2VC {
    private Opciones2 vista;

    public Opciones2VC() throws FileNotFoundException {
        this.vista = new Opciones2();
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
            FormProgCampColomVC pantalla = null;
            try {
                pantalla = new FormProgCampColomVC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Opciones2VC.class.getName()).log(Level.SEVERE, null, ex);
            }
            pantalla.mostrarVista();
        }
    }
    
    class b2Pressed implements EventHandler<Event>{
        @Override
        public void handle(Event event) {
            FormVoluntProgVC pantalla = null;
            try {
                pantalla = new FormVoluntProgVC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Opciones2VC.class.getName()).log(Level.SEVERE, null, ex);
            }
            pantalla.mostrarVista();
        }      
    }
    
    class b3Pressed implements EventHandler<Event>{
        @Override
        public void handle(Event event) {
            FormCampICCPVC vista1 = null;
            try {
                vista1 = new FormCampICCPVC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Opciones2VC.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(Opciones2VC.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista.mostrarVista();;
        }
        
    }
    
}
