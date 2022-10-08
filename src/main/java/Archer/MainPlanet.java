/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archer;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author jessi
 */
public class MainPlanet extends Application {

    
    @Override
    public void start(Stage stage) {
   try{
       String name = "Planet.fxml";
   Parent root= FXMLLoader.load(getClass().getResource(name));
   Scene scene=new Scene(root);
      stage.setScene(scene);
      stage.show();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    
     public static void main(String[] args) {
    launch(args);
    Game game= new Game();
    game.setNumber(1);
    System.out.println(game.getNumber());
    
    } 
    
}
