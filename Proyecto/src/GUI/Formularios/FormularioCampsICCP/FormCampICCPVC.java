/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioCampsICCP;
import GUI.Formularios.FormularioPersInfo.FormPersonaVC;
import GUI.Formularios.FormulariosOpc.OpcionesVC;
import GUI.Formularios.FormulariosOpc2.Opciones2VC;
import GUI.Singleton;
import ModeloNegocio.CampsICCP;
import ModeloNegocio.GestorPlataforma;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

/**
 *
 * @author Asus
 */
public class FormCampICCPVC {
    private FormCampICCP vista;
    private GestorPlataforma gestor;

    public FormCampICCPVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista= new FormCampICCP();
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
           String nombreCamp = vista.getNombreTF().getText();
            String Id = vista.getIdTF().getText();
            String Annio = vista.getAnnioTF().getText();
            String Direccion = vista.getDireccionTF().getText();
            if (nombreCamp.equals("") || Id.equals("") || Annio.equals("") || Direccion.equals("")) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de validacion");
                alert.setHeaderText("No se pudo registrar la informacion");
                alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                alert.show();
                FormCampICCPVC pantalla = null;
                try {
                    pantalla = new FormCampICCPVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormCampICCPVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
            } else {
                CampsICCP camp = new CampsICCP(Annio, Direccion, Id, nombreCamp);
               try {
                   gestor.addProgramaICCP(camp);
               } catch (IOException ex) {
                   Logger.getLogger(FormCampICCPVC.class.getName()).log(Level.SEVERE, null, ex);
               }
                OpcionesVC pantalla = null;
                try {
                    pantalla = new OpcionesVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormPersonaVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confirmacion");
                alert.setHeaderText("La informacion ha sido registrada");
                alert.show();
            }
           
        }   
    }
    
    class regresar implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
           Opciones2VC pantalla = null;
            try {
                pantalla = new Opciones2VC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FormCampICCPVC.class.getName()).log(Level.SEVERE, null, ex);
            }
           pantalla.mostrarVista();
        }   
    }
    
}
