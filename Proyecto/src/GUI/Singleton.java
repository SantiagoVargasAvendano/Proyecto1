package GUI;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Singleton {
    private Stage stage;
    private static Singleton singleton = null;
    public static Singleton getSingleton(){
       if(singleton == null)
           singleton = new Singleton();                 
       return singleton;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    /*
        Label info = new Label("Nota: Los campos con \"*\" son obligatorios");
        info.setFont(Font.font(null, FontWeight.BOLD, FontPosture.REGULAR, 15));
        this.informacion = new Label("Introduzca la informacion del campamento:", info);
        informacion.setContentDisplay(ContentDisplay.RIGHT);
    
        private HBox fondo;
        private Image logo;
        private Text nombreE;
        private StackPane fondos;
    
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
        fondos.getChildren().addAll(imagen, fondo, hbox);
        escena = new Scene(fondos, 1200, 670);
    
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error de validacion");
        alert.setHeaderText("No se pudo registrar la informacion");
        alert.setContentText("Debe llenar todos los campos que se encuentran como obligatorios");
        alert.show();

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmacion");
        alert.setHeaderText("La informacion ha sido registrada");
        alert.show();
    
     */
}
