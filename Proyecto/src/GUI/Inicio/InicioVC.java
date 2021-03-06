/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Inicio;

import GUI.Formularios.FormulariosOpc.OpcionesVC;
import GUI.Consultas.Opciones.OpcionesCVC;
import GUI.Estadisticas.Opciones.TipoVC;
import GUI.Estadisticas.Torta.TortaVC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    private GestorPlataforma gestor;

    public InicioVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.inicio = new Inicio();
        inicio.getBoton().setOnMousePressed(new EventoEstadistica());
        inicio.getBoton2().setOnMousePressed(new EventoGuardar());
        inicio.getBoton3().setOnMousePressed(new EventoFormulario());
        inicio.getBoton4().setOnMousePressed(new EventoConsulta());
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
                vista = new OpcionesVC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(InicioVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista.mostrarVista();
        }      
   }
    
    class EventoConsulta implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            OpcionesCVC vista = null;
            try {
                vista = new OpcionesCVC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(InicioVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista.mostrarVista();
        }      
   }
    
    class EventoEstadistica implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            TipoVC vista = null;
            try {
                vista = new TipoVC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(InicioVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista.mostrarVista();
        }      
   }
    
    class EventoGuardar implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            try {
                gestor.addPersonaDb(gestor.getNuevaspersonas());
                gestor.addColombiaAssignmentDb(gestor.getNuevosprogramasColombiaAssignment());
                gestor.addICCPAssignmentDb(gestor.getNuevosICCPAssignments());
                gestor.addVoluntariadoAssignmentDb(gestor.getNuevosvolunteerAssignment());
                gestor.addProgramaColombiaDb(gestor.getNuevosprogramasColombia());
                gestor.addVoluntariadoDb(gestor.getNuevosprogramasVoluntariado());
                gestor.addProgramaICCPDb(gestor.getNuevosprogramasICCP());
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confirmacion");
                alert.setHeaderText("La informacion ha sido registrada");
                alert.show();
            } catch (IOException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de validacion");
                alert.setHeaderText("No se pudo registrar la informacion");
                alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                alert.show();
                Logger.getLogger(InicioVC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
   }
}
