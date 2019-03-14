/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Estadisticas.Torta;


import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author diego
 */
public class Torta {
    
    private Scene escena;
    private Button atras;
    private final VBox vbox;
    
    
    public Torta()throws FileNotFoundException {
        
        this.atras = new Button("Atras");
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Male", 225),
                new PieChart.Data("Female", 155));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Relacion Generos");
          
        ((Group) escena.getRoot()).getChildren().add(chart);
        this.vbox = new VBox(atras,chart);
        escena = new Scene(vbox, 500, 500);
        
    }
    public void mostrar(Stage stage) {
        stage.setTitle("Consulta");
        stage.setScene(this.escena);
        stage.show();
    }
        
    public Button getAtras() {
        return atras;
    }
}
