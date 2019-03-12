/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioLocalVolunProg;

import GUI.Formularios.FormularioProgAssign.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ContentDisplay;
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
public class FormLocalVolProg {
    private Scene escena;
    private VBox vbox;
    private HBox hbox;
    private HBox hbox2;
    private HBox hbox3;
    private Label informacion;
    private Label numRegistro;
    private TextField numRegistroTF;   
    private Label IdParticipante;
    private TextField IdParticipanteTF;   
    private Label nombreParticipante;
    private TextField nombreParticipanteTF;   
    private Label nombreCampamento;
    private TextField nombreCampamentoTF; 
    private Label rol;
    private ChoiceBox rolTF;
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

    public FormLocalVolProg() throws FileNotFoundException {
        this.vbox = new VBox();
        this.hbox2 = new HBox();
        this.hbox3 = new HBox();
        vbox.setSpacing(100);
        vbox.setPadding(new Insets(100, 25, 25, 100));
        Label info = new Label("Nota: Los campos con \"*\" son obligatorios");
        info.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 15));
        this.informacion = new Label("Introduzca la informacion de registro:", info);
        informacion.setContentDisplay(ContentDisplay.RIGHT);
        informacion.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 20));
        this.numRegistroTF = new TextField();
        this.numRegistro = new Label("Numero de registro: *", numRegistroTF);
        numRegistro.setContentDisplay(ContentDisplay.RIGHT);
        this.IdParticipanteTF = new TextField();
        this.IdParticipante = new Label("Identificacion del participante: *", IdParticipanteTF);
        IdParticipante.setContentDisplay(ContentDisplay.RIGHT);
        this.nombreParticipanteTF = new TextField();
        this.nombreParticipante = new Label("Nombre del participante: *", nombreParticipanteTF);
        nombreParticipante.setContentDisplay(ContentDisplay.RIGHT);
        this.nombreCampamentoTF = new TextField();
        hbox2.getChildren().addAll(numRegistro, IdParticipante, nombreParticipante);
        hbox2.setSpacing(50);
        this.nombreCampamento = new Label("Identificacion del campamento: *", nombreCampamentoTF);
        nombreCampamento.setContentDisplay(ContentDisplay.RIGHT);
        names = FXCollections.observableArrayList();
        names.add("Coordinador");
        names.add("Sub-coordinador");
        names.add("Coordinador EIP");
        names.add("Consejero tiempo completo");
        names.add("Consejero medio tiempo");
        names.add("LIT");
        names.add("Lider EIP tiempo completo");
        names.add("Lider EIP medio tiempo");
        names.add("Observador");
        names.add("Sub-coordinador EIP");
        names.add("Shadower");
        names.add("Consejero ICCP");
        names.add("Personal de apoyo ICCP");
        names.add("Delegado ICCP");
        names.add("Campista");
        names.add("Interno");
        this.rolTF = new ChoiceBox(names);
        this.rol = new Label("Rol: *", rolTF);
        rol.setContentDisplay(ContentDisplay.RIGHT);
        this.calificacionTF = new TextField();
        this.calificacion = new Label("Calificacion: *", calificacionTF);
        calificacion.setContentDisplay(ContentDisplay.RIGHT);
        hbox3.getChildren().addAll(nombreCampamento, rol, calificacion);
        hbox3.setSpacing(70);
        this.notaTF = new TextField();
        this.nota = new Label("Agregar una nota: ", notaTF);
        nota.setContentDisplay(ContentDisplay.RIGHT);
        this.hbox = new HBox();
        hbox.setSpacing(100);
        this.boton = new Button("Agregar");
        this.regresar = new Button("Regresar");
        hbox.getChildren().addAll(regresar, boton);
        vbox.getChildren().addAll(informacion,hbox2,hbox3,nota,hbox);

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
        stage.setTitle("Local Volunteer program assignment");
        stage.setScene(this.escena);
        stage.show();
    }

    public TextField getIdParticipanteTF() {
        return IdParticipanteTF;
    }

    public ChoiceBox getRolTF() {
        return rolTF;
    }    

    public Button getBoton() {
        return boton;
    }

    public Button getRegresar() {
        return regresar;
    }

    public TextField getNumRegistroTF() {
        return numRegistroTF;
    }

    public TextField getNombreParticipanteTF() {
        return nombreParticipanteTF;
    }

    public TextField getNombreCampamentoTF() {
        return nombreCampamentoTF;
    }

    public TextField getCalificacionTF() {
        return calificacionTF;
    }

    public TextField getNotaTF() {
        return notaTF;
    }

    
    
}
