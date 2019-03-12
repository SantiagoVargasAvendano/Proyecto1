/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Formularios.FormularioPersInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class FormPersona {
    private Scene escena;
    private VBox vbox;
    private HBox hbox;
    private HBox hbox2;
    private HBox hbox3;
    private Label informacion;
    private Label fullName;
    private TextField fullNameTF;
    private Label typeDocument;
    private ChoiceBox typeDocumentTF;
    private Label Id;
    private TextField IdTF;
    private Label gender;
    private ChoiceBox genderTF;
    private Label dateBirth;
    private DatePicker dateBirthTF;
    private Label mobile;
    private TextField mobileTF;
    private Label phone;
    private TextField phoneTF;
    private Label citizen;
    private TextField citizenTF;
    private Label email;
    private TextField emailTF;
    private Label passport;
    private TextField passportTF;
    private Label sizeShirt;
    private ChoiceBox sizeShirtTF;
    private Label currentOcupation;
    private TextField currentOcupationTF;
    private HBox hbox4;
    private Label info2;
    private Label fieldsStudy;
    private TextField fieldsStudyTF;
    private Label university;
    private TextField universityTF;
    private Label graduado;
    private ChoiceBox graduadoTF;
    private Label currentAdress;
    private HBox hbox5;
    private Label info3;
    private TextField currentAdressTF;
    private Label currentCity;
    private TextField currentCityTF;
    private HBox hbox6;
    private Label info4;
    private Label fullNameEmergencyContact;
    private TextField fullNameEmergencyContactTF;
    private Label numberEmergencyContact;
    private TextField numberEmergencyContactTF;
    private Label emailEmergencyContact;
    private TextField emailEmergencyContactTF;
    private Label relationship;
    private ChoiceBox relationshipTF;
    private Button boton;
    private HBox fondo;
    private Image logo;
    private Text nombreE;
    private StackPane fondos;
    private ObservableList names;
    private ObservableList names2;
    private ObservableList names3;
    private ObservableList names4;
    private ObservableList names5;
    private Button regresar;
    private HBox botones;
    
    public FormPersona() throws FileNotFoundException {
        this.vbox = new VBox();
        vbox.setSpacing(20);
        vbox.setPadding(new Insets(100, 25, 25, 25));
        Label info = new Label("Nota: Los campos con \"*\" son obligatorios");
        info.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 15));
        this.informacion = new Label("Informacion personal: ", info);
        informacion.setContentDisplay(ContentDisplay.RIGHT);  
        informacion.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 20));
        vbox.getChildren().add(informacion);
        this.hbox = new HBox();
        this.fullNameTF = new TextField();
        this.fullName = new Label("Nombre completo: *" , fullNameTF);
        fullName.setContentDisplay(ContentDisplay.RIGHT);
        names = FXCollections.observableArrayList();
        names.add("Tarjeta de identidad");
        names.add("Cedula de ciudadania");
        names.add("Cedula de extranjeria");
        names.add("Pasaporte");
        names.add("Registro civil");
        this.typeDocumentTF = new ChoiceBox(names);
        this.typeDocument = new Label("Tipo de documento: *", typeDocumentTF);
        typeDocument.setContentDisplay(ContentDisplay.RIGHT);
        this.IdTF = new TextField();
        this.Id = new Label("Identificacion: *" , IdTF);
        Id.setContentDisplay(ContentDisplay.RIGHT);
        names2 = FXCollections.observableArrayList();
        names2.add("Masculino");
        names2.add("Femenino");
        this.genderTF = new ChoiceBox(names2);
        this.gender = new Label("Genero: *", genderTF);
        gender.setContentDisplay(ContentDisplay.RIGHT);
        hbox.getChildren().addAll(fullName,typeDocument,Id,gender);
        hbox.setSpacing(20);
        vbox.getChildren().add(hbox);   
        this.hbox2 = new HBox();
        this.dateBirthTF = new DatePicker();
        this.dateBirth = new Label("Fecha nacimiento: *", dateBirthTF);       
        dateBirth.setContentDisplay(ContentDisplay.RIGHT);
        this.mobileTF = new TextField();
        this.mobile = new Label("Celular: *", mobileTF);       
        mobile.setContentDisplay(ContentDisplay.RIGHT);
        this.phoneTF = new TextField();
        this.phone = new Label("Telefono:", phoneTF);     
        phone.setContentDisplay(ContentDisplay.RIGHT);
        names3 = FXCollections.observableArrayList();
        names3.add("S");
        names3.add("M");
        names3.add("L");
        names3.add("XXL");
        names3.add("XL");
        names3.add("10");
        names3.add("12");
        names3.add("14");
        names3.add("16");
        this.sizeShirtTF = new ChoiceBox(names3);
        this.sizeShirt = new Label("Tamaño de camisa: *", sizeShirtTF);
        sizeShirt.setContentDisplay(ContentDisplay.RIGHT);
        hbox2.getChildren().addAll(dateBirth,mobile,phone, sizeShirt);
        hbox2.setSpacing(60);
        vbox.getChildren().add(hbox2);    
        this.hbox3 = new HBox();
        this.emailTF = new TextField();
        this.email = new Label("Email: *", emailTF);
        email.setContentDisplay(ContentDisplay.RIGHT);
        this.citizenTF = new TextField();
        this.citizen = new Label("Nacionalidad:", citizenTF);
        citizen.setContentDisplay(ContentDisplay.RIGHT);
        this.passportTF = new TextField();
        this.passport = new Label("Pasaporte:", passportTF);
        passport.setContentDisplay(ContentDisplay.RIGHT);
        hbox3.getChildren().addAll(email,citizen, passport);
        hbox3.setSpacing(100);
        vbox.getChildren().add(hbox3);
        
        this.info2 = new Label("Informacion academica:");
        info2.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 20));
        vbox.getChildren().add(info2);
        this.hbox4 = new HBox();
        this.fieldsStudyTF = new TextField();
        this.fieldsStudy = new Label("Carrera: *", fieldsStudyTF);
        fieldsStudy.setContentDisplay(ContentDisplay.RIGHT);
        this.universityTF = new TextField();
        this.university = new Label("Universidad: *", universityTF);
        university.setContentDisplay(ContentDisplay.RIGHT);
        names5 = FXCollections.observableArrayList();
        names5.add("Si");
        names5.add("No");
        this.graduadoTF = new ChoiceBox(names5);
        this.graduado = new Label("Graduado: *", graduadoTF);
        graduado.setContentDisplay(ContentDisplay.RIGHT);
        hbox4.getChildren().addAll(fieldsStudy,university,graduado);
        hbox4.setSpacing(100);
        vbox.getChildren().add(hbox4);
        
        this.info3 = new Label("Informacion actual: ");
        info3.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 20));
        vbox.getChildren().add(info3);
        this.hbox5 = new HBox();
        this.currentOcupationTF = new TextField();
        this.currentOcupation = new Label("Ocupacion: *", currentOcupationTF);
        currentOcupation.setContentDisplay(ContentDisplay.RIGHT);
        this.currentAdressTF = new TextField();
        this.currentAdress = new Label("Direccion actual: *", currentAdressTF);
        currentAdress.setContentDisplay(ContentDisplay.RIGHT);
        this.currentCityTF = new TextField();
        this.currentCity = new Label("Ciudad actual: *", currentCityTF);
        currentCity.setContentDisplay(ContentDisplay.RIGHT);
        hbox5.getChildren().addAll(currentOcupation,currentAdress,currentCity);
        hbox5.setSpacing(100);
        vbox.getChildren().add(hbox5);
        
        this.info4 = new Label("Informacion contacto de emergencia: ");
        info4.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 20));
        vbox.getChildren().add(info4);
        this.hbox6 = new HBox();
        this.fullNameEmergencyContactTF = new TextField();
        this.fullNameEmergencyContact = new Label("Nombre: *", fullNameEmergencyContactTF);
        fullNameEmergencyContact.setContentDisplay(ContentDisplay.RIGHT);
        this.numberEmergencyContactTF = new TextField();
        this.numberEmergencyContact = new Label("Numero: *", numberEmergencyContactTF);
        numberEmergencyContact.setContentDisplay(ContentDisplay.RIGHT);
        this.emailEmergencyContactTF = new TextField();
        this.emailEmergencyContact = new Label("Email: *",emailEmergencyContactTF);
        emailEmergencyContact.setContentDisplay(ContentDisplay.RIGHT);
        names4 = FXCollections.observableArrayList();
        names4.add("Papá");
        names4.add("Mamá");
        names4.add("Primo");
        names4.add("Prima");
        names4.add("Abuelo");
        names4.add("Abuela");
        names4.add("Madrina");
        names4.add("Padrino");
        names4.add("Tio");
        names4.add("Tia");
        names4.add("Amigo");
        names4.add("N/A");
        this.relationshipTF = new ChoiceBox(names4);
        this.relationship = new Label("Relacion: *", relationshipTF);
        relationship.setContentDisplay(ContentDisplay.RIGHT);
        hbox6.getChildren().addAll(fullNameEmergencyContact,numberEmergencyContact,emailEmergencyContact,relationship);
        hbox6.setSpacing(70);
        vbox.getChildren().add(hbox6);
            
        this.botones = new HBox();
        botones.setAlignment(Pos.CENTER);
        botones.setSpacing(100);
        this.boton = new Button("Agregar");    
        this.regresar = new Button("Regresar");
        botones.getChildren().addAll(regresar, boton);
        vbox.getChildren().add(botones);
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
        this.escena = new Scene(fondos, 1200, 670, Color.BLACK); 
    }    
            
    public void mostrar(Stage stage){
        stage.setTitle("Formulario Informacion personal");
        stage.setScene(this.escena);
        stage.show();
    }

    public TextField getFullNameTF() {
        return fullNameTF;
    }

    public ChoiceBox getTypeDocumentTF() {
        return typeDocumentTF;
    }

    public TextField getIdTF() {
        return IdTF;
    }

    public ChoiceBox getGenderTF() {
        return genderTF;
    }

    public DatePicker getDateBirthTF() {
        return dateBirthTF;
    }
    
    public TextField getMobileTF() {
        return mobileTF;
    }

    public TextField getPhoneTF() {
        return phoneTF;
    }

    public TextField getCitizenTF() {
        return citizenTF;
   }

    public TextField getEmailTF() {
        return emailTF;
    }

    public TextField getPassportTF() {
        return passportTF;
    }

    public ChoiceBox getSizeShirtTF() {
        return sizeShirtTF;
    }

    public TextField getCurrentOcupationTF() {
        return currentOcupationTF;
    }

    public TextField getFieldsStudyTF() {
        return fieldsStudyTF;
    }

    public TextField getUniversityTF() {
        return universityTF;
    }

    public ChoiceBox getGraduadoTF() {
        return graduadoTF;
    }
    
    public TextField getCurrentAdressTF() {
        return currentAdressTF;
    }

    public TextField getCurrentCityTF() {
        return currentCityTF;
    }

    public TextField getFullNameEmergencyContactTF() {
        return fullNameEmergencyContactTF;
    }

    public TextField getNumberEmergencyContactTF() {
        return numberEmergencyContactTF;
    }

    public TextField getEmailEmergencyContactTF() {
        return emailEmergencyContactTF;
    }

    public ChoiceBox getRelationshipTF() {
        return relationshipTF;
    }

    public Button getBoton() {
        return boton;
    }

    public Button getRegresar() {
        return regresar;
    }
          
}
