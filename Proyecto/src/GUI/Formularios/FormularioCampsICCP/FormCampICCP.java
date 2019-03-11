/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioCampsICCP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
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
public class FormCampICCP {
    private Scene escena;
    private VBox vbox;
    private HBox hbox;
    private Label informacion;
    private Label nombre;
    private TextField nombreTF;
    private Label IdCampamento;
    private TextField IdCampamentoTF;   
    private Label annio;
    private TextField annioTF;
    private Label direccion;
    private TextField direccionTF;
    private Button boton;
    private Button regresar;

    private HBox fondo;
    private Image logo;
    private Text nombreE;
    private StackPane fondos;

    public FormCampICCP() throws FileNotFoundException {
        this.vbox = new VBox();
        vbox.setSpacing(70);
        vbox.setPadding(new Insets(100, 25, 25, 100));
        Label info = new Label("Nota: Los campos con \"*\" son obligatorios");
        info.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 15));
        this.informacion = new Label("Introduzca la informacion del campamento:", info);
        informacion.setContentDisplay(ContentDisplay.RIGHT);
        informacion.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 20));
        this.nombreTF = new TextField();
        this.nombre = new Label("Nombre del campamento: *", nombreTF);
        nombre.setContentDisplay(ContentDisplay.RIGHT);
        this.IdCampamentoTF = new TextField();
        this.IdCampamento = new Label("Identificacion del campamento: *", IdCampamentoTF);
        IdCampamento.setContentDisplay(ContentDisplay.RIGHT);
        this.annioTF = new TextField();
        this.annio = new Label("Annio de realizacion: *", annioTF);
        annio.setContentDisplay(ContentDisplay.RIGHT);
        this.direccionTF = new TextField();
        this.direccion = new Label("Direccion de realizacion: *", direccionTF);
        direccion.setContentDisplay(ContentDisplay.RIGHT);
        this.hbox = new HBox();
        hbox.setSpacing(100);
        this.boton = new Button("Agregar");
        this.regresar = new Button("Regresar");
        hbox.getChildren().addAll(regresar, boton);
        vbox.getChildren().addAll(informacion,nombre,IdCampamento,annio,direccion,hbox);

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
        stage.setTitle("Camp ICCP");
        stage.setScene(this.escena);
        stage.show();
    }

    public TextField getNombreTF() {
        return nombreTF;
    }

    public TextField getIdTF() {
        return IdCampamentoTF;
    }

    public TextField getAnnioTF() {
        return annioTF;
    }

    public TextField getDireccionTF() {
        return direccionTF;
    }

    public Button getBoton() {
        return boton;
    }

    public Button getRegresar() {
        return regresar;
    }

    
    
}
