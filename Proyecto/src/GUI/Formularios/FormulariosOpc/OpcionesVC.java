/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormulariosOpc;

import GUI.Formularios.FormularioPersInfo.FormPersonaVC;
import GUI.Formularios.FormulariosOpc2.Opciones2VC;
import GUI.Formularios.FormulariosOpc3.Opciones3VC;
import GUI.Inicio.InicioVC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author Asus
 */
public class OpcionesVC {
    private GestorPlataforma gestor;
    private Opciones vista;

    public OpcionesVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista = new Opciones();
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
            FormPersonaVC pantalla = null;
            try {
                pantalla = new FormPersonaVC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OpcionesVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            pantalla.mostrarVista();
        }      
    }
    
    class b2Pressed implements EventHandler<Event>{
        @Override
        public void handle(Event event) {
            Opciones3VC pantalla = null;
            try {
                pantalla = new Opciones3VC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OpcionesVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            pantalla.mostrarVista();
        }      
    }
    
    class b3Pressed implements EventHandler<Event>{
        @Override
        public void handle(Event event) {
            Opciones2VC pantalla = null;
            try {
                pantalla = new Opciones2VC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OpcionesVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            pantalla.mostrarVista();
        }      
    }
    
    class regresar implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            InicioVC vista = null;
            try {
                vista = new InicioVC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OpcionesVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista.mostrarVista();;
        }
        
    }
    
}
