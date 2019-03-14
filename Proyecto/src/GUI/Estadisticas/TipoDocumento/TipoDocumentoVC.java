/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Estadisticas.TipoDocumento;

import GUI.Estadisticas.Genero.*;
import GUI.Estadisticas.Torta.*;
import GUI.Consultas.Opciones.OpcionesCVC;
import GUI.Consultas.PersInfo.PersIncoCVC;
import GUI.Consultas.ProgramsAssignC.ProgramsAssignC;
import GUI.Consultas.ProgramsAssignC.ProgramsAssignCVC;
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
public class TipoDocumentoVC {
    private GestorPlataforma gestor;
    private TipoDocumento vista;
    
    public TipoDocumentoVC(GestorPlataforma gestor,int s,int m,int l, int xl,
            int xxl) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista = new TipoDocumento(s,m,l,xl,xxl);
        this.vista.getAtras().setOnMousePressed(new TipoDocumentoVC.atras());
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
}
