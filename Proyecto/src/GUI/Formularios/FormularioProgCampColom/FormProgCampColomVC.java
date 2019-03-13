/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioProgCampColom;
import GUI.Formularios.FormulariosOpc.OpcionesVC;
import GUI.Formularios.FormulariosOpc2.Opciones2VC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import ModeloNegocio.ProgramsCampsColombia;
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
public class FormProgCampColomVC {
    private FormProgCampColom vista;
    private GestorPlataforma gestor;

    public FormProgCampColomVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista= new FormProgCampColom();
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
            String company = vista.getNombreCompaniaTF().getText();
            String Id = vista.getIdTF().getText();
            String Lugar = vista.getLugarTF().getText();
            String poblacion = vista.getPoblacionTF().getText();
            String duration = vista.getDuracionTF().getText();
            boolean t = true;
            if (company.equals("") || Id.equals("") || Lugar.equals("") || poblacion.equals("") || duration.equals("")) {
                t = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de validacion");
                alert.setHeaderText("No se pudo registrar la informacion");
                alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                alert.show();
                FormProgCampColomVC pantalla = null;
                try {
                    pantalla = new FormProgCampColomVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormProgCampColomVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
            }
            if (t) {
                try {
                    String fechaGrado = vista.getFechaGradoTF().getValue().toString();
                    String tipoPrograma = vista.getTipoProgramaTF().getValue().toString();
                    
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confirmacion");
                    alert.setHeaderText("La informacion ha sido registrada");
                    alert.show();
                    ProgramsCampsColombia program = new ProgramsCampsColombia(tipoPrograma, company, fechaGrado, duration, Lugar, poblacion, Id);
                    gestor.addProgramaColombia(program);
                    OpcionesVC pantalla = null;
                    try {
                        pantalla = new OpcionesVC(gestor);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FormProgCampColomVC.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pantalla.mostrarVista();
                    
                    
                    
                } catch (NullPointerException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error de validacion");
                    alert.setHeaderText("No se pudo registrar la informacion");
                    alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                    alert.show();
                    FormProgCampColomVC pantalla = null;
                    try {
                        pantalla = new FormProgCampColomVC(gestor);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FormProgCampColomVC.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(FormProgCampColomVC.class.getName()).log(Level.SEVERE, null, ex);
            }
           pantalla.mostrarVista();
        }   
    }
    
}
