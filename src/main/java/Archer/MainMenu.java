/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archer;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jessi
 */
public class MainMenu extends Application {
    @Override
    public void start (Stage stage) throws IOException{
         Parent root= FXMLLoader.load(getClass().getResource("Menu.fxml"));
       
       Scene scene=new Scene(root);
      stage.setTitle("Java and FXML");
      stage.setScene(scene);
      stage.show();
    }
    
    public static void main(String[] args) {
    launch(args);
    } 
}
