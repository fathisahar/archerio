/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archer;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ControllerLogin {
    @FXML private HBox hbContainer;
    @FXML private TextField tfUsername;
    @FXML private PasswordField pfPassword;
    @FXML private Text txtHeader;
    @FXML private Label lblHeader;     
    
    public ControllerLogin() {
        System.out.println("first");
    }

    @FXML
    public void initialize() {
        System.out.println("second");
        lblHeader.setText("My New Label Header when loading...");
        txtHeader.setText("My New Text Header when loading...");      
        String url = "https://clearwatercontrols.co.uk/wp-content/uploads/2013/06/background_image.jpg";
        
        Background bgr = new Background(new BackgroundImage(new Image(url), 
                BackgroundRepeat.NO_REPEAT, 
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true)));
        hbContainer.setBackground(bgr);  
    }
    
    public void handleOnClick(){
        System.out.println("Hello: " +  tfUsername.getText() + " - " +  pfPassword.getText());
        lblHeader.setText("My New Label Header");
        txtHeader.setText("My New Text Header"); 
        setBackground();
    }
    
    public void setBackground(){
        /*// create a background fill 
        BackgroundFill background_fill = new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY, Insets.EMPTY);
        // create Background 
        Background background = new Background(background_fill); */
        
        //hbContainer.setStyle("-fx-background-color: #FDEDEC;");
        
    }
    
    public void handleCancel(){
        lblHeader.setText("");
        txtHeader.setText(""); 
    }
   
}