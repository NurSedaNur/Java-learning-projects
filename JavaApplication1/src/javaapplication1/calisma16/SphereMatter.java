/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma16;

/**
 *
 * @author sedan
 */

    
public class SphereMatter implements Matter{
    public double density=1.0;
    public double radius=1.0;

    SphereMatter(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double getDensity(){
        return density;
    }
    public double getVolume(){
        return (3.14*radius*radius*radius)/3;
    }

    @Override
    public double getMass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
