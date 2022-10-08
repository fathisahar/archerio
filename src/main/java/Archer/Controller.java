/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archer;

import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.lang.Math;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller implements Initializable{

    @FXML private AnchorPane pane;
    @FXML private TextField angleValue;
    @FXML private TextField displacementValue;
    @FXML private TextField weightValue;
    @FXML private TextField constantValue;
    @FXML private TextField pointsText;
    @FXML private TextField distanceErrorX;
    @FXML private TextField distanceErrorY;
    @FXML private TextField initialVel;
    @FXML private TextField finalVel;
    @FXML private ImageView pixelBow;
    @FXML private ImageView bg;
    @FXML private ImageView pixelArrow;
    @FXML private ImageView target;
    @FXML private ImageView attempts;
    @FXML private Button goButton;
    @FXML private Rectangle lowerRectangle;
    @FXML private Rectangle upperRectangle;
    @FXML private Slider weightSlider; 
    @FXML private Slider constantSlider; 
    @FXML private Slider displacementSlider; 
    Image two= new Image("attempts20.png");
    Image one= new Image("attempts10.png");
    Image zero= new Image("attempts00.png");
    private Image arrowImg = new Image(("arrow.png"));
    private Image bowImg = new Image(("Bow2.png"));
    private double currentPosition;
    private double angleValueDifference;
    public Game game;
    private Arrow arrow;
    private Bow bow; 
    private Projection projection;
    private int attempt=3;
    private Stage stage;
    private Scene scene;
    private Parent root;
            
    /*public void display(Game game){
        this.game = game;
    }*/
    
    @Override
    public void initialize (URL url, ResourceBundle rb){
        
        arrow = new Arrow();
        bow = new Bow();
        projection = new Projection();
        
        double radius = 100;
        arrow.setBow(bow);
        projection.setArrow(arrow);
        
        MyResourceBundle myRb = ((MyResourceBundle)rb);
        game = (Game)myRb.getMyObject("game");
       
        switch (game.getNumber()){
            case 0:
                Image sun = new Image(("sun.jpg"));
                bg.setImage(sun);
                arrow.setGravity(274);
                sliderSetting(0.279, 27.939, 58.78, 5587.845, 0.279, 13.969);
                lowerRectangle.setFill(Color.CHOCOLATE);
                upperRectangle.setFill(Color.CHOCOLATE);
            break;
            case 1: 
                Image mercury = new Image(("Mercury.jpg"));
                bg.setImage(mercury);
                arrow.setGravity(3.7);
                sliderSetting(0.01, 1, 7.55, 200.456, 0.0037, 0.376);
                lowerRectangle.setFill(Color.GREY);
                upperRectangle.setFill(Color.GREY);
            break;
            case 2: 
                Image venus = new Image(("venuss000.jpg"));
                bg.setImage(venus);
                arrow.setGravity(8.87);
                sliderSetting(0.009, 0.9, 18.09, 180.89, 0.009, 0.45);
                lowerRectangle.setFill(Color.FIREBRICK);
                upperRectangle.setFill(Color.FIREBRICK);
            break;
            case 3: 
                Image earth = new Image(("Earth.jpg"));
                bg.setImage(earth);
                arrow.setGravity(9.807);
                sliderSetting(0.01, 1, 20, 200, 0.01, 0.5);
                sliderSetting(0.01, 1, 20, 200, 0.01, 0.5);
                lowerRectangle.setFill(Color.LIGHTGREEN);
                upperRectangle.setFill(Color.LIGHTGREEN);
            break;
            case 4: 
                Image moon = new Image(("Moon.jpg"));
                bg.setImage(moon);
                arrow.setGravity(1.62);
                sliderSetting(0.00165, 5.165, 3.3037, 66.0376, 0.00165, 5.0826);
                lowerRectangle.setFill(Color.LIGHTGRAY);
                upperRectangle.setFill(Color.LIGHTGRAY);
            break;
            case 5: 
                Image mars = new Image(("Mars.jpg"));
                bg.setImage(mars);
                arrow.setGravity(3.721);
                sliderSetting(0.00379, 0.379, 7.588, 150.885, 0.00379, 2.189);
                lowerRectangle.setFill(Color.ORANGE);
                upperRectangle.setFill(Color.ORANGE);
            break;
            case 6: 
                Image jupiter = new Image(("jupiter0.jpg"));
                bg.setImage(jupiter);
                arrow.setGravity(24.79);
                sliderSetting(0.025, 2.5277, 50.555, 505.557, 0.025, 1.264);
                lowerRectangle.setFill(Color.ORANGERED);
                upperRectangle.setFill(Color.ORANGERED);
            break;
            case 7: 
                Image saturn = new Image(("saturnn.jpg"));
                bg.setImage(saturn);
                arrow.setGravity(10.44);
                sliderSetting(0.0106, 1.0645, 21.29, 212.909, 0.0106, 0.532);
                lowerRectangle.setFill(Color.SILVER);
                upperRectangle.setFill(Color.SILVER);
            break;    
            case 8: 
                Image uranus = new Image(("uranus0.jpg"));
                bg.setImage(uranus);
                arrow.setGravity(8.87);
                sliderSetting(0.009, 0.904, 18.089, 180.891, 0.009, 0.452);
                lowerRectangle.setFill(Color.LIGHTSKYBLUE);
                upperRectangle.setFill(Color.LIGHTSKYBLUE);
            break;
            case 9: 
                Image neptune = new Image(("neptune0.jpg"));
                bg.setImage(neptune);
                arrow.setGravity(11.15);
                sliderSetting(0.01136, 1.1369, 22.739, 227.389, 0.01136, 0.5684);
                lowerRectangle.setFill(Color.TURQUOISE);
                upperRectangle.setFill(Color.TURQUOISE);
            break;
            case 10: 
                Image pluto = new Image(("pluto00.jpg"));
                bg.setImage(pluto);
                arrow.setGravity(0.62);
                sliderSetting(0.000632, 5, 1.264, 64.644, 0.000632, 10);
                lowerRectangle.setFill(Color.GAINSBORO);
                upperRectangle.setFill(Color.GAINSBORO);
            break;
       }
        
        Image target1= new Image ("finalTarget.png");
        target.setImage(target1);       
        Random rand = new Random();
        int low = 500 ;
        int high = 900;
        int result = low+rand.nextInt((high-low)/10) *10;
        target.setTranslateX(result+10);
        target.setTranslateY(250);
        target.setFitHeight(150);
        target.setFitWidth(144);
        game.setTargetX(result+12);
        game.setTargetYmin(250 - (target.getFitHeight()/2));
        game.setTargetYmax(250 + (target.getFitHeight()/2) - 20);
        pixelBow.setImage(bowImg);
        pixelBow.setX(70);
        pixelBow.setY(300);
        pixelArrow.setImage(arrowImg);
        pixelArrow.setX(70);
        pixelArrow.setY(300);
        attempts.setImage(two);
        attempts.setX(100);
        attempts.setY(300);
        pointsText.setText((Integer.toString(0)));
        
    }
    
    class MovedHandler implements EventHandler<MouseEvent> {
        double startY;
        double startRotate;
        double rotation;
        double y;
        double newRotate;
        
        @Override
        public void handle(MouseEvent event) {
            Point2D pt = pixelBow.localToParent(event.getX(), event.getY());
            y = pt.getY();
            rotation = startY - y;
            newRotate = -1 * rotation + startRotate;
            if (newRotate < 45 && newRotate > -45)
                pixelBow.setRotate(newRotate);  
            }
    }

    MovedHandler handler = new MovedHandler();
    
    public void onMouseDragged(){
        pixelBow.setOnMouseDragged(handler);
    }
    
    public void onMousePressed(MouseEvent event){
        Point2D pt = pixelBow.localToParent(event.getX(), event.getY());
        handler.startY = pt.getY();
        handler.startRotate = pixelBow.getRotate();
    }
    
    public void onMouseReleased(MouseEvent event){
        Point2D pt = pixelBow.localToParent(event.getX(), event.getY());
        double y = pt.getY();
        angleValueDifference = handler.startY - handler.y;
        if (angleValue.getText().isEmpty()){
            currentPosition = handler.rotation;
            if (currentPosition >=  + 45){
                currentPosition = 45;
                angleValue.setText(currentPosition + "\u00B0");
                arrow.setAngle(currentPosition);
                onClickPredict();
            }else if (currentPosition <=  - 45){
                currentPosition = -45;
                angleValue.setText(currentPosition + "\u00B0");
                arrow.setAngle(currentPosition);
                //preGo();
                onClickPredict();
            }else
                angleValue.setText(handler.rotation + "\u00B0");
                arrow.setAngle(currentPosition);
                //preGo();
                onClickPredict();
           }
        if (currentPosition != 0){
            if (angleValueDifference > 0 ){
                currentPosition = currentPosition + angleValueDifference;
                    if (currentPosition >= 45){
                        currentPosition = 45;
                    }
                angleValue.setText(currentPosition + "\u00B0");
                arrow.setAngle(currentPosition);
                onClickPredict();
            }else {
                currentPosition = currentPosition + angleValueDifference;
                    if (currentPosition <= -45){
                        currentPosition = -45;
                    }
                angleValue.setText(currentPosition + "\u00B0");
                arrow.setAngle(currentPosition);
                onClickPredict();
                }         
            }
         if (currentPosition == 0)
                currentPosition = handler.rotation;
                angleValue.setText(currentPosition + "\u00B0");
                onClickPredict();
                arrow.setAngle(currentPosition);
        }
    
    public void weightReleased(MouseEvent event){
        weightValue.setText(Double.toString((double)(Math.round(weightSlider.getValue()*100.0)/100.0)));
        arrow.setWeight(weightSlider.getValue());
        arrow.setHeight(1.2);
        onClickPredict();
    }
    
    public void constantReleased(MouseEvent event){
        constantValue.setText(Double.toString((double)(Math.round(constantSlider.getValue()*10.0)/10.0)));
        bow.setConstant(constantSlider.getValue());
        onClickPredict();
    }
    
    public void displacementReleased(MouseEvent event){
        displacementValue.setText(Double.toString((double)(Math.round(displacementSlider.getValue()*100.0)/100.0)));
        bow.setDisplacement(displacementSlider.getValue());
        onClickPredict();
    }
    
    public void onClickGo(ActionEvent e) throws FileNotFoundException, IOException{
        attempt--;
        pixelArrow.setImage(arrowImg);
        pixelArrow.setPreserveRatio(true);
        projection.setxInitial(0);
        projection.setVelocityI();
        projection.setVelocityF();
        initialVel.setText(Double.toString((double)(Math.round(projection.getVelocityI()*10.0)/10.0)));
        finalVel.setText(Double.toString((double)(Math.round(projection.getVelocityF()*10.0)/10.0)));
        projection.setxVelocity();
        projection.setyVelocity();
        
        projection.setFinalC();
        double C[][] = projection.getFinalC();
        
        new Thread(() -> { // lambda expression
            try {
                double vxi = projection.getxVelocity();
                double vyi = projection.getyVelocity();
                double t = 0.1;
                
                double angles [] = new double[C[0].length];
                for (int a = 0; a < C[0].length; a++ ){
                    double angle = Math.toDegrees(Math.atan(vyi / vxi));
                    vyi = vyi - t * projection.getArrow().getGravity();
                    angles[a] = angle;
                }
                
                for (int i = 0; i < C[0].length; i++){ 
                    PathTransition path = new PathTransition();
                        if (((i+1) < C[0].length) && ((i+2) < C[0].length)) {
                            Line line = new Line();
                            //If the arrow is going to hit the target, it must stop
                            if (doesStop() == 1 && 125+ 50*(C[0][i]) < game.getTargetX() && 200 + 50*(C[0][i+1]) > game.getTargetX()){
                                //Setting the line which the arrow will follow according to the components
                                line.setStartX(150+ 50*(C[0][i]));
                                line.setEndX(game.getTargetX());
                                line.setStartY(380 + -50 *(C[1][i]));
                                double x = ((game.getTargetX() - 12) - 150) / 50;
                                double y = arrow.getHeight() + projection.getyVelocity()*(x/projection.getxVelocity()) 
                                        + 0.5*(-arrow.getGravity())*(x/projection.getxVelocity())*(x/projection.getxVelocity());
                                double ypixel = 380 + -50 *y;
                                line.setEndY(ypixel);
                                //Getting the difference between the distance of the user's arrow 
                                //and the target's coordinates
                                getErrorY(ypixel);
                                getErrorX(game.getTargetX());
                                //Getting the points associated to the user's attempt
                                getPoints(i);
                                int points =  Integer.parseInt(pointsText.getText()) + getPoints(i);
                                pointsText.setText((Integer.toString(points)));
                                //Starting the animation of the arrow's path with the specific angle
                                path.setDuration(Duration.millis(400));
                                path.setPath(line);
                                path.setNode(pixelArrow);
                                path.setOrientation(PathTransition.OrientationType.NONE);
                                path.setCycleCount(1);
                                path.setAutoReverse(false);
                                path.play();
                                pixelArrow.setRotate(angles[i+1]);
                                break;
                            } else {
                                //Setting the line and angles which the arrow will follow according to the components 
                                line.setStartX(150+ 50*(C[0][i]));
                                line.setEndX((150 + 50*C[0][i+1]));
                                line.setStartY(380 + -50 *(C[1][i]));
                                line.setEndY(380 + -50 *(C[1][i+1]));
                                path.setDuration(Duration.millis(300));
                                path.setPath(line);
                                path.setNode(pixelArrow);
                                path.setOrientation(PathTransition.OrientationType.NONE);
                                path.setCycleCount(1);
                                path.setAutoReverse(false);
                                path.play();
                                RotateTransition rotate = new RotateTransition();  
                                rotate.setAxis(Rotate.Z_AXIS);
                                if(angles[i]<0){
                                rotate.setFromAngle(-(angles[i]));
                                rotate.setToAngle(-(angles[i+1]) );
                                }else if (angles[i]>0){
                                rotate.setFromAngle(-(angles[i]) );
                                rotate.setToAngle(-(angles[i+1]) );
                                        }
                                rotate.setCycleCount(1);  
                                rotate.setDuration(Duration.millis(350)); 
                                rotate.setNode(pixelArrow);
                                rotate.play();
                            }
                        }        
                    Thread.sleep(220);
                } 
            }catch (InterruptedException ex) {}
        }).start();
        
        switch (attempt){
            case 2: 
                attempts.setImage(two);
                break;
            case 1: 
                attempts.setImage(one);
                break;
            case 0:
                attempts.setImage(zero);
                 goButton.setText("Next Page");
                break;
            case -1:
                
        String str = pointsText.getText();
        int number = Integer.parseInt(str);
        game.setNumber(number);
        MyResourceBundle myResourceBundle= new MyResourceBundle(game);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Solution.fxml"));
        loader.setResources(myResourceBundle);
        root = loader.load();
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        break;
        
        }
    }
    
    public void onClickPredict(){
        if (bow.getDisplacement() != 0 && bow.getConstant() != 0 && arrow.getWeight() != 0 && arrow.getHeight() != 0 && arrow.getAngle() != 0){
            pane.getChildren().clear();
            projection.setVelocityI();
            projection.setxVelocity();
            projection.setyVelocity();
            projection.setFinalC();
            double C[][] = projection.getFinalC();
            Line lines[] = new Line[(C[0].length)];
                    for (int i = 0; i < C[0].length; i++){  
                            if ((i+1) < C[0].length && (i+2) < C[0].length){
                                Line line = new Line();
                                if (arrow.getAngle() <= 45 && arrow.getAngle() >= 25 ){
                                    line.setStartX(95 + 55*C[0][i]);
                                    line.setEndX((95 + 55*C[0][i+1]));
                                    line.setStartY(337 + -50*(C[1][i]));
                                    line.setEndY(337 + -50*(C[1][i+1]));
                                } else if (arrow.getAngle() < 25 && arrow.getAngle() >= 0 ){
                                    line.setStartX(100 + 55*C[0][i]);
                                    line.setEndX((100 + 55*C[0][i+1]));
                                    line.setStartY(335 + -50*(C[1][i]));
                                    line.setEndY(335 + -50*(C[1][i+1]));
                                } else {
                                    line.setStartX(100 + 50*(C[0][i]));
                                    line.setEndX(100 + 50*(C[0][i+1]));
                                    line.setStartY(330 + -50*(C[1][i]));
                                    line.setEndY(330 + -50*(C[1][i+1]));
                                }
                                if (game.getNumber() == 1 | game.getNumber() == 9 | 
                                        game.getNumber() == 0 | game.getNumber() == 2 | game.getNumber() == 4 |
                                        game.getNumber() == 10){
                                    line.setStroke(Color.WHITE);
                                } else {
                                    line.setStroke(Color.BLACK);
                                }
                                line.setStrokeWidth(4);
                                lines[i] = line;
                            }
                    }
                    for (int i = 0; i < (lines.length*4)/7; i+=2){
                        if ((i+1) < C[0].length && (i+2) < C[0].length){
                            pane.getChildren().add(lines[i]);
                        }
                    }
            }
    }
    
    public void sliderSetting(double minW, double maxW, double minC, double maxC, double minD, double maxD){
        
        weightSlider.setMin(minW);
        weightSlider.setMax(maxW);
        weightSlider.setValue((maxW - minW) / 2);
        weightSlider.setShowTickLabels(true);
        weightSlider.setShowTickMarks(true);
        
        constantSlider.setMin(minC);
        constantSlider.setMax(maxC);
        constantSlider.setValue((maxC - minC) / 2);
        constantSlider.setShowTickLabels(true);
        constantSlider.setShowTickMarks(true);
        
        displacementSlider.setMin(minD);
        displacementSlider.setMax(maxD);
        displacementSlider.setValue((maxD - minD) / 2);
        displacementSlider.setShowTickLabels(true);
        displacementSlider.setShowTickMarks(true);
        
        weightValue.setText(Double.toString((maxW - minW) / 2));
        constantValue.setText(Double.toString((maxC - minC) / 2));
        displacementValue.setText(Double.toString((maxD - minD
                ) / 2));
    }
    
    public int doesStop(){
        double x = ((game.getTargetX() - 12) - 150) / 50;
        double y = arrow.getHeight() + projection.getyVelocity()*(x/projection.getxVelocity()) 
                + 0.5*(-arrow.getGravity())*(x/projection.getxVelocity())*(x/projection.getxVelocity());
        double ypixel = 380 + -50 *y;
        if (ypixel > game.getTargetYmin() + 45 && ypixel < game.getTargetYmax() + 45){
            return 1;
        } else {
            return 0;
        }
    }
    
    public int getPoints(int index){
        projection.setVelocityI();
        projection.setxVelocity();
        projection.setyVelocity();
        projection.setFinalC();
        double C[][] = projection.getFinalC();
        double differenceY = (((50 *(C[1][index+1])) - (50 *(C[1][index]))));
        double arrowY = (380 + (-50 *(C[1][index])) - (2*differenceY)/3);
        double part = (game.getTargetYmax()-game.getTargetYmin())/4;
        double mid = game.getTargetYmin() + ((game.getTargetYmax() + 45) + (-game.getTargetYmin() + 45))/2.0;
        
        if (arrowY <= mid + (part/2.0) && arrowY >= mid - (part/2.0)) {
            return 5;
        } else if (arrowY <= mid + (1.2*part) && arrowY >= mid - (1.3*part)){
            return 3;
        } else if (arrowY <= mid + (part/2.0) + (2*part) && arrowY >= mid - (part/2.0) - (2*part)){
            return 1;
        } else {
            return 0;
        }
    }
    
    public void getErrorX(double arrowX){
        //Getting the difference between the arrow's x value and the target's x value
        //Converting it into meters by dividing by 50 (1m = 50pixels) 
        double errorX = (game.getTargetX() - arrowX)/50.0;
        //Adjusting the displayed value since it is an absolute value of distance
        if (errorX > 0){
            distanceErrorX.setText(Double.toString((double)(Math.round((errorX)*10.0)/10.0)));
        } else if (errorX == 0.0){
            distanceErrorX.setText(Double.toString(0.0));
        } else {
             distanceErrorX.setText(Double.toString((double)(Math.round((errorX *(-1))*10.0)/10.0)));
        }
    }
   
    public void getErrorY(double arrowY){
        //Getting the difference between the arrow's y middle value and the target's y value
        //Converting it into meters by dividing by 50 (1m = 50pixels) 
        double mid = game.getTargetYmin() + ((game.getTargetYmax() + 45) + (-game.getTargetYmin() + 45))/2.0;
        double errorY = (mid - arrowY)/(-50);
        //Adjusting the displayed value since it is an absolute value of distance
        if (errorY > 0){
            double value = (Math.round((errorY)*100.0)/100.0);
            distanceErrorY.setText(Double.toString(value));
        } else {
            double value = (-1) * (Math.round((errorY)*100.0)/100.0);
            distanceErrorY.setText(Double.toString(value));
        }   
    }
}

