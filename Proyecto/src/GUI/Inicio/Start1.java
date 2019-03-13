/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Inicio;

import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import javafx.application.Application;
import javafx.stage.Stage;

public class Start1 extends Application {
    public static void main(String[] args) {
        launch(args); 
    }
      
    @Override
    public void start(Stage primaryStage)
            throws Exception {
        Singleton singleton = Singleton.getSingleton();
        GestorPlataforma gestor = new GestorPlataforma();
        singleton.setStage(primaryStage);
        InicioVC pp = new InicioVC(gestor);
        pp.mostrarVista();
        
    }
    
}
