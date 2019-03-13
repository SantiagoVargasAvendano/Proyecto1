/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioLocalVolunProg;
import GUI.Formularios.FormularioProgAssign.*;
import GUI.Formularios.FormularioLocalVolunProg.*;
import GUI.Formularios.FormularioICCPAssign.*;
import GUI.Formularios.FormularioCampsICCP.*;
import GUI.Formularios.FormulariosOpc.OpcionesVC;
import GUI.Formularios.FormulariosOpc2.Opciones2VC;
import GUI.Formularios.FormulariosOpc3.Opciones3VC;
import GUI.Singleton;
import ModeloNegocio.ProgramsAssignment;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

/**
 *
 * @author Asus
 */
public class FormLocalVolProgVC {
    private FormLocalVolProg vista;

    public FormLocalVolProgVC() throws FileNotFoundException {
        this.vista= new FormLocalVolProg();
        vista.getBoton().setOnMousePressed(new siguiente());
        vista.getRegresar().setOnMousePressed(new regresar());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
    }
    
    class siguiente implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            String numRegistro = vista.getNumRegistroTF().getText();
            String idPersona = vista.getIdParticipanteTF().getText();
            String nombrePersona = vista.getNombreParticipanteTF().getText();
            String nombreCampamento = vista.getNombreCampamentoTF().getText();
            String calificacion = vista.getCalificacionTF().getText();
            String nota = vista.getNotaTF().getText();
            boolean t = true;
            if (numRegistro.equals("") || idPersona.equals("") || nombrePersona.equals("") || nombrePersona.equals("") || calificacion.equals("")) {
                t = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de validacion");
                alert.setHeaderText("No se pudo registrar la informacion");
                alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                alert.show();
                FormLocalVolProgVC pantalla = null;
                try {
                    pantalla = new FormLocalVolProgVC();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormLocalVolProgVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
            }

            if (t) {
                try {
                    String rol = vista.getRolTF().getValue().toString();
                    
                    ProgramsAssignment asignacion = new ProgramsAssignment(idPersona, nombrePersona, nombreCampamento, rol, calificacion, nota);
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confirmacion");
                    alert.setHeaderText("La informacion ha sido registrada");
                    alert.show();
                    
                    OpcionesVC pantalla = null;
                    try {
                        pantalla = new OpcionesVC();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FormLocalVolProgVC.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pantalla.mostrarVista();

                } catch (NullPointerException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error de validacion");
                    alert.setHeaderText("No se pudo registrar la informacion");
                    alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                    alert.show();
                    FormLocalVolProgVC pantalla = null;
                    try {
                        pantalla = new FormLocalVolProgVC();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FormLocalVolProgVC.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pantalla.mostrarVista();
                }
            }
        }
    }
    
    class regresar implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
           Opciones3VC pantalla = null;
            try {
                pantalla = new Opciones3VC();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FormLocalVolProgVC.class.getName()).log(Level.SEVERE, null, ex);
            }
           pantalla.mostrarVista();
        }   
    }
    
}
