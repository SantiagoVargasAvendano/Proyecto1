/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.ProgramasICCP;

import GUI.Consultas.ProgramasVoluntariado.*;
import GUI.Consultas.ProgramasColombia.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class ProgramsICCPC {
    private Scene escena;
    
    private VBox vbox;
    private HBox hbox;
    private RadioButton nameCamp;
    private TextField nameCampTF;
    private RadioButton idCamp;
    private TextField idCampTF;
    private RadioButton year;
    private TextField yearTF;
    
    private HBox hbox2;
    private RadioButton campDate;
    private TextField campDateTF;
    private RadioButton direccion;
    private TextField direccionTF;
    
    private Button consultar;
    private Button atras;
    
    private HBox menu;
    private ComboBox<String> opciones;
    private Button seleccionar;
    private HBox fondo;
    private Label label;
    private Image logo;
    private Text nombreE;
    private StackPane fondos;

    public ProgramsICCPC() throws FileNotFoundException {
        this.vbox = new VBox();
        vbox.setSpacing(60);
        vbox.setPadding(new Insets(100, 0, 0, 20));
        this.opciones = new ComboBox<>();
        opciones.getItems().addAll("Informacion personal","Programas Colombia",
                "Programas voluntariado","Programas ICCP", "Asignacion programas Colombia"
                ,"Asignacion programas voluntariado","Asignacion programas ICCP");
        this.seleccionar = new Button("Seleccionar tabla");
        this.atras = new Button("Atras");
        opciones.setPromptText("Programas ICCP");
        this.menu = new HBox();
        menu.setSpacing(100);
        Label info = new Label("Ingrese la tabla en la cual quiere hacer la consulta: ", opciones);
        info.setContentDisplay(ContentDisplay.RIGHT);
        menu.getChildren().addAll(info, seleccionar, atras);
        Label info2= new Label("Seleccione los atributos de la consulta, y sus criterios de busqueda: ");
        vbox.getChildren().addAll(menu, info2);
        
        this.hbox = new HBox();
        hbox.setSpacing(20);
        this.nameCamp = new RadioButton("Nombre del campamento: ");
        this.nameCampTF = new TextField();
        this.idCamp = new RadioButton("Id del campamento: ");
        this.idCampTF = new TextField();
        this.year = new RadioButton("Annio del programa: ");
        this.yearTF = new TextField();
        hbox.getChildren().addAll(nameCamp,nameCampTF,idCamp,idCampTF,year,yearTF);
        vbox.getChildren().add(hbox);
        
        this.hbox2 = new HBox();
        hbox2.setSpacing(20);
        this.campDate = new RadioButton("Edicion del campamento: ");
        this.campDateTF = new TextField();
        this.direccion = new RadioButton("Duracion del campamento: ");
        this.direccionTF = new TextField();
        hbox2.getChildren().addAll(campDate,campDateTF, direccion,direccionTF);
        vbox.getChildren().add(hbox2);

        this.consultar = new Button("Consultar");
        vbox.getChildren().add(consultar);
        
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

    public RadioButton getNameCamp() {
        return nameCamp;
    }

    public TextField getNameCampTF() {
        return nameCampTF;
    }

    public RadioButton getIdCamp() {
        return idCamp;
    }

    public TextField getIdCampTF() {
        return idCampTF;
    }

    public RadioButton getCampDate() {
        return campDate;
    }

    public TextField getCampDateTF() {
        return campDateTF;
    }

    public RadioButton getYear() {
        return year;
    }

    public TextField getYearTF() {
        return yearTF;
    }

    public RadioButton getDireccion() {
        return direccion;
    }

    public TextField getDireccionTF() {
        return direccionTF;
    }

    public Button getConsultar() {
        return consultar;
    }

    public Button getAtras() {
        return atras;
    }

    public Text getNombreE() {
        return nombreE;
    }
    
    
}
