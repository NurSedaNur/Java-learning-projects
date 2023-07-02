/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma16;

/**
 *
 * @author sedan
 */

public class CubeMatter implements Matter {
    public double density=1.0;
    public double edge =1.0;
    public double getDensity(){
    return density;
    }
    public double getVolume(){
        return edge*edge*edge;
    }
    public double getmass(){
        return density*edge*edge*edge;
    }

    @Override
    public double getMass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

  
