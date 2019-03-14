/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.Opciones;

import GUI.Consultas.PersInfo.PersIncoCVC;
import GUI.Consultas.ProgramasColombia.ProgramsColombiaCVC;
import GUI.Consultas.ProgramasVoluntariado.ProgramsVoluntariadoCVC;
import GUI.Inicio.InicioVC;
import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author Asus
 */
public class OpcionesCVC {
    private OpcionesC vista;
    private GestorPlataforma gestor;

    public OpcionesCVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista = new OpcionesC();
        vista.getSeleccionar().setOnMousePressed(new opcion());
        vista.getRegresar().setOnMousePressed(new atras());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
    }
    
    class opcion implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            String opc = vista.getOpciones().getValue().toString();
            switch(opc){
                case "Informacion personal":
                    PersIncoCVC pantalla = null;
            try {
                pantalla = new PersIncoCVC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OpcionesCVC.class.getName()).log(Level.SEVERE, null, ex);
            }
                    pantalla.mostrarVista();
                    break;
                case "Programas Colombia":
                    ProgramsColombiaCVC pantalla1 = null;
            try {
                pantalla1 = new ProgramsColombiaCVC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OpcionesCVC.class.getName()).log(Level.SEVERE, null, ex);
            }
                    pantalla1.mostrarVista();
                    break;
                case "Programas voluntariado":
                    ProgramsVoluntariadoCVC pantalla2 = null;
            try {
                pantalla2 = new ProgramsVoluntariadoCVC(gestor);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OpcionesCVC.class.getName()).log(Level.SEVERE, null, ex);
            }
                    pantalla2.mostrarVista();
                    break;
                case "":
                    break;
                case "1":
                    break;
            }
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
