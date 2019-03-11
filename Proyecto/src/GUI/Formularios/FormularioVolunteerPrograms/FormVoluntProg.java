/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioVolunteerPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
public class FormVoluntProg {
    private Scene escena;
    private VBox vbox;
    private HBox hbox2;
    private HBox hbox3;
    private HBox hbox;
    private Label informacion;
    private Label nombreCompania;
    private TextField nombreCompaniaTF;
    private Label Id;
    private TextField IdTF;   
    private Label fechaGrado;
    private DatePicker fechaGradoTF;
    private Label duracion;
    private TextField duracionTF;
    private Label tipoVoluntariado;
    private ChoiceBox tipoVoluntariadoTF;
    private Button boton;
    private Button regresar;
    private ObservableList names;

    private HBox fondo;
    private Image logo;
    private Text nombreE;
    private StackPane fondos;

    public FormVoluntProg() throws FileNotFoundException {
        this.vbox = new VBox();
        this.hbox2 = new HBox();
        this.hbox3 = new HBox();
        vbox.setSpacing(100);
        vbox.setPadding(new Insets(100, 25, 25, 100));
        Label info = new Label("Nota: Los campos con \"*\" son obligatorios");
        info.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 15));
        this.informacion = new Label("Introduzca la informacion del campamento:", info);
        informacion.setContentDisplay(ContentDisplay.RIGHT);
        informacion.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 20));
        this.nombreCompaniaTF = new TextField();
        this.nombreCompania = new Label("Nombre de la compania: *", nombreCompaniaTF);
        nombreCompania.setContentDisplay(ContentDisplay.RIGHT);
        this.IdTF = new TextField();
        this.Id = new Label("Identificacion del programa: *", IdTF);
        Id.setContentDisplay(ContentDisplay.RIGHT);
        this.fechaGradoTF = new DatePicker();
        this.fechaGrado = new Label("Fecha de grado: *", fechaGradoTF);
        fechaGrado.setContentDisplay(ContentDisplay.RIGHT);
        this.duracionTF = new TextField();
        this.duracion = new Label("Duracion del campamento: *", duracionTF);
        duracion.setContentDisplay(ContentDisplay.RIGHT);
        names = FXCollections.observableArrayList();
        names.add("Blanco");
        names.add("Azul");
        names.add("Verde");
        names.add("Rojo");
        this.tipoVoluntariadoTF = new ChoiceBox(names);
        this.tipoVoluntariado = new Label("Tipo de voluntariado: *", tipoVoluntariadoTF);
        tipoVoluntariado.setContentDisplay(ContentDisplay.RIGHT);
        this.hbox = new HBox();
        hbox.setSpacing(100);
        this.boton = new Button("Agregar");
        this.regresar = new Button("Regresar");
        hbox.getChildren().addAll(regresar, boton);
        hbox2.getChildren().addAll(nombreCompania, Id, fechaGrado);
        hbox2.setSpacing(50);
        hbox3.getChildren().addAll(duracion,tipoVoluntariado);
        hbox3.setSpacing(50);
        vbox.getChildren().addAll(informacion, hbox2,hbox3,hbox);

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
        stage.setTitle("Formulario 1");
        stage.setScene(this.escena);
        stage.show();
    }

    public TextField getNombreCompaniaTF() {
        return nombreCompaniaTF;
    }

    public DatePicker getFechaGradoTF() {
        return fechaGradoTF;
    }
    
    public TextField getDuracionTF() {
        return duracionTF;
    }

    public ChoiceBox getTipoVoluntariadoTF() {
        return tipoVoluntariadoTF;
    }

    public TextField getIdTF() {
        return IdTF;
    }

    public Button getBoton() {
        return boton;
    }

    public Button getRegresar() {
        return regresar;
    }

    
    
}
