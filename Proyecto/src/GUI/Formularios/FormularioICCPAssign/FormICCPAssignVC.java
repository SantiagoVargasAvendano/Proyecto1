/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioICCPAssign;
import GUI.Formularios.FormularioCampsICCP.*;
import GUI.Formularios.FormulariosOpc.OpcionesVC;
import GUI.Formularios.FormulariosOpc2.Opciones2VC;
import GUI.Formularios.FormulariosOpc3.Opciones3VC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import ModeloNegocio.ICCPAssignment;
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
public class FormICCPAssignVC {
    private FormICCPAssign vista;
    private GestorPlataforma gestor;

    public FormICCPAssignVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista= new FormICCPAssign();
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
            String idParticipante = vista.getIdParticipanteTF().getText();
            String nombreParticipante = vista.getNombreParticipanteTF().getText();
            String codigoCampamento = vista.getCodigoCampamentoTF().getText();
            String calificacion = vista.getCalificacionTF().getText();
            String nota = vista.getNotaTF().getText();
            boolean t = true;
            if (idParticipante.equals("") || nombreParticipante.equals("") || codigoCampamento.equals("")
                    || calificacion.equals("")) {
                t = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de validacion");
                alert.setHeaderText("No se pudo registrar la informacion");
                alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                alert.show();
                FormICCPAssignVC pantalla = null;
                try {
                    pantalla = new FormICCPAssignVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormICCPAssignVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
            }
            boolean l = false;
            for(int i=0;i<gestor.getPersonas().size() && !l;i++){
                if(gestor.getPersonas().get(i).getId().equals(idParticipante) && 
                        gestor.getPersonas().get(i).getFullName().equals(nombreParticipante)){
                    t = true;
                }
            }
            boolean q = false;
            for(int j=0;j<gestor.getProgramasICCP().size() && !q;j++){
                if(gestor.getProgramasICCP().get(j).getCampYear().equals(codigoCampamento)){
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
                FormICCPAssignVC pantalla = null;
                try {
                    pantalla = new FormICCPAssignVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormICCPAssignVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
            }            
            if (t) {
                try {
                    String fechaInicio = vista.getFechaInicioTF().getValue().toString();
                    String fechaFin = vista.getFechaFinTF().getValue().toString();
                    String rol = vista.getRolTF().getValue().toString();
                    
                    ICCPAssignment asignacion = new ICCPAssignment( nombreParticipante, idParticipante, codigoCampamento, fechaInicio, fechaFin, rol, calificacion, nota);
                    gestor.addICCPAssignment(asignacion);
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confirmacion");
                    alert.setHeaderText("La informacion ha sido registrada");
                    alert.show();
                    OpcionesVC pantalla = null;
                    try {
                        pantalla = new OpcionesVC(gestor);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FormICCPAssignVC.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pantalla.mostrarVista();
                } catch (NullPointerException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error de validacion");
                    alert.setHeaderText("No se pudo registrar la informacion");
                    alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                    alert.show();
                    FormICCPAssignVC pantalla = null;
                    try {
                        pantalla = new FormICCPAssignVC(gestor);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FormICCPAssignVC.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(FormICCPAssignVC.class.getName()).log(Level.SEVERE, null, ex);
            }
           pantalla.mostrarVista();
        }   
    }
    
}
