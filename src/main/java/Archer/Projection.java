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
public class Projection {
    private double xInitial;
    private double[][] finalC;
    private double velocityI;
    private double velocityF;
    private double xVelocity;
    private double yVelocity;
    private Arrow arrow;
    
    public Projection(){
    }
    
    public Projection(double xInitial, Arrow arrow) {
        this.xInitial = xInitial;
        this.arrow = arrow;
    }
    
    public void setxInitial(double xInitial) {
        this.xInitial = xInitial;
    }

    public void setxVelocity() {
        double a = arrow.getAngle();
        double angle = Math.cos(Math.toRadians(a));
        
        this.xVelocity = velocityI * angle;
    }

    public void setyVelocity() {
        double a = arrow.getAngle();
        double angle = Math.sin(Math.toRadians(a));
        
        this.yVelocity = velocityI * angle;
    }
    
    public void setVelocityI() {
        Bow b = arrow.getBow();
        double k = b.getConstant();
        double x = b.getDisplacement();
        double a = arrow.getAngle();
        double angle = Math.tan(Math.toRadians(a));
        double g = arrow.getGravity();
        double m = arrow.getWeight();
        
        this.velocityI = Math.sqrt(((0.5 * k * x * x) - (m * (-g) * x*angle) ) / (0.5 * m ));
    }
    
    public void setVelocityF() {
        double a = 0.5 * (-arrow.getGravity());
        double b = yVelocity;
        double c = arrow.getHeight();
        
        double t1 = (-b + Math.sqrt((b*b) - (4 * a * c)))/(2.0*a);
        double t2 = (-b - Math.sqrt((b*b) - (4 * a * c)))/(2.0*a);
        t1 = (double)(Math.round(t1*10.0)/10.0);
        t2 = (double)(Math.round(t2*10.0)/10.0);
        double time = 0;
        if (t2 > t1 && t2 > 0){
            time = t2;
        } else if (t1 > t2 && t1 > 0){
            time = t1;
        }
        
        double yVelocityF = yVelocity - arrow.getGravity()* time;
        this.velocityF = Math.sqrt(yVelocityF*yVelocityF + xVelocity*xVelocity);
    }

    public void setArrow(Arrow arrow) {
        this.arrow = arrow;
    }
    
    public void setFinalC() {
        double a = 0.5 * (-arrow.getGravity());
        double b = yVelocity;
        double c = arrow.getHeight();
        //Using the quadratic formula to find the time of flight
        double t1 = (-b + Math.sqrt((b*b) - (4 * a * c)))/(2.0*a);
        double t2 = (-b - Math.sqrt((b*b) - (4 * a * c)))/(2.0*a);
        t1 = (double)(Math.round(t1*10.0)/10.0);
        t2 = (double)(Math.round(t2*10.0)/10.0);
        double time = 0;
        if (t2 > t1 && t2 > 0){
            time = t2;
        } else if (t1 > t2 && t1 > 0){
            time = t1;
        }
        
        //Additional time is added to the time of flight for the 
        //animation to reach a lower part of the screen in JavaFX
        
        int ii = (int)((time+0.4) * 10);
        this.finalC = new double[2][ii+1];
        
        double x;
        double y;
        double iii;
        //For each 0.1 seconds, an x and y component is calculated and added to
        //the 2D array
        for (double i = 0; i <= time+0.4; i += 0.1){
                i = (double)(Math.round(i*10.0)/10.0);
                x = xVelocity*i;
                y = arrow.getHeight() + yVelocity*i + 0.5*(-arrow.getGravity())*i*i;
                //The i of the loop is multiplied by 10 to become an integer index
                iii = (i) * 10;
                this.finalC[0][(int)iii] = x;
                this.finalC[1][(int)iii] = y;
        }
    }

    public double getxInitial() {
        return xInitial;
    }

    public double getxVelocity() {
        return xVelocity;
    }

    public double getyVelocity() {
        return yVelocity;
    }
    
    public double getVelocityI() {
        return velocityI;
    }
    
    public double getVelocityF() {
        return velocityF;
    }

    public Arrow getArrow() {
        return arrow;
    }
    
     public double[][] getFinalC() {
        return finalC;
    }

    

    

   

    
    
    
    
    
    
}

