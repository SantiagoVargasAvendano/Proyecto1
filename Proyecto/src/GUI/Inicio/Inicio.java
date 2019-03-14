/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Inicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author Asus
 */
public class Inicio {
    private Scene escena;
    private HBox hbox;
    private VBox vbox;
    private VBox vbox1;          
    private Image imagen;
    private Button boton;
    private Image imagen1;
    private Button boton2;
    private Image imagen2;
    private Button boton3;
    private Image imagen3;
    private Button boton4;
    private HBox fondo;
    private Image logo;
    private Text nombreE;
    private StackPane fondos;

    public Inicio() throws FileNotFoundException {
        this.hbox = new HBox();
        hbox.setPadding(new Insets(100, 0, 0, 0));
        this.vbox = new VBox();
        this.vbox1 = new VBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(100);
        FileInputStream input = new FileInputStream("src/GUI/Inicio/Graficas.png");
        this.imagen = new Image(input);
        this.boton = new Button("Estadisticas", new ImageView(imagen));
        FileInputStream input1 = new FileInputStream("src/GUI/Inicio/Informes.png");
        this.imagen1 = new Image(input1);
        this.boton2 = new Button("Guardar informacion", new ImageView(imagen1));
        FileInputStream input2 = new FileInputStream("src/GUI/Inicio/Formulario.png");
        this.imagen2 = new Image(input2);
        this.boton3 = new Button("Formularios", new ImageView(imagen2));
        FileInputStream input3 = new FileInputStream("src/GUI/Inicio/lupa.png");
        this.imagen3 = new Image(input3);
        this.boton4 = new Button("Consulta", new ImageView(imagen3));
        vbox.getChildren().addAll(boton, boton2);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(100);
        vbox1.getChildren().addAll(boton3, boton4);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setSpacing(100);
        hbox.getChildren().addAll(vbox, vbox1);
        
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
        fondos.getChildren().addAll(imagen, fondo, hbox);
        escena = new Scene(fondos, 1200, 670);
        
    }
    
    public void mostrar(Stage stage) {
        stage.setTitle("Inicio");
        stage.setScene(this.escena);
        stage.show();
    }

    public Button getBoton() {
        return boton;
    }

    public Button getBoton2() {
        return boton2;
    }

    public Button getBoton3() {
        return boton3;
    }

    public Button getBoton4() {
        return boton4;
    }

    
    
    
}
