/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioLocalVolunProg;
import GUI.Formularios.FormularioLocalVolunProg.*;
import GUI.Formularios.FormulariosOpc.OpcionesVC;
import GUI.Formularios.FormulariosOpc3.Opciones3VC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import ModeloNegocio.LocalVolunteerAssignment;
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
    private GestorPlataforma gestor;

    public FormLocalVolProgVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
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
                FormLocalVolProgVC pantalla = null;
                try {
                    pantalla = new FormLocalVolProgVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormLocalVolProgVC.class.getName()).log(Level.SEVERE, null, ex);
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
            for(int j=0;j<gestor.getProgramasVoluntariado().size() && !q;j++){
                if(gestor.getProgramasVoluntariado().get(j).getNombre().equals(nombreCampamento) ){
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
                FormLocalVolProgVC pantalla = null;
                try {
                    pantalla = new FormLocalVolProgVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormLocalVolProgVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
            }

            if (t) {
                try {
                    String rol = vista.getRolTF().getValue().toString();
                    
                    LocalVolunteerAssignment asignacion = new LocalVolunteerAssignment(idPersona, nombrePersona, nombreCampamento, rol, calificacion, nota);
                    gestor.addVoluntariadoAssignment(asignacion);
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confirmacion");
                    alert.setHeaderText("La informacion ha sido registrada");
                    alert.show();
                    
                    OpcionesVC pantalla = null;
                    try {
                        pantalla = new OpcionesVC(gestor);
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
                        pantalla = new FormLocalVolProgVC(gestor);
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
                pantalla = new Opciones3VC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FormLocalVolProgVC.class.getName()).log(Level.SEVERE, null, ex);
            }
           pantalla.mostrarVista();
        }   
    }
    
}
