/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.ProgramasVoluntariado;

import GUI.Consultas.ProgramasColombia.*;
import GUI.Consultas.Opciones.OpcionesCVC;
import GUI.Consultas.PersInfo.PersIncoCVC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author Asus
 */
public class ProgramsVoluntariadoCVC {
    private GestorPlataforma gestor;
    private ProgramsVoluntariadoC vista;

    public ProgramsVoluntariadoCVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista = new ProgramsVoluntariadoC();
        this.vista.getAtras().setOnMousePressed(new atras());
        this.vista.getConsultar().setOnMousePressed(new consultar());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
    }
    
    class consultar implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            ArrayList<String> tabla = new ArrayList<>();
            ArrayList<String> condicion = new ArrayList<>();
            if(vista.getNameCamp().isSelected()){
                tabla.add("Name Camp");
                condicion.add(vista.getNameCampTF().getText());
            }
            if(vista.getIdCamp().isSelected()){
                tabla.add("Camp ID");
                condicion.add(vista.getIdCampTF().getText());
            }
            if(vista.getTypeProgram().isSelected()){
                tabla.add("Type of Program");
                condicion.add(vista.getTypeProgramTF().getText());
            }
            if(vista.getCompany().isSelected()){
                tabla.add("Company");
                condicion.add(vista.getCompanyTF().getText());
            }
            if(vista.getCampDate().isSelected()){
                tabla.add("Camp Date");
                condicion.add(vista.getCampDateTF().getText());
            }
            if(vista.getDuration().isSelected()){
                tabla.add("Duration");
                condicion.add(vista.getDurationTF().getText());
            }
            String[] nombreAtributo = new String[tabla.size()];
            String[] condiciones = new String[condicion.size()];
            for(int i=0;i<tabla.size();i++){
                nombreAtributo[i] = tabla.get(i);
                System.out.println(nombreAtributo[i]);
            }
            for(int j=0;j<condicion.size();j++){
                condiciones[j] = condicion.get(j);
                System.out.println(condiciones[j]);
            }
            String nombre = "Volunteer Programs";
            System.out.println(nombre);
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
