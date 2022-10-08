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
import javafx.stage.Stage;

/**
 *
 * @author jessi
 */
public class MainSolution extends Application {
    @Override
    public void start (Stage stage) throws IOException{
         Parent root= FXMLLoader.load(getClass().getResource("Solution.fxml"));
       
       Scene scene=new Scene(root);
      stage.setTitle("Java and FXML");
      stage.setScene(scene);
      stage.show();
    }
    
     public static void main(String[] args) {
    launch(args);
    } 
}
