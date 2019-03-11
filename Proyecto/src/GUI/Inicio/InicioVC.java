/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Inicio;

import GUI.Formularios.FormulariosOpc.OpcionesVC;
import GUI.Singleton;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

/**
 *
 * @author Asus
 */
public class InicioVC {
    private Inicio inicio;

    public InicioVC() throws FileNotFoundException{
        this.inicio = new Inicio();
        inicio.getBoton3().setOnMousePressed(new EventoFormulario());
        
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        inicio.mostrar(singleton.getStage());
    }
    
    class EventoFormulario implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            OpcionesVC vista = null;
            try {
                vista = new OpcionesVC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(InicioVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista.mostrarVista();
        }      
   }
}
