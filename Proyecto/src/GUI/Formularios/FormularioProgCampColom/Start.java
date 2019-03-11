/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioProgCampColom;

import GUI.Singleton;
import javafx.application.Application;
import javafx.stage.Stage;

public class Start extends Application {
    public static void main(String[] args) {
        launch(args);
    }
      
    @Override
    public void start(Stage primaryStage)
            throws Exception {
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        FormProgCampColomVC pp = new FormProgCampColomVC();
        pp.mostrarVista();         
    }
}
