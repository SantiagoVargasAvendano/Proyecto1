/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.PersInfo;

import GUI.Singleton;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author Asus
 */
public class PersIncoCVC {
    private PersInfoC vista;

    public PersIncoCVC() throws FileNotFoundException {
        this.vista= new PersInfoC();
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
        vista.getConsultar().setOnMousePressed(new consulta());
    }
    
    class consulta implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            ArrayList<String> tabla = new ArrayList<>();
            ArrayList<String> condicion = new ArrayList<>();
            if(vista.getName().isSelected()){
                tabla.add("Full Name");
                condicion.add(vista.getNameTF().getText());
            }
            if(vista.getId().isSelected()){
                tabla.add("ID");
                condicion.add(vista.getIdTF().getText());
            }
            if(vista.getTypeDocument().isSelected()){
                tabla.add("Type of Document");
                condicion.add(vista.getTypeDocumentTF().getText());
            }
            if(vista.getGender().isSelected()){
                tabla.add("Gender");
                condicion.add(vista.getGenderTF().getText());
            }
            if(vista.getDateBirth().isSelected()){
                tabla.add("Date of Birth");
                condicion.add(vista.getDateBirthTF().getText());
            }
            if(vista.getMobile().isSelected()){
                tabla.add("Mobile");
                condicion.add(vista.getMobileTF().getText());
            }
            if(vista.getPhone().isSelected()){
                tabla.add("Phone");
                condicion.add(vista.getPhoneTF().getText());
            }
            if(vista.getCitizen().isSelected()){
                tabla.add("Citizen");
                condicion.add(vista.getCitizenTF().getText());
            }
            if(vista.getEmail().isSelected()){
                tabla.add("E-Mail");
                condicion.add(vista.getEmailTF().getText());
            }
            if(vista.getSizeShirt().isSelected()){
                tabla.add("Size of Shirt");
                condicion.add(vista.getSizeShirtTF().getText());
            }
            if(vista.getCurrentOcu().isSelected()){
                tabla.add("Current Ocupation");
                condicion.add(vista.getCurrentOcuTF().getText());
            }
            if(vista.getFieldsStudy().isSelected()){
                tabla.add("Field of Study");
                condicion.add(vista.getFieldsStudyTF().getText());
            }
            if(vista.getUniversity().isSelected()){
                tabla.add("University");
                condicion.add(vista.getUniversityTF().getText());
            }
            if(vista.getGraduate().isSelected()){
                tabla.add("Graduate");
                condicion.add(vista.getGraduateTF().getText());
            }
            if(vista.getCurrentAddress().isSelected()){
                tabla.add("Current Adress");
                condicion.add(vista.getCurrentAddressTF().getText());
            }
            if(vista.getCurrentCity().isSelected()){
                tabla.add("Current City");
                condicion.add(vista.getCurrentCityTF().getText());
            }
            if(vista.getNameEmCon().isSelected()){
                tabla.add("Full Name Emergency Contact");
                condicion.add(vista.getNameEmConTF().getText());
            }
            if(vista.getNumberEmCon().isSelected()){
                tabla.add("Number Emergency Contact");
                condicion.add(vista.getNumberEmConTF().getText());
            }
            if(vista.getEmailEmCon().isSelected()){
                tabla.add("Email Emergency Contact");
                condicion.add(vista.getEmailEmConTF().getText());
            }
            if(vista.getRelationship().isSelected()){
                tabla.add("Relationship");
                condicion.add(vista.getRelationshipTF().getText());
            }
            String[] nombreAtributo = new String[tabla.size()];
            String[] condiciones = new String[condicion.size()];
            for(int i=0;i<tabla.size();i++){
                nombreAtributo[i] = tabla.get(i);
            }
            for(int j=0;j<condicion.size();j++){
                nombreAtributo[j] = condicion.get(j);
            }
            String nombre = "Personal Information";
                
        }
        
    }
    
}
