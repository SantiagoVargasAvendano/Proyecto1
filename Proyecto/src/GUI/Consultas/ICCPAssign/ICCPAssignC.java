/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Consultas.ICCPAssign;

import GUI.Consultas.ProgramsAssignC.*;
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
public class ICCPAssignC {
    private Scene escena;
    
    private VBox vbox;
    private HBox hbox;
    private RadioButton namePers;
    private TextField namePersTF;
    private RadioButton idPers;
    private TextField idPersTF;
    private RadioButton nameCamp;
    private TextField nameCampTF;
    
    private HBox hbox2;
    private RadioButton rol;
    private TextField rolTF;
    private RadioButton calification;
    private TextField calificationTF;
    private RadioButton note;
    private TextField noteTF;
    
    private HBox hbox3;
    private RadioButton fechaIni;
    private TextField fechaIniTF;
    private RadioButton fechaFin;
    private TextField fechaFinTF;
    
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

    public ICCPAssignC() throws FileNotFoundException {
        this.vbox = new VBox();
        vbox.setSpacing(60);
        vbox.setPadding(new Insets(100, 0, 0, 20));
        this.opciones = new ComboBox<>();
        opciones.getItems().addAll("Informacion personal","Programas Colombia",
                "programas voluntariado","Programas ICCP", "Asignacion programas Colombia"
                ,"Asignacion programas voluntariado","Asignacion programas ICCP");
        this.seleccionar = new Button("Seleccionar tabla");
        this.atras = new Button("Atras");
        opciones.setPromptText("Asignacion programas Colombia");
        this.menu = new HBox();
        menu.setSpacing(100);
        Label info = new Label("Ingrese la tabla en la cual quiere hacer la consulta: ", opciones);
        info.setContentDisplay(ContentDisplay.RIGHT);
        menu.getChildren().addAll(info, seleccionar, atras);
        Label info2= new Label("Seleccione los atributos de la consulta, y sus criterios de busqueda: ");
        vbox.getChildren().addAll(menu, info2);
        
        this.hbox = new HBox();
        hbox.setSpacing(20);
        this.namePers = new RadioButton("Nombre de la persona: ");
        this.namePersTF = new TextField();
        this.idPers = new RadioButton("Id de la persona: ");
        this.idPersTF = new TextField();
        this.nameCamp = new RadioButton("Nombre del campamento: ");
        this.nameCampTF = new TextField();
        hbox.getChildren().addAll(namePers,namePersTF,idPers,idPersTF, nameCamp,nameCampTF);
        vbox.getChildren().add(hbox);
        
        this.hbox2 = new HBox();
        hbox2.setSpacing(20);
        this.rol = new RadioButton("Rol: ");
        this.rolTF = new TextField();
        this.calification = new RadioButton("Calificacion: ");
        this.calificationTF = new TextField();
        this.note = new RadioButton("Nota: ");
        this.noteTF = new TextField();
        hbox2.getChildren().addAll(rol, rolTF,calification,calificationTF,note,noteTF);
        vbox.getChildren().add(hbox2);
        
        this.hbox3 = new HBox();
        hbox3.setSpacing(20);
        this.fechaIni = new RadioButton("Fecha Inicio: ");
        this.fechaIniTF = new TextField();
        this.fechaFin = new RadioButton("Fecha Fin: ");
        this.fechaFinTF = new TextField();
        hbox3.getChildren().addAll(fechaIni, fechaIniTF, fechaFin, fechaFinTF);
        vbox.getChildren().add(hbox3);
        
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

    public RadioButton getNamePers() {
        return namePers;
    }

    public TextField getNamePersTF() {
        return namePersTF;
    }

    public RadioButton getIdPers() {
        return idPers;
    }

    public TextField getIdPersTF() {
        return idPersTF;
    }

    public RadioButton getRol() {
        return rol;
    }

    public TextField getRolTF() {
        return rolTF;
    }

    public RadioButton getCalification() {
        return calification;
    }

    public TextField getCalificationTF() {
        return calificationTF;
    }

    public RadioButton getNote() {
        return note;
    }

    public TextField getNoteTF() {
        return noteTF;
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

    public RadioButton getFechaIni() {
        return fechaIni;
    }

    public TextField getFechaIniTF() {
        return fechaIniTF;
    }

    public RadioButton getFechaFin() {
        return fechaFin;
    }

    public TextField getFechaFinTF() {
        return fechaFinTF;
    }
    
    
}
