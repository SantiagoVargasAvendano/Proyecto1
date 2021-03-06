/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Estadisticas.Torta;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author diego
 */
public class Torta {
    
    private Scene escena;
    private Button atras;
    private final VBox vbox;
    
    private HBox fondo;
        private Image logo;
        private Text nombreE;
        private StackPane fondos;
    
    
    public Torta()throws FileNotFoundException {
        
        this.atras = new Button("Atras");
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Male", 225),
                new PieChart.Data("Female", 155));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Relacion Generos");
        this.vbox = new VBox(atras,chart);
        this.fondo = new HBox();
        this.logo = new Image(new FileInputStream("src/GUI/Logo.png"));
        this.nombreE = new Text("Base de datos YMCA");
        nombreE.setFont(Font.font(50));
        fondo.getChildren().addAll(nombreE, new ImageView(logo));
        fondo.setPadding(new Insets(5, 10, 0, 10));
        fondo.setSpacing(600);
        this.fondos = new StackPane();
        Image pp = new Image(new FileInputStream("src/GUI/Fondo.png"));
        ImageView imagen = new ImageView(pp);
        fondos.getChildren().addAll(imagen, fondo, vbox);
        escena = new Scene(fondos, 1200, 670);
        
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
