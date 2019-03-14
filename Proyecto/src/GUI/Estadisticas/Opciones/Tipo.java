/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Estadisticas.Opciones;


import GUI.Estadisticas.Torta.*;
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author diego
 */
public class Tipo {
    
    private Scene escena;
    private Button atras;
    private final VBox vbox;
    private Button genero;
    private Button tallaCamisa;
    
    private HBox fondo;
        private Image logo;
        private Text nombreE;
        private StackPane fondos;
    
    
    public Tipo()throws FileNotFoundException {
        this.vbox = new VBox();
        vbox.setPadding(new Insets(100, 0, 0, 50));
        Label torta = new Label("Grafico de torta: ");
        torta.setFont(Font.font(null, FontWeight.BOLD, 30));
        this.genero = new Button("Genero");
        this.tallaCamisa = new Button("Tipo de documento");
        this.atras = new Button("atras");
        vbox.getChildren().addAll(torta,genero,tallaCamisa,atras);
        vbox.setSpacing(100);
        
        
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
        stage.setTitle("Graficos");
        stage.setScene(this.escena);
        stage.show();
    }
        
    public Button getAtras() {
        return atras;
    }

    public Button getGenero() {
        return genero;
    }

    public Button getTallaCamisa() {
        return tallaCamisa;
    }
    
    
}
