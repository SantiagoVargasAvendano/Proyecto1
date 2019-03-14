/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.PersInfo;

import GUI.Consultas.Opciones.OpcionesCVC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author Asus
 */
public class PersIncoCVC {
    private GestorPlataforma gestor;
    private PersInfoC vista;

    public PersIncoCVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista= new PersInfoC();
        vista.getConsultar().setOnMousePressed(new consulta());
        vista.getAtras().setOnMousePressed(new atras());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
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
                condiciones[j] = condicion.get(j);
            }
            String nombre = "Personal Information"; 
            ResultSet result = null;
            try {
                result = gestor.generarConsulta(gestor.getStringConsulta(nombre, nombreAtributo, condiciones, "AND"));
            } catch (SQLException ex) {
                Logger.getLogger(PersIncoCVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while(result.next()){
                    System.out.println(result.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(PersIncoCVC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    class atras implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            OpcionesCVC pantalla = null;
            try {
                pantalla = new OpcionesCVC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PersIncoCVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            pantalla.mostrarVista();
        }
        
    }
    
}
