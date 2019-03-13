/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.PersInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class PersInfoC {
    private Scene escena;
    
    private VBox vbox;
    private HBox hbox;
    private RadioButton name;
    private TextField nameTF;
    private RadioButton id;
    private TextField idTF;
    private RadioButton typeDocument;
    private TextField typeDocumentTF;
    private RadioButton gender;
    private TextField genderTF;
    
    
    private HBox menu;
    private ComboBox<String> opciones;
    private Button seleccionar;
    private HBox fondo;
    private Label label;
    private Image logo;
    private Text nombreE;
    private StackPane fondos;

    public PersInfoC() throws FileNotFoundException {
        this.vbox = new VBox();
        vbox.setSpacing(50);
        vbox.setPadding(new Insets(100, 0, 0, 50));
        this.opciones = new ComboBox<>();
        opciones.getItems().addAll("Informacion personal","Programas Colombia",
                "programas voluntariado","Programas ICCP", "Asignacion programas Colombia"
                ,"Asignacion programas voluntariado","Asignacion programas ICCP");
        this.seleccionar = new Button("Seleccionar tabla");
        opciones.setPromptText("Informacion personal");
        this.menu = new HBox();
        menu.setSpacing(300);
        Label info = new Label("Ingrese la tabla en la cual quiere hacer la consulta: ", opciones);
        info.setContentDisplay(ContentDisplay.RIGHT);
        menu.getChildren().addAll(info, seleccionar);
        Label info2= new Label("Seleccione los atributos de la consulta, y sus criterios de busqueda: ");
        vbox.getChildren().addAll(menu, info2);
        
        this.hbox = new HBox();
        hbox.setSpacing(20);
        this.name = new RadioButton("Nombre completo: ");
        this.nameTF = new TextField();
        this.id = new RadioButton("Id: ");
        this.idTF = new TextField();
        this.typeDocument = new RadioButton("Tipo de documento: ");
        this.typeDocumentTF = new TextField();
        this.gender = new RadioButton("Genero: ");
        this.genderTF = new TextField();
        hbox.getChildren().addAll(name,nameTF,id,idTF,typeDocument,typeDocumentTF,gender,genderTF);
        vbox.getChildren().add(hbox);
        
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

    public Button getSeleccionar() {
        return seleccionar;
    }

    public ComboBox<String> getOpciones() {
        return opciones;
    }
    
}
