/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 *
 * @author jessi
 */
public class ControllerEducational implements Initializable{
   @FXML private ImageView image;
   @FXML private Button button;
   
   @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image img = new Image(("X.png"));
        ImageView view = new ImageView(img);
        view.setFitWidth(27);
        view.setFitHeight(27);
        button.setGraphic(view);
        
        Image angle = new Image("funfact.jpg");
        image.setImage(angle);
    }
    
    public void onClickTension() throws FileNotFoundException{
        Image angle = new Image("tension1.jpg");
        image.setImage(angle);
    }
    
    public void onClickAngle() throws FileNotFoundException{
        Image angle = new Image("angle1.jpg");
        image.setImage(angle);
    }
    public void onClickWeight() throws FileNotFoundException{
        Image angle = new Image("weight.jpg");
        image.setImage(angle);
    }

   public void onClickExit(ActionEvent event) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
   }
}


