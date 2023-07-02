/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma27;

/**
 *
 * @author sedan
 */
public class Main {
    public static void main(String[] args) {
//        WomenGameCalculator womenCalculator=new WomenGameCalculator();
//        womenCalculator.hesapla();
//        womenCalculator.gameOver();
//        GameCalculator gameCalculator=new ManGameCalculator();
//        gameCalculator.hesapla();
        GameCalculator [] gamecalculator = {new WomenGameCalculator(),new ManGameCalculator(),new KidsGameCalculator()};
        for(GameCalculator game:gamecalculator){
            game.hesapla();
            game.gameOver();
        }
    }
}
