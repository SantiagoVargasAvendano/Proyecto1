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
    
    private HBox hbox2;
    private RadioButton dateBirth;
    private TextField dateBirthTF;
    private RadioButton mobile;
    private TextField mobileTF;
    private RadioButton phone;
    private TextField phoneTF;
    private RadioButton citizen;
    private TextField citizenTF;
    
    private HBox hbox3;
    private RadioButton email;
    private TextField emailTF;
    private RadioButton sizeShirt;
    private TextField sizeShirtTF;
    private RadioButton currentOcu;
    private TextField currentOcuTF;
    private RadioButton fieldsStudy;
    private TextField fieldsStudyTF;
    
    private HBox hbox4;
    private RadioButton university;
    private TextField universityTF;
    private RadioButton graduate;
    private TextField graduateTF;
    private RadioButton currentAddress;
    private TextField currentAddressTF;
    private RadioButton currentCity;
    private TextField currentCityTF;
    
    private HBox hbox5;
    private RadioButton nameEmCon;
    private TextField nameEmConTF;
    private RadioButton numberEmCon;
    private TextField numberEmConTF;
    private RadioButton emailEmCon;
    private TextField emailEmConTF;
    private RadioButton relationship;
    private TextField relationshipTF;
    
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
        vbox.setPadding(new Insets(100, 0, 0, 20));
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
        
        this.hbox2 = new HBox();
        hbox2.setSpacing(20);
        this.dateBirth = new RadioButton("Fecha nacimiento: ");
        this.dateBirthTF = new TextField();
        this.mobile = new RadioButton("Celular: ");
        this.mobileTF = new TextField();
        this.phone = new RadioButton("Telefono: ");
        this.phoneTF = new TextField();
        this.citizen = new RadioButton("Nacionalidad: ");
        this.citizenTF = new TextField();
        hbox2.getChildren().addAll(dateBirth,dateBirthTF,mobile,mobileTF,phone,phoneTF,citizen,citizenTF);
        vbox.getChildren().add(hbox2);
        
        this.hbox3 = new HBox();
        hbox3.setSpacing(20);
        this.email = new RadioButton("Email: ");
        this.emailTF = new TextField();
        this.sizeShirt = new RadioButton("Talla camisa: ");
        this.sizeShirtTF = new TextField();
        this.currentOcu = new RadioButton("Ocupacion actual: ");
        this.currentOcuTF = new TextField();
        this.fieldsStudy = new RadioButton("Carrera: ");
        this.fieldsStudyTF = new TextField();
        hbox3.getChildren().addAll(email, emailTF,sizeShirt,sizeShirtTF,currentOcu,currentOcuTF, fieldsStudy,fieldsStudyTF);
        vbox.getChildren().add(hbox3);
        
        this.hbox4 = new HBox();
        hbox4.setSpacing(20);
        this.university = new RadioButton("Universidad: ");
        this.universityTF = new TextField();
        this.graduate = new RadioButton("Graduado: ");
        this.graduateTF = new TextField();
        this.currentAddress = new RadioButton("Direccion acutal: ");
        this.currentAddressTF = new TextField();
        this.currentCity = new RadioButton("Ciudad actual: ");
        this.currentCityTF = new TextField();
        hbox4.getChildren().addAll(university,universityTF,graduate,graduateTF,currentAddress,currentAddressTF,currentCity, currentCityTF);
        vbox.getChildren().add(hbox4);
        
        this.hbox5 = new HBox();
        hbox5.setSpacing(5);
        this.nameEmCon = new RadioButton("Nombre Con. Emer.: ");
        this.nameEmConTF = new TextField();
        this.numberEmCon = new RadioButton("Numero Con. Emer.: ");
        this.numberEmConTF = new TextField();
        this.emailEmCon = new RadioButton("Email Con. Emer.: ");
        this.emailEmConTF = new TextField();
        this.relationship = new RadioButton("Relacion Con. Emer.: ");
        this.relationshipTF = new TextField();
        hbox5.getChildren().addAll(nameEmCon,nameEmConTF,numberEmCon,numberEmConTF,emailEmCon,emailEmConTF,relationship,relationshipTF);
        vbox.getChildren().add(hbox5);
        
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
