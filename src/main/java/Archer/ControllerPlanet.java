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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;

/**
 *
 * @author jessi
 */
public class ControllerPlanet  implements Initializable{
    
    public Game game = new Game();
    public Arrow arrow = new Arrow();
   
    private Stage stage;
    private Scene scene;
    private Parent root; 
    
    @FXML private Button button;
    @FXML private ImageView image;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image img = new Image(("fleche.png"));
        ImageView view = new ImageView(img);
        view.setFitWidth(16);
        view.setFitHeight(27);
        button.setTranslateX(5);
        button.setTranslateY(15);
        button.setGraphic(view);
        Image back = new Image(("systeme_solaire.png"));
        image.setImage(back);
    }
        public void onClickSun(ActionEvent event) throws IOException {
        game.setNumber(0);
        arrow.setGravity(8.1);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
        
    public void onClickMercury(ActionEvent event) throws IOException {
       game.setNumber(1);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void onClickVenus(ActionEvent event) throws IOException {
       game.setNumber(2);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } 
    
   public void onClickEarth(ActionEvent event) throws IOException {
        game.setNumber(3);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
   
  public void onClickMoon(ActionEvent event) throws IOException {
       game.setNumber(4);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
  
      public void onClickMars(ActionEvent event) throws IOException {
        game.setNumber(5);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
      
    public void onClickJupiter(ActionEvent event) throws IOException{
       game.setNumber(6);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
        public void onClickSaturn(ActionEvent event) throws IOException {
        game.setNumber(7);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void onClickUranus(ActionEvent event) throws IOException {
        game.setNumber(8);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void onClickNeptune(ActionEvent event) throws IOException {
       game.setNumber(9);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onClickPluto(ActionEvent event) throws IOException{
        game.setNumber(10);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
     public void onClickExit(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
}
