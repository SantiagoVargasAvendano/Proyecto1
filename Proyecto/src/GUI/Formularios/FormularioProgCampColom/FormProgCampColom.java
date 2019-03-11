/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioProgCampColom;

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
public class FormProgCampColom {
    private Scene escena;
    private VBox vbox;
    private HBox hbox2;
    private HBox hbox3;
    private HBox hbox4;
    private HBox hbox;
    private Label informacion;
    private Label tipoPrograma;
    private ChoiceBox tipoProgramaTF;
    private Label nombreCompania;
    private TextField nombreCompaniaTF;
    private Label Id;
    private TextField IdTF;   
    private Label dia;
    private Label fechaGrado;
    private DatePicker fechaGradoTF;
    private TextField diaTF;
    private Label mes;
    private TextField mesTF;
    private Label annio;
    private TextField annioTF;
    private Label duracion;
    private TextField duracionTF;
    private Label lugar;
    private TextField lugarTF;
    private Label poblacion;
    private TextField poblacionTF;
    private Button boton;
    private Button regresar;
    private ObservableList names;

    private HBox fondo;
    private Image logo;
    private Text nombreE;
    private StackPane fondos;

    public FormProgCampColom() throws FileNotFoundException {
        this.vbox = new VBox();
        this.hbox2 = new HBox();
        this.hbox3 = new HBox();
        this.hbox4 = new HBox();
        vbox.setSpacing(90);
        vbox.setPadding(new Insets(100, 25, 25, 100));
        this.informacion = new Label("Introduzca la informacion del campamento:");
        informacion.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 20));
        names = FXCollections.observableArrayList();
        names.add("EIP");
        names.add("Y-TAC");
        names.add("Y-CAMP");
        names.add("EIC");
        names.add("English day");
        names.add("Weekend Fun Camp");
        names.add("Null");
        names.add("ICCP");
        names.add("Delegation ICCP");
        names.add("Campers Abroad");
        names.add("YMCA coleaders");
        this.tipoProgramaTF = new ChoiceBox(names);
        this.tipoPrograma = new Label("Tipo de programa:", tipoProgramaTF);
        tipoPrograma.setContentDisplay(ContentDisplay.RIGHT);
        this.nombreCompaniaTF = new TextField();
        this.nombreCompania = new Label("Nombre de la compania:", nombreCompaniaTF);
        nombreCompania.setContentDisplay(ContentDisplay.RIGHT);
        this.IdTF = new TextField();
        this.Id = new Label("Identificacion:", IdTF);
        Id.setContentDisplay(ContentDisplay.RIGHT);
        this.diaTF = new TextField();
        this.dia = new Label("Dia de realizacion:", diaTF);
        dia.setContentDisplay(ContentDisplay.RIGHT);
        this.mesTF = new TextField();
        this.mes = new Label("Mes de realizacion:", mesTF);
        mes.setContentDisplay(ContentDisplay.RIGHT);
        this.annioTF = new TextField();
        this.annio = new Label("Annio de realizacion:", annioTF);
        annio.setContentDisplay(ContentDisplay.RIGHT);
        this.duracionTF = new TextField();
        this.duracion = new Label("Duracion del campamento:", duracionTF);
        duracion.setContentDisplay(ContentDisplay.RIGHT);
        this.duracionTF = new TextField();
        this.lugarTF= new TextField();
        this.lugar = new Label("Lugar del campamento", lugarTF);
        lugar.setContentDisplay(ContentDisplay.RIGHT);
        this.poblacionTF= new TextField();
        this.poblacion = new Label("Poblacion del campamento", poblacionTF);
        poblacion.setContentDisplay(ContentDisplay.RIGHT); 
        this.hbox = new HBox();
        hbox.setSpacing(100);
        this.boton = new Button("Agregar");
        this.regresar = new Button("Regresar");
        hbox.getChildren().addAll(regresar, boton);
        hbox2.getChildren().addAll(tipoPrograma, nombreCompania, Id);
        hbox2.setSpacing(50);
        hbox3.getChildren().addAll(dia, mes, annio);
        hbox3.setSpacing(75);
        hbox4.getChildren().addAll(duracion,lugar,poblacion);
        hbox4.setSpacing(50);
        vbox.getChildren().addAll(informacion, hbox2,hbox3,hbox4,hbox);

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

    public TextField getDiaTF() {
        return diaTF;
    }

    public TextField getMesTF() {
        return mesTF;
    }

    public TextField getDuracionTF() {
        return duracionTF;
    }

    public ChoiceBox getTipoProgramaTF() {
        return tipoProgramaTF;
    }

    public TextField getLugarTF() {
        return lugarTF;
    }

    public TextField getPoblacionTF() {
        return poblacionTF;
    }

    public TextField getIdTF() {
        return IdTF;
    }

    public TextField getAnnioTF() {
        return annioTF;
    }

    public Button getBoton() {
        return boton;
    }

    public Button getRegresar() {
        return regresar;
    }

    
    
}
