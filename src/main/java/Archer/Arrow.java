/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archer;

/**
 *
 * @author sahar
 */
public class Arrow {
    private double weight;
    private double height;
    private double gravity; 
    private Bow bow;
    private double angle;

    public Arrow() {
    }   
    
    public Arrow(double weight, double height, Bow bow, double angle){
        this.weight = weight;
        this.height = height;
        this.bow = bow;
        this.angle = angle;
    }

    public Arrow(double weight, double height, double gravity, Bow bow, double angle) {
        this.weight = weight;
        this.height = height;
        this.gravity = gravity;
        this.bow = bow;
        this.angle = angle;
    }
    
    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getGravity() {
        return gravity;
    }

    public Bow getBow() {
        return bow;
    }

    public double getAngle() {
        return angle;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public void setBow(Bow bow) {
        this.bow = bow;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
}
