/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.ProgramsAssignC;

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
public class ProgramsAssignCVC {
    private GestorPlataforma gestor;
    private ProgramsAssignC vista;

    public ProgramsAssignCVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista = new ProgramsAssignC();
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
            if(vista.getNamePers().isSelected()){
                tabla.add("Personal ID");
                condicion.add(vista.getNamePersTF().getText());
            }            
            if(vista.getIdPers().isSelected()){
                tabla.add("ID");
                condicion.add(vista.getIdPersTF().getText());
            }
            if(vista.getNameCamp().isSelected()){
                tabla.add("Camp ID");
                condicion.add(vista.getNameCampTF().getText());
            }
            if(vista.getRol().isSelected()){
                tabla.add("Role");
                condicion.add(vista.getRolTF().getText());
            }
            if(vista.getCalification().isSelected()){
                tabla.add("Calification");
                condicion.add(vista.getCalificationTF().getText());
            }
            if(vista.getNote().isSelected()){
                tabla.add("Note");
                condicion.add(vista.getNoteTF().getText());
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
            String nombre = "Programs Assignment";
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
