/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.java.fx;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
public class EjemploJavaFx extends Application {

    /**
     * @param args the command line arguments
     */
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button botonOk = new Button("Ok");
        Button botonNoOk = new Button("No Ok");
        Button botonSi = new Button(" Si");
        Button botonNo = new Button("NO");
        FileInputStream input = new FileInputStream("icon.png");
        Image imagen = new Image(input);
        Label label1 = new Label(" Prohibido",new ImageView(imagen));
        TableView tabla = new TableView();
        tabla.setEditable(true);
        //TableColumn Primera = TableColumn("Primea");
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(15,15,15,15));
        pane.setHgap(10);
        pane.setVgap(5);
        pane.add(new Label(" Usuario"), 0, 0);
        pane.add(new Label(" Contraseña"),0,1);
        pane.add(new TextField() , 1, 0);
        pane.add(new TextField(), 1, 1);
        Button ingresa = new Button(" Ingresar");
        pane.add(ingresa,0,2);
        ColumnConstraints col = new ColumnConstraints();
        ColumnConstraints col2 = new ColumnConstraints();
        col.setPercentWidth(120);
        col2.setPercentWidth(150);
        pane.getColumnConstraints().addAll(col,col2,col,col2);
        GridPane pane2 = new GridPane();
        pane2.getColumnConstraints().addAll(col,col2,col,col2);
        Label label3 = new Label(" El texto");
        pane2.add(label3, 0,0,1,2);
        HBox hbox = new HBox(botonSi, botonNo,pane2);
        VBox vbox = new VBox(botonOk,botonNoOk,hbox,label1,pane);
        Scene escena = new Scene(vbox,500,500);
        primaryStage.setTitle("Ejemplo");
        primaryStage.setScene(escena);
        primaryStage.show();
    }
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
        
 

