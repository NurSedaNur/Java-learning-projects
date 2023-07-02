/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma17;

/**
 *
 * @author sedan
 */
abstract public class Insan implements Konus {
    
    //abstract cunku merhabayı almamıs
    
    private final String ad;
    protected Insan (String pad){
        this.ad=pad;
    }
    public String getAd(){
        return this.ad;
    }
    
}


