/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archer;

import java.io.FileNotFoundException;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.Animation.Status;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
/**
 *
 * @author jessi
 */
public class ControllerProjectionTwo implements Initializable{
   
    @FXML private Button go;
    @FXML private ImageView arrow;
    @FXML private ImageView bow;
    @FXML private AnchorPane panePredict;
    
     @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        Image arrowImg = new Image(("arrow.png"));
        arrow.setImage(arrowImg);
        arrow.setPreserveRatio(true);
        arrow.setX(500);
        arrow.setY(500);
        
        Image bowImg = new Image(("Bow2.png"));
        bow.setImage(bowImg);
        bow.setFitHeight(275);
        bow.setFitWidth(200);
        bow.setPreserveRatio(true);
        bow.setX(500);
        bow.setY(500);
        
        Line line = new Line();
        PathTransition path = new PathTransition();
                            line.setStartX(200);
                            line.setEndX(400);
                            line.setStartY(400);
                            line.setEndY(600);
                            path.setDuration(Duration.millis(300));
                            path.setPath(line);
                            path.setNode(arrow);
                            path.setOrientation(PathTransition.OrientationType.NONE);
                            path.setCycleCount(1);
                            path.setAutoReverse(false);
                            path.play();
        
    }
    
    
    public void onClickProject() throws FileNotFoundException{
        
        
        /*
        Bow bow = new Bow(400, 0.04);
        Arrow arrowO = new Arrow(0.004, 1.2, 9.8, bow, 40.0);
        Projection projection = new Projection(0, arrowO);
        Game game = new Game(1, 5, 5, 7);
        
        projection.setVelocityI();
        projection.setxVelocity();
        projection.setyVelocity();
        projection.setFinalC();
        
        double C[][] = projection.getFinalC();

        new Thread(() -> { // lambda expression
            try {
                for (int i = 0; i < C[0].length; i++){  
                    PathTransition path = new PathTransition();
                    //if (path.getStatus() == Animation.Status.STOPPED){
                        if ((i+1) < C[0].length && (i+2) < C[0].length){
                            Line line = new Line();
                            line.setStartX(50*(C[0][i]));
                            line.setEndX((50 *C[0][i+1]));
                            line.setStartY(300 + -50 *(C[1][i]));
                            line.setEndY(300+ -50 *(C[1][i+1]));
                            path.setDuration(Duration.millis(300));
                            path.setPath(line);
                            path.setNode(arrow);
                            path.setOrientation(PathTransition.OrientationType.NONE);
                            path.setCycleCount(1);
                            path.setAutoReverse(false);
                            path.play();
                            
                            double vxi = projection.getxVelocity();
                            double vyi = projection.getyVelocity();
                            double t = 0.1;
                            
                            double angles [] = new double[C[0].length];
        
                            for (int a = 0; a < C[0].length; a++ ){
                                double angle = Math.toDegrees(Math.atan(vyi / vxi));
                                vyi = vyi - t * projection.getArrow().getGravity();
                                angles[a] = angle;
                            }
                            
                            RotateTransition rotate = new RotateTransition();  
                            rotate.setAxis(Rotate.Z_AXIS);
                            if(angles[i]<0){
                            rotate.setFromAngle(-(angles[i]));
                            rotate.setToAngle(-(angles[i+1]));
                            angles[i]=+360;
                            }else if (angles[i]>0){
                             rotate.setFromAngle(-(angles[i]));
                            rotate.setToAngle(-(angles[i+1]));
                                    }
                            rotate.setCycleCount(1);  
                            rotate.setDuration(Duration.millis(350)); 
                            rotate.setNode(arrow);
                            rotate.play();
                        }        
                    //}
                    Thread.sleep(220);
                }
            }catch (InterruptedException ex) {}
        }).start();
                            double vxi = projection.getxVelocity();
                            double vyi = projection.getyVelocity();
                            double t = 0.1;
                            
                            double angles [] = new double[C[0].length];
        
                            for (int a = 0; a < C[0].length; a++ ){
                                double angle = Math.toDegrees(Math.atan(vyi / vxi));
                                vyi = vyi - t * projection.getArrow().getGravity();
                                System.out.println(angle);
                            }
*/
    }
    
    public void onClickPredict() throws FileNotFoundException{
        Bow bow = new Bow(400, 0.04);
        Arrow arrow = new Arrow(0.004, 1.2, 9.8, bow, 40.0);
        Projection projection = new Projection(0, arrow);
        //Game game = new Game(1, 5, 5, 7);
        
        projection.setVelocityI();
        projection.setxVelocity();
        projection.setyVelocity();
        projection.setFinalC();
        
        double C[][] = projection.getFinalC();
        Line lines[] = new Line[(C[0].length)]; // 0 to 11 index, 12 items
                for (int i = 0; i < C[0].length; i++){  
                        if ((i+1) < C[0].length && (i+2) < C[0].length){
                            Line line = new Line();
                            line.setStartX(95 + 52 *(C[0][i]));
                            line.setEndX((95 + 52 *C[0][i+1]));
                            line.setStartY(500 + -55 *(C[1][i]));
                            line.setEndY(500 + -55 *(C[1][i+1]));
                            lines[i] = line;
                        }
                }
                for (int i = 0; i < lines.length; i+=2){
                    if ((i+1) < C[0].length && (i+2) < C[0].length){
                        panePredict.getChildren().add(lines[i]);
                    }
                }
    }
}
                
            