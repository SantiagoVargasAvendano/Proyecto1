/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormulariosOpc2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class Opciones2 {
    private Scene escena;
    private VBox vbox;
    private Label descripcion;
    private Button b1;
    private Button b2;
    private Button b3;  
    private Button regresar;
    private HBox fondo;
    private Image logo;
    private Text nombreE;
    private StackPane fondos;
    private HBox baseboton;

    public Opciones2() throws FileNotFoundException {
        this.vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(100);
        vbox.setPadding(new Insets(100, 0, 0, 0));
        this.descripcion = new Label("Programas");
        descripcion.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 30));
        this.b1 = new Button("Programas de Colombia");
        this.b2 = new Button("Programas de voluntariado");
        this.b3 = new Button("Programas ICCP");
        this.regresar = new Button("Regresar");
        baseboton = new HBox();
        baseboton.setAlignment(Pos.TOP_LEFT);
        baseboton.getChildren().add(regresar);
        baseboton.setPadding(new Insets(0,0,0,30));
        vbox.getChildren().addAll(descripcion,b1,b2,b3,baseboton);       
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
    
    public void mostrar(Stage stage){
        stage.setTitle("Menu opciones  1");
        stage.setScene(this.escena);
        stage.show();
    }

    public Button getB1() {
        return b1;
    }

    public Button getB2() {
        return b2;
    }

    public Button getB3() {
        return b3;
    }

    public Button getRegresar() {
        return regresar;
    }            
}
