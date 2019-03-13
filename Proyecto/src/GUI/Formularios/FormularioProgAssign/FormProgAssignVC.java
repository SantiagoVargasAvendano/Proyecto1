/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioProgAssign;
import GUI.Formularios.FormularioLocalVolunProg.*;
import GUI.Formularios.FormularioICCPAssign.*;
import GUI.Formularios.FormularioCampsICCP.*;
import GUI.Formularios.FormulariosOpc.OpcionesVC;
import GUI.Formularios.FormulariosOpc2.Opciones2VC;
import GUI.Formularios.FormulariosOpc3.Opciones3VC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
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
public class FormProgAssignVC {
    private FormProgAssign vista;
    private GestorPlataforma gestor;

    public FormProgAssignVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista= new FormProgAssign();
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
            String idPersona = vista.getIdParticipanteTF().getText();
            String nombrePersona = vista.getNombreParticipanteTF().getText();
            String nombreCampamento = vista.getNombreCampamentoTF().getText();
            String calificacion = vista.getCalificacionTF().getText();
            String nota = vista.getNotaTF().getText();
            boolean t = true;
            if (idPersona.equals("") || nombrePersona.equals("") || nombrePersona.equals("") || calificacion.equals("")) {
                t = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de validacion");
                alert.setHeaderText("No se pudo registrar la informacion");
                alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                alert.show();
                FormProgAssignVC pantalla = null;
                try {
                    pantalla = new FormProgAssignVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormProgAssignVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
            }
            boolean l = false;
            for(int i=0;i<gestor.getPersonas().size() && !l;i++){
                if(gestor.getPersonas().get(i).getId().equals(idPersona) && 
                        gestor.getPersonas().get(i).getFullName().equals(nombrePersona)){
                    t = true;
                }
            }
            boolean q = false;
            for(int j=0;j<gestor.getProgramasColombia().size() && !q;j++){
                if(gestor.getProgramasColombia().get(j).getNombre().equals(nombreCampamento) ){
                    q = true;
                }
            }
            if(l==false || q==false){
                t = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de validacion");
                alert.setHeaderText("No se pudo registrar la informacion");
                alert.setContentText("Puede que la persona o el campamento que ingreso no existan");
                alert.show();
                FormProgAssignVC pantalla = null;
                try {
                    pantalla = new FormProgAssignVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormProgAssignVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
            }

            if (t) {
                try {
                    String rol = vista.getRolTF().getValue().toString();
                    
                    ProgramsAssignment asignacion = new ProgramsAssignment(idPersona, nombrePersona, nombreCampamento, rol, calificacion, nota);
                    gestor.addColombiaAssignment(asignacion);
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confirmacion");
                    alert.setHeaderText("La informacion ha sido registrada");
                    alert.show();
                    
                    OpcionesVC pantalla = null;
                    try {
                        pantalla = new OpcionesVC(gestor);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FormProgAssignVC.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pantalla.mostrarVista();

                } catch (NullPointerException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error de validacion");
                    alert.setHeaderText("No se pudo registrar la informacion");
                    alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                    alert.show();
                    FormProgAssignVC pantalla = null;
                    try {
                        pantalla = new FormProgAssignVC(gestor);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FormProgAssignVC.class.getName()).log(Level.SEVERE, null, ex);
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
                pantalla = new Opciones3VC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FormProgAssignVC.class.getName()).log(Level.SEVERE, null, ex);
            }
           pantalla.mostrarVista();
        }   
    }
    
}
