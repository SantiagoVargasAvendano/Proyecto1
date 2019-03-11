/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioProgAssign;
import GUI.Formularios.FormularioLocalVolunProg.*;
import GUI.Formularios.FormularioICCPAssign.*;
import GUI.Formularios.FormularioCampsICCP.*;
import GUI.Formularios.FormulariosOpc2.Opciones2VC;
import GUI.Formularios.FormulariosOpc3.Opciones3VC;
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
public class FormProgAssignVC {
    private FormProgAssign vista;

    public FormProgAssignVC() throws FileNotFoundException {
        this.vista= new FormProgAssign();
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
           Opciones3VC pantalla = null;
            try {
                pantalla = new Opciones3VC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FormProgAssignVC.class.getName()).log(Level.SEVERE, null, ex);
            }
           pantalla.mostrarVista();
        }   
    }
    
}
