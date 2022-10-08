/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archer;

import javafx.scene.image.ImageView;

/**
 *
 * @author jessi
 */
public class Game {
    private double targetX;
    private double targetYmin;
    private double targetYmax;
    private int number;

    public Game() {
    }
    
    public Game(double targetX, double targetYmin, double targetYmax) {
        this.targetX = targetX;
        this.targetYmin = targetYmin;
        this.targetYmax = targetYmax;
    }

   public Game(int number) {
        this.number = number;
    }
    
    public void setTargetX(double targetX) {
        this.targetX = targetX;
    }
    
    public void setTargetYmin(double targetYmin) {
        this.targetYmin = targetYmin;
    } 
    
    public void setTargetYmax(double targetYmax) {
        this.targetYmax = targetYmax;
    } 
    
     public void setNumber(int number) {
        this.number = number;
    }
    
    public double getTargetX() {
        return targetX;
    }
    
    public double getTargetYmin() {
        return targetYmin;
    }
    
    public double getTargetYmax() {
        return targetYmax;
    }

    public int getNumber() {
        return number;
    }

   
}
