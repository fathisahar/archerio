/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author jessi
 */
public class ControllerMenu implements Initializable{
@FXML AnchorPane pane = new AnchorPane();
@FXML private ImageView image ;
    
@Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        Image menu = new Image(("menu.jpg"));
        image.setImage(menu);
     }   
    public void onClickPlay(ActionEvent event) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("Planet.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
   }
    public void onClickFunfact(ActionEvent event) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("Educational.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void onClickExit(ActionEvent actionEvent){
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.close();
    }
    
}
