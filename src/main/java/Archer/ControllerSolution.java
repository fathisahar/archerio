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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author jessi
 */
public class ControllerSolution implements Initializable {
 @FXML private Label YourScore;
 @FXML private Label Score;
 @FXML private Label Compliment;
 @FXML private ImageView image;
 public Game game;
 
  
  @Override
    public void initialize(URL arg0, ResourceBundle rb) {
   Image bg = new Image(("univers.jpg"));
   image.setImage(bg);
   MyResourceBundle myRb = ((MyResourceBundle)rb);
   game = (Game)myRb.getMyObject("game");
   
   Score.setText(Integer.toString(game.getNumber()));
   
   System.out.println(game.getNumber());
   if(game.getNumber()==0){
       Compliment.setText("Better luck next time :( \n \n Please refer to the Fun Facts page \n available on the Main Menu for more information!");
   }
   if(game.getNumber()>=1&& game.getNumber()<= 5){
       Compliment.setText("Good job! \n \n Please refer to the Fun Facts page \n available on the Main Menu for more information!");
    }
   if(game.getNumber()>=6&& game.getNumber()<= 10){
        Compliment.setText("You are amazing! :) \n \n Please refer to the Fun Facts page \n available on the Main Menu for more information!");
    }
   if(game.getNumber()>=11&& game.getNumber()<= 14){
        Compliment.setText("Congratulations, you are almost there! \n \n Please refer to the Fun Facts page \n available on the Main Menu for more information!");
    }
   if(game.getNumber()==15){
       Compliment.setText("Your skills are immaculate! \n \n Please refer to the Fun Facts page \n available on the Main Menu for more information!");
   }
}
    public void onClickExit(ActionEvent event) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("Exit.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
   }
}