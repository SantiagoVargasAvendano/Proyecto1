/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioProgCampColom;
import GUI.Formularios.FormulariosOpc2.Opciones2VC;
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
public class FormProgCampColomVC {
    private FormProgCampColom vista;

    public FormProgCampColomVC() throws FileNotFoundException {
        this.vista= new FormProgCampColom();
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
        vista.getBoton().setOnMousePressed(new siguiente());
        vista.getRegresar().setOnMousePressed(new regresar());
    }
    
    class siguiente implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
           
        }   
    }
    
    class regresar implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
           Opciones2VC pantalla = null;
            try {
                pantalla = new Opciones2VC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FormProgCampColomVC.class.getName()).log(Level.SEVERE, null, ex);
            }
           pantalla.mostrarVista();
        }   
    }
    
}
