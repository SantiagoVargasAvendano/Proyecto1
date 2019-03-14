/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.Resultado;

import GUI.Consultas.Opciones.*;
import GUI.Consultas.ICCPAssign.ICCPAssignCVC;
import GUI.Consultas.LocalVolunAssign.LocalVolunAssignCVC;
import GUI.Consultas.PersInfo.PersIncoCVC;
import GUI.Consultas.ProgramasColombia.ProgramsColombiaCVC;
import GUI.Consultas.ProgramasICCP.ProgramsICCPC;
import GUI.Consultas.ProgramasICCP.ProgramsICCPCVC;
import GUI.Consultas.ProgramasVoluntariado.ProgramsVoluntariadoCVC;
import GUI.Consultas.ProgramsAssignC.ProgramsAssignCVC;
import GUI.Inicio.InicioVC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import ModeloNegocio.PersonalInformation;
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
public class ResultadoVC {
    private Resultado vista;
    private GestorPlataforma gestor;

    public ResultadoVC(GestorPlataforma gestor, ArrayList<PersonalInformation> personas) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista = new Resultado(personas);
        vista.getRegresar().setOnMousePressed(new atras());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
    }
    
    class opcion implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            
        }
        
    }
    
    class atras implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            InicioVC pantalla = null;
            try {
                pantalla = new InicioVC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PersIncoCVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            pantalla.mostrarVista();
        }
        
    }
}
