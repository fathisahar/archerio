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
public class Bow {
    private double tension;
    private double constant;
    private double displacement;
    
    public Bow(){
    }

    public Bow(double constant, double displacement){
        this.constant = constant;
        this.displacement = displacement;
    }

    public double getTension() {
        return tension;
    }

    public double getConstant() {
        return constant;
    }
    
    public double getDisplacement() {
        return displacement;
    }

    public void setTension() {
        this.tension = this.displacement * this.constant;
    }
    
    public void setConstant(double constant) {
        this.constant = constant;
    }
    
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
    
}
