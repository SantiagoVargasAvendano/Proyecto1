/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Estadisticas.Opciones;

import GUI.Estadisticas.Torta.*;
import GUI.Consultas.Opciones.OpcionesCVC;
import GUI.Consultas.PersInfo.PersIncoCVC;
import GUI.Consultas.ProgramsAssignC.ProgramsAssignC;
import GUI.Consultas.ProgramsAssignC.ProgramsAssignCVC;
import GUI.Estadisticas.Genero.GeneroVC;
import GUI.Estadisticas.TipoDocumento.TipoDocumentoVC;
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
 * @author diego
 */
public class TipoVC {
    private GestorPlataforma gestor;
    private Tipo vista;
    
    public TipoVC(GestorPlataforma gestor) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista = new Tipo();
        this.vista.getAtras().setOnMousePressed(new TipoVC.atras());
        this.vista.getGenero().setOnMousePressed(new Genero());
        this.vista.getTallaCamisa().setOnMousePressed(new TipoDocumento());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
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
    
    class Genero implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            GeneroVC pantalla = null;
            int p = 0;
            int h=0;
            for(int i=0;i<gestor.getPersonas().size();i++){
                if(gestor.getPersonas().get(i).getGender().equals("Male"))
                    p++;
                else
                    h++;
            }
            try {
                pantalla = new GeneroVC(gestor, p,h);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PersIncoCVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            pantalla.mostrarVista();
        }
        
    }
    
    class TipoDocumento implements EventHandler<Event>{

        @Override
        public void handle(Event event) {
            int l = 0; int m = 0; int s = 0; int xxl = 0; int xl = 0;
            String c = "";
            for(int i=0;i<gestor.getPersonas().size();i++){
                c = gestor.getPersonas().get(i).getTypeDocument();
                switch(c){
                    case "Tarjeta de Identidad":
                        s++;
                        break;
                    case "Cedula de Ciudadania":
                        m++;
                        break;
                    case "Cedula de Extranjería":
                        l++;
                        break;
                    case "asaporte":
                        xl++;
                        break;
                    case "Registro Civil":
                        xxl++;
                        break;
                    default:
                        break;
                }
            }
            
            TipoDocumentoVC pantalla = null;
            try {
                pantalla = new TipoDocumentoVC(gestor,s,m,l,xl,xxl);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PersIncoCVC.class.getName()).log(Level.SEVERE, null, ex);
            }
            pantalla.mostrarVista();
        }
        
    }
}
