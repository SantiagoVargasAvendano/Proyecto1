/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioProgAssign;

import GUI.Formularios.FormularioLocalVolunProg.*;
import GUI.Formularios.FormularioICCPAssign.*;
import GUI.Formularios.FormularioCampsICCP.*;
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
public class FormProgAssign {
    private Scene escena;
    private VBox vbox;
    private HBox hbox;
    private Label informacion;
    private Label IdParticipante;
    private TextField IdParticipanteTF;   
    private Label nombreParticipante;
    private TextField nombreParticipanteTF;   
    private Label IdCampamento;
    private TextField IdCampamentoTF; 
    private Label rol;
    private ChoiceBox rolTF;
    private Button boton;
    private Button regresar;
    private ObservableList names;

    private HBox fondo;
    private Image logo;
    private Text nombreE;
    private StackPane fondos;

    public FormProgAssign() throws FileNotFoundException {
        this.vbox = new VBox();
        vbox.setSpacing(60);
        vbox.setPadding(new Insets(100, 25, 25, 100));
        this.informacion = new Label("Introduzca la informacion de registro:");
        informacion.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 20));
        this.IdParticipanteTF = new TextField();
        this.IdParticipante = new Label("Identificacion del participante:", IdParticipanteTF);
        IdParticipante.setContentDisplay(ContentDisplay.RIGHT);
        this.nombreParticipanteTF = new TextField();
        this.nombreParticipante = new Label("Nombre del participante:", nombreParticipanteTF);
        nombreParticipante.setContentDisplay(ContentDisplay.RIGHT);
        this.IdCampamentoTF = new TextField();
        this.IdCampamento = new Label("Identificacion del campamento:", IdCampamentoTF);
        IdCampamento.setContentDisplay(ContentDisplay.RIGHT);
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
        this.rol = new Label("Rol", rolTF);
        rol.setContentDisplay(ContentDisplay.RIGHT);
        this.hbox = new HBox();
        hbox.setSpacing(100);
        this.boton = new Button("Agregar");
        this.regresar = new Button("Regresar");
        hbox.getChildren().addAll(regresar, boton);
        vbox.getChildren().addAll(informacion,nombreParticipante,IdParticipante,IdCampamento,rol,hbox);

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

    public TextField getIdParticipanteTF() {
        return IdParticipanteTF;
    }

    public TextField getIdCampamentoTF() {
        return IdCampamentoTF;
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

    
    
}
