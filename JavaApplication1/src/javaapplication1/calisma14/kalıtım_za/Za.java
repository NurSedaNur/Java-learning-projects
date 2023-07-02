/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma14.kalıtım_za;

/**
 *
 * @author sedan
 */
 class Xa{
     Ya b =new Ya();
     Xa(){
         System.out.println("Xa");
     }
 }
 class Ya{
     Ya(){
         System.out.println("Ya");
     }
 }

public class Za extends Xa {
    Ya y=new Ya();
    public static void main(String[] args) {
        new Za();
    }
    
    
}
