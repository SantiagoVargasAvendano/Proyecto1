/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioICCPAssign;

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
public class FormICCPAssign {
    private Scene escena;
    private VBox vbox;
    private HBox hbox;
    private HBox hbox2;
    private HBox hbox3;
    private HBox hbox4;
    private Label informacion;
    private Label nombreParticipante;
    private TextField nombreParticipanteTF;
    private Label IdParticipante;
    private TextField IdParticipanteTF;   
    private Label codigoCampamento;
    private TextField codigoCampamentoTF;
    private Label rol;
    private ChoiceBox rolTF;
    private Label fechaInicio;
    private DatePicker fechaInicioTF;
    private Label fechaFin;
    private DatePicker fechaFinTF;
    private Label calificacion;
    private TextField calificacionTF;   
    private Label nota;
    private TextField notaTF;   
    private Button boton;
    private Button regresar;
    private ObservableList names;

    private HBox fondo;
    private Image logo;
    private Text nombreE;
    private StackPane fondos;

    public FormICCPAssign() throws FileNotFoundException {
        this.vbox = new VBox();
        this.hbox2 = new HBox();
        this.hbox3 = new HBox();
        this.hbox4 = new HBox();
        vbox.setSpacing(90);
        vbox.setPadding(new Insets(100, 25, 25, 100));
        Label info = new Label("Nota: Los campos con \"*\" son obligatorios");
        info.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 15));
        this.informacion = new Label("Introduzca la informacion de registro:", info);
        informacion.setContentDisplay(ContentDisplay.RIGHT);
        informacion.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 20));
        this.nombreParticipanteTF = new TextField();
        this.nombreParticipante = new Label("Nombre del participante: *", nombreParticipanteTF);
        nombreParticipante.setContentDisplay(ContentDisplay.RIGHT);
        this.IdParticipanteTF = new TextField();
        this.IdParticipante = new Label("Identificacion del participante: *", IdParticipanteTF);
        IdParticipante.setContentDisplay(ContentDisplay.RIGHT);
        this.codigoCampamentoTF = new TextField();
        this.codigoCampamento = new Label("Codigo del campamento: *", codigoCampamentoTF);
        codigoCampamento.setContentDisplay(ContentDisplay.RIGHT);
        names = FXCollections.observableArrayList();
        names.add("Consejero");
        names.add("Personal de apoyo");
        names.add("Salvavidas");
        this.rolTF = new ChoiceBox(names);
        this.rol = new Label("Rol", rolTF);
        rol.setContentDisplay(ContentDisplay.RIGHT);
        this.fechaInicioTF = new DatePicker();
        this.fechaInicio = new Label("Fecha de incio: *", fechaInicioTF);
        fechaInicio.setContentDisplay(ContentDisplay.RIGHT);
        this.fechaFinTF = new DatePicker();
        this.fechaFin = new Label("Fecha de fin: *", fechaFinTF);
        fechaFin.setContentDisplay(ContentDisplay.RIGHT);
        this.calificacionTF = new TextField();
        this.calificacion = new Label("Calificacion: *", calificacionTF);
        calificacion.setContentDisplay(ContentDisplay.RIGHT);
        this.notaTF = new TextField();
        this.nota = new Label("Agregar una nota: ", notaTF);
        nota.setContentDisplay(ContentDisplay.RIGHT);
        this.hbox = new HBox();
        hbox.setSpacing(100);
        this.boton = new Button("Agregar");
        this.regresar = new Button("Regresar");
        hbox.getChildren().addAll(regresar, boton);
        hbox2.getChildren().addAll(nombreParticipante, IdParticipante);
        hbox2.setSpacing(50);
        hbox3.getChildren().addAll(codigoCampamento, rol, fechaInicio);
        hbox3.setSpacing(75);
        hbox4.getChildren().addAll(fechaFin ,calificacion, nota);
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

    public TextField getNombreParticipanteTF() {
        return nombreParticipanteTF;
    }

    public TextField getIdParticipanteTF() {
        return IdParticipanteTF;
    }

    public TextField getCodigoCampamentoTF() {
        return codigoCampamentoTF;
    }

    public DatePicker getFechaInicioTF() {
        return fechaInicioTF;
    }

    public DatePicker getFechaFinTF() {
        return fechaFinTF;
    }

    public ChoiceBox getRolTF() {
        return rolTF;
    }

    public TextField getCalificacionTF() {
        return calificacionTF;
    }

    public TextField getNotaTF() {
        return notaTF;
    }

    

    public Button getBoton() {
        return boton;
    }

    public Button getRegresar() {
        return regresar;
    }

    
    
}
