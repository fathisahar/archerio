/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archer;

/**
 *
 * @author sahar
 */
import java.util.Iterator;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class MainLogin extends Application {
    @Override
    public void start(Stage stage) throws Exception {
   
        Parent root = FXMLLoader.load(getClass().getResource("sceneFormLogin.fxml"));
        Scene scene = new Scene(root);
        //scene.getStylesheets().add(getClass().getResource("stylesFormLogin.css").toExternalForm());
        
        stage.setTitle("JavaFX and FXML");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
