/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioPersInfo;
import GUI.Formularios.FormulariosOpc.OpcionesVC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import ModeloNegocio.PersonalInformation;
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
public class FormPersonaVC {
    private FormPersona vista;
    private GestorPlataforma gestor;

    public FormPersonaVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista= new FormPersona();
        vista.getBoton().setOnMousePressed(new Guardar());
        vista.getRegresar().setOnMousePressed(new regresar());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
    }
    
    class Guardar implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            String fullName = vista.getFullNameTF().getText();
            String Id = vista.getIdTF().getText();
            String mobile = vista.getMobileTF().getText();
            String phone = vista.getPhoneTF().getText();
            String citizen = vista.getCitizenTF().getText();
            String email = vista.getEmailTF().getText();
            String passport = vista.getPassportTF().getText();
            String currentOcupation = vista.getCurrentOcupationTF().getText();
            String fieldsStudy = vista.getFieldsStudyTF().getText();
            String university = vista.getUniversityTF().getText();           
            String currentAdress = vista.getCurrentAdressTF().getText();
            String currentCity = vista.getCurrentCityTF().getText();
            String fullNameEmergencyContact = vista.getFullNameEmergencyContactTF().getText();
            String numberEmergencyContact = vista.getNumberEmergencyContactTF().getText();
            String emailEmergencyContact = vista.getEmailEmergencyContactTF().getText();
            String[] probar = new String[12];
            probar[0] = fullName;
            probar[1] = Id;
            probar[2] = mobile;
            probar[3] = email;
            probar[4] = currentOcupation;
            probar[5] = fieldsStudy;
            probar[6] = university;
            probar[7] = currentAdress;
            probar[8] = currentCity;
            probar[9] = fullNameEmergencyContact;
            probar[10] = numberEmergencyContact;
            probar[11] = emailEmergencyContact;
            boolean t = true;
            for(int i = 0; i < 12 && t; i++) {
                if (probar[i].equals("")) {
                    t = false;
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error de validacion");
                    alert.setHeaderText("No se pudo registrar la informacion");
                    alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                    alert.show();
                    FormPersonaVC pantalla = null;
                    try {
                        pantalla = new FormPersonaVC(gestor);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(FormPersonaVC.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pantalla.mostrarVista();
                }
            }if(t){
            try{      
            String sizeShirt = vista.getSizeShirtTF().getValue().toString();
            String gender = vista.getGenderTF().getValue().toString();    
            String dateBirth = vista.getDateBirthTF().getValue().toString();
            String typeDocument = vista.getTypeDocumentTF().getValue().toString();
            String graduate = vista.getGraduadoTF().getValue().toString();
            String relationship = vista.getRelationshipTF().getValue().toString();  
            Boolean g = true;
            if(graduate.equals("No")) g = false;
                
            PersonalInformation persona = new PersonalInformation(fullName, typeDocument, Id, 
                    gender, dateBirth, mobile, email, sizeShirt, currentOcupation, fieldsStudy, 
                    university, g, currentAdress, currentCity, fullNameEmergencyContact, 
                    numberEmergencyContact, emailEmergencyContact, relationship);
            if(!passport.equals("")) persona.setPassport(passport);
            if(!phone.equals("")) persona.setPhone(phone);
            if(!citizen.equals("")) persona.setCitizen(citizen);  
                try {
                    gestor.addPersona(persona);
                } catch (IOException ex) {
                    Logger.getLogger(FormPersonaVC.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Confirmacion");
                alert.setHeaderText("La informacion ha sido registrada");
                alert.show();
                OpcionesVC pantalla = null;
                try {
                    pantalla = new OpcionesVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormPersonaVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
            } catch (NullPointerException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de validacion");
                alert.setHeaderText("No se pudo registrar la informacion");
                alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
                alert.show();
                FormPersonaVC pantalla = null;
                try {
                    pantalla = new FormPersonaVC(gestor);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormPersonaVC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pantalla.mostrarVista();
            }  
            }
        }
        
    }
    
    class regresar implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            OpcionesVC vista = null;
            try {
                vista = new OpcionesVC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FormPersonaVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            vista.mostrarVista();
        }     
    }
}
