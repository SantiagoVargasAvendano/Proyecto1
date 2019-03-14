/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.PersInfo;

import GUI.Consultas.Opciones.OpcionesCVC;
import GUI.Consultas.Resultado.ResultadoVC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import ModeloNegocio.PersonalInformation;
import java.io.FileNotFoundException;
import java.io.IOException;
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
            ArrayList<PersonalInformation> personas = new ArrayList<>();
            for(int i=0;i<gestor.getPersonas().size();i++){
                int c = 0;
                int p = 0;
                if(vista.getName().isSelected()){
                    c++;
                    if(gestor.getPersonas().get(i).getFullName().equals(vista.getNameTF().getText())){
                        p++;
                    }
                }
                if(vista.getId().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getId().equals(vista.getIdTF().getText())){
                        p++;
                    }
                }
                if(vista.getTypeDocument().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getTypeDocument().equals(vista.getTypeDocumentTF().getText())){
                        p++;
                    }
                }
                if(vista.getGender().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getGender().equals(vista.getGenderTF().getText())){
                        p++;
                    }
                }
                if(vista.getMobile().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getMobile().equals(vista.getMobile().getText())){
                        p++;
                    }
                }
                if(vista.getPhone().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getPhone().equals(vista.getPhoneTF().getText())){
                        p++;
                    }
                }
                if(vista.getCitizen().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getCitizen().equals(vista.getCitizenTF().getText())){
                        p++;
                    }
                }
                if(vista.getEmail().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getEmail().equals(vista.getEmailTF().getText())){
                        p++;
                    }
                }
                if(vista.getCurrentOcu().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getCurrentOcupation().equals(vista.getCurrentOcuTF().getText())){
                        p++;
                    }
                }
                if(vista.getFieldsStudy().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getFieldsStudy().equals(vista.getFieldsStudyTF().getText())){
                        p++;
                    }
                }
                if(vista.getUniversity().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getUniversity().equals(vista.getUniversityTF().getText())){
                        p++;
                    }
                }
                if(vista.getGraduate().isSelected()){
                     c++;
                     boolean g = false;
                     if(vista.getGraduateTF().getText().equals("Si")) g = true;
                    if(gestor.getPersonas().get(i).isGraduate()==g){
                        p++;
                    }
                }
                if(vista.getCurrentAddress().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getCurrentAdress().equals(vista.getCurrentAddressTF().getText())){
                        p++;
                    }
                }if(vista.getCurrentCity().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getCurrentCity().equals(vista.getCurrentCityTF().getText())){
                        p++;
                    }
                }
                if(vista.getNameEmCon().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getFullNameEmergencyContact().equals(vista.getNameEmConTF().getText())){
                        p++;
                    }
                }
                if(vista.getNumberEmCon().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getNumberEmergencyContact().equals(vista.getNumberEmConTF().getText())){
                        p++;
                    }
                }
                if(vista.getEmailEmCon().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getEmailEmergencyContact().equals(vista.getEmailEmConTF().getText())){
                        p++;
                    }
                }
                if(vista.getRelationship().isSelected()){
                     c++;
                    if(gestor.getPersonas().get(i).getRelationship().equals(vista.getRelationshipTF().getText())){
                        p++;
                    }
                }
                if(c==p){
                    personas.add(gestor.getPersonas().get(i));
                }
            }
            ResultadoVC pantalla = null;
            try {
                pantalla = new ResultadoVC(gestor, personas);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PersIncoCVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            pantalla.mostrarVista();
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
