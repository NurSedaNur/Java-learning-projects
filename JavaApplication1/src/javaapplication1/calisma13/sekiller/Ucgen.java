/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma13.sekiller;

/**
 *
 * @author sedan
 */
public class Ucgen extends Sekil {
    String ucgenTuru;
    public Ucgen(double x,double y,String tip){
        super(x,y);
        ucgenTuru=tip;
    }
    public double Alan(){
        return (taban*yukseklik)/2;
    }
    
}
