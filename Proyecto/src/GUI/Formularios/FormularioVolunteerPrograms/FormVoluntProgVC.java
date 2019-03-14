/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioVolunteerPrograms;
import GUI.Formularios.FormulariosOpc.OpcionesVC;
import GUI.Formularios.FormulariosOpc2.Opciones2VC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import ModeloNegocio.VolunteerPrograms;
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
public class FormVoluntProgVC {
    private FormVoluntProg vista;
    private GestorPlataforma gestor;

    public FormVoluntProgVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista= new FormVoluntProg();
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
           String company = vista.getNombreCompaniaTF().getText();
            String Id = vista.getIdTF().getText();
            String duracion = vista.getDuracionTF().getText();
            boolean t = true;
            if (company.equals("") || Id.equals("") || duracion.equals("")) {
                t = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de validacion");
                alert.setHeaderText("No se pudo registrar la informacion");
                alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                alert.show();
                FormVoluntProgVC pantalla = null;
                try {
                    pantalla = new FormVoluntProgVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormVoluntProgVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
            }
            if (t) {
                try {
                    String tipoVoluntariado = vista.getTipoVoluntariadoTF().getValue().toString();
                    String FechaGrado = vista.getFechaGradoTF().getValue().toString();

                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confirmacion");
                    alert.setHeaderText("La informacion ha sido registrada");
                    alert.show();
                    VolunteerPrograms volun = new VolunteerPrograms(company, FechaGrado, duracion, tipoVoluntariado, Id);
                    try {
                        gestor.addVoluntariado(volun);
                    } catch (IOException ex) {
                        Logger.getLogger(FormVoluntProgVC.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    OpcionesVC pantalla = null;
                    try {
                        pantalla = new OpcionesVC(gestor);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FormVoluntProgVC.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pantalla.mostrarVista();
                } catch (NullPointerException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error de validacion");
                    alert.setHeaderText("No se pudo registrar la informacion");
                    alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                    alert.show();
                    FormVoluntProgVC pantalla = null;
                    try {
                        pantalla = new FormVoluntProgVC(gestor);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FormVoluntProgVC.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pantalla.mostrarVista();
                }
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
                Logger.getLogger(FormVoluntProgVC.class.getName()).log(Level.SEVERE, null, ex);
            }
           pantalla.mostrarVista();
        }   
    }
    
}
